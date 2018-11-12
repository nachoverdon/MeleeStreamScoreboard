/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.nachoverdon.mss.view;

import javax.swing.JComponent;

/**
 *
 * @author Nacho Verdón Blázquez
 */
public class PlayersInfoPanel extends javax.swing.JPanel {
    private JComponent[] teamsComponents;

    /**
     * Creates new form playersInfoPanel
     */
    public PlayersInfoPanel() {
        initComponents();
        panelPlayer1.setPlayerNumber(1);
        panelPlayer2.setPlayerNumber(2);
        panelPlayer3.setPlayerNumber(3);
        panelPlayer4.setPlayerNumber(4);
        setVisible(true);

        teamsComponents = new JComponent[]{
            panelPlayer3, panelPlayer4, buttonSwap1And3, buttonSwap2And4,
            buttonSwap3And4
        };

        setTeams(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelPlayer1 = new com.nachoverdon.mss.view.PlayerPanel();
        panelPlayer2 = new com.nachoverdon.mss.view.PlayerPanel();
        panelPlayer3 = new com.nachoverdon.mss.view.PlayerPanel();
        panelPlayer4 = new com.nachoverdon.mss.view.PlayerPanel();
        checkBoxTeams = new javax.swing.JCheckBox();
        buttonSwap1And2 = new javax.swing.JButton();
        buttonSwap1And3 = new javax.swing.JButton();
        buttonSwap2And4 = new javax.swing.JButton();
        buttonSwap3And4 = new javax.swing.JButton();

        setMaximumSize(new java.awt.Dimension(532, 365));
        setMinimumSize(new java.awt.Dimension(532, 365));
        setName(""); // NOI18N
        setPreferredSize(new java.awt.Dimension(532, 365));

        panelPlayer3.setEnabled(false);

        panelPlayer4.setEnabled(false);

        checkBoxTeams.setText("Teams");
        checkBoxTeams.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkBoxTeamsActionPerformed(evt);
            }
        });

        buttonSwap1And2.setText("↔");
        buttonSwap1And2.setMaximumSize(new java.awt.Dimension(50, 32));
        buttonSwap1And2.setMinimumSize(new java.awt.Dimension(50, 32));
        buttonSwap1And2.setPreferredSize(new java.awt.Dimension(50, 32));

        buttonSwap1And3.setText("↕");
        buttonSwap1And3.setEnabled(false);

        buttonSwap2And4.setText("↕");
        buttonSwap2And4.setEnabled(false);
        buttonSwap2And4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonSwap2And4ActionPerformed(evt);
            }
        });

        buttonSwap3And4.setText("↔");
        buttonSwap3And4.setEnabled(false);
        buttonSwap3And4.setMaximumSize(new java.awt.Dimension(50, 32));
        buttonSwap3And4.setMinimumSize(new java.awt.Dimension(50, 32));
        buttonSwap3And4.setPreferredSize(new java.awt.Dimension(50, 32));
        buttonSwap3And4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonSwap3And4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(4, 4, 4)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(panelPlayer1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(buttonSwap1And2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(panelPlayer2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(panelPlayer3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(checkBoxTeams)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(buttonSwap1And3)))
                        .addGap(0, 0, 0)
                        .addComponent(buttonSwap3And4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(panelPlayer4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(buttonSwap2And4))))
                .addContainerGap(4, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(4, 4, 4)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(buttonSwap1And2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(panelPlayer2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(panelPlayer1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(buttonSwap2And4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(buttonSwap1And3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(checkBoxTeams, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, 0)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelPlayer4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonSwap3And4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(panelPlayer3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void checkBoxTeamsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkBoxTeamsActionPerformed
        if (isTeams()) setTeams(true);
        else setTeams(false);
    }//GEN-LAST:event_checkBoxTeamsActionPerformed

    private void buttonSwap3And4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonSwap3And4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_buttonSwap3And4ActionPerformed

    private void buttonSwap2And4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonSwap2And4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_buttonSwap2And4ActionPerformed

    private boolean isTeams() {
        return checkBoxTeams.isSelected();
    }

    private void setTeams(boolean enable) {
        checkBoxTeams.setSelected(enable);
        for (JComponent component: teamsComponents) {
            component.setVisible(enable);
            component.setEnabled(enable);
        }
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonSwap1And2;
    private javax.swing.JButton buttonSwap1And3;
    private javax.swing.JButton buttonSwap2And4;
    private javax.swing.JButton buttonSwap3And4;
    private javax.swing.JCheckBox checkBoxTeams;
    private com.nachoverdon.mss.view.PlayerPanel panelPlayer1;
    private com.nachoverdon.mss.view.PlayerPanel panelPlayer2;
    private com.nachoverdon.mss.view.PlayerPanel panelPlayer3;
    private com.nachoverdon.mss.view.PlayerPanel panelPlayer4;
    // End of variables declaration//GEN-END:variables
}