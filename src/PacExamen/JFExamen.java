
package PacExamen;

import g4s21p8dlf.JPreguntas;
import g4s21p8dlf.JRespuestas;
import java.awt.Toolkit;
import javax.swing.JOptionPane;

public class JFExamen extends javax.swing.JFrame {


    public JFExamen() {
        initComponents();
        question.setText(p.getPregunta(posicion));
        String[] a = r.setRespuestas(posicion);
        buttonGroup1.clearSelection(); // sirve para borrar las selecciones de los radio button
        opc1.setText(a[0]);
        opc2.setText(a[1]);
        opc3.setText(a[2]);
        opc4.setText(a[3]);
        opc1.requestFocus();
        regresar.setEnabled(false);
        terminarExamen.setEnabled(false);
    }


    int posicion = 0;
    JRespuestas r = new JRespuestas();
    JPreguntas p = new JPreguntas();
    Object[] select = {"","","","",""};
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        question = new javax.swing.JLabel();
        opc1 = new javax.swing.JRadioButton();
        opc2 = new javax.swing.JRadioButton();
        opc3 = new javax.swing.JRadioButton();
        opc4 = new javax.swing.JRadioButton();
        terminarExamen = new javax.swing.JButton();
        avanzar = new javax.swing.JButton();
        regresar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setName("Examen"); // NOI18N

        question.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 18)); // NOI18N
        question.setText("¿Pregunta 1?");

        buttonGroup1.add(opc1);
        opc1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opc1ActionPerformed(evt);
            }
        });

        buttonGroup1.add(opc2);
        opc2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opc2ActionPerformed(evt);
            }
        });

        buttonGroup1.add(opc3);
        opc3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opc3ActionPerformed(evt);
            }
        });

        buttonGroup1.add(opc4);
        opc4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opc4ActionPerformed(evt);
            }
        });

        terminarExamen.setText("finish");
        terminarExamen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                terminarExamenActionPerformed(evt);
            }
        });

        avanzar.setText("next");
        avanzar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                avanzarActionPerformed(evt);
            }
        });

        regresar.setText("back");
        regresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                regresarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(question, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(regresar)
                        .addGap(99, 99, 99)
                        .addComponent(terminarExamen)
                        .addGap(92, 92, 92)
                        .addComponent(avanzar))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(opc2)
                        .addComponent(opc1)
                        .addComponent(opc3)
                        .addComponent(opc4)))
                .addContainerGap(297, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(question, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(opc1)
                .addGap(11, 11, 11)
                .addComponent(opc3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(opc4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(opc2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 107, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(regresar)
                    .addComponent(terminarExamen)
                    .addComponent(avanzar))
                .addGap(67, 67, 67))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void avanzarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_avanzarActionPerformed

        if(posicion == 3){
            avanzar.setEnabled(false);
            terminarExamen.setEnabled(true);
        }
        
        if(posicion < 5){
            regresar.setEnabled(true);
            posicion++;
            question.setText(p.getPregunta(posicion));
            String[] a = r.setRespuestas(posicion);
            buttonGroup1.clearSelection(); // sirve para borrar las selecciones de los radio button
            opc1.setText(a[0]);
            opc2.setText(a[1]);
            opc3.setText(a[2]);
            opc4.setText(a[3]);
            opc1.requestFocus();
        }else{
            Toolkit.getDefaultToolkit().beep();
        }
    }//GEN-LAST:event_avanzarActionPerformed

    private void regresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_regresarActionPerformed
       
            
        
        
        if(posicion == 0){
            regresar.setEnabled(false);
        }
        
        if(posicion > -1){
            posicion--;
            avanzar.setEnabled(true);
            question.setText(p.getPregunta(posicion));
            String[] a = r.setRespuestas(posicion);
            buttonGroup1.clearSelection(); // sirve para borrar las selecciones de los radio button
            opc1.setText(a[0]);
            opc2.setText(a[1]);
            opc3.setText(a[2]);
            opc4.setText(a[3]);
            opc1.requestFocus();
        }else{
            Toolkit.getDefaultToolkit().beep();
        }
    }//GEN-LAST:event_regresarActionPerformed

    private void terminarExamenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_terminarExamenActionPerformed
        
        int calificacion = 0;
        
        for(int i = 0; i < 5; i++){
            if(select[i].equals(r.getRespuesta(i))){
                calificacion = calificacion + 1;
            }
        }
        
        calificacion = calificacion * 2;
        
        JOptionPane.showMessageDialog(null, "Tu calificacion es " +  calificacion);
        
    }//GEN-LAST:event_terminarExamenActionPerformed

    private void opc1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opc1ActionPerformed
        select[posicion] = opc1.getLabel();
    }//GEN-LAST:event_opc1ActionPerformed

    private void opc2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opc2ActionPerformed
        select[posicion] = opc2.getLabel();
    }//GEN-LAST:event_opc2ActionPerformed

    private void opc3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opc3ActionPerformed
        select[posicion] = opc3.getLabel();
    }//GEN-LAST:event_opc3ActionPerformed

    private void opc4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opc4ActionPerformed
        select[posicion] = opc4.getLabel();
    }//GEN-LAST:event_opc4ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton avanzar;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton opc1;
    private javax.swing.JRadioButton opc2;
    private javax.swing.JRadioButton opc3;
    private javax.swing.JRadioButton opc4;
    private javax.swing.JLabel question;
    private javax.swing.JButton regresar;
    private javax.swing.JButton terminarExamen;
    // End of variables declaration//GEN-END:variables
}
