/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.itson.pmn.gui;

import com.singularsys.jep.Jep;
import com.singularsys.jep.JepException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author enriq_000
 */
public class MetodoSimpson38 extends javax.swing.JFrame {

    /**
     * Creates new form MetodoSimpson38
     */
    
    //Se declara la variable que define el limite inferior
    double a;
    
    //Se declara la variable que define el limite superior
    double b;
    
    public MetodoSimpson38() {
        
        initComponents();
        this.setLocationRelativeTo(null);
        
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
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtFuncion = new javax.swing.JTextField();
        txtLimiteInferior = new javax.swing.JTextField();
        txtLimiteSuperior = new javax.swing.JTextField();
        txtArea = new javax.swing.JLabel();
        btnCalcular = new javax.swing.JButton();
        btnMenu = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Metodo Simpson 3/8");

        jPanel1.setBackground(new java.awt.Color(102, 102, 255));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Metodo Simpson 3/8");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Ingrese la función");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Ingrese el Limite Inferior");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Ingrese el Limite Superior");

        txtFuncion.setText("x^2+1");

        txtLimiteInferior.setText("0");

        txtLimiteSuperior.setText("2");

        txtArea.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txtArea.setForeground(new java.awt.Color(255, 255, 255));
        txtArea.setText("AREA = ");

        btnCalcular.setBackground(new java.awt.Color(102, 102, 255));
        btnCalcular.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnCalcular.setText("Calcular área");
        btnCalcular.setBorder(null);
        btnCalcular.setBorderPainted(false);
        btnCalcular.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCalcular.setOpaque(false);
        btnCalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalcularActionPerformed(evt);
            }
        });

        btnMenu.setBackground(new java.awt.Color(102, 102, 255));
        btnMenu.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnMenu.setText("Menú Principal");
        btnMenu.setBorder(null);
        btnMenu.setBorderPainted(false);
        btnMenu.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnMenu.setOpaque(false);
        btnMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMenuActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(57, 57, 57)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4))
                                .addGap(53, 53, 53)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(txtLimiteInferior)
                                    .addComponent(txtFuncion)
                                    .addComponent(txtLimiteSuperior, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btnCalcular, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtArea, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(149, 149, 149)
                        .addComponent(jLabel1)))
                .addContainerGap(64, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel1)
                .addGap(44, 44, 44)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtFuncion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtLimiteInferior, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtLimiteSuperior, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(49, 49, 49)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCalcular, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtArea)
                    .addComponent(btnMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(50, Short.MAX_VALUE))
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

    /**
     * Metodo encargado de encontrar el área bajo la curva de un función 
     * mediante el método de Simpson 3/8 de Newton
     * @param evt 
     */
    private void btnCalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalcularActionPerformed

        Jep jep = new Jep();

        //Se obtienen los valores de los Limites Inferior y Superior
        a = Double.parseDouble(txtLimiteInferior.getText());
        b = Double.parseDouble(txtLimiteSuperior.getText());

        /**
         * Realizar el método siempre y cuando el Limite Inferior sea menor al
         * Limite Superior
         */
        if (a<b) {

            double [] fx = new double[4];

            //Generación de la longitud de la base
            double h = b-a;
            
            //Generación de la longitud de cada intervalo
            double intervalo = h/3;

            try{
                for (int i = 0; i < 4; i++) {

                    //Generación de la variable a evaluar
                    jep.addVariable("x", a);
                    
                    //Parseo de la función a evaluar
                    jep.parse(txtFuncion.getText());

                    /**
                     * Generación de los fx a evaluar en la formula de Simpson
                     * 3/8
                     */
                    fx[i]= Double.parseDouble(jep.evaluate().toString());

                    //Aumento de la x a evaluar según el intervalo evaluado
                    a+=intervalo;

                }
            }catch (JepException ex) {

                Logger.getLogger(MetodoSimpson38.class.getName()).log(Level.SEVERE, null, ex);

                JOptionPane.showMessageDialog(null, "Asegurese de escribir la "
                    + "función a analizar con el formato correcto");
                txtFuncion.requestFocus();
            }

            /**
             * Generación del área bajo la curva de la función al aplicar la 
             * formula de Simpson 3/8
             */
            double area = h*((fx[0]+3*fx[1]+3*fx[2]+fx[3])/8);

            //Se muestra el área bajo la curva de la función en Pantalla
            txtArea.setText("AREA = "+String.format("%.3f", area));

        }else{

            JOptionPane.showMessageDialog(null, "El Limite Superior debe ser "
                + "mayor al Limite Inferior");
            txtLimiteInferior.setText(null);
            txtLimiteSuperior.setText(null);
            txtLimiteInferior.requestFocus();
        }

    }//GEN-LAST:event_btnCalcularActionPerformed

    private void btnMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMenuActionPerformed
        
        MenuPrincipal mp = new MenuPrincipal();
        mp.setVisible(true);
        this.setVisible(false);
        
    }//GEN-LAST:event_btnMenuActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCalcular;
    private javax.swing.JButton btnMenu;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel txtArea;
    private javax.swing.JTextField txtFuncion;
    private javax.swing.JTextField txtLimiteInferior;
    private javax.swing.JTextField txtLimiteSuperior;
    // End of variables declaration//GEN-END:variables
}