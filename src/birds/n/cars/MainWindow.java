/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package birds.n.cars;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author Adi
 */
public class MainWindow extends javax.swing.JFrame implements ActionListener  {
    private GameGrid gameGrid;
    
    /**
     * Creates new form NewJFrame
     */
    public MainWindow() {
        initComponents();
        setDefaultCloseOperation(/*WindowConstants.*/EXIT_ON_CLOSE);
    
//        gameGrid = new GameGrid(10, 10);
//        GameGrid grid2 = new GameGrid(10, 10);
//        
//        jPanel_Player1.add(gameGrid.fieldView);
//        jPanel_Player2.add(grid2.fieldView);
//        jPanel_Player1.getSize();
//Field[][] field = new Field[10][10];
//Field[] field2 = new Field[10];
     Field field;
     Field field2;


        for(int i = 0; i < 10; i++){
           for(int j = 0; j < 10; j++){
               field = new Field(i,j);
               field2 = new Field(i,j);
            jPanel_Player1.add(field);        
            jPanel_Player2.add(field2);   
            
            
            field.setActionCommand(i+","+j);
            field2.setActionCommand(i+","+j);
            
            field2.addActionListener(this);
            field.addActionListener(this);
            
         
//                      // ActionListener wird als anonyme Klasse eingebunden
//        field[i][j].addActionListener(new java.awt.event.ActionListener() {
//            // Beim Drücken des Menüpunktes wird actionPerformed aufgerufen
//            public void actionPerformed(java.awt.event.ActionEvent e) {
//                //Programm schließen
//                   System.out.print(field[i][j].getPosX() );
//            }
//        });
        }
        }
             
    }
       private void operatorIdentifier(ActionEvent e){
       
        ;
        }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        mainPanel = new javax.swing.JPanel();
        mainMenuPanel = new javax.swing.JPanel();
        panelLabel = new javax.swing.JPanel();
        labelBNC = new javax.swing.JLabel();
        panelMainMenu = new javax.swing.JPanel();
        buttonSingle = new javax.swing.JButton();
        buttonMulti = new javax.swing.JButton();
        buttonOptions = new javax.swing.JButton();
        buttonExit = new javax.swing.JButton();
        singleplayerPanel = new javax.swing.JPanel();
        chatPanel = new javax.swing.JPanel();
        jTextField_chattext = new javax.swing.JTextField();
        jScrollPane_Chatwindow = new javax.swing.JScrollPane();
        jTextPane1 = new javax.swing.JTextPane();
        gamePanel = new javax.swing.JPanel();
        jPanel_Player1 = new javax.swing.JPanel();
        jPanel_Player2 = new javax.swing.JPanel();
        spFiguresButton = new javax.swing.JButton();
        multiplayerPanel = new javax.swing.JPanel();
        hostList = new javax.swing.JPanel();
        labelMultiplayerMenu = new javax.swing.JLabel();
        labelAvailableHosts = new javax.swing.JLabel();
        namesScrollPane = new javax.swing.JScrollPane();
        namesList = new javax.swing.JList<>();
        multiplayerMenu = new javax.swing.JPanel();
        labelIP = new javax.swing.JLabel();
        labelSessionName = new javax.swing.JLabel();
        ipTextField = new javax.swing.JTextField();
        sessionNameTextField = new javax.swing.JTextField();
        mpHostButton = new javax.swing.JButton();
        mpJoinButton = new javax.swing.JButton();
        mpRefreshButton = new javax.swing.JButton();
        mpBackButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        mainPanel.setLayout(new java.awt.CardLayout());

        labelBNC.setFont(new java.awt.Font("Dialog", 1, 48)); // NOI18N
        labelBNC.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelBNC.setText("Birds 'N' Cars");

        javax.swing.GroupLayout panelLabelLayout = new javax.swing.GroupLayout(panelLabel);
        panelLabel.setLayout(panelLabelLayout);
        panelLabelLayout.setHorizontalGroup(
            panelLabelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLabelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelBNC, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        panelLabelLayout.setVerticalGroup(
            panelLabelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLabelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelBNC, javax.swing.GroupLayout.DEFAULT_SIZE, 417, Short.MAX_VALUE)
                .addContainerGap())
        );

        panelMainMenu.setBorder(javax.swing.BorderFactory.createTitledBorder("Main Menu"));

        buttonSingle.setText("SINGLEPLAYER");
        buttonSingle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonSingleActionPerformed(evt);
            }
        });

        buttonMulti.setText("MULTIPLAYER");
        buttonMulti.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonMultiActionPerformed(evt);
            }
        });

        buttonOptions.setText("OPTIONS");
        buttonOptions.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonOptionsActionPerformed(evt);
            }
        });

        buttonExit.setText("EXIT");
        buttonExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonExitActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelMainMenuLayout = new javax.swing.GroupLayout(panelMainMenu);
        panelMainMenu.setLayout(panelMainMenuLayout);
        panelMainMenuLayout.setHorizontalGroup(
            panelMainMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelMainMenuLayout.createSequentialGroup()
                .addGap(423, 423, 423)
                .addGroup(panelMainMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(buttonSingle)
                    .addComponent(buttonMulti)
                    .addComponent(buttonOptions)
                    .addComponent(buttonExit))
                .addGap(423, 423, 423))
        );

        panelMainMenuLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {buttonExit, buttonMulti, buttonOptions, buttonSingle});

        panelMainMenuLayout.setVerticalGroup(
            panelMainMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelMainMenuLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(buttonSingle)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(buttonMulti)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(buttonOptions)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(buttonExit)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout mainMenuPanelLayout = new javax.swing.GroupLayout(mainMenuPanel);
        mainMenuPanel.setLayout(mainMenuPanelLayout);
        mainMenuPanelLayout.setHorizontalGroup(
            mainMenuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1000, Short.MAX_VALUE)
            .addGroup(mainMenuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(mainMenuPanelLayout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(mainMenuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(panelMainMenu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(panelLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addContainerGap()))
        );
        mainMenuPanelLayout.setVerticalGroup(
            mainMenuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 640, Short.MAX_VALUE)
            .addGroup(mainMenuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(mainMenuPanelLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(panelLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(panelMainMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap()))
        );

        mainPanel.add(mainMenuPanel, "mainMenuCard");

        singleplayerPanel.setPreferredSize(new java.awt.Dimension(1000, 640));

        chatPanel.setToolTipText("");

        jTextField_chattext.setText("jTextField1");
        jTextField_chattext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_chattextActionPerformed(evt);
            }
        });

        jScrollPane_Chatwindow.setViewportView(jTextPane1);

        javax.swing.GroupLayout chatPanelLayout = new javax.swing.GroupLayout(chatPanel);
        chatPanel.setLayout(chatPanelLayout);
        chatPanelLayout.setHorizontalGroup(
            chatPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(chatPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(chatPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane_Chatwindow, javax.swing.GroupLayout.PREFERRED_SIZE, 471, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField_chattext, javax.swing.GroupLayout.PREFERRED_SIZE, 471, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        chatPanelLayout.setVerticalGroup(
            chatPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, chatPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane_Chatwindow, javax.swing.GroupLayout.DEFAULT_SIZE, 57, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField_chattext, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel_Player1.setBorder(javax.swing.BorderFactory.createTitledBorder("Enemy Parking"));
        jPanel_Player1.setLayout(new java.awt.GridLayout(10, 10));

        jPanel_Player2.setBorder(javax.swing.BorderFactory.createTitledBorder("Your Parking"));
        jPanel_Player2.setLayout(new java.awt.GridLayout(10, 10));

        spFiguresButton.setText("Figure");
        spFiguresButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                spFiguresButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout gamePanelLayout = new javax.swing.GroupLayout(gamePanel);
        gamePanel.setLayout(gamePanelLayout);
        gamePanelLayout.setHorizontalGroup(
            gamePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(gamePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(gamePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(gamePanelLayout.createSequentialGroup()
                        .addComponent(jPanel_Player1, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 188, Short.MAX_VALUE)
                        .addComponent(jPanel_Player2, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(gamePanelLayout.createSequentialGroup()
                        .addComponent(spFiguresButton)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        gamePanelLayout.setVerticalGroup(
            gamePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(gamePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(gamePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel_Player1, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel_Player2, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(spFiguresButton)
                .addContainerGap(83, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout singleplayerPanelLayout = new javax.swing.GroupLayout(singleplayerPanel);
        singleplayerPanel.setLayout(singleplayerPanelLayout);
        singleplayerPanelLayout.setHorizontalGroup(
            singleplayerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(gamePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(chatPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        singleplayerPanelLayout.setVerticalGroup(
            singleplayerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(singleplayerPanelLayout.createSequentialGroup()
                .addComponent(gamePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0)
                .addComponent(chatPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        mainPanel.add(singleplayerPanel, "singleplayerCard");

        multiplayerPanel.setPreferredSize(new java.awt.Dimension(1000, 640));
        multiplayerPanel.setLayout(new java.awt.BorderLayout());

        labelMultiplayerMenu.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        labelMultiplayerMenu.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelMultiplayerMenu.setText("Multiplayer Menu");

        labelAvailableHosts.setText("Available Hosts:");

        namesList.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        namesScrollPane.setViewportView(namesList);

        javax.swing.GroupLayout hostListLayout = new javax.swing.GroupLayout(hostList);
        hostList.setLayout(hostListLayout);
        hostListLayout.setHorizontalGroup(
            hostListLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(labelMultiplayerMenu, javax.swing.GroupLayout.DEFAULT_SIZE, 1000, Short.MAX_VALUE)
            .addGroup(hostListLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(hostListLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(namesScrollPane)
                    .addGroup(hostListLayout.createSequentialGroup()
                        .addComponent(labelAvailableHosts)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        hostListLayout.setVerticalGroup(
            hostListLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(hostListLayout.createSequentialGroup()
                .addComponent(labelMultiplayerMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelAvailableHosts, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(namesScrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 383, Short.MAX_VALUE)
                .addContainerGap())
        );

        multiplayerPanel.add(hostList, java.awt.BorderLayout.NORTH);

        multiplayerMenu.setPreferredSize(new java.awt.Dimension(1000, 150));

        labelIP.setText("Your IP:");

        labelSessionName.setText("Session Name:");

        ipTextField.setEditable(false);

        sessionNameTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                sessionNameTextFieldKeyReleased(evt);
            }
        });

        mpHostButton.setText("HOST");
        mpHostButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mpHostButtonActionPerformed(evt);
            }
        });

        mpJoinButton.setText("JOIN");
        mpJoinButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mpJoinButtonActionPerformed(evt);
            }
        });

        mpRefreshButton.setText("REFRESH");
        mpRefreshButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mpRefreshButtonActionPerformed(evt);
            }
        });

        mpBackButton.setText("BACK TO MAIN MENU");
        mpBackButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mpBackButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout multiplayerMenuLayout = new javax.swing.GroupLayout(multiplayerMenu);
        multiplayerMenu.setLayout(multiplayerMenuLayout);
        multiplayerMenuLayout.setHorizontalGroup(
            multiplayerMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(multiplayerMenuLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(multiplayerMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(mpRefreshButton, javax.swing.GroupLayout.DEFAULT_SIZE, 234, Short.MAX_VALUE)
                    .addComponent(mpHostButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ipTextField)
                    .addComponent(labelIP, javax.swing.GroupLayout.Alignment.LEADING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(multiplayerMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(sessionNameTextField)
                    .addComponent(labelSessionName)
                    .addComponent(mpJoinButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(mpBackButton, javax.swing.GroupLayout.DEFAULT_SIZE, 234, Short.MAX_VALUE))
                .addContainerGap())
        );
        multiplayerMenuLayout.setVerticalGroup(
            multiplayerMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(multiplayerMenuLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(multiplayerMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelIP)
                    .addComponent(labelSessionName))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(multiplayerMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ipTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sessionNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(multiplayerMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(mpHostButton)
                    .addComponent(mpJoinButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(multiplayerMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(mpRefreshButton)
                    .addComponent(mpBackButton))
                .addContainerGap(26, Short.MAX_VALUE))
        );

        multiplayerPanel.add(multiplayerMenu, java.awt.BorderLayout.SOUTH);

        mainPanel.add(multiplayerPanel, "multiplayerCard");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(mainPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(mainPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buttonMultiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonMultiActionPerformed
        // TODO add your handling code here:
        //JOptionPane.showMessageDialog(MainWindow.this, "Multiplayer not available yet", "Sorry :(",JOptionPane.WARNING_MESSAGE);
        CardLayout card = (CardLayout)mainPanel.getLayout();
        card.show(mainPanel, "multiplayerCard");
        
        
    }//GEN-LAST:event_buttonMultiActionPerformed

    private void buttonSingleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonSingleActionPerformed
        // TODO add your handling code here:

        CardLayout card = (CardLayout)mainPanel.getLayout();
        card.show(mainPanel, "singleplayerCard");

    }//GEN-LAST:event_buttonSingleActionPerformed

    private void buttonOptionsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonOptionsActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(MainWindow.this, "Options not available yet", "Sorry :(",JOptionPane.WARNING_MESSAGE);
    }//GEN-LAST:event_buttonOptionsActionPerformed

    private void buttonExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonExitActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_buttonExitActionPerformed

    private void jTextField_chattextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_chattextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_chattextActionPerformed

    private void mpHostButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mpHostButtonActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(MainWindow.this, "Not available yet", "Sorry :(",JOptionPane.WARNING_MESSAGE);
    }//GEN-LAST:event_mpHostButtonActionPerformed

    private void mpJoinButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mpJoinButtonActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(MainWindow.this, "Not available yet", "Sorry :(",JOptionPane.WARNING_MESSAGE);
    }//GEN-LAST:event_mpJoinButtonActionPerformed

    private void mpRefreshButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mpRefreshButtonActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(MainWindow.this, "Not available yet", "Sorry :(",JOptionPane.WARNING_MESSAGE);
    }//GEN-LAST:event_mpRefreshButtonActionPerformed

    private void mpBackButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mpBackButtonActionPerformed
        // TODO add your handling code here:
        CardLayout card = (CardLayout)mainPanel.getLayout();
        card.show(mainPanel, "mainMenuCard");
        

    }//GEN-LAST:event_mpBackButtonActionPerformed

    private void spFiguresButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_spFiguresButtonActionPerformed
           Figures car =new Figures(4, 1, 1, 2 , "Test");
     gameGrid.fieldView.drawMark(1,1,Color.orange);
     gameGrid.showStatus(2, gameGrid.field);
        // TODO add your handling code here:
    }//GEN-LAST:event_spFiguresButtonActionPerformed

    private void sessionNameTextFieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_sessionNameTextFieldKeyReleased
        if(sessionNameTextField.getText().length() >= 4) {
            mpHostButton.setEnabled(true);
        } else {
            mpHostButton.setEnabled(false);
        }
    }//GEN-LAST:event_sessionNameTextFieldKeyReleased

    public void mainMenuWindowOpenAgain(){
        this.setVisible(true);
    }
    
//    /**
//     * @param args the command line arguments
//    */ 
//    
//    public static void main(String args[]) {
//        /* Set the Nimbus look and feel */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
//         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new MainWindow().setVisible(true);
//            }
//        });
//    }
 
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonExit;
    private javax.swing.JButton buttonMulti;
    private javax.swing.JButton buttonOptions;
    private javax.swing.JButton buttonSingle;
    private javax.swing.JPanel chatPanel;
    private javax.swing.JPanel gamePanel;
    private javax.swing.JPanel hostList;
    private javax.swing.JTextField ipTextField;
    private javax.swing.JPanel jPanel_Player1;
    private javax.swing.JPanel jPanel_Player2;
    private javax.swing.JScrollPane jScrollPane_Chatwindow;
    private javax.swing.JTextField jTextField_chattext;
    private javax.swing.JTextPane jTextPane1;
    private javax.swing.JLabel labelAvailableHosts;
    private javax.swing.JLabel labelBNC;
    private javax.swing.JLabel labelIP;
    private javax.swing.JLabel labelMultiplayerMenu;
    private javax.swing.JLabel labelSessionName;
    private javax.swing.JPanel mainMenuPanel;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JButton mpBackButton;
    private javax.swing.JButton mpHostButton;
    private javax.swing.JButton mpJoinButton;
    private javax.swing.JButton mpRefreshButton;
    private javax.swing.JPanel multiplayerMenu;
    private javax.swing.JPanel multiplayerPanel;
    private javax.swing.JList<String> namesList;
    private javax.swing.JScrollPane namesScrollPane;
    private javax.swing.JPanel panelLabel;
    private javax.swing.JPanel panelMainMenu;
    private javax.swing.JTextField sessionNameTextField;
    private javax.swing.JPanel singleplayerPanel;
    private javax.swing.JButton spFiguresButton;
    // End of variables declaration//GEN-END:variables

    @Override
    public void actionPerformed(ActionEvent e) {
         String ch = (e.getActionCommand());
                 
      
    }
    
//    public String getPos(){
//    return ch;
//    }
            
}
