/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Forms;

import Classes.TransactionFunctions;
import java.awt.event.KeyEvent;

/**
 *
 * @author Farhan
 */
public class TransactionOperations extends javax.swing.JFrame {
    TransactionFunctions transactionFunctions = new TransactionFunctions();
    
    /**
     * Creates new form TransactionOperations
     */
    public TransactionOperations() {
        this.setResizable(false);
        transactionFunctions.setTransactionFunctions(this);
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        back = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        totalTransaction = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        transactionTable = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Transaction Operations");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(82, 91, 86));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(19, 34, 38));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(82, 91, 86));
        jLabel1.setFont(new java.awt.Font("Century Gothic", 3, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 204, 204));
        jLabel1.setText("Transactions...");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 40, 170, 40));

        back.setBackground(new java.awt.Color(153, 153, 153));
        back.setBorder(null);
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });
        back.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                backKeyPressed(evt);
            }
        });
        jPanel2.add(back, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, 40, 40));
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1180, 10, -1, -1));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1290, 120));

        jLabel15.setBackground(new java.awt.Color(255, 255, 255));
        jLabel15.setFont(new java.awt.Font("Century Gothic", 3, 24)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("To");
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 130, 30, 30));

        jLabel16.setBackground(new java.awt.Color(255, 255, 255));
        jLabel16.setFont(new java.awt.Font("Century Gothic", 3, 24)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("From");
        jPanel1.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 130, -1, 30));

        jLabel17.setBackground(new java.awt.Color(255, 255, 255));
        jLabel17.setFont(new java.awt.Font("Century Gothic", 3, 24)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("Total");
        jPanel1.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 550, -1, 30));

        totalTransaction.setEditable(false);
        totalTransaction.setFont(new java.awt.Font("Century Gothic", 2, 18)); // NOI18N
        totalTransaction.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                totalTransactionFocusGained(evt);
            }
        });
        jPanel1.add(totalTransaction, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 550, 180, 30));

        jScrollPane1.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N

        transactionTable.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        transactionTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        transactionTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                transactionTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(transactionTable);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, 1270, 370));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1290, 590));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
        Admin admin = new Admin();
        admin.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_backActionPerformed

    private void backKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_backKeyPressed
        if(evt.getKeyCode() == KeyEvent.VK_BACK_SPACE || evt.getKeyCode() == KeyEvent.VK_ENTER || evt.getKeyCode() == KeyEvent.VK_ESCAPE ){
        Admin admin = new Admin();
        admin.setVisible(true);
        this.dispose();
        }
    }//GEN-LAST:event_backKeyPressed

    private void transactionTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_transactionTableMouseClicked
        transactionFunctions.populateTransaction();
    }//GEN-LAST:event_transactionTableMouseClicked

    private void totalTransactionFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_totalTransactionFocusGained
        transactionFunctions.totalTransaction();
    }//GEN-LAST:event_totalTransactionFocusGained

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(TransactionOperations.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TransactionOperations.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TransactionOperations.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TransactionOperations.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TransactionOperations().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton back;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    public javax.swing.JTextField totalTransaction;
    public javax.swing.JTable transactionTable;
    // End of variables declaration//GEN-END:variables
}