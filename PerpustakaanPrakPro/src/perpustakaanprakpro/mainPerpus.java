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
        
        setLocationRelativeTo(this);
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
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        MainPanel.setBackground(new java.awt.Color(0, 51, 51));

        mainJudul.setFont(new java.awt.Font("Courier New", 1, 48)); // NOI18N
        mainJudul.setForeground(new java.awt.Color(255, 255, 255));
        mainJudul.setText("LIBRARY Admin");

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
                .addGap(260, 260, 260)
                .addGroup(MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(mainJudul)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, MainPanelLayout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addGroup(MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(pengembalianButton, javax.swing.GroupLayout.PREFERRED_SIZE, 293, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(peminjamanButton, javax.swing.GroupLayout.PREFERRED_SIZE, 293, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bukuButton, javax.swing.GroupLayout.PREFERRED_SIZE, 293, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(anggotaButton, javax.swing.GroupLayout.PREFERRED_SIZE, 293, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(22, 22, 22)))
                .addContainerGap(229, Short.MAX_VALUE))
        );
        MainPanelLayout.setVerticalGroup(
            MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MainPanelLayout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(mainJudul)
                .addGap(28, 28, 28)
                .addGroup(MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(peminjamanButton, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(46, 46, 46)
                .addGroup(MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pengembalianButton, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39)
                .addGroup(MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(bukuButton, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addGroup(MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(anggotaButton, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(124, Short.MAX_VALUE))
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
        new PengembalianBuku().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_pengembalianButtonActionPerformed

    private void peminjamanButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_peminjamanButtonActionPerformed
        new PeminjamanBuku().setVisible(true);
        this.dispose();
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
                FormLogin flogin = new FormLogin();
                flogin.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel MainPanel;
    private javax.swing.JButton anggotaButton;
    private javax.swing.JButton bukuButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel mainJudul;
    private javax.swing.JButton peminjamanButton;
    private javax.swing.JButton pengembalianButton;
    // End of variables declaration//GEN-END:variables
}
