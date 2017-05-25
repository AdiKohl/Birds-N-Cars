/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package birds.n.cars;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Felix
 */
public class GameGrid extends JFrame {

    // Colors used for empty locations.
    private static final Color EMPTY_COLOR = Color.white;
    // Color used for objects that have no defined color.
    private static final Color UNKNOWN_COLOR = Color.gray;

    private final String STEP_PREFIX = "Playfield: ";
    private JLabel stepLabel;
    public FieldView fieldView;

    // A map for storing colors for participants in the simulation
    private Map<Class, Color> colors;
    // A statistics object computing and storing simulation information

    private Field field;
    private int step;

    /**
     * Create a view of the given width and height.
     *
     * @param height The simulation's height.
     * @param width The simulation's width.
     */
    public GameGrid(int height, int width) {

        field = new Field(height, width);
        colors = new LinkedHashMap<>();

        stepLabel = new JLabel(STEP_PREFIX, JLabel.CENTER);
        

        setLocation(100, 50);

        fieldView = new FieldView(height, width);

        Container contents = getContentPane();
        contents.add(stepLabel, BorderLayout.NORTH);
        contents.add(fieldView, BorderLayout.CENTER);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setSize(500, 500);
        
        showStatus(step, field);
        
        
    }

    public static void main(String[] args) {
        GameGrid grid = new GameGrid(10, 10);
        
    }

    /**
     * Show the current status of the field.
     *
     * @param step Which iteration step it is.
     * @param field The field whose status is to be displayed.
     */
    public void showStatus(int step, Field field) {
        if (!isVisible()) {
            setVisible(true);
        }
        fieldView.preparePaint();
        for (int row = 0; row < field.getDepth(); row++) {
            for (int col = 0; col < field.getWidth(); col++) {
                fieldView.drawMark(col, row, EMPTY_COLOR);
            }
        }

        fieldView.repaint();
    }

    /**
     * Provide a graphical view of a rectangular field. This is a nested class
     * (a class defined inside a class) which defines a custom component for the
     * user interface. This component displays the field. This is rather
     * advanced GUI stuff - you can ignore this for your project if you like.
     */
    public class FieldView extends JPanel {

        private final int GRID_VIEW_SCALING_FACTOR = 1;

        private int gridWidth, gridHeight;
        private int xScale, yScale;
        Dimension size;
        private Graphics g;
        private Image fieldImage;

        /**
         * Create a new FieldView component.
         */
        public FieldView(int height, int width) {
            gridHeight = height;
            gridWidth = width;
            size = new Dimension(0, 0);
        }

        /**
         * Tell the GUI manager how big we would like to be.
         */
        public Dimension getPreferredSize() {
            return new Dimension(gridWidth * GRID_VIEW_SCALING_FACTOR,
                    gridHeight * GRID_VIEW_SCALING_FACTOR);
        }

        /**
         * Prepare for a new round of painting. Since the component may be
         * resized, compute the scaling factor again.
         */
        public void preparePaint() {
            if (!size.equals(getSize())) {  // if the size has changed...
                size = getSize();
                fieldImage = fieldView.createImage(size.width, size.height);
                g = fieldImage.getGraphics();

                xScale = size.width / gridWidth;
                if (xScale < 1) {
                    xScale = GRID_VIEW_SCALING_FACTOR;
                }
                yScale = size.height / gridHeight;
                if (yScale < 1) {
                    yScale = GRID_VIEW_SCALING_FACTOR;
                }
            }
        }

        /**
         * Paint on grid location on this field in a given color.
         */
        public void drawMark(int x, int y, Color color) {
            g.setColor(color);
            g.fillRect(x * xScale, y * yScale, xScale - 1, yScale - 1);
        }

        /**
         * The field view component needs to be redisplayed. Copy the internal
         * image to screen.
         */
        public void paintComponent(Graphics g) {
            if (fieldImage != null) {
                Dimension currentSize = getSize();
                if (size.equals(currentSize)) {
                    g.drawImage(fieldImage, 0, 0, null);
                } else {
                    // Rescale the previous image.
                    g.drawImage(fieldImage, 0, 0, currentSize.width, currentSize.height, null);
                }
            }
        }
    }
            /**
         * Paint on grid location on this field in a given color.
         */
        
}
