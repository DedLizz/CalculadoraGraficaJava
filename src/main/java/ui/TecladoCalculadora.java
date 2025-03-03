/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui;

import utils.ComunicadorTeclado;

/**
 *
 * @author brandon
 */
public class TecladoCalculadora extends javax.swing.JPanel {

    /**
     * Creates new form TecladoCalculadora
     */
    public TecladoCalculadora() {
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
        tresbnt = new javax.swing.JButton();
        seisbnt = new javax.swing.JButton();
        cuatrobtn = new javax.swing.JButton();
        cincobtn = new javax.swing.JButton();
        sietebnt = new javax.swing.JButton();
        unobtn = new javax.swing.JButton();
        nuevebtn = new javax.swing.JButton();
        ochobtn = new javax.swing.JButton();
        cerobnt = new javax.swing.JButton();
        dos = new javax.swing.JButton();

        jPanel1.setBackground(new java.awt.Color(0, 51, 153));
        jPanel1.setForeground(new java.awt.Color(0, 51, 153));

        tresbnt.setFont(new java.awt.Font("Noto Serif Thin", 3, 48)); // NOI18N
        tresbnt.setText("3");
        tresbnt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tresbntActionPerformed(evt);
            }
        });

        seisbnt.setFont(new java.awt.Font("Noto Serif Thin", 3, 48)); // NOI18N
        seisbnt.setText("6");
        seisbnt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                seisbntActionPerformed(evt);
            }
        });

        cuatrobtn.setFont(new java.awt.Font("Noto Serif Thin", 3, 48)); // NOI18N
        cuatrobtn.setText("4");
        cuatrobtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cuatrobtnActionPerformed(evt);
            }
        });

        cincobtn.setFont(new java.awt.Font("Noto Serif Thin", 3, 48)); // NOI18N
        cincobtn.setText("5");
        cincobtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cincobtnActionPerformed(evt);
            }
        });

        sietebnt.setFont(new java.awt.Font("Noto Serif Thin", 3, 48)); // NOI18N
        sietebnt.setText("7");
        sietebnt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sietebntActionPerformed(evt);
            }
        });

        unobtn.setFont(new java.awt.Font("Noto Serif Thin", 3, 48)); // NOI18N
        unobtn.setText("1");
        unobtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                unobtnActionPerformed(evt);
            }
        });

        nuevebtn.setFont(new java.awt.Font("Noto Serif Thin", 3, 48)); // NOI18N
        nuevebtn.setText("9");
        nuevebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nuevebtnActionPerformed(evt);
            }
        });

        ochobtn.setFont(new java.awt.Font("Noto Serif Thin", 3, 48)); // NOI18N
        ochobtn.setText("8");
        ochobtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ochobtnActionPerformed(evt);
            }
        });

        cerobnt.setFont(new java.awt.Font("Noto Serif Thin", 3, 48)); // NOI18N
        cerobnt.setText("0");
        cerobnt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cerobntActionPerformed(evt);
            }
        });

        dos.setFont(new java.awt.Font("Noto Serif Thin", 3, 48)); // NOI18N
        dos.setText("2");
        dos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(unobtn, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(dos, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tresbnt, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(cuatrobtn, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cincobtn, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(seisbnt, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(sietebnt, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cerobnt, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(ochobtn, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(nuevebtn, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(unobtn, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dos, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tresbnt, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cuatrobtn, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cincobtn, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(seisbnt, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(sietebnt, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ochobtn, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nuevebtn, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cerobnt)
                .addContainerGap(18, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void unobtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_unobtnActionPerformed
        ComunicadorTeclado.agregarTexto("1");
    }//GEN-LAST:event_unobtnActionPerformed

    private void dosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dosActionPerformed
        ComunicadorTeclado.agregarTexto("2");
    }//GEN-LAST:event_dosActionPerformed

    private void tresbntActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tresbntActionPerformed
        ComunicadorTeclado.agregarTexto("3");
    }//GEN-LAST:event_tresbntActionPerformed

    private void cuatrobtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cuatrobtnActionPerformed
        ComunicadorTeclado.agregarTexto("4");
    }//GEN-LAST:event_cuatrobtnActionPerformed

    private void cincobtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cincobtnActionPerformed
        ComunicadorTeclado.agregarTexto("5");
    }//GEN-LAST:event_cincobtnActionPerformed

    private void seisbntActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_seisbntActionPerformed
        ComunicadorTeclado.agregarTexto("6");
    }//GEN-LAST:event_seisbntActionPerformed

    private void sietebntActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sietebntActionPerformed
        ComunicadorTeclado.agregarTexto("7");
    }//GEN-LAST:event_sietebntActionPerformed

    private void ochobtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ochobtnActionPerformed
        ComunicadorTeclado.agregarTexto("8");
    }//GEN-LAST:event_ochobtnActionPerformed

    private void nuevebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nuevebtnActionPerformed
        ComunicadorTeclado.agregarTexto("9");
    }//GEN-LAST:event_nuevebtnActionPerformed

    private void cerobntActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cerobntActionPerformed
        ComunicadorTeclado.agregarTexto("0");
    }//GEN-LAST:event_cerobntActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cerobnt;
    private javax.swing.JButton cincobtn;
    private javax.swing.JButton cuatrobtn;
    private javax.swing.JButton dos;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton nuevebtn;
    private javax.swing.JButton ochobtn;
    private javax.swing.JButton seisbnt;
    private javax.swing.JButton sietebnt;
    private javax.swing.JButton tresbnt;
    private javax.swing.JButton unobtn;
    // End of variables declaration//GEN-END:variables
}
