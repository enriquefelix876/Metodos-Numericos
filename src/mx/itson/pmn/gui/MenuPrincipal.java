/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.itson.pmn.gui;

/**
 *
 * @author enriq_000
 */
public class MenuPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form MenuPrincipal
     */
    public MenuPrincipal() {
        
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

        panelPrincipal = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btnNewton = new javax.swing.JButton();
        btnBiseccion = new javax.swing.JButton();
        btnReglaFalsa = new javax.swing.JButton();
        btnSecante = new javax.swing.JButton();
        btnGaussJordan = new javax.swing.JButton();
        btnMatrizInversa = new javax.swing.JButton();
        btnGaussSeidel = new javax.swing.JButton();
        btnLRegresionLineal = new javax.swing.JButton();
        btnCalcular8 = new javax.swing.JButton();
        btnRegresionMultiple = new javax.swing.JButton();
        btnInterpolacionNewton = new javax.swing.JButton();
        btnCalcular11 = new javax.swing.JButton();
        btnCalcular12 = new javax.swing.JButton();
        btnCalcular13 = new javax.swing.JButton();
        btnCalcular14 = new javax.swing.JButton();
        btnSimpson38 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Metodos Númericos");

        panelPrincipal.setBackground(new java.awt.Color(0, 102, 153));
        panelPrincipal.setToolTipText("");

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 30)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Métodos Numericos");

        btnNewton.setBackground(new java.awt.Color(102, 102, 255));
        btnNewton.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnNewton.setText("Método de Newton");
        btnNewton.setBorder(null);
        btnNewton.setBorderPainted(false);
        btnNewton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnNewton.setOpaque(false);
        btnNewton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNewtonActionPerformed(evt);
            }
        });

        btnBiseccion.setBackground(new java.awt.Color(102, 102, 255));
        btnBiseccion.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnBiseccion.setText("Método de Bisección");
        btnBiseccion.setBorder(null);
        btnBiseccion.setBorderPainted(false);
        btnBiseccion.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnBiseccion.setOpaque(false);
        btnBiseccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBiseccionActionPerformed(evt);
            }
        });

        btnReglaFalsa.setBackground(new java.awt.Color(102, 102, 255));
        btnReglaFalsa.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnReglaFalsa.setText("Método de la Regla Falsa");
        btnReglaFalsa.setBorder(null);
        btnReglaFalsa.setBorderPainted(false);
        btnReglaFalsa.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnReglaFalsa.setOpaque(false);
        btnReglaFalsa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReglaFalsaActionPerformed(evt);
            }
        });

        btnSecante.setBackground(new java.awt.Color(102, 102, 255));
        btnSecante.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnSecante.setText("Método de la Secante");
        btnSecante.setBorder(null);
        btnSecante.setBorderPainted(false);
        btnSecante.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSecante.setOpaque(false);
        btnSecante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSecanteActionPerformed(evt);
            }
        });

        btnGaussJordan.setBackground(new java.awt.Color(102, 102, 255));
        btnGaussJordan.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnGaussJordan.setText("Método de Gauss Jordan");
        btnGaussJordan.setBorder(null);
        btnGaussJordan.setBorderPainted(false);
        btnGaussJordan.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnGaussJordan.setOpaque(false);
        btnGaussJordan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGaussJordanActionPerformed(evt);
            }
        });

        btnMatrizInversa.setBackground(new java.awt.Color(102, 102, 255));
        btnMatrizInversa.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnMatrizInversa.setText("Método de Matriz Inversa");
        btnMatrizInversa.setBorder(null);
        btnMatrizInversa.setBorderPainted(false);
        btnMatrizInversa.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnMatrizInversa.setOpaque(false);
        btnMatrizInversa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMatrizInversaActionPerformed(evt);
            }
        });

        btnGaussSeidel.setBackground(new java.awt.Color(102, 102, 255));
        btnGaussSeidel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnGaussSeidel.setText("Método de Gauss Seidel");
        btnGaussSeidel.setBorder(null);
        btnGaussSeidel.setBorderPainted(false);
        btnGaussSeidel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnGaussSeidel.setOpaque(false);
        btnGaussSeidel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGaussSeidelActionPerformed(evt);
            }
        });

        btnLRegresionLineal.setBackground(new java.awt.Color(102, 102, 255));
        btnLRegresionLineal.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnLRegresionLineal.setText("Método Regresión Lineal");
        btnLRegresionLineal.setBorder(null);
        btnLRegresionLineal.setBorderPainted(false);
        btnLRegresionLineal.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnLRegresionLineal.setOpaque(false);
        btnLRegresionLineal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLRegresionLinealActionPerformed(evt);
            }
        });

        btnCalcular8.setBackground(new java.awt.Color(102, 102, 255));
        btnCalcular8.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnCalcular8.setText("Método Regresión Polinomial");
        btnCalcular8.setBorder(null);
        btnCalcular8.setBorderPainted(false);
        btnCalcular8.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCalcular8.setOpaque(false);
        btnCalcular8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalcular8ActionPerformed(evt);
            }
        });

        btnRegresionMultiple.setBackground(new java.awt.Color(102, 102, 255));
        btnRegresionMultiple.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnRegresionMultiple.setText("Método Regresión Multiple");
        btnRegresionMultiple.setBorder(null);
        btnRegresionMultiple.setBorderPainted(false);
        btnRegresionMultiple.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnRegresionMultiple.setOpaque(false);
        btnRegresionMultiple.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegresionMultipleActionPerformed(evt);
            }
        });

        btnInterpolacionNewton.setBackground(new java.awt.Color(102, 102, 255));
        btnInterpolacionNewton.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnInterpolacionNewton.setText("Método Interpolación Newton");
        btnInterpolacionNewton.setBorder(null);
        btnInterpolacionNewton.setBorderPainted(false);
        btnInterpolacionNewton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnInterpolacionNewton.setOpaque(false);
        btnInterpolacionNewton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInterpolacionNewtonActionPerformed(evt);
            }
        });

        btnCalcular11.setBackground(new java.awt.Color(102, 102, 255));
        btnCalcular11.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnCalcular11.setText("Método Interpolación Lagrange");
        btnCalcular11.setBorder(null);
        btnCalcular11.setBorderPainted(false);
        btnCalcular11.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCalcular11.setOpaque(false);
        btnCalcular11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalcular11ActionPerformed(evt);
            }
        });

        btnCalcular12.setBackground(new java.awt.Color(102, 102, 255));
        btnCalcular12.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnCalcular12.setText("Regla del Rectangulo");
        btnCalcular12.setBorder(null);
        btnCalcular12.setBorderPainted(false);
        btnCalcular12.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCalcular12.setOpaque(false);
        btnCalcular12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalcular12ActionPerformed(evt);
            }
        });

        btnCalcular13.setBackground(new java.awt.Color(102, 102, 255));
        btnCalcular13.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnCalcular13.setText("Regla del Trapecio");
        btnCalcular13.setBorder(null);
        btnCalcular13.setBorderPainted(false);
        btnCalcular13.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCalcular13.setOpaque(false);
        btnCalcular13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalcular13ActionPerformed(evt);
            }
        });

        btnCalcular14.setBackground(new java.awt.Color(102, 102, 255));
        btnCalcular14.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnCalcular14.setText("Regla de 1/3 Simpson");
        btnCalcular14.setBorder(null);
        btnCalcular14.setBorderPainted(false);
        btnCalcular14.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCalcular14.setOpaque(false);
        btnCalcular14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalcular14ActionPerformed(evt);
            }
        });

        btnSimpson38.setBackground(new java.awt.Color(102, 102, 255));
        btnSimpson38.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnSimpson38.setText("Regla de 3/8 Simpson");
        btnSimpson38.setBorder(null);
        btnSimpson38.setBorderPainted(false);
        btnSimpson38.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSimpson38.setOpaque(false);
        btnSimpson38.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSimpson38ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelPrincipalLayout = new javax.swing.GroupLayout(panelPrincipal);
        panelPrincipal.setLayout(panelPrincipalLayout);
        panelPrincipalLayout.setHorizontalGroup(
            panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelPrincipalLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(250, 250, 250))
            .addGroup(panelPrincipalLayout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelPrincipalLayout.createSequentialGroup()
                        .addComponent(btnRegresionMultiple, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40)
                        .addComponent(btnInterpolacionNewton, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40)
                        .addComponent(btnCalcular11, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(panelPrincipalLayout.createSequentialGroup()
                            .addComponent(btnGaussSeidel, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(40, 40, 40)
                            .addComponent(btnLRegresionLineal, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(40, 40, 40)
                            .addComponent(btnCalcular8, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelPrincipalLayout.createSequentialGroup()
                                .addComponent(btnSecante, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(40, 40, 40)
                                .addComponent(btnGaussJordan, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(40, 40, 40)
                                .addComponent(btnMatrizInversa, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(panelPrincipalLayout.createSequentialGroup()
                                .addComponent(btnBiseccion, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(40, 40, 40)
                                .addComponent(btnReglaFalsa, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(40, 40, 40)
                                .addComponent(btnNewton, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(panelPrincipalLayout.createSequentialGroup()
                        .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnSimpson38, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(panelPrincipalLayout.createSequentialGroup()
                                .addComponent(btnCalcular12, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(40, 40, 40)
                                .addComponent(btnCalcular13, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(40, 40, 40)
                        .addComponent(btnCalcular14, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(42, Short.MAX_VALUE))
        );
        panelPrincipalLayout.setVerticalGroup(
            panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPrincipalLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel1)
                .addGap(49, 49, 49)
                .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnNewton, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBiseccion, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnReglaFalsa, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnMatrizInversa, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSecante, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnGaussJordan, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCalcular8, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnGaussSeidel, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnLRegresionLineal, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCalcular11, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnRegresionMultiple, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnInterpolacionNewton, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCalcular14, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCalcular12, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCalcular13, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnSimpson38, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(49, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnNewtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNewtonActionPerformed

        MetodoNewton mn = new MetodoNewton();
        mn.setVisible(true);
        this.setVisible(false);
        
    }//GEN-LAST:event_btnNewtonActionPerformed

    private void btnBiseccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBiseccionActionPerformed

        MetodoBiseccion mb = new MetodoBiseccion();
        mb.setVisible(true);
        this.setVisible(false);
        
    }//GEN-LAST:event_btnBiseccionActionPerformed

    private void btnReglaFalsaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReglaFalsaActionPerformed
        
        MetodoReglaFalsa mrf = new MetodoReglaFalsa();
        mrf.setVisible(true);
        this.setVisible(false);
        
    }//GEN-LAST:event_btnReglaFalsaActionPerformed

    private void btnSecanteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSecanteActionPerformed
        
        MetodoSecante ms = new MetodoSecante();
        ms.setVisible(true);
        this.setVisible(false);
        
    }//GEN-LAST:event_btnSecanteActionPerformed

    private void btnGaussJordanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGaussJordanActionPerformed
        
        MetodoGaussJordan mgj = new MetodoGaussJordan();
        mgj.setVisible(true);
        this.setVisible(false);
        
    }//GEN-LAST:event_btnGaussJordanActionPerformed

    private void btnMatrizInversaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMatrizInversaActionPerformed
        
        MetodoMatrizInversa mmi = new MetodoMatrizInversa();
        mmi.setVisible(true);
        this.setVisible(false);
        
    }//GEN-LAST:event_btnMatrizInversaActionPerformed

    private void btnGaussSeidelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGaussSeidelActionPerformed
        
        MetodoGaussSeidel mgs = new MetodoGaussSeidel();
        mgs.setVisible(true);
        this.setVisible(false);
        
    }//GEN-LAST:event_btnGaussSeidelActionPerformed

    private void btnLRegresionLinealActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLRegresionLinealActionPerformed
        
        MetodoRegresionLineal mrl = new MetodoRegresionLineal();
        mrl.setVisible(true);
        this.setVisible(false);
        
    }//GEN-LAST:event_btnLRegresionLinealActionPerformed

    private void btnCalcular8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalcular8ActionPerformed
        
        MetodoRegresionPolinomial mrp = new MetodoRegresionPolinomial();
        mrp.setVisible(true);
        this.setVisible(false);
        
    }//GEN-LAST:event_btnCalcular8ActionPerformed

    private void btnRegresionMultipleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresionMultipleActionPerformed
        
        MetodoRegresionMultiple mrm = new MetodoRegresionMultiple();
        mrm.setVisible(true);
        this.setVisible(false);
        
    }//GEN-LAST:event_btnRegresionMultipleActionPerformed

    private void btnInterpolacionNewtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInterpolacionNewtonActionPerformed
        
        MetodoInterpolacionNewton min = new MetodoInterpolacionNewton();
        min.setVisible(true);
        this.setVisible(false);
        
    }//GEN-LAST:event_btnInterpolacionNewtonActionPerformed

    private void btnCalcular11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalcular11ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCalcular11ActionPerformed

    private void btnCalcular12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalcular12ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCalcular12ActionPerformed

    private void btnCalcular13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalcular13ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCalcular13ActionPerformed

    private void btnCalcular14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalcular14ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCalcular14ActionPerformed

    private void btnSimpson38ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSimpson38ActionPerformed
        
        MetodoSimpson38 ms38 = new MetodoSimpson38();
        ms38.setVisible(true);
        this.setVisible(false);
        
    }//GEN-LAST:event_btnSimpson38ActionPerformed

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
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBiseccion;
    private javax.swing.JButton btnCalcular11;
    private javax.swing.JButton btnCalcular12;
    private javax.swing.JButton btnCalcular13;
    private javax.swing.JButton btnCalcular14;
    private javax.swing.JButton btnCalcular8;
    private javax.swing.JButton btnGaussJordan;
    private javax.swing.JButton btnGaussSeidel;
    private javax.swing.JButton btnInterpolacionNewton;
    private javax.swing.JButton btnLRegresionLineal;
    private javax.swing.JButton btnMatrizInversa;
    private javax.swing.JButton btnNewton;
    private javax.swing.JButton btnReglaFalsa;
    private javax.swing.JButton btnRegresionMultiple;
    private javax.swing.JButton btnSecante;
    private javax.swing.JButton btnSimpson38;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel panelPrincipal;
    // End of variables declaration//GEN-END:variables
}
