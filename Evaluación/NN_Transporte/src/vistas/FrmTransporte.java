/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vistas;

import org.neuroph.core.NeuralNetwork;
import org.neuroph.core.data.DataSet;
import org.neuroph.core.data.DataSetRow;
import org.neuroph.nnet.MultiLayerPerceptron;

/**
 *
 * @author UTNG
 */
public class FrmTransporte extends javax.swing.JFrame {

    /**
     * Creates new form FrmTransporte
     */
    public FrmTransporte() {
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

        bgCiudad = new javax.swing.ButtonGroup();
        bgFamilia = new javax.swing.ButtonGroup();
        bgTransporte = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        chkVelocidad = new javax.swing.JCheckBox();
        rbtnCiudadG = new javax.swing.JRadioButton();
        rbtnCiudadP = new javax.swing.JRadioButton();
        rbtnFamiliaG = new javax.swing.JRadioButton();
        rbtnFamiliaP = new javax.swing.JRadioButton();
        jPanel3 = new javax.swing.JPanel();
        rbtnAutobus = new javax.swing.JRadioButton();
        rbtnVan = new javax.swing.JRadioButton();
        rbtnCaminar = new javax.swing.JRadioButton();
        rbtnCarro = new javax.swing.JRadioButton();
        jLabel4 = new javax.swing.JLabel();
        btnCalcular = new javax.swing.JButton();
        btnLimpiar = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(129, 190, 209));

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Entradas"));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("¿Necesita velocidad?");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("Tamaño de la ciudad:");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setText("Tamaño de la familia:");

        chkVelocidad.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        chkVelocidad.setText("Sí");

        bgCiudad.add(rbtnCiudadG);
        rbtnCiudadG.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        rbtnCiudadG.setText("Grande");

        bgCiudad.add(rbtnCiudadP);
        rbtnCiudadP.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        rbtnCiudadP.setSelected(true);
        rbtnCiudadP.setText("Pequeña");
        rbtnCiudadP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtnCiudadPActionPerformed(evt);
            }
        });

        bgFamilia.add(rbtnFamiliaG);
        rbtnFamiliaG.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        rbtnFamiliaG.setText("Grande");

        bgFamilia.add(rbtnFamiliaP);
        rbtnFamiliaP.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        rbtnFamiliaP.setSelected(true);
        rbtnFamiliaP.setText("Pequeña");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(rbtnCiudadG)
                        .addGap(18, 18, 18)
                        .addComponent(rbtnCiudadP))
                    .addComponent(chkVelocidad)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(rbtnFamiliaG)
                        .addGap(18, 18, 18)
                        .addComponent(rbtnFamiliaP)))
                .addContainerGap(16, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(chkVelocidad))
                .addGap(17, 17, 17)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rbtnCiudadG)
                    .addComponent(rbtnCiudadP))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(rbtnFamiliaG)
                        .addComponent(rbtnFamiliaP))
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        bgTransporte.add(rbtnAutobus);
        rbtnAutobus.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        rbtnAutobus.setText("Autobús");

        bgTransporte.add(rbtnVan);
        rbtnVan.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        rbtnVan.setText("Van");

        bgTransporte.add(rbtnCaminar);
        rbtnCaminar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        rbtnCaminar.setText("Caminar");

        bgTransporte.add(rbtnCarro);
        rbtnCarro.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        rbtnCarro.setText("Carro");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rbtnAutobus)
                    .addComponent(rbtnVan)
                    .addComponent(rbtnCaminar)
                    .addComponent(rbtnCarro))
                .addContainerGap(80, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(rbtnCaminar)
                .addGap(18, 18, 18)
                .addComponent(rbtnAutobus)
                .addGap(18, 18, 18)
                .addComponent(rbtnVan)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 14, Short.MAX_VALUE)
                .addComponent(rbtnCarro)
                .addContainerGap())
        );

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Selección de transporte");

        btnCalcular.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnCalcular.setText("Calcular");
        btnCalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalcularActionPerformed(evt);
            }
        });

        btnLimpiar.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnLimpiar.setText("Limpiar");
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });

        btnSalir.setBackground(new java.awt.Color(255, 51, 51));
        btnSalir.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnSalir.setForeground(new java.awt.Color(51, 51, 51));
        btnSalir.setText("Salir");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnCalcular, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnLimpiar, javax.swing.GroupLayout.DEFAULT_SIZE, 158, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnSalir, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addGap(61, 61, 61)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnCalcular)
                        .addGap(18, 18, 18)
                        .addComponent(btnLimpiar)))
                .addGap(18, 18, 18)
                .addComponent(btnSalir)
                .addContainerGap(13, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void rbtnCiudadPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtnCiudadPActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rbtnCiudadPActionPerformed

    private void btnCalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalcularActionPerformed
        NeuralNetwork nn = new MultiLayerPerceptron(3,10,2);
        
        DataSet ds = new DataSet(3, 2);
        
        ds.addRow(new DataSetRow(new double[]{0,1,1}, new double[]{0,0}));
        ds.addRow(new DataSetRow(new double[]{0,0,1}, new double[]{0,0}));
        ds.addRow(new DataSetRow(new double[]{1,1,1}, new double[]{0,1}));
        ds.addRow(new DataSetRow(new double[]{1,0,1}, new double[]{1,0}));
        ds.addRow(new DataSetRow(new double[]{1,1,0}, new double[]{0,1}));
        ds.addRow(new DataSetRow(new double[]{1,0,0}, new double[]{1,1}));
        ds.addRow(new DataSetRow(new double[]{0,0,0}, new double[]{0,0}));
        ds.addRow(new DataSetRow(new double[]{1,1,1}, new double[]{0,1}));
        ds.addRow(new DataSetRow(new double[]{0,1,5}, new double[]{0,0}));
        //nn = NeuralNetwork.createFromFile("C:\\Users\\ramon\\Desktop\\NN_Transporte.nnet");
            
        // set network input
        int velocidad;        
        int ciudad;
        int familia;
        
        velocidad = (chkVelocidad.isSelected()?1:0);
        ciudad    = (rbtnCiudadG.isSelected()?1:0);
        familia   = (rbtnFamiliaG.isSelected()?1:0);

        nn.setInput(velocidad, ciudad,familia);
        
        // calculate network
        nn.calculate();
        double[] networkOutput = nn.getOutput();
        
        int[] res = new int[2];
        
        res[0] = (int) Math.round(networkOutput[0]);
        res[1] = (int) Math.round(networkOutput[0]);
        
        if(res[0] == 0 && res[1]== 0){
            rbtnCaminar.setSelected(true);
        }else if(res[0] == 0 && res[1]== 1){
            rbtnAutobus.setSelected(true);
        }else if(res[0] == 1 && res[1]== 0){
            rbtnVan.setSelected(true);
        }else if(res[0] == 1 && res[1]== 1){
            rbtnCarro.setSelected(true);
        }
        
        nn.save("C:\\Users\\ramon\\Desktop\\Redes\\NNTransporte.nnet");
    }//GEN-LAST:event_btnCalcularActionPerformed

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
            rbtnCaminar.setSelected(false);
            rbtnAutobus.setSelected(false);
            rbtnVan.setSelected(false);
            rbtnCarro.setSelected(false);
            chkVelocidad.setSelected(false);
            rbtnCiudadG.setSelected(false);
            rbtnFamiliaG.setSelected(false);
            
    }//GEN-LAST:event_btnLimpiarActionPerformed

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
            java.util.logging.Logger.getLogger(FrmTransporte.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmTransporte.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmTransporte.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmTransporte.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmTransporte().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup bgCiudad;
    private javax.swing.ButtonGroup bgFamilia;
    private javax.swing.ButtonGroup bgTransporte;
    private javax.swing.JButton btnCalcular;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JButton btnSalir;
    private javax.swing.JCheckBox chkVelocidad;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JRadioButton rbtnAutobus;
    private javax.swing.JRadioButton rbtnCaminar;
    private javax.swing.JRadioButton rbtnCarro;
    private javax.swing.JRadioButton rbtnCiudadG;
    private javax.swing.JRadioButton rbtnCiudadP;
    private javax.swing.JRadioButton rbtnFamiliaG;
    private javax.swing.JRadioButton rbtnFamiliaP;
    private javax.swing.JRadioButton rbtnVan;
    // End of variables declaration//GEN-END:variables
}
