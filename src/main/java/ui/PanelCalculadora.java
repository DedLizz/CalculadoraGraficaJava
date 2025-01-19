
package ui;

import logic.Operaciones;
import utils.ComunicadorTeclado;
import utils.Paneles;
import utils.Validacion;


public class PanelCalculadora extends javax.swing.JPanel {
    private double primerNumero = 0;
    private String operador = "";
    private boolean operacionSeleccionada = false;

  
    public PanelCalculadora() {
        initComponents();
        //validaro para el texfiel para que ingrese solo numeros
        Validacion.validadorSoloNumeros(TEXFIEL);
        
        // Registrar el JTextField para usarlo en ComunicadorTeclado
        ComunicadorTeclado.registrarTextField(TEXFIEL);
        
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        porcentajebtn = new javax.swing.JButton();
        limpiarbtn = new javax.swing.JButton();
        TEXFIEL = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        multiplicacionbtn = new javax.swing.JButton();
        divisionfbtn = new javax.swing.JButton();
        jButton16 = new javax.swing.JButton();
        sumabtn = new javax.swing.JButton();
        restabtn = new javax.swing.JButton();
        teclasNumericas = new javax.swing.JRadioButton();
        resultado = new javax.swing.JButton();

        jPanel1.setBackground(new java.awt.Color(0, 51, 153));
        jPanel1.setForeground(new java.awt.Color(0, 51, 153));
        jPanel1.setToolTipText("");

        porcentajebtn.setFont(new java.awt.Font("TeXGyreSchola", 3, 14)); // NOI18N
        porcentajebtn.setText("%");
        porcentajebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                porcentajebtnActionPerformed(evt);
            }
        });

        limpiarbtn.setFont(new java.awt.Font("TeXGyreSchola", 3, 18)); // NOI18N
        limpiarbtn.setText("c");
        limpiarbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                limpiarbtnActionPerformed(evt);
            }
        });

        TEXFIEL.setFont(new java.awt.Font("Source Code Pro Medium", 0, 24)); // NOI18N

        jLabel1.setFont(new java.awt.Font("sansserif", 3, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 102));
        jLabel1.setText("v.1");

        multiplicacionbtn.setFont(new java.awt.Font("TeXGyreSchola", 3, 18)); // NOI18N
        multiplicacionbtn.setText("*");
        multiplicacionbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                multiplicacionbtnActionPerformed(evt);
            }
        });

        divisionfbtn.setFont(new java.awt.Font("TeXGyreSchola", 3, 18)); // NOI18N
        divisionfbtn.setText("/");
        divisionfbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                divisionfbtnActionPerformed(evt);
            }
        });

        jButton16.setFont(new java.awt.Font("TeXGyreSchola", 3, 12)); // NOI18N
        jButton16.setText("Raíz");
        jButton16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton16ActionPerformed(evt);
            }
        });

        sumabtn.setFont(new java.awt.Font("TeXGyreSchola", 3, 18)); // NOI18N
        sumabtn.setText("+");
        sumabtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sumabtnActionPerformed(evt);
            }
        });

        restabtn.setFont(new java.awt.Font("TeXGyreSchola", 3, 18)); // NOI18N
        restabtn.setText("-");
        restabtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                restabtnActionPerformed(evt);
            }
        });

        teclasNumericas.setBackground(new java.awt.Color(0, 51, 153));
        teclasNumericas.setForeground(new java.awt.Color(255, 255, 102));
        teclasNumericas.setText("teclas numericas");
        teclasNumericas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                teclasNumericasActionPerformed(evt);
            }
        });

        resultado.setFont(new java.awt.Font("TeXGyreSchola", 3, 18)); // NOI18N
        resultado.setText("=");
        resultado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resultadoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(teclasNumericas))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(TEXFIEL))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(divisionfbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(multiplicacionbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(sumabtn, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(restabtn, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(porcentajebtn, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton16, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(resultado, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(limpiarbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(61, 61, 61))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(teclasNumericas))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(TEXFIEL, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(divisionfbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(multiplicacionbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sumabtn, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(restabtn, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(porcentajebtn, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(limpiarbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(resultado, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(17, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 465, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void divisionfbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_divisionfbtnActionPerformed
        //verifica si el TEXFIEL tiene contenido
        if ( !TEXFIEL.getText().trim().isEmpty()) {
            
            //se ejecuta si el operador esta vacio y la opeacion selecionada es falsa
            if (operador == "" && !operacionSeleccionada){
                primerNumero = Double.parseDouble(TEXFIEL.getText());
                operador = "/";
                operacionSeleccionada = true;
            TEXFIEL.setText("");
            } else if (operador != "/" && operacionSeleccionada){
                operador = "/";
            }
        }
      
    }//GEN-LAST:event_divisionfbtnActionPerformed

    private void multiplicacionbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_multiplicacionbtnActionPerformed
        
        //verifica si el TEXFIEL tiene contenido
        if(!TEXFIEL.getText().trim().isEmpty()) {
            
            //se ejcuta si el perador esta vacio y la operacion selecionada es falsa
            if (operador == "" && !operacionSeleccionada){
                primerNumero = Double.parseDouble(TEXFIEL.getText());
                operador = "*";
                operacionSeleccionada = true;
            TEXFIEL.setText("");
            } else if (operador != "*" && operacionSeleccionada){ // cambio de operacion
                operador = "*";
            }
        
        }
        
 
    }//GEN-LAST:event_multiplicacionbtnActionPerformed

    private void sumabtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sumabtnActionPerformed
        if(!TEXFIEL.getText().trim().isEmpty()){
            if (operador == "" && !operacionSeleccionada){
                primerNumero = Double.parseDouble(TEXFIEL.getText());
                operador = "+";
                operacionSeleccionada = true;
            TEXFIEL.setText("");
            } else if (operador != "+" && operacionSeleccionada) {
                operador = "+";
            }
        }
        
    }//GEN-LAST:event_sumabtnActionPerformed

    private void restabtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_restabtnActionPerformed
        if(!TEXFIEL.getText().trim().isEmpty()){
            if (operador == "" && !operacionSeleccionada) {
                primerNumero = Double.parseDouble(TEXFIEL.getText());
                operador = "-";
                operacionSeleccionada = true;
            TEXFIEL.setText("");
            } else if (operador != "-" && operacionSeleccionada) {
                operador = "-";
            }
        }

    }//GEN-LAST:event_restabtnActionPerformed

    private void porcentajebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_porcentajebtnActionPerformed
        if (!TEXFIEL.getText().trim().isEmpty()){
            if (operador == "" && !operacionSeleccionada) {
                primerNumero = Double.parseDouble(TEXFIEL.getText());
                operador = "%";
                operacionSeleccionada = true;
                TEXFIEL.setText(""); 
            } else if (operador != "%"){
                operador = "%";
            }
        }

    }//GEN-LAST:event_porcentajebtnActionPerformed

    private void jButton16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton16ActionPerformed
        if(!TEXFIEL.getText().trim().isEmpty()){
            if(operador == "" && !operacionSeleccionada){
                primerNumero = Double.parseDouble(TEXFIEL.getText());
                operador = "raiz";
                operacionSeleccionada = true;
                TEXFIEL.setText("");
            } else if (operador != "raiz" && operacionSeleccionada) {
                operador = "raiz";
            }
        }
    }//GEN-LAST:event_jButton16ActionPerformed

    private void limpiarbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_limpiarbtnActionPerformed
        TEXFIEL.setText("");
        operacionSeleccionada = false;
        operador = "";
        primerNumero = 0;
    }//GEN-LAST:event_limpiarbtnActionPerformed

    private void resultadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resultadoActionPerformed
        
        if(operacionSeleccionada){
            //segundo numero ingresado que lo toma cuando presiona el (=)
            double segundoNumero = Double.parseDouble(TEXFIEL.getText());
            double resultado = 0;

            //evalua la opearcion que se establecio
            switch (operador) {
                case "+":
                    resultado = Operaciones.suma(primerNumero, segundoNumero);
                    break;
                case "-":
                    resultado = Operaciones.resta(primerNumero, segundoNumero);
                    break;
                case "%":
                    resultado = Operaciones.porcentaje(primerNumero, segundoNumero);
                    break;
                case "*":
                    resultado = Operaciones.multipliacion(primerNumero, segundoNumero);
                    break;
                case "/":
                    resultado = Operaciones.division(primerNumero, segundoNumero);
                    break;
                case "raiz":
                    resultado = Operaciones.raiz(primerNumero, segundoNumero);
                    break;

            }

            TEXFIEL.setText(String.valueOf(resultado));
            operacionSeleccionada = false;
            
        }
        
 
    }//GEN-LAST:event_resultadoActionPerformed

    private void teclasNumericasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_teclasNumericasActionPerformed
        // Verificamos si el RadioButton está seleccionado
        if (teclasNumericas.isSelected()) {
            // Llamamos al método que muestra el panel de teclas numéricas
            utils.Paneles.teclaNumerica(true);
        } else {
            // Llamamos al método para cerrar el panel de teclas numéricas
            utils.Paneles.teclaNumerica(false);
        }
    }//GEN-LAST:event_teclasNumericasActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField TEXFIEL;
    private javax.swing.JButton divisionfbtn;
    private javax.swing.JButton jButton16;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton limpiarbtn;
    private javax.swing.JButton multiplicacionbtn;
    private javax.swing.JButton porcentajebtn;
    private javax.swing.JButton restabtn;
    private javax.swing.JButton resultado;
    private javax.swing.JButton sumabtn;
    private javax.swing.JRadioButton teclasNumericas;
    // End of variables declaration//GEN-END:variables
}
