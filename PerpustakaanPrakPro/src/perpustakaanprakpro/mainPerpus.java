/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package perpustakaanprakpro;

/**
 *
 * @author Naufal
 */
public class mainPerpus extends javax.swing.JFrame {

    /**
     * Creates new form mainPerpus
     */
    public mainPerpus() {
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

        MainPanel = new javax.swing.JPanel();
        mainJudul = new javax.swing.JLabel();
        pengembalianButton = new javax.swing.JButton();
        peminjamanButton = new javax.swing.JButton();
        bukuButton = new javax.swing.JButton();
        anggotaButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        MainPanel.setBackground(new java.awt.Color(0, 51, 51));

        mainJudul.setFont(new java.awt.Font("Courier New", 1, 48)); // NOI18N
        mainJudul.setForeground(new java.awt.Color(255, 255, 255));
        mainJudul.setText("LIBRARY");

        pengembalianButton.setBackground(new java.awt.Color(0, 0, 0));
        pengembalianButton.setFont(new java.awt.Font("Courier New", 1, 24)); // NOI18N
        pengembalianButton.setForeground(new java.awt.Color(255, 255, 255));
        pengembalianButton.setText("Pengembalian Buku");
        pengembalianButton.setBorder(null);
        pengembalianButton.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        pengembalianButton.setMargin(new java.awt.Insets(14, 14, 14, 14));
        pengembalianButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pengembalianButtonActionPerformed(evt);
            }
        });

        peminjamanButton.setBackground(new java.awt.Color(0, 0, 0));
        peminjamanButton.setFont(new java.awt.Font("Courier New", 1, 24)); // NOI18N
        peminjamanButton.setForeground(new java.awt.Color(255, 255, 255));
        peminjamanButton.setText("Peminjaman Buku");
        peminjamanButton.setBorder(null);
        peminjamanButton.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        peminjamanButton.setMargin(new java.awt.Insets(14, 14, 14, 14));
        peminjamanButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                peminjamanButtonActionPerformed(evt);
            }
        });

        bukuButton.setBackground(new java.awt.Color(0, 0, 0));
        bukuButton.setFont(new java.awt.Font("Courier New", 1, 24)); // NOI18N
        bukuButton.setForeground(new java.awt.Color(255, 255, 255));
        bukuButton.setText("Data Buku");
        bukuButton.setBorder(null);
        bukuButton.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        bukuButton.setMargin(new java.awt.Insets(14, 14, 14, 14));
        bukuButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bukuButtonActionPerformed(evt);
            }
        });

        anggotaButton.setBackground(new java.awt.Color(0, 0, 0));
        anggotaButton.setFont(new java.awt.Font("Courier New", 1, 24)); // NOI18N
        anggotaButton.setForeground(new java.awt.Color(255, 255, 255));
        anggotaButton.setText("Data Anggota");
        anggotaButton.setBorder(null);
        anggotaButton.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        anggotaButton.setMargin(new java.awt.Insets(14, 14, 14, 14));
        anggotaButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                anggotaButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout MainPanelLayout = new javax.swing.GroupLayout(MainPanel);
        MainPanel.setLayout(MainPanelLayout);
        MainPanelLayout.setHorizontalGroup(
            MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MainPanelLayout.createSequentialGroup()
                .addGroup(MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(anggotaButton, javax.swing.GroupLayout.PREFERRED_SIZE, 293, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bukuButton, javax.swing.GroupLayout.PREFERRED_SIZE, 293, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(peminjamanButton, javax.swing.GroupLayout.PREFERRED_SIZE, 293, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(MainPanelLayout.createSequentialGroup()
                            .addGap(304, 304, 304)
                            .addComponent(mainJudul))
                        .addGroup(MainPanelLayout.createSequentialGroup()
                            .addGap(260, 260, 260)
                            .addComponent(pengembalianButton, javax.swing.GroupLayout.PREFERRED_SIZE, 293, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(310, Short.MAX_VALUE))
        );
        MainPanelLayout.setVerticalGroup(
            MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MainPanelLayout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(mainJudul)
                .addGap(37, 37, 37)
                .addComponent(peminjamanButton, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addComponent(pengembalianButton, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44)
                .addComponent(bukuButton, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(anggotaButton, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(127, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(MainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(MainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void pengembalianButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pengembalianButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pengembalianButtonActionPerformed

    private void peminjamanButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_peminjamanButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_peminjamanButtonActionPerformed

    private void bukuButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bukuButtonActionPerformed
         new DataBuku().setVisible(true);
         this.dispose();
    }//GEN-LAST:event_bukuButtonActionPerformed

    private void anggotaButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_anggotaButtonActionPerformed
        new DataMahasiswa().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_anggotaButtonActionPerformed

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
            java.util.logging.Logger.getLogger(mainPerpus.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(mainPerpus.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(mainPerpus.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(mainPerpus.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new mainPerpus().setVisible(false);
                
                FormLogin formLogin = new FormLogin();
                formLogin.setVisible(true);
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel MainPanel;
    private javax.swing.JButton anggotaButton;
    private javax.swing.JButton bukuButton;
    private javax.swing.JLabel mainJudul;
    private javax.swing.JButton peminjamanButton;
    private javax.swing.JButton pengembalianButton;
    // End of variables declaration//GEN-END:variables
}
