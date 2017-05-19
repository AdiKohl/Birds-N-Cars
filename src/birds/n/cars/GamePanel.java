/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package birds.n.cars;

/**
 *
 * @author Felix
 */
public class GamePanel extends javax.swing.JFrame {

    /**
     * Creates new form GamePanel
     */
    public GamePanel() {
        initComponents();
        GameGrid grid1 = new GameGrid(10, 10);
        GameGrid grid2 = new GameGrid(10, 10);
        jPanel_Player1.add(grid1.fieldView);
        jPanel_Player2.add(grid2.fieldView);
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel_Chate = new javax.swing.JPanel();
        jTextField_chattext = new javax.swing.JTextField();
        jScrollPane_Chatwindow = new javax.swing.JScrollPane();
        jTextPane1 = new javax.swing.JTextPane();
        jPanel_Game = new javax.swing.JPanel();
        jPanel_Player1 = new javax.swing.JPanel();
        jPanel_Player2 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel_Chate.setToolTipText("");

        jTextField_chattext.setText("jTextField1");
        jTextField_chattext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_chattextActionPerformed(evt);
            }
        });

        jScrollPane_Chatwindow.setViewportView(jTextPane1);

        javax.swing.GroupLayout jPanel_ChateLayout = new javax.swing.GroupLayout(jPanel_Chate);
        jPanel_Chate.setLayout(jPanel_ChateLayout);
        jPanel_ChateLayout.setHorizontalGroup(
            jPanel_ChateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_ChateLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel_ChateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jTextField_chattext, javax.swing.GroupLayout.DEFAULT_SIZE, 471, Short.MAX_VALUE)
                    .addComponent(jScrollPane_Chatwindow))
                .addContainerGap(517, Short.MAX_VALUE))
        );
        jPanel_ChateLayout.setVerticalGroup(
            jPanel_ChateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel_ChateLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane_Chatwindow, javax.swing.GroupLayout.DEFAULT_SIZE, 45, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField_chattext, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel_Player1.setBorder(javax.swing.BorderFactory.createTitledBorder("Enemy Parking"));

        javax.swing.GroupLayout jPanel_Player1Layout = new javax.swing.GroupLayout(jPanel_Player1);
        jPanel_Player1.setLayout(jPanel_Player1Layout);
        jPanel_Player1Layout.setHorizontalGroup(
            jPanel_Player1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 461, Short.MAX_VALUE)
        );
        jPanel_Player1Layout.setVerticalGroup(
            jPanel_Player1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 484, Short.MAX_VALUE)
        );

        jPanel_Player2.setBorder(javax.swing.BorderFactory.createTitledBorder("Your Parking"));

        javax.swing.GroupLayout jPanel_Player2Layout = new javax.swing.GroupLayout(jPanel_Player2);
        jPanel_Player2.setLayout(jPanel_Player2Layout);
        jPanel_Player2Layout.setHorizontalGroup(
            jPanel_Player2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 149, Short.MAX_VALUE)
        );
        jPanel_Player2Layout.setVerticalGroup(
            jPanel_Player2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 119, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel_GameLayout = new javax.swing.GroupLayout(jPanel_Game);
        jPanel_Game.setLayout(jPanel_GameLayout);
        jPanel_GameLayout.setHorizontalGroup(
            jPanel_GameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_GameLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel_Player1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel_Player2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel_GameLayout.setVerticalGroup(
            jPanel_GameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_GameLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel_GameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel_GameLayout.createSequentialGroup()
                        .addComponent(jPanel_Player2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jPanel_Player1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel_Chate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel_Game, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel_Game, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel_Chate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField_chattextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_chattextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_chattextActionPerformed


   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel_Chate;
    private javax.swing.JPanel jPanel_Game;
    private javax.swing.JPanel jPanel_Player1;
    private javax.swing.JPanel jPanel_Player2;
    private javax.swing.JScrollPane jScrollPane_Chatwindow;
    private javax.swing.JTextField jTextField_chattext;
    private javax.swing.JTextPane jTextPane1;
    // End of variables declaration//GEN-END:variables


    
    public static void main(String args[]) {
        
        
        
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(GamePanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GamePanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GamePanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GamePanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GamePanel().setVisible(true);
            }
        });
    }


}
