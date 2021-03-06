
import java.text.DecimalFormat;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * Universidad del Valle de Guatemala
 * @author Christian Morales, Jose Luis Méndez, Juan García
 * Carne: 15015, 15021, 15046
 * 13 de Julio del 2016
 * Descripción: Este es el GUI, que utiliza la clase RadioCarro, se presenta la interfaz gráfica y se cumplen los requisitos de la GDT.
 *  Esta tambié será intercambiada con los comprañeros.
 */
public class Main extends javax.swing.JFrame {

    /**
     * Creates new form Main
     * Se crea el objeto Rad que implementa la estructura A objeto = new B()
     */
    
    Radio radio = new RadioCarro();
    public Main() {
        initComponents();
        // Se le da una valor de "false" al encendido para que el radio inicie como apagado
        radio.setEncendido(false);        
        // Se inician todos los componentes como no habilitados, para que no puedan usarse estando apagado el radio
        jB1.setEnabled(false);
        jB2.setEnabled(false);
        jB3.setEnabled(false);
        jB4.setEnabled(false);
        jB5.setEnabled(false);
        jB6.setEnabled(false);
        jB7.setEnabled(false);
        jB8.setEnabled(false);
        jB9.setEnabled(false);
        jB10.setEnabled(false);
        jB11.setEnabled(false);
        jB12.setEnabled(false);
        jBbajarEmisora.setEnabled(false);
        jBguardar.setEnabled(false);
        jBsubirEmisora.setEnabled(false);
        jRadioButton1.setEnabled(false);
        jRadioButton2.setEnabled(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jB1 = new javax.swing.JButton();
        jB4 = new javax.swing.JButton();
        jB7 = new javax.swing.JButton();
        jB10 = new javax.swing.JButton();
        jB2 = new javax.swing.JButton();
        jB5 = new javax.swing.JButton();
        jB8 = new javax.swing.JButton();
        jB11 = new javax.swing.JButton();
        jB9 = new javax.swing.JButton();
        jB12 = new javax.swing.JButton();
        jB3 = new javax.swing.JButton();
        jB6 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jBpower = new javax.swing.JButton();
        jComboBox1 = new javax.swing.JComboBox<String>();
        jBguardar = new javax.swing.JButton();
        jBsubirEmisora = new javax.swing.JButton();
        jBbajarEmisora = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(550, 450));
        setResizable(false);
        getContentPane().setLayout(null);

        jB1.setText("1");
        jB1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB1ActionPerformed(evt);
            }
        });
        getContentPane().add(jB1);
        jB1.setBounds(60, 220, 45, 23);

        jB4.setText("4");
        jB4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB4ActionPerformed(evt);
            }
        });
        getContentPane().add(jB4);
        jB4.setBounds(60, 250, 45, 23);

        jB7.setText("7");
        jB7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB7ActionPerformed(evt);
            }
        });
        getContentPane().add(jB7);
        jB7.setBounds(60, 280, 45, 23);

        jB10.setText("10");
        jB10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB10ActionPerformed(evt);
            }
        });
        getContentPane().add(jB10);
        jB10.setBounds(60, 310, 45, 23);

        jB2.setText("2");
        jB2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB2ActionPerformed(evt);
            }
        });
        getContentPane().add(jB2);
        jB2.setBounds(120, 220, 45, 23);

        jB5.setText("5");
        jB5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB5ActionPerformed(evt);
            }
        });
        getContentPane().add(jB5);
        jB5.setBounds(120, 250, 45, 23);

        jB8.setText("8");
        jB8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB8ActionPerformed(evt);
            }
        });
        getContentPane().add(jB8);
        jB8.setBounds(120, 280, 45, 23);

        jB11.setText("11");
        jB11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB11ActionPerformed(evt);
            }
        });
        getContentPane().add(jB11);
        jB11.setBounds(120, 310, 45, 23);

        jB9.setText("9");
        jB9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB9ActionPerformed(evt);
            }
        });
        getContentPane().add(jB9);
        jB9.setBounds(180, 280, 45, 23);

        jB12.setText("12");
        jB12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB12ActionPerformed(evt);
            }
        });
        getContentPane().add(jB12);
        jB12.setBounds(180, 310, 47, 23);

        jB3.setText("3");
        jB3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB3ActionPerformed(evt);
            }
        });
        getContentPane().add(jB3);
        jB3.setBounds(180, 220, 45, 23);

        jB6.setText("6");
        jB6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB6ActionPerformed(evt);
            }
        });
        getContentPane().add(jB6);
        jB6.setBounds(180, 250, 45, 23);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("----.---");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(60, 130, 116, 43);

        buttonGroup1.add(jRadioButton1);
        jRadioButton1.setForeground(new java.awt.Color(255, 255, 255));
        jRadioButton1.setText("AM");
        jRadioButton1.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jRadioButton1StateChanged(evt);
            }
        });
        jRadioButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jRadioButton1);
        jRadioButton1.setBounds(170, 140, 41, 23);

        buttonGroup1.add(jRadioButton2);
        jRadioButton2.setForeground(new java.awt.Color(255, 255, 255));
        jRadioButton2.setText("FM");
        jRadioButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jRadioButton2);
        jRadioButton2.setBounds(170, 170, 39, 23);

        jBpower.setIcon(new javax.swing.ImageIcon(getClass().getResource("/power1.png"))); // NOI18N
        jBpower.setBorderPainted(false);
        jBpower.setContentAreaFilled(false);
        jBpower.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/power2.png"))); // NOI18N
        jBpower.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBpowerActionPerformed(evt);
            }
        });
        getContentPane().add(jBpower);
        jBpower.setBounds(240, 360, 70, 60);

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Guardar Emisora.", "1.", "2.", "3.", "4.", "5.", "6.", "7.", "8.", "9.", "11.", "12." }));
        jComboBox1.setToolTipText("");
        getContentPane().add(jComboBox1);
        jComboBox1.setBounds(320, 220, 150, 30);

        jBguardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/guardar1.png"))); // NOI18N
        jBguardar.setBorderPainted(false);
        jBguardar.setContentAreaFilled(false);
        jBguardar.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/guardar2.png"))); // NOI18N
        jBguardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBguardarActionPerformed(evt);
            }
        });
        getContentPane().add(jBguardar);
        jBguardar.setBounds(350, 260, 90, 80);

        jBsubirEmisora.setIcon(new javax.swing.ImageIcon(getClass().getResource("/+1.png"))); // NOI18N
        jBsubirEmisora.setBorderPainted(false);
        jBsubirEmisora.setContentAreaFilled(false);
        jBsubirEmisora.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/+2.png"))); // NOI18N
        jBsubirEmisora.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBsubirEmisoraActionPerformed(evt);
            }
        });
        getContentPane().add(jBsubirEmisora);
        jBsubirEmisora.setBounds(320, 160, 40, 43);

        jBbajarEmisora.setIcon(new javax.swing.ImageIcon(getClass().getResource("/-1.png"))); // NOI18N
        jBbajarEmisora.setBorderPainted(false);
        jBbajarEmisora.setContentAreaFilled(false);
        jBbajarEmisora.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/-2.png"))); // NOI18N
        jBbajarEmisora.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBbajarEmisoraActionPerformed(evt);
            }
        });
        getContentPane().add(jBbajarEmisora);
        jBbajarEmisora.setBounds(400, 160, 50, 40);

        jLabel3.setFont(new java.awt.Font("Tempus Sans ITC", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(204, 204, 204));
        jLabel3.setText("RADIO");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(220, 50, 90, 40);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fondo main.jpg"))); // NOI18N
        jLabel2.setText("jLabel2");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(0, 0, 520, 430);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // Este método guarda una emisora en un botón
    private void jBguardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBguardarActionPerformed
        // TODO add your handling code here:
        int bt = jComboBox1.getSelectedIndex()-1;
        double emi = Double.parseDouble(jLabel1.getText());
        radio.saveEmisora(bt, emi);
    }//GEN-LAST:event_jBguardarActionPerformed

    // Este boton se encarga del encendido y apagado del radio y su inicialización
    private void jBpowerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBpowerActionPerformed
        // TODO add your handling code here:
        /*Acciones al encender el radio al inicio*/
        boolean enc;
        enc = radio.getEncendido();
        if(enc == true){
            enc = false;
            radio.setEncendido(enc);
            jB1.setEnabled(enc);
            jB2.setEnabled(enc);
            jB3.setEnabled(enc);
            jB4.setEnabled(enc);
            jB5.setEnabled(enc);
            jB6.setEnabled(enc);
            jB7.setEnabled(enc);
            jB8.setEnabled(enc);
            jB9.setEnabled(enc);
            jB10.setEnabled(enc);
            jB11.setEnabled(enc);
            jB12.setEnabled(enc);
            jBbajarEmisora.setEnabled(enc);
            jBguardar.setEnabled(enc);
            jBsubirEmisora.setEnabled(enc);
            jRadioButton1.setEnabled(enc);
            jRadioButton2.setEnabled(enc);
        }else if(enc == false){
            enc = true;
            radio.setEncendido(enc);
            jB1.setEnabled(enc);
            jB2.setEnabled(enc);
            jB3.setEnabled(enc);
            jB4.setEnabled(enc);
            jB5.setEnabled(enc);
            jB6.setEnabled(enc);
            jB7.setEnabled(enc);
            jB8.setEnabled(enc);
            jB9.setEnabled(enc);
            jB10.setEnabled(enc);
            jB11.setEnabled(enc);
            jB12.setEnabled(enc);
            jBbajarEmisora.setEnabled(enc);
            jBguardar.setEnabled(enc);
            jBsubirEmisora.setEnabled(enc);
            jRadioButton1.setEnabled(enc);
            jRadioButton2.setEnabled(enc);
        }
        
        radio.setFrecuencia(true);
        jLabel1.setText("89.70");
        jRadioButton2.setSelected(true);
        /*Hacer acciones para apagar el radio*/
    }//GEN-LAST:event_jBpowerActionPerformed

    // Estos radioButton siven para seleccionar la frecuencia AM o FM
    private void jRadioButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton1ActionPerformed
        // TODO add your handling code here:
        
        jLabel1.setText("530");
        radio.setFrecuencia(false);
    }//GEN-LAST:event_jRadioButton1ActionPerformed

    private void jRadioButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton2ActionPerformed
        // TODO add your handling code here:
        jLabel1.setText("89.70");
        radio.setFrecuencia(true);
    }//GEN-LAST:event_jRadioButton2ActionPerformed

    
    //Estos botones se encargan de ir avanzando hacia adelante o hacia atrás en las emisoras, dependiendo de la frecuencia (AM o FM)
    private void jBsubirEmisoraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBsubirEmisoraActionPerformed
        // TODO add your handling code here:
        //SI EL RADIO ES FM
        if(radio.getFrecuencia()){
            if(jLabel1.getText().equals("107.9")){
                jLabel1.setText("89.7");
            }else{
                double est = Math.rint( (Double.parseDouble(jLabel1.getText())) *10)/10;
                est = est + 0.2;
                String emi = Double.toString(est);
                jLabel1.setText(emi);
            }
        // SI EL RADIO ES AM    
        }else{
            if(jLabel1.getText().equals("1610")){
                jLabel1.setText("530");
            }else{
                int est = Integer.parseInt(jLabel1.getText());
                est = est + 10;
                String emi = Integer.toString(est);
                jLabel1.setText(emi);
            }
        }
    }//GEN-LAST:event_jBsubirEmisoraActionPerformed

    private void jBbajarEmisoraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBbajarEmisoraActionPerformed
        // TODO add your handling code here:
        //SI EL RADIO ES FM
        if(radio.getFrecuencia()){
            if(jLabel1.getText().equals("89.7")){
                jLabel1.setText("107.9");
            }else{
                double est = Math.rint( (Double.parseDouble(jLabel1.getText())) *10)/10;
                est = est - 0.2;
                String emi = Double.toString(est);
                jLabel1.setText(emi);
            }
        // SI EL RADIO ES AM    
        }else{
            if(jLabel1.getText().equals("530")){
                jLabel1.setText("1610");
            }else{
                int est = Integer.parseInt(jLabel1.getText());
                est = est - 10;
                String emi = Integer.toString(est);
                jLabel1.setText(emi);
            }
        }
    }//GEN-LAST:event_jBbajarEmisoraActionPerformed

    
    // Se presentan los botones que tendrán guardadas las emisoras
    private void jB1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB1ActionPerformed
        // TODO add your handling code here:
        
        double  estacion = radio.selectEmisora(0);
        if(estacion== (int)estacion){
            jRadioButton1.setSelected(true);
            jLabel1.setText(String.valueOf((int)estacion));
        
        }
        else{
            jRadioButton2.setSelected(true);
            jLabel1.setText(String.valueOf(estacion));
        }    
    }//GEN-LAST:event_jB1ActionPerformed

    private void jB2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB2ActionPerformed
double  estacion = radio.selectEmisora(1);
        if(estacion== (int)estacion){
            jRadioButton1.setSelected(true);
            jLabel1.setText(String.valueOf((int)estacion));
        
        }
        else{
            jRadioButton2.setSelected(true);
            jLabel1.setText(String.valueOf(estacion));
        }           
            // TODO add your handling code here:
    }//GEN-LAST:event_jB2ActionPerformed

    private void jB3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB3ActionPerformed
             // TODO add your handling code here:
             double  estacion = radio.selectEmisora(2);
        if(estacion== (int)estacion){
            jRadioButton1.setSelected(true);
            jLabel1.setText(String.valueOf((int)estacion));
        
        }
        else{
            jRadioButton2.setSelected(true);
            jLabel1.setText(String.valueOf(estacion));
        }    
    }//GEN-LAST:event_jB3ActionPerformed

    private void jB4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB4ActionPerformed
               // TODO add your handling code here:
               double  estacion = radio.selectEmisora(3);
        if(estacion== (int)estacion){
            jRadioButton1.setSelected(true);
            jLabel1.setText(String.valueOf((int)estacion));
        
        }
        else{
            jRadioButton2.setSelected(true);
            jLabel1.setText(String.valueOf(estacion));
        }    
    }//GEN-LAST:event_jB4ActionPerformed

    
    private void jB5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB5ActionPerformed
                // TODO add your handling code here
                double  estacion = radio.selectEmisora(4);
        if(estacion== (int)estacion){
            jRadioButton1.setSelected(true);
            jLabel1.setText(String.valueOf((int)estacion));
        
        }
        else{
            jRadioButton2.setSelected(true);
            jLabel1.setText(String.valueOf(estacion));
        }    
    }//GEN-LAST:event_jB5ActionPerformed

    private void jB6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB6ActionPerformed
        // TODO add your handling code here:
      double  estacion = radio.selectEmisora(5);
        if(estacion== (int)estacion){
            jRadioButton1.setSelected(true);
            jLabel1.setText(String.valueOf((int)estacion));
        
        }
        else{
            jRadioButton2.setSelected(true);
            jLabel1.setText(String.valueOf(estacion));
        }    
    }//GEN-LAST:event_jB6ActionPerformed

    private void jB7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB7ActionPerformed
        // TODO add your handling code here:
          double  estacion = radio.selectEmisora(6);
        if(estacion== (int)estacion){
            jRadioButton1.setSelected(true);
            jLabel1.setText(String.valueOf((int)estacion));
        
        }
        else{
            jRadioButton2.setSelected(true);
            jLabel1.setText(String.valueOf(estacion));
        }    
    }//GEN-LAST:event_jB7ActionPerformed

    private void jB8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB8ActionPerformed
        double  estacion = radio.selectEmisora(7);
        if(estacion== (int)estacion){
            jRadioButton1.setSelected(true);
            jLabel1.setText(String.valueOf((int)estacion));
        
        }
        else{
            jRadioButton2.setSelected(true);
            jLabel1.setText(String.valueOf(estacion));
        }    
    }//GEN-LAST:event_jB8ActionPerformed

    private void jB9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB9ActionPerformed
        // TODO add your handling code here:
        double  estacion = radio.selectEmisora(8);
        if(estacion== (int)estacion){
            jRadioButton1.setSelected(true);
            jLabel1.setText(String.valueOf((int)estacion));
        
        }
        else{
            jRadioButton2.setSelected(true);
            jLabel1.setText(String.valueOf(estacion));
        }    
    }//GEN-LAST:event_jB9ActionPerformed

    private void jB10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB10ActionPerformed
        // TODO add your handling code here:
          double  estacion = radio.selectEmisora(9);
        if(estacion== (int)estacion){
            jRadioButton1.setSelected(true);
            jLabel1.setText(String.valueOf((int)estacion));
        
        }
        else{
            jRadioButton2.setSelected(true);
            jLabel1.setText(String.valueOf(estacion));
        }    
    }//GEN-LAST:event_jB10ActionPerformed

    private void jB11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB11ActionPerformed
            // TODO add your handling code here:
     double  estacion = radio.selectEmisora(10);
        if(estacion== (int)estacion){
            jRadioButton1.setSelected(true);
            jLabel1.setText(String.valueOf((int)estacion));
        
        }
        else{
            jRadioButton2.setSelected(true);
            jLabel1.setText(String.valueOf(estacion));
        }    
    }//GEN-LAST:event_jB11ActionPerformed

    private void jB12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB12ActionPerformed
        // TODO add your handling code here:
       double  estacion = radio.selectEmisora(11);
        if(estacion== (int)estacion){
            jRadioButton1.setSelected(true);
            jLabel1.setText(String.valueOf((int)estacion));
        
        }
        else{
            jRadioButton2.setSelected(true);
            jLabel1.setText(String.valueOf(estacion));
        }    
    }//GEN-LAST:event_jB12ActionPerformed

    private void jRadioButton1StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jRadioButton1StateChanged
        // TODO add your handling code here:
        radio.setFrecuencia(!radio.getFrecuencia());
    }//GEN-LAST:event_jRadioButton1StateChanged

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
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new Main().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jB1;
    private javax.swing.JButton jB10;
    private javax.swing.JButton jB11;
    private javax.swing.JButton jB12;
    private javax.swing.JButton jB2;
    private javax.swing.JButton jB3;
    private javax.swing.JButton jB4;
    private javax.swing.JButton jB5;
    private javax.swing.JButton jB6;
    private javax.swing.JButton jB7;
    private javax.swing.JButton jB8;
    private javax.swing.JButton jB9;
    private javax.swing.JButton jBbajarEmisora;
    private javax.swing.JButton jBguardar;
    private javax.swing.JButton jBpower;
    private javax.swing.JButton jBsubirEmisora;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    // End of variables declaration//GEN-END:variables
}
