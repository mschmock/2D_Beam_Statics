//Autor: Manuel Schmocker
//Datum: 24.02.2014

package ch.manuel.structurecalc2d;

//Eingabefenster für Randbedingungen

import java.awt.Color;

public class NewJDialog3 extends javax.swing.JDialog {

    //Konstruktor der Klasse
    public NewJDialog3(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        
        //Position Fenster festlegen
        int width = this.getWidth();
        int hight = this.getHeight();
        java.awt.Dimension d = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        this.setLocation((int) ((d.getWidth() - width)/2), (int) ((d.getHeight() - hight)/2));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jCheckBox1 = new javax.swing.JCheckBox();
        jCheckBox2 = new javax.swing.JCheckBox();
        jCheckBox3 = new javax.swing.JCheckBox();
        jCheckBox4 = new javax.swing.JCheckBox();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        model1 = new javax.swing.SpinnerNumberModel(1, 1, 1, 1);
        jSpinner1 = new javax.swing.JSpinner();
        jLabel3 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setTitle("Randbedingungen");
        setResizable(false);

        jCheckBox1.setText("Kraft Fx");
        jCheckBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox1ActionPerformed(evt);
            }
        });

        jCheckBox2.setText("Kraft Fy");
        jCheckBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox2ActionPerformed(evt);
            }
        });

        jCheckBox3.setText("X-Richtung blockiert");
        jCheckBox3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox3ActionPerformed(evt);
            }
        });

        jCheckBox4.setText("Y-Richtung blockiert");
        jCheckBox4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox4ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setText("Randbedingungen:");

        jLabel2.setText("Punkt wählen:");

        jSpinner1.setModel(model1);
        jSpinner1.setToolTipText("Punkt wählen");
        jSpinner1.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jSpinner1StateChanged(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel3.setText("Kräfte");

        jTextField1.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jTextField1.setText("10.0");
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel4.setText("Lager");

        jTextField2.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jTextField2.setText("10.0");
        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });

        jLabel5.setText("Wert eingeben:");

        jLabel6.setText("kN");

        jLabel7.setText("kN");

        jButton1.setText("OK");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jCheckBox4)
                            .addComponent(jLabel1)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(18, 18, 18)
                                .addComponent(jSpinner1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel4)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel3)
                                        .addGap(48, 48, 48))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(jCheckBox2)
                                        .addGap(18, 18, 18)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel7))
                                    .addComponent(jLabel5))))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jCheckBox1)
                                .addGap(18, 18, 18)
                                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel6))
                            .addComponent(jCheckBox3)
                            .addComponent(jButton1))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jSpinner1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCheckBox1)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCheckBox2)
                    .addComponent(jLabel7))
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jCheckBox3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jCheckBox4)
                .addGap(18, 18, 18)
                .addComponent(jButton1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //Auswahl betätigt: neuer Wert im jSpinner gewählt
    private void jSpinner1StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jSpinner1StateChanged
        updateGUI();
    }//GEN-LAST:event_jSpinner1StateChanged

    //Button OK pressed
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        //Bei Bedarf Textfeld auslesen
        if(jCheckBox1.isSelected()) {
            storeValField1();
        }
        if(jCheckBox2.isSelected()) {
            storeValField2();
        }
        
        //Fenster schliessen
        this.setVisible(false);         //Fenster auf nicht sichtbar, visible: false
        Main.myFrame.updateMyPlot();    //Diagramm aktualisieren (Randbedingungen anzeigen)
    }//GEN-LAST:event_jButton1ActionPerformed

    //CheckBox: Lager X-Richtung gewählt
    private void jCheckBox3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox3ActionPerformed
        int i = model1.getNumber().intValue() - 1;      //aktueller Wert aus Spinner lesen
        
        //Wert abspeichern
        Structure.getPt(i).setFixX(jCheckBox3.isSelected());
    }//GEN-LAST:event_jCheckBox3ActionPerformed

    //CheckBox: Lager Y-Richtung gewählt
    private void jCheckBox4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox4ActionPerformed
        int i = model1.getNumber().intValue() - 1;      //aktueller Wert aus Spinner lesen
        
        //Wert abspeichern
        Structure.getPt(i).setFixY(jCheckBox4.isSelected());
    }//GEN-LAST:event_jCheckBox4ActionPerformed

    //CheckBox: Kraft X-Richtung gewählt
    private void jCheckBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox1ActionPerformed
        int i = model1.getNumber().intValue() - 1;      //aktueller Wert aus Spinner lesen
        boolean checked = jCheckBox1.isSelected();
        
        //Wert abspeichern
        if (checked) {
            jTextField1.setEnabled(true);
            jTextField1.setBackground(col1);
            jTextField1.setText(Double.toString(Structure.getPt(i).getForceX()));
        } else {
            jTextField1.setEnabled(false);
            jTextField1.setBackground(col2);
            jTextField1.setText("-");
            Structure.getPt(i).setForceX(0.0);
        }
    }//GEN-LAST:event_jCheckBox1ActionPerformed

    //CheckBox: Kraft Y-Richtung gewählt
    private void jCheckBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox2ActionPerformed
        int i = model1.getNumber().intValue() - 1;      //aktueller Wert aus Spinner lesen
        boolean checked = jCheckBox2.isSelected();
        
        //Wert abspeichern
        if (checked) {
            jTextField2.setEnabled(true);
            jTextField2.setBackground(col1);
            jTextField2.setText(Double.toString(Structure.getPt(i).getForceY()));
        } else {
            jTextField2.setEnabled(false);
            jTextField2.setBackground(col2);
            jTextField2.setText("-");
            Structure.getPt(i).setForceY(0.0);
        }
    }//GEN-LAST:event_jCheckBox2ActionPerformed

    //Eingabe bestätigt "Enter": TextFeld1
    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        storeValField1();
    }//GEN-LAST:event_jTextField1ActionPerformed

    //Eingabe bestätigt "Enter": TextFeld2
    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        storeValField2();
    }//GEN-LAST:event_jTextField2ActionPerformed

   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JCheckBox jCheckBox2;
    private javax.swing.JCheckBox jCheckBox3;
    private javax.swing.JCheckBox jCheckBox4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JSpinner jSpinner1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    // End of variables declaration//GEN-END:variables

    //Eigene Variablen
    private javax.swing.SpinnerNumberModel model1;
    final private Color col1 = new Color(255, 255, 255);
    final private Color col2 = new Color(240, 240, 240);

    //jTextField1 auslesen und speichern
    private void storeValField1() {
        int i = model1.getNumber().intValue() - 1;      //aktueller Wert aus Spinner lesen
        String str = jTextField1.getText();
        
        //Kann die Eingabe numerisch interpretiert werden?
        if (MyUtilities.isNumeric(str)) {
            double fx = Double.parseDouble(str);
            Structure.getPt(i).setForceX(fx);       //Wert abspeichern: Kraft Fx
            jTextField1.setText(String.valueOf(MyUtilities.runden(fx, 3)));
        } else {
            MyUtilities.getErrorMsg("Eingabefehler", "Eingabe überprüfen!");
            jTextField1.setText(Double.toString(Structure.getPt(i).getForceX()));
        }
    }
    
    //jTextField2 auslesen und speichern
    private void storeValField2() {
        int i = model1.getNumber().intValue() - 1;      //aktueller Wert aus Spinner lesen
        String str = jTextField2.getText();
        
        //Kann die Eingabe numerisch interpretiert werden?
        if (MyUtilities.isNumeric(str)) {
            double fy = Double.parseDouble(str);
            Structure.getPt(i).setForceY(fy);       //Wert abspeichern: Kraft Fy
            jTextField2.setText(String.valueOf(MyUtilities.runden(fy, 3)));
        } else {
            MyUtilities.getErrorMsg("Eingabefehler", "Eingabe überprüfen!");
            jTextField2.setText(Double.toString(Structure.getPt(i).getForceY()));
        }
    }
    
    //Update Fenster
    public void updateGUI() {
        //aktueller Wert aus Spinner lesen
        int i = model1.getNumber().intValue() - 1;
        
        //gespeicherte Daten abbilden
        double fx = Structure.getPt(i).getForceX();
        double fy = Structure.getPt(i).getForceY();
        if (fx == 0) {
            jCheckBox1.setSelected(false);
            jTextField1.setEnabled(false);
            jTextField1.setBackground(col2);
            jTextField1.setText("-");
        } else {
            jCheckBox1.setSelected(true);
            jTextField1.setEnabled(true);
            jTextField1.setBackground(col1);
            jTextField1.setText(Double.toString(MyUtilities.runden(fx, 3)));
        }
        if (fy == 0) {
            jCheckBox2.setSelected(false);
            jTextField2.setEnabled(false);
            jTextField2.setBackground(col2);
            jTextField2.setText("-");
        } else {
            jCheckBox2.setSelected(true);
            jTextField2.setEnabled(true);
            jTextField2.setBackground(col1);
            jTextField2.setText(Double.toString(MyUtilities.runden(fy, 3)));
        }
        jCheckBox3.setSelected(Structure.getPt(i).getFixX());
        jCheckBox4.setSelected(Structure.getPt(i).getFixY());
    }
    
    //Auswahl für jSpinner zur Verfügung stellen
    public void setSelection() {
        int nb = Structure.getNbPts();
        //Maximum für Auswahl festlegen (Min = 1, bleibt immer so)
        model1.setMaximum(nb);
    }
}
