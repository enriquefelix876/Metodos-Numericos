/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.itson.pmn.gui;

import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.data.xy.XYSeries;
import org.jfree.data.xy.XYSeriesCollection;

/**
 *
 * @author enriq_000
 */
public class MetodoRegresionPolinomial extends javax.swing.JFrame {

    /**
     * Creates new form MetodoRegresionPolinomial
     */
    
    //Declaración de una matriz de tipo
    JTextField[][]campo = new JTextField[10][2];

    /**Declaración de la variable global n, que identifica la cantidad de 
     * puntos ingresados en la gráfica
    */
    int n;

    /**Declaración del arreglo que guardará todos los valores de X ingresados
     * en los campos de texto
    */
    double[]valorDeX;
    
    /**Declaración del arreglo que guardará todos los valores de Y ingresados
     * en los campos de texto
    */
    double[]valorDeY;
    
    //Declaración del modelo de la tabla 1
    DefaultTableModel modelo = new DefaultTableModel();
    
    //Declaración del modelo de la tabla 2
    DefaultTableModel modelo2 = new DefaultTableModel();
    public MetodoRegresionPolinomial() {
        
        initComponents();
        
                //Metodo para centrar pantalla
        this.setLocationRelativeTo(null);

        //Columnas agregadas a la tabla 1
        modelo.addColumn("n");
        modelo.addColumn("Sumatoria X");
        modelo.addColumn("Sumatoria Y");
        modelo.addColumn("Sumatoria X^2");
        modelo.addColumn("Sumatoria X^3");
        modelo.addColumn("Sumatoria X^4");
        modelo.addColumn("Producto X*Y");
        modelo.addColumn("Producto X^2*Y");
        
        //Columnas agregadas a la tabla 2
        modelo2.addColumn("X");
        modelo2.addColumn("Y");
        
        //Establecimiento de modelo 1 a la tabla 1 y establecimiento del grosor de la fila
        tablaValores.setModel(modelo);
        tablaValores.setRowHeight(27);
        
        //Establecimiento de modelo 2 a la tabla 2 y establecimiento del grosor de la fila 
        tablaValores2.setModel(modelo2);
        tablaValores2.setRowHeight(50);
        
        //Se inicia n con un valor de 2 puntos predeterminadamente
        n = 2;
        
        //Aqui se agregan los JTextField a la matriz de JTextField
        campo[0][0]=campo00;
        campo[1][0]=campo10;
        campo[2][0]=campo20;
        campo[3][0]=campo30;
        campo[4][0]=campo40;
        campo[5][0]=campo50;
        campo[6][0]=campo60;
        campo[7][0]=campo70;
        campo[8][0]=campo80;
        campo[9][0]=campo90;
        
        campo[0][1]=campo01;
        campo[1][1]=campo11;
        campo[2][1]=campo21;
        campo[3][1]=campo31;
        campo[4][1]=campo41;
        campo[5][1]=campo51;
        campo[6][1]=campo61;
        campo[7][1]=campo71;
        campo[8][1]=campo81;
        campo[9][1]=campo91;
        
        //Invocación del metodo que genera los campos al inicio, se iniciará en
        //2 ya que previamente se señaló
        generarCampos();
        
        //Invocación del metodo que generá una gráfica vacia al iniciar
        generarGraficaVacia();
    }

        /**
     * Este metodo tiene la finalidad de generar una gráfica vacia
     * Se utilizará al iniciar el programa, y al dar click en el boton Nuevo
     */
    private void generarGraficaVacia(){
    
        XYSeries series = new XYSeries("");
        

        XYSeriesCollection dataset = new XYSeriesCollection();
        dataset.addSeries(series);

        JFreeChart chart = ChartFactory.createXYLineChart(
                "Gráfica",
                "X",
                "Y",
                dataset,
                PlotOrientation.VERTICAL,
                false,
                false,
                false
        );

        // Mostramos la grafica dentro del jPanel1
        ChartPanel panel = new ChartPanel(chart);        
        panelGrafica.setLayout(new java.awt.BorderLayout());
        panelGrafica.add(panel);   
        panelGrafica.validate();
    }

    /**
     * Este metodo pondrá visible todos los campos necesarios para poder 
     * ingresar valores de acuerdo al valor de la variable global n que se
     * obtiene al recibir su valor del comboBox que expresa el número de puntos
     */
    private void generarCampos(){
    
        //Se iguala n al valor obtenido de comboBox
        n = Integer.parseInt(comboCantidad.getSelectedItem().toString());
        
        //Se ponen ocultos todos los campos de texto momentaneamente
        for (int i = 0; i < 10; i++) {
            
            for (int j = 0; j < 2; j++) {
             
                campo[i][j].setEnabled(false);
            }
        }
        
        /**
         * Se ponen visibles todos los campos necesarios para poder ingresar los
         * valores de n número de puntos
         */
        for (int i = 0; i < n; i++) {
            
            for (int j = 0; j < 2; j++) {
                
                campo[i][j].setEnabled(true);
            }
        }
    }
    
    /**
     * Este metodo tiene la funcionalidad de obtener todos los valores 
     *  en los campos de texto y así crear dos vectores con los valores de X
     * y Y
     */
    private void generarArreglosDeVariables(){
        
        //Se obtiene la longitud de los vectores
        n = Integer.parseInt(comboCantidad.getSelectedItem().toString());
        
        //Se iguala la longitud de los vectores a n
        valorDeX = new double[n];
        valorDeY = new double[n];

        //Se inicia un bucle for en el que se añadirán los valores de x al vector
        //de 1 por 1
        for (int i = 0; i < n; i++) {
            
            valorDeX[i] = Double.parseDouble(campo[i][0].getText());
        }
        
        //Se inicia un bucle for en el que se añadirán los valores de x al vector
        //de 1 por 1
        for (int i = 0; i <n; i++) {
            
            valorDeY[i] = Double.parseDouble(campo[i][1].getText());
        }
        
    }
    
    /**
     * Este metodo tiene la funcionalidad de crear un vector con la información
     * obtenida de x previamente pero al cuadrado
     */
    double[]xAlCuadrado;
    private void generarArregloXAlCuadrado(){
    
        //Se obtiene la longitud del vector
        n = Integer.parseInt(comboCantidad.getSelectedItem().toString());
        
        //Se iguala la longitud del vector a n
        xAlCuadrado = new double[n];
        
        //Se van ingresando los valores al vector de x al cuadrado de 1 por 1
       //en un bucle for
        for (int i = 0; i < n; i++) {
            
            xAlCuadrado[i] = Math.pow(valorDeX[i], 2);
            
        }
    }
    
        /**
     * Este metodo tiene la funcionalidad de crear un vector con la información
     * obtenida de x previamente pero al cuadrado
     */
    
    double[]xAlCubo;
    private void generarArregloXAlCubo(){
    
        //Se obtiene la longitud del vector
        n = Integer.parseInt(comboCantidad.getSelectedItem().toString());
        
        //Se iguala la longitud del vector a n
        xAlCubo = new double[n];
        
        //Se van ingresando los valores al vector de x al cuadrado de 1 por 1
       //en un bucle for
        for (int i = 0; i < n; i++) {
            
            xAlCubo[i] = Math.pow(valorDeX[i], 3);
            
        }
    }
    
        double[]xAlaCuarta;
    private void generarArregloXAlaCuarta(){
    
        //Se obtiene la longitud del vector
        n = Integer.parseInt(comboCantidad.getSelectedItem().toString());
        
        //Se iguala la longitud del vector a n
        xAlaCuarta = new double[n];
        
        //Se van ingresando los valores al vector de x al cuadrado de 1 por 1
       //en un bucle for
        for (int i = 0; i < n; i++) {
            
            xAlaCuarta[i] = Math.pow(valorDeX[i], 4);
            
        }
    }
    
    /**
     * Se genera un arreglo con los valores obtenidos previamente de XY 
     * multiplicados
     */
    double[]productoXPorY;
    private void generarArregloProductoXPorY(){
    
        //Se obtiene la longitud del vector
        n = Integer.parseInt(comboCantidad.getSelectedItem().toString());
        
        //Se iguala la longitud del vector a n
        productoXPorY = new double[n];
        
        //Se van ingresando los valores al vector de x multiplicado por
        //y de 1 por 1 en un bucle for
        for (int i = 0; i < n; i++) {
         
            productoXPorY[i] = valorDeX[i]*valorDeY[i];
            
        }
    }
    
     /**
     * Se genera un arreglo con los valores obtenidos previamente de XY 
     * multiplicados
     */
    double[]productoXAlCuadradoPorY;
    private void generarArregloProductoXAlCuadradoPorY(){
    
        //Se obtiene la longitud del vector
        n = Integer.parseInt(comboCantidad.getSelectedItem().toString());
        
        //Se iguala la longitud del vector a n
        productoXAlCuadradoPorY = new double[n];
        
        //Se van ingresando los valores al vector de x multiplicado por
        //y de 1 por 1 en un bucle for
        for (int i = 0; i < n; i++) {
         
            productoXAlCuadradoPorY[i] = xAlCuadrado[i]*valorDeY[i];
            
        }
    }
    
    /**
     * Este metodo tiene la funcionalidad de sumar todos los elementos de un
     * arreglo de tipo doble
     * @param arreglo de tipo double
     * @return sumatoriaArreglo
     */
    private double sumatoriaArreglo(double[]arreglo){
    
        //Se obtiene la longitd del arreglo a analizar
        n = Integer.parseInt(comboCantidad.getSelectedItem().toString());
        
        //Se inicia la sumatoria en 0
        double sumatoriaArreglo = 0;
        
        //Se va sumando 1 a 1 los elementos del arreglo en un bucle for
        for (int i = 0; i < n; i++) {
            
            sumatoriaArreglo += arreglo[i];
        }
        
        return sumatoriaArreglo;
    }
    double a;
    double b;
    
    /**
     * Este metodo limpia las tablas de un modelo dado
     * @param modeloTabla a limpiar
     */
    private void limpiarTabla(DefaultTableModel modeloTabla){
    
        int filas = modeloTabla.getRowCount();
            
            for (int i = 0;filas>i; i++) {
                
                modeloTabla.removeRow(0);
            }
    }
    
    /**
     * Este metodo generá un gráfica usando la Libreria JFreeChart al dar click
     * en el botón Aceptar
     */
    private void generarGrafica(){
    
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();

        //Se van agregandos los elementos de Y en funcion de la función obtenida 
        //por el metodo de regresión polinomial, y a la vez se agregarán 
        //los elementos de y dados originalmente para comparar ambas lineas en 
        //la gráfica
        for (int i = 0; i < 10; i++) {

            //Recta Obtenida al realizar el metodo de Regresión Lineal
            dataset.addValue(matriz[2][3]*Math.pow(i, 2)+matriz[1][3]*i+matriz[0][3], "Recta generada "
                    + "al aplicar Regresión Polinomial", "" + i);

        }

        JFreeChart chart = ChartFactory.createLineChart(
                "Y = "+String.format("%.2f", a)+"x+("+String.format("%.2f", b)+")",
                "X",
                "Y",
                dataset,
                PlotOrientation.VERTICAL,
                true,
                false,
                false
        );

        //Mostramos la grafica en pantalla
        ChartPanel panel = new ChartPanel(chart);        
        panelGrafica.setLayout(new java.awt.BorderLayout());
        panelGrafica.add(panel);   
        panelGrafica.validate();
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelInicio = new javax.swing.JTabbedPane();
        panelLineal = new javax.swing.JPanel();
        panelCampos = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        comboCantidad = new javax.swing.JComboBox<>();
        btnAplicar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        campo00 = new javax.swing.JTextField();
        campo01 = new javax.swing.JTextField();
        campo10 = new javax.swing.JTextField();
        campo11 = new javax.swing.JTextField();
        campo20 = new javax.swing.JTextField();
        campo21 = new javax.swing.JTextField();
        campo30 = new javax.swing.JTextField();
        campo31 = new javax.swing.JTextField();
        campo40 = new javax.swing.JTextField();
        campo41 = new javax.swing.JTextField();
        campo50 = new javax.swing.JTextField();
        campo60 = new javax.swing.JTextField();
        campo61 = new javax.swing.JTextField();
        campo70 = new javax.swing.JTextField();
        campo71 = new javax.swing.JTextField();
        campo80 = new javax.swing.JTextField();
        campo81 = new javax.swing.JTextField();
        campo90 = new javax.swing.JTextField();
        campo91 = new javax.swing.JTextField();
        campo51 = new javax.swing.JTextField();
        txtEcuacionDeLaRecta = new javax.swing.JLabel();
        btnResolver = new javax.swing.JButton();
        btnNuevo = new javax.swing.JButton();
        panelGrafica = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaValores2 = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        tablaValores = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        btnBiseccion = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Método Regresión Polinomial");
        setResizable(false);

        panelLineal.setBackground(new java.awt.Color(102, 102, 255));

        panelCampos.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Cantidad de Puntos");

        comboCantidad.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        comboCantidad.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "2", "3", "4", "5", "6", "7", "8", "9", "10" }));

        btnAplicar.setText("Aplicar");
        btnAplicar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAplicarActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel3.setText("X");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel4.setText("Y");

        campo00.setText("1");
        campo00.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campo00ActionPerformed(evt);
            }
        });

        campo10.setText("2");

        campo20.setText("3");

        campo30.setText("4");

        campo40.setText("5");

        campo50.setText("6");

        campo60.setText("7");

        campo70.setText("8");

        campo80.setText("9");

        campo90.setText("10");

        txtEcuacionDeLaRecta.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        txtEcuacionDeLaRecta.setText("Y = ax^2+ax+b");

        btnResolver.setText("Aceptar");
        btnResolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResolverActionPerformed(evt);
            }
        });

        btnNuevo.setText("Nuevo");
        btnNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelCamposLayout = new javax.swing.GroupLayout(panelCampos);
        panelCampos.setLayout(panelCamposLayout);
        panelCamposLayout.setHorizontalGroup(
            panelCamposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCamposLayout.createSequentialGroup()
                .addGroup(panelCamposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelCamposLayout.createSequentialGroup()
                        .addGap(73, 73, 73)
                        .addComponent(jLabel2))
                    .addGroup(panelCamposLayout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(109, 109, 109)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(panelCamposLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(panelCamposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelCamposLayout.createSequentialGroup()
                        .addGroup(panelCamposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(panelCamposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(campo70, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(campo60, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(campo50, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(campo20, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(campo10, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(campo30, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(campo40, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(campo00, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(panelCamposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelCamposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(campo61, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 108, Short.MAX_VALUE)
                                .addComponent(campo51, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(campo41, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(campo01, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(campo31, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(campo21, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(campo11, javax.swing.GroupLayout.Alignment.LEADING))
                            .addComponent(campo71, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(20, Short.MAX_VALUE))
                    .addGroup(panelCamposLayout.createSequentialGroup()
                        .addGroup(panelCamposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(panelCamposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(panelCamposLayout.createSequentialGroup()
                                    .addGroup(panelCamposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(campo80, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(campo90, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(18, 18, 18)
                                    .addGroup(panelCamposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(campo81, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(campo91, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addComponent(txtEcuacionDeLaRecta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnResolver, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(panelCamposLayout.createSequentialGroup()
                                .addComponent(comboCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnAplicar, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        panelCamposLayout.setVerticalGroup(
            panelCamposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCamposLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 21, Short.MAX_VALUE)
                .addGroup(panelCamposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(comboCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAplicar))
                .addGap(12, 12, 12)
                .addComponent(btnNuevo)
                .addGap(13, 13, 13)
                .addGroup(panelCamposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelCamposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(campo01, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(campo00, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelCamposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(campo11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(campo10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelCamposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(campo21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(campo20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelCamposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(campo31, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(campo30, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelCamposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(campo40, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(campo41, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelCamposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(campo51, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(campo50, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addGroup(panelCamposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(campo61, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(campo60, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelCamposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(campo70, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(campo71, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelCamposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(campo80, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(campo81, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelCamposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(campo90, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(campo91, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(txtEcuacionDeLaRecta)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnResolver)
                .addGap(18, 18, 18))
        );

        panelGrafica.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        panelGrafica.setMaximumSize(new java.awt.Dimension(524, 397));
        panelGrafica.setMinimumSize(new java.awt.Dimension(524, 397));

        javax.swing.GroupLayout panelGraficaLayout = new javax.swing.GroupLayout(panelGrafica);
        panelGrafica.setLayout(panelGraficaLayout);
        panelGraficaLayout.setHorizontalGroup(
            panelGraficaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        panelGraficaLayout.setVerticalGroup(
            panelGraficaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        tablaValores2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "X", "Y"
            }
        ));
        jScrollPane1.setViewportView(tablaValores2);

        tablaValores.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane3.setViewportView(tablaValores);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Aplicando la formula");

        btnBiseccion.setBackground(new java.awt.Color(102, 102, 255));
        btnBiseccion.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnBiseccion.setText("Menu Principal");
        btnBiseccion.setBorder(null);
        btnBiseccion.setBorderPainted(false);
        btnBiseccion.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnBiseccion.setOpaque(false);
        btnBiseccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBiseccionActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelLinealLayout = new javax.swing.GroupLayout(panelLineal);
        panelLineal.setLayout(panelLinealLayout);
        panelLinealLayout.setHorizontalGroup(
            panelLinealLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLinealLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelCampos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(panelLinealLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelLinealLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(panelLinealLayout.createSequentialGroup()
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(panelGrafica, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 1020, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBiseccion, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(24, Short.MAX_VALUE))
        );
        panelLinealLayout.setVerticalGroup(
            panelLinealLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelLinealLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelLinealLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(panelLinealLayout.createSequentialGroup()
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addGroup(panelLinealLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(panelGrafica, javax.swing.GroupLayout.PREFERRED_SIZE, 350, Short.MAX_VALUE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                        .addGap(38, 38, 38)
                        .addComponent(btnBiseccion, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(panelCampos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(121, Short.MAX_VALUE))
        );

        panelInicio.addTab("Metodo Regresión Polinomial", panelLineal);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelInicio, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 1360, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelInicio)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAplicarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAplicarActionPerformed

        //Invocación del metodo Generar Campos
        generarCampos();
    }//GEN-LAST:event_btnAplicarActionPerformed

    private void campo00ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campo00ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campo00ActionPerformed
    double matriz[][];
    
     /**
     * Este metodo tiene la función de generar ambas tablas con los valores 
     * necesarios para la realización del metodo de regresión lineal multiple y 
     * los valor de Y en función de la función obtenida al realizar el metodo de
     * regresión lineal. A la vez generará una gráfica con dos lineas 
     * comparativas entre los valores ingresados en principio, y los valores de 
     * y en función de la funcion generada al realizar el metodo de regresión 
     * lineal
     * @param evt
     */
    private void btnResolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResolverActionPerformed

        //Bloque try en caso de que suceda alguna excepción
        try {
            //Se generan los arreglos de las variables X y Y
            generarArreglosDeVariables();

            //Se genera el arreglo de X al cuadrado
            generarArregloXAlCuadrado();
            generarArregloXAlCubo();
            generarArregloXAlaCuarta();
            generarArregloProductoXPorY();
            generarArregloProductoXAlCuadradoPorY();

            double sumatoriaX = sumatoriaArreglo(valorDeX);
            double sumatoriaY = sumatoriaArreglo(valorDeY);
            double sumatoriaXAlCuadrado = sumatoriaArreglo(xAlCuadrado);
            double sumatoriaXAlCubo = sumatoriaArreglo(xAlCubo);
            double sumatoriaXALaCuarta = sumatoriaArreglo(xAlaCuarta);
            double sumatoriaXPorY = sumatoriaArreglo(productoXPorY);
            double sumatoriaXAlCuadradoPorY = sumatoriaArreglo(productoXAlCuadradoPorY);

            //Valores de la tabla 1 para evitar campos duplicados
            limpiarTabla(modelo);

            //Se ingresan los valores sumatoriaX, sumatoriaY, sumatoriaXAlCuadrado,
            //sumatoriaProductoXPorY, promedioX, promedioY y n
            //redondeados a 2 cifras en la tabla 1
            String[]valoresTabla = new String[8];
            valoresTabla[0] = String.valueOf(n);
            valoresTabla[1] = String.valueOf(String.format("%.2f", sumatoriaX));
            valoresTabla[2] = String.valueOf(String.format("%.2f", sumatoriaY));
            valoresTabla[3] = String.valueOf(String.format("%.2f", sumatoriaXAlCuadrado));
            valoresTabla[4] = String.valueOf(String.format("%.2f", sumatoriaXAlCubo));
            valoresTabla[5] = String.valueOf(String.format("%.2f", sumatoriaXALaCuarta));
            valoresTabla[6] = String.valueOf(String.format("%.2f", sumatoriaXPorY));
            valoresTabla[7] = String.valueOf(String.format("%.2f", sumatoriaXAlCuadradoPorY));

            modelo.addRow(valoresTabla);

            matriz = generarMatrizAumentada(n, sumatoriaX, sumatoriaXAlCuadrado, sumatoriaY,
                sumatoriaXAlCubo, sumatoriaXPorY, sumatoriaXALaCuarta, sumatoriaXAlCuadradoPorY);

            double divisor;

            int contador=0;

            do{

                divisor = matriz[contador][contador];

                //Divide la fila a analizar entre su diagonal para igualar el primer
                //valor a 1
                for (int i = 0; i < 4; i++) {

                    matriz[contador][i] =  matriz[contador][i]/divisor;
                }

                //Convertir a 0 las las columnas

                for (int i = 0; i < 3; i++) {

                    double producto = matriz[contador][contador]*matriz[i][contador];

                    for (int j = 0; j < 4; j++) {

                        if (i!=contador) {

                            matriz[i][j] -= matriz[contador][j]*producto;
                        }
                    }
                }

                txtEcuacionDeLaRecta.setText("Y = "+String.format("%.2f", matriz[2][3])
                    +"x^2+"+String.format("%.2f", matriz[1][3])+"x+"+String.format("%.2f", matriz[0][3]));

                contador++;

                //Valores de la tabla 2
                limpiarTabla(modelo2);

                //Se ingresan todos los valores redondeados a 2 digitos en de X y Y
                //en la tabla 2
                String[]valoresTabla2 = new String[2];
                for (int i = 0; i < n; i++) {

                    valoresTabla2[0]=String.valueOf(String.format("%.2f", valorDeX[i]));

                    valoresTabla2[1]= String.valueOf(String.format("%.2f", (matriz[2][3]*Math.pow(valorDeX[i], 2))+matriz[1][3]*valorDeX[i]+matriz[0][3]));

                    double valor = matriz[2][3]*Math.pow(valorDeX[i], 2)+matriz[1][3]*valorDeX[i]+matriz[0][3];
                    modelo2.addRow(valoresTabla2);
                }
            }while(contador<n);

        } catch (Exception e) {

        }
        generarGrafica();
    }//GEN-LAST:event_btnResolverActionPerformed

    private double [][]generarMatrizAumentada(double numeroDatos, double sumatoriaX, double sumatoriaXAlCuadrado, double sumatoriaY,
    double sumatoriaXAlCubo, double sumatoriaXPorY, double sumatoriaXAlaCuarta, double sumatoriaXAlCuadradoPorY){

        double [][] matriz = new double[3][4];
        
            matriz[0][0] = numeroDatos;
            matriz[0][1] = sumatoriaX;
            matriz[0][2] = sumatoriaXAlCuadrado;
            matriz[0][3] = sumatoriaY;
            
            matriz[1][0] = sumatoriaX;
            matriz[1][1] = sumatoriaXAlCuadrado;
            matriz[1][2] = sumatoriaXAlCubo;
            matriz[1][3] = sumatoriaXPorY;
            
            matriz[2][0] = sumatoriaXAlCuadrado;
            matriz[2][1] = sumatoriaXAlCubo;
            matriz[2][2] = sumatoriaXAlaCuarta;
            matriz[2][3] = sumatoriaXAlCuadradoPorY;
            
            return matriz;
    }
        
    private void btnNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoActionPerformed

        //Se invoca el metodo para limpiar ambas tablas
        limpiarTabla(modelo);
        limpiarTabla(modelo2);

        /**
        * Este bucle for servirá para borrar todo lo escrito en los campos
        * y para ocultar todos los campos momentaneamente
        */
        for (int i = 0; i < 10; i++) {

            for (int j = 0; j < 2; j++) {
                campo[i][j].setEnabled(false);
                campo[i][j].setText(null);
            }
        }

        /**
        * Luego de borrar y ocultar todos los campos, se pondrán visibles los
        * primeros 4, para establecer los puntos disponibles en 2
        */
        for (int i = 0; i < 2; i++) {

            for (int j = 0; j < 2; j++) {

                campo[i][j].setEnabled(true);
            }
        }

        /**
        * Se seleccionará el indice 0 del comboBox, el cual tendrá un valor de
        * 2, esto servirá para poder darle este valor a n
        */
        this.comboCantidad.setSelectedIndex(0);

        /**
        * Se establecerá el valor de n de acuerdo al valor obtenido del
        * comboBox, el cual fue establecido previamente
        */
        n = Integer.parseInt(comboCantidad.getSelectedItem().toString());

        //Se genera una gráfica XY vacia
        generarGraficaVacia();

        //Se inserta 1 en el primer valor de X
        campo00.setText("1");
        //Se inserta 2 en el segundo valor de X
        campo10.setText("2");

        txtEcuacionDeLaRecta.setText("Y = ax+b");
    }//GEN-LAST:event_btnNuevoActionPerformed

    private void btnBiseccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBiseccionActionPerformed

        MetodoBiseccion mb = new MetodoBiseccion();
        mb.setVisible(true);
        this.setVisible(false);

    }//GEN-LAST:event_btnBiseccionActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAplicar;
    private javax.swing.JButton btnBiseccion;
    private javax.swing.JButton btnNuevo;
    private javax.swing.JButton btnResolver;
    private javax.swing.JTextField campo00;
    private javax.swing.JTextField campo01;
    private javax.swing.JTextField campo10;
    private javax.swing.JTextField campo11;
    private javax.swing.JTextField campo20;
    private javax.swing.JTextField campo21;
    private javax.swing.JTextField campo30;
    private javax.swing.JTextField campo31;
    private javax.swing.JTextField campo40;
    private javax.swing.JTextField campo41;
    private javax.swing.JTextField campo50;
    private javax.swing.JTextField campo51;
    private javax.swing.JTextField campo60;
    private javax.swing.JTextField campo61;
    private javax.swing.JTextField campo70;
    private javax.swing.JTextField campo71;
    private javax.swing.JTextField campo80;
    private javax.swing.JTextField campo81;
    private javax.swing.JTextField campo90;
    private javax.swing.JTextField campo91;
    private javax.swing.JComboBox<String> comboCantidad;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JPanel panelCampos;
    private javax.swing.JPanel panelGrafica;
    private javax.swing.JTabbedPane panelInicio;
    private javax.swing.JPanel panelLineal;
    private javax.swing.JTable tablaValores;
    private javax.swing.JTable tablaValores2;
    private javax.swing.JLabel txtEcuacionDeLaRecta;
    // End of variables declaration//GEN-END:variables
}
