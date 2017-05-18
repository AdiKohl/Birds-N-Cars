/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package birds.n.cars;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

/**
 *
 * @author Team8
 */

public class BirdsNCars extends JFrame implements ActionListener{
    
    private Panel panel;
    private final JButton buttonSingle = new JButton("SINGLEPLAYER");
    private final JButton buttonMulti = new JButton("MULTIPLAYER");
    private final JButton buttonOptions = new JButton("OPTIONS");
    private final JButton buttonExit = new JButton("EXIT");
    
    public BirdsNCars() {
        super("Birds'N'Cars");
        
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        
        
        
        setDefaultCloseOperation(/*WindowConstants.*/EXIT_ON_CLOSE);
        
        setResizable(true);
        setLayout(new BorderLayout());
        
        this.panel = new Panel(new GridLayout(4,1));
        this.panel.add(this.buttonSingle);
        this.panel.add(this.buttonMulti);
        this.panel.add(this.buttonOptions);
        this.panel.add(this.buttonExit);
        
        add(this.panel, BorderLayout.SOUTH);
        
        this.buttonSingle.addActionListener(e -> onSingle());
        this.buttonMulti.addActionListener(e -> onMulti());
        this.buttonOptions.addActionListener(e -> onOptions());
        this.buttonExit.addActionListener(e -> onExit());
        
        this.buttonSingle.setPreferredSize(new Dimension(200,200));
        
        pack();
        setBounds(0,0,screenSize.width/3*2, screenSize.height/3*2);
        
        setVisible(true);
        
        
    }
    
    
    
    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        // TODO code application logic here
        EventQueue.invokeLater(() -> new BirdsNCars());
    }
    
    
    @Override
    public void actionPerformed(ActionEvent e){
        char ch = (e.getActionCommand()).charAt(0);
    }
    
    public void onExit(){
        System.exit(0);   
    }
    
    public void onOptions(){
        JOptionPane.showMessageDialog(BirdsNCars.this, "Options not available yet", "Sorry :(",JOptionPane.WARNING_MESSAGE);
    }
    public void onSingle(){
        JOptionPane.showMessageDialog(BirdsNCars.this, "Singleplayer not available yet", "Sorry :(",JOptionPane.WARNING_MESSAGE);
    }
    public void onMulti(){
        JOptionPane.showMessageDialog(BirdsNCars.this, "Multiplayer not available yet", "Sorry :(",JOptionPane.WARNING_MESSAGE);
    }    
    
}
