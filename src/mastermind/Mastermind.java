package mastermind;

import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Antonio
 */

public class Mastermind extends javax.swing.JFrame {

    //Crear variables y objetos
    //variables para el descodificador y el codificador
    final int CARACTERES_POR_DIFICULTAD = 4;
    Random generadorNumeros = new Random();
    char numero;
    final char INICIALIZAR_NUMERO = '0';
    String codificador = "";

    //variables para las fichas
    int rojas = 0;
    int blancas = 0;
    final String SIN_FICHAS = "0";
    //variables para el descodificador
    String cadena = "";     //esta variable la pongo solo por aclarar el codigo
    int numeroIntento = 1;
    final int ULTIMO_NUMERO = 10;

    //objetos
    static final Logger LOGGER = Logger.getLogger("MyLogger");
    
    
    public Mastermind() {
        initComponents();
        jButton2Reiniciar.doClick();
        LOGGER.log(Level.CONFIG, "El click emulado en el boton funciono correctamente");
        jButton2Reiniciar.setVisible(false); 
        jPanel2Codificador.setVisible(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1Descodificador = new javax.swing.JPanel();
        jLabel2Descodificador = new javax.swing.JLabel();
        jLabel13Rojas = new javax.swing.JLabel();
        jLabel14Blancas = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1Descodificador = new javax.swing.JTextArea();
        jButton1Comprobar = new javax.swing.JButton();
        jTextField1Rojas = new javax.swing.JTextField();
        jTextField1Blancas = new javax.swing.JTextField();
        jTextField1MeterCodigo = new javax.swing.JTextField();
        jButton2Reiniciar = new javax.swing.JButton();
        jPanel2Codificador = new javax.swing.JPanel();
        jLabel1Patron = new javax.swing.JLabel();
        jTextField1Patron = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1Descodificador.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel2Descodificador.setText("Descodificador");

        jLabel13Rojas.setText("Rojas");

        jLabel14Blancas.setText("Blancas");

        jTextArea1Descodificador.setColumns(20);
        jTextArea1Descodificador.setRows(5);
        jScrollPane1.setViewportView(jTextArea1Descodificador);

        jButton1Comprobar.setText("Comprobar");
        jButton1Comprobar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ComprobarActionPerformed(evt);
            }
        });

        jButton2Reiniciar.setText("Reiniciar partida");
        jButton2Reiniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ReiniciarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1DescodificadorLayout = new javax.swing.GroupLayout(jPanel1Descodificador);
        jPanel1Descodificador.setLayout(jPanel1DescodificadorLayout);
        jPanel1DescodificadorLayout.setHorizontalGroup(
            jPanel1DescodificadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1DescodificadorLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1DescodificadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1DescodificadorLayout.createSequentialGroup()
                        .addComponent(jLabel2Descodificador)
                        .addGap(18, 18, 18)
                        .addComponent(jTextField1MeterCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1))
                .addGroup(jPanel1DescodificadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1DescodificadorLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(jPanel1DescodificadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1DescodificadorLayout.createSequentialGroup()
                                .addGroup(jPanel1DescodificadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jTextField1Rojas, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel13Rojas, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1DescodificadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel14Blancas)
                                    .addComponent(jTextField1Blancas, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jButton2Reiniciar)))
                    .addGroup(jPanel1DescodificadorLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jButton1Comprobar)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1DescodificadorLayout.setVerticalGroup(
            jPanel1DescodificadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1DescodificadorLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1DescodificadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2Descodificador)
                    .addComponent(jTextField1MeterCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1Comprobar))
                .addGap(18, 18, 18)
                .addGroup(jPanel1DescodificadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1DescodificadorLayout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1DescodificadorLayout.createSequentialGroup()
                        .addGroup(jPanel1DescodificadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel13Rojas)
                            .addComponent(jLabel14Blancas))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1DescodificadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField1Rojas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField1Blancas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton2Reiniciar)
                        .addGap(39, 39, 39))))
        );

        jPanel2Codificador.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel2Codificador.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1Patron.setText("Patron");
        jPanel2Codificador.add(jLabel1Patron, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 60, -1));

        jTextField1Patron.setEditable(false);
        jPanel2Codificador.add(jTextField1Patron, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 10, 70, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2Codificador, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jPanel1Descodificador, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1Descodificador, javax.swing.GroupLayout.PREFERRED_SIZE, 306, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel2Codificador, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ComprobarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ComprobarActionPerformed
        try{
            cadena = jTextField1MeterCodigo.getText();
            //Este Logger muestra el codigo introducido por el usuario para resolver un posible error de datos
            LOGGER.log(Level.FINE, "La cadena para descifrar introducida por el usuario es " + cadena);
            if(cadena.length()<5){
                //introduccion del codigo del jugador
                if(numeroIntento <= ULTIMO_NUMERO){
                    LOGGER.log(Level.FINE, "El usuario ha intentado descubrir el codigo " + numeroIntento + " veces.");
                    jTextField1Rojas.setText(SIN_FICHAS);
                    jTextField1Blancas.setText(SIN_FICHAS); 
                    blancas = Integer.valueOf(SIN_FICHAS);
                    rojas = Integer.valueOf(SIN_FICHAS);
                    for(int j=0; j<CARACTERES_POR_DIFICULTAD; j++){
                        for(int k=0; k<CARACTERES_POR_DIFICULTAD; k++){
                            if(codificador.charAt(j) == (cadena.charAt(k))){
                                LOGGER.log(Level.FINE, "Ha acertado una ficha con el caracter " + cadena.charAt(k));
                                if(codificador.charAt(k) == (cadena.charAt(k))){
                                    rojas++;
                                    LOGGER.log(Level.FINER, "Ha acertado una ficha y es roja");
                                }
                            }
                            else{
                                blancas++;
                                LOGGER.log(Level.FINER, "Ha acertado una ficha y es blanca");
                            }
                        }
                    }
                    jTextField1Rojas.setText(String.valueOf(rojas));
                    jTextField1Blancas.setText(String.valueOf(blancas)); 
                    jTextArea1Descodificador.append(cadena + "\n");
                    //terminar juego
                    if(cadena.equals(codificador)){
                        jButton1Comprobar.setVisible(false);
                        new VentanaGanador(this, true).setVisible(true); 
                        jButton2Reiniciar.setVisible(true);
                    }
                    if(numeroIntento == ULTIMO_NUMERO){
                        jButton1Comprobar.setVisible(false);
                        new VentanaPerdedor(this, true).setVisible(true);
                        jButton2Reiniciar.setVisible(true);
                    }
                    numeroIntento++;
                }
                else{
                    new VentanaPerdedor(this, true).setVisible(true);
                }
            }
            else{
                JOptionPane.showMessageDialog(this, "Debes de introducir 4 números "
                        + "entre el 0 y 7", "Error", JOptionPane.ERROR_MESSAGE);
                LOGGER.log(Level.WARNING, "El jugador se le ha indicado cuantos digitos debe introducir");
            }
        }
        //para que muestre el mensaje si tiene menos de caracteres que la cadena con la que lo compara
        catch(IndexOutOfBoundsException ex){
            LOGGER.log(Level.WARNING, "El jugador se le ha indicado cuantos digitos debe introducir");
            JOptionPane.showMessageDialog(this, "Debes de introducir 4 números "
                    + "entre el 0 y 7", "Error", JOptionPane.ERROR_MESSAGE);
        }
        catch(NumberFormatException ex){
            JOptionPane.showMessageDialog(this, "La cadena no se puede analizar como un Integer", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jButton1ComprobarActionPerformed

    private void jButton2ReiniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ReiniciarActionPerformed
        try{
            LOGGER.log(Level.FINE, "Se inicio una nueva partida");
            //inicializar campos
            numeroIntento=1;
            jButton1Comprobar.setVisible(true);
            jTextField1MeterCodigo.setText("");
            jTextArea1Descodificador.setText("");
            codificador="";
            jTextField1Rojas.setText(SIN_FICHAS);
            jTextField1Blancas.setText(SIN_FICHAS); 
            //crear el codigo secreto
            for(int i=0; i<CARACTERES_POR_DIFICULTAD; i++){
                int contador;
                //lo declaro antes porque sera la pregunta de do while y le asigno valor despues
                //para que cada vez que saque un numero nuevo se salga del bucle si no encuentra repetidos 
                do{
                    contador=0;
                    //le sumamos el codigo char del 0  
                    //la suma de un char y un entero es un entero ya que este tipo de dato es mayor.
                    numero = (char)(generadorNumeros.nextInt(8) + INICIALIZAR_NUMERO);
                    for(int posicion=0; posicion<codificador.length(); posicion++){
                        if(numero == codificador.charAt(posicion)){
                            contador++;
                        }
                    }
                }while(contador!=0);
                codificador += numero;
            }
        }catch(IllegalArgumentException ex){
            JOptionPane.showMessageDialog(this, "El numero es negativo", "Error", JOptionPane.ERROR_MESSAGE);           
        }
        catch(IndexOutOfBoundsException ex){
            JOptionPane.showMessageDialog(this, "La longitud es negativa o corta", "Error", JOptionPane.ERROR_MESSAGE);           
        }
        jTextField1Patron.setText(codificador);
        jButton2Reiniciar.setVisible(false);
    }//GEN-LAST:event_jButton2ReiniciarActionPerformed

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
            java.util.logging.Logger.getLogger(Mastermind.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Mastermind.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Mastermind.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Mastermind.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Mastermind().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1Comprobar;
    private javax.swing.JButton jButton2Reiniciar;
    private javax.swing.JLabel jLabel13Rojas;
    private javax.swing.JLabel jLabel14Blancas;
    private javax.swing.JLabel jLabel1Patron;
    private javax.swing.JLabel jLabel2Descodificador;
    private javax.swing.JPanel jPanel1Descodificador;
    private javax.swing.JPanel jPanel2Codificador;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1Descodificador;
    private javax.swing.JTextField jTextField1Blancas;
    private javax.swing.JTextField jTextField1MeterCodigo;
    private javax.swing.JTextField jTextField1Patron;
    private javax.swing.JTextField jTextField1Rojas;
    // End of variables declaration//GEN-END:variables

}