/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.nachoverdon.mss.view;

/**
 *
 * @author Nacho Verdón Blázquez
 */
public class GeneralInfoPanel extends javax.swing.JPanel {

    /**
     * Creates new form GeneralInfoPanel
     */
    public GeneralInfoPanel() {
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

        labelRound = new javax.swing.JLabel();
        labelTournamentName = new javax.swing.JLabel();
        comboBoxRound = new javax.swing.JComboBox<>();
        comboBoxTournamentName = new javax.swing.JComboBox<>();
        labelWebsite = new javax.swing.JLabel();
        labelBracket = new javax.swing.JLabel();
        comboBoxWebsite = new javax.swing.JComboBox<>();
        comboBoxBracket = new javax.swing.JComboBox<>();
        labelCaster1 = new javax.swing.JLabel();
        labelCaster2 = new javax.swing.JLabel();
        comboBoxCaster1 = new javax.swing.JComboBox<>();
        comboBoxCaster2 = new javax.swing.JComboBox<>();
        labelPlayerCam1 = new javax.swing.JLabel();
        labelPlayerCam2 = new javax.swing.JLabel();
        comboBoxPlayerCam1 = new javax.swing.JComboBox<>();
        comboBoxPlayerCam2 = new javax.swing.JComboBox<>();
        labelPlayerCam3 = new javax.swing.JLabel();
        labelPlayerCam4 = new javax.swing.JLabel();
        comboBoxPlayerCam3 = new javax.swing.JComboBox<>();
        comboBoxPlayerCam4 = new javax.swing.JComboBox<>();
        labelMessage = new javax.swing.JLabel();
        comboBoxMessage = new javax.swing.JComboBox<>();
        buttonSend = new javax.swing.JButton();

        setMaximumSize(new java.awt.Dimension(532, 365));
        setMinimumSize(new java.awt.Dimension(532, 365));
        setPreferredSize(new java.awt.Dimension(532, 365));

        labelRound.setText("Round");

        labelTournamentName.setText("Tournament name");

        comboBoxRound.setEditable(true);
        comboBoxRound.setMaximumSize(new java.awt.Dimension(128, 26));
        comboBoxRound.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboBoxRoundActionPerformed(evt);
            }
        });

        comboBoxTournamentName.setEditable(true);
        comboBoxTournamentName.setMaximumSize(new java.awt.Dimension(128, 26));
        comboBoxTournamentName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboBoxTournamentNameActionPerformed(evt);
            }
        });

        labelWebsite.setText("Website");

        labelBracket.setText("Bracket");

        comboBoxWebsite.setEditable(true);
        comboBoxWebsite.setMaximumSize(new java.awt.Dimension(128, 26));
        comboBoxWebsite.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboBoxWebsiteActionPerformed(evt);
            }
        });

        comboBoxBracket.setEditable(true);
        comboBoxBracket.setMaximumSize(new java.awt.Dimension(128, 26));
        comboBoxBracket.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboBoxBracketActionPerformed(evt);
            }
        });

        labelCaster1.setText("Caster 1");

        labelCaster2.setText("Caster 2");

        comboBoxCaster1.setEditable(true);
        comboBoxCaster1.setMaximumSize(new java.awt.Dimension(128, 26));
        comboBoxCaster1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboBoxCaster1ActionPerformed(evt);
            }
        });

        comboBoxCaster2.setEditable(true);
        comboBoxCaster2.setMaximumSize(new java.awt.Dimension(128, 26));
        comboBoxCaster2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboBoxCaster2ActionPerformed(evt);
            }
        });

        labelPlayerCam1.setText("Player Cam 1");

        labelPlayerCam2.setText("Player Cam 2");

        comboBoxPlayerCam1.setEditable(true);
        comboBoxPlayerCam1.setMaximumSize(new java.awt.Dimension(128, 26));
        comboBoxPlayerCam1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboBoxPlayerCam1ActionPerformed(evt);
            }
        });

        comboBoxPlayerCam2.setEditable(true);
        comboBoxPlayerCam2.setMaximumSize(new java.awt.Dimension(128, 26));
        comboBoxPlayerCam2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboBoxPlayerCam2ActionPerformed(evt);
            }
        });

        labelPlayerCam3.setText("Player Cam 3");

        labelPlayerCam4.setText("Player Cam 4");

        comboBoxPlayerCam3.setEditable(true);
        comboBoxPlayerCam3.setMaximumSize(new java.awt.Dimension(128, 26));
        comboBoxPlayerCam3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboBoxPlayerCam3ActionPerformed(evt);
            }
        });

        comboBoxPlayerCam4.setEditable(true);
        comboBoxPlayerCam4.setMaximumSize(new java.awt.Dimension(128, 26));
        comboBoxPlayerCam4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboBoxPlayerCam4ActionPerformed(evt);
            }
        });

        labelMessage.setText("Message");

        comboBoxMessage.setEditable(true);
        comboBoxMessage.setMaximumSize(new java.awt.Dimension(128, 26));
        comboBoxMessage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboBoxMessageActionPerformed(evt);
            }
        });

        buttonSend.setText("Send");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(comboBoxMessage, javax.swing.GroupLayout.PREFERRED_SIZE, 407, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(buttonSend, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(labelCaster1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(labelWebsite, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(labelRound, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(comboBoxRound, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(comboBoxWebsite, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(comboBoxCaster1, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(comboBoxPlayerCam1, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(labelPlayerCam1, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(labelTournamentName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(comboBoxTournamentName, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(labelPlayerCam2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(comboBoxCaster2, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(labelCaster2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(comboBoxBracket, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(comboBoxPlayerCam2, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(labelBracket, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(labelMessage, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(comboBoxPlayerCam3, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(labelPlayerCam3, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(labelPlayerCam4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(comboBoxPlayerCam4, 0, 255, Short.MAX_VALUE)))))
                .addGap(10, 10, 10))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelRound)
                    .addComponent(labelTournamentName))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(comboBoxRound, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(comboBoxTournamentName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelWebsite)
                    .addComponent(labelBracket, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(comboBoxWebsite, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(comboBoxBracket, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelCaster1)
                    .addComponent(labelCaster2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(comboBoxCaster1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(comboBoxCaster2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelPlayerCam1)
                    .addComponent(labelPlayerCam2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(comboBoxPlayerCam1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(comboBoxPlayerCam2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelPlayerCam3, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelPlayerCam4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(comboBoxPlayerCam3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(comboBoxPlayerCam4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelMessage)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(comboBoxMessage, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonSend)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void comboBoxCaster1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboBoxCaster1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboBoxCaster1ActionPerformed

    private void comboBoxCaster2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboBoxCaster2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboBoxCaster2ActionPerformed

    private void comboBoxRoundActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboBoxRoundActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboBoxRoundActionPerformed

    private void comboBoxTournamentNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboBoxTournamentNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboBoxTournamentNameActionPerformed

    private void comboBoxPlayerCam2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboBoxPlayerCam2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboBoxPlayerCam2ActionPerformed

    private void comboBoxPlayerCam1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboBoxPlayerCam1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboBoxPlayerCam1ActionPerformed

    private void comboBoxPlayerCam4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboBoxPlayerCam4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboBoxPlayerCam4ActionPerformed

    private void comboBoxPlayerCam3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboBoxPlayerCam3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboBoxPlayerCam3ActionPerformed

    private void comboBoxMessageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboBoxMessageActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboBoxMessageActionPerformed

    private void comboBoxBracketActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboBoxBracketActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboBoxBracketActionPerformed

    private void comboBoxWebsiteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboBoxWebsiteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboBoxWebsiteActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonSend;
    private javax.swing.JComboBox<String> comboBoxBracket;
    private javax.swing.JComboBox<String> comboBoxCaster1;
    private javax.swing.JComboBox<String> comboBoxCaster2;
    private javax.swing.JComboBox<String> comboBoxMessage;
    private javax.swing.JComboBox<String> comboBoxPlayerCam1;
    private javax.swing.JComboBox<String> comboBoxPlayerCam2;
    private javax.swing.JComboBox<String> comboBoxPlayerCam3;
    private javax.swing.JComboBox<String> comboBoxPlayerCam4;
    private javax.swing.JComboBox<String> comboBoxRound;
    private javax.swing.JComboBox<String> comboBoxTournamentName;
    private javax.swing.JComboBox<String> comboBoxWebsite;
    private javax.swing.JLabel labelBracket;
    private javax.swing.JLabel labelCaster1;
    private javax.swing.JLabel labelCaster2;
    private javax.swing.JLabel labelMessage;
    private javax.swing.JLabel labelPlayerCam1;
    private javax.swing.JLabel labelPlayerCam2;
    private javax.swing.JLabel labelPlayerCam3;
    private javax.swing.JLabel labelPlayerCam4;
    private javax.swing.JLabel labelRound;
    private javax.swing.JLabel labelTournamentName;
    private javax.swing.JLabel labelWebsite;
    // End of variables declaration//GEN-END:variables
}