/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package birds.n.cars;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.GridLayout;
import java.awt.Panel;
import java.awt.TextField;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.JOptionPane;

/**
 *
 * @author Adi
 */
public class MultiplayerMenue extends JFrame implements ActionListener {

    private boolean hostActive = false;

    private Panel panel;
    private final TextField textfield = new TextField(0);
    private final JButton buttonHost = new JButton("HOST");
    private final JButton buttonJoin = new JButton("JOIN");
    private final JButton buttonRefresh = new JButton("REFRESH");
    private final JButton buttonExit = new JButton("EXIT");

    public MultiplayerMenue() {
        super("Multiplayer");

        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();

        setDefaultCloseOperation(/*WindowConstants.*/EXIT_ON_CLOSE);

        setResizable(true);
        setLayout(new BorderLayout());

        this.panel = new Panel(new GridLayout(2, 2));
        this.panel.add(this.buttonHost);
        this.panel.add(this.buttonJoin);
        this.panel.add(this.buttonRefresh);
        this.panel.add(this.buttonExit);

        add(this.panel, BorderLayout.SOUTH);

        this.buttonHost.addActionListener(e -> onHost());
        this.buttonJoin.addActionListener(e -> onJoin());
        this.buttonRefresh.addActionListener(e -> onRefresh());
        this.buttonExit.addActionListener(e -> onExit());

        this.buttonHost.setPreferredSize(new Dimension(200, 200));

        pack();
        setBounds(0, 0, screenSize.width / 3 * 2, screenSize.height / 3 * 2);

        setVisible(true);

    }

    public boolean getHostActive() {
        return this.hostActive;
    }

    //public static void main(String[] agrs) {
    //    EventQueue.invokeLater(() -> new MultiplayerMenue());
    //}

    @Override
    public void actionPerformed(ActionEvent e) {
        char ch = (e.getActionCommand()).charAt(0);
    }

    public void onExit() {
        System.exit(0);
    }

    public void onHost() {
        JOptionPane.showMessageDialog(MultiplayerMenue.this, "Options not available yet", "Sorry :(", JOptionPane.WARNING_MESSAGE);
    }

    public void onJoin() {
        JOptionPane.showMessageDialog(MultiplayerMenue.this, "Singleplayer not available yet", "Sorry :(", JOptionPane.WARNING_MESSAGE);
    }

    public void onRefresh() {
        JOptionPane.showMessageDialog(MultiplayerMenue.this, "Multiplayer not available yet", "Sorry :(", JOptionPane.WARNING_MESSAGE);
    }
}
