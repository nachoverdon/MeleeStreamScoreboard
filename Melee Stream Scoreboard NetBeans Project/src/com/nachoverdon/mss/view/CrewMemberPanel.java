/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.nachoverdon.mss.view;

import com.nachoverdon.mss.model.IconItem;
import com.nachoverdon.mss.utils.ComboBoxUtils;
import org.json.JSONObject;

/**
 *
 * @author bazoo
 */
public class CrewMemberPanel extends javax.swing.JPanel {

    /**
     * Creates new form CrewMemberPanel
     */
    public CrewMemberPanel() {
        initComponents();
        initFields();
    }
    
    private void initFields() {
        try {
            ComboBoxUtils.initPlayers(comboBoxName, false);
            ComboBoxUtils.initCharacters(comboBoxCharacter, false);
        } catch (NullPointerException e) {
            e.printStackTrace();
        }
    }

    public JSONObject getInfo() {
        JSONObject json = new JSONObject();

        if (!isEnabled()) {
            return null;
        }

        json.put("name", comboBoxName.getSelectedItem());
        json.put("character", ComboBoxUtils.getSelectedItemName(comboBoxCharacter));
        json.put("stocksLeft", getStocksLeft());
        json.put("stocksTaken", stocksLeft.getValue());

        return json;
    }
    
    public int getStocksLeft() {
        return (int)stocksLeft.getValue();
    }
    
    // If it has a name, it's enabled.
    public boolean isEnabled() {
        String name = (String) comboBoxName.getSelectedItem();
        return name != null && !name.equals("");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        comboBoxName = new javax.swing.JComboBox<>();
        comboBoxCharacter = new javax.swing.JComboBox<>();
        stocksLeft = new javax.swing.JSpinner();
        stocksTaken = new javax.swing.JSpinner();

        comboBoxName.setEditable(true);
        comboBoxName.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "" }));
        comboBoxName.setToolTipText("");
        comboBoxName.setMaximumSize(new java.awt.Dimension(128, 26));
        comboBoxName.setName(""); // NOI18N
        comboBoxName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboBoxNameActionPerformed(evt);
            }
        });

        comboBoxCharacter.setToolTipText("");
        comboBoxCharacter.setEnabled(false);
        comboBoxCharacter.setMaximumSize(new java.awt.Dimension(128, 26));
        comboBoxCharacter.setName(""); // NOI18N
        comboBoxCharacter.setPreferredSize(new java.awt.Dimension(32, 20));

        stocksLeft.setModel(new javax.swing.SpinnerNumberModel(4, 0, 99, 1));
        stocksLeft.setEnabled(false);
        stocksLeft.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                stocksLeftStateChanged(evt);
            }
        });

        stocksTaken.setModel(new javax.swing.SpinnerNumberModel(0, 0, 99, 1));
        stocksTaken.setEnabled(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(comboBoxName, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 10, Short.MAX_VALUE)
                .addComponent(comboBoxCharacter, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(stocksLeft, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(stocksTaken, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(stocksLeft)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(comboBoxCharacter, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(comboBoxName, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(stocksTaken)
        );
    }// </editor-fold>//GEN-END:initComponents

    // Enable the fields when a name is selected or disables them if not.
    private void comboBoxNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboBoxNameActionPerformed
        String name = (String)comboBoxName.getSelectedItem();
        
        if (name.equals("")) {
            disableFields();
        } else {
            enableFields();
        }

//        try {
//            updateTotalStocksLeft();
//        } catch (NullPointerException e) {
//            System.out.println("This probably happened while loading the panel,"
//                    + "you can ignore it... I think.");
//            e.printStackTrace();
//        }
    }//GEN-LAST:event_comboBoxNameActionPerformed

    // Updates the total stocks left whenever a player updates their stocks left
    private void stocksLeftStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_stocksLeftStateChanged
        updateTotalStocksLeft();
    }//GEN-LAST:event_stocksLeftStateChanged

    // Calls the parent CrewPanel to update the total stock count.
    private void updateTotalStocksLeft() {
        // TODO: ROFL, this sucks but works. Enhance child/parent listener. maybe. lol
        CrewPanel crewPanel = (CrewPanel) getParent() // CrewMemberPanel 
                .getParent() // JViewport 
                .getParent() // JScrollPane
                .getParent(); // CrewPanel
        crewPanel.calculateStocksLeft();
    }
    
    // Enable fields and updates stocks
    private void setFields(boolean enabled) {
        comboBoxCharacter.setEnabled(enabled);
        stocksLeft.setEnabled(enabled);
        stocksTaken.setEnabled(enabled);
        updateTotalStocksLeft();
    }
    
    private void enableFields() {
        setFields(true);
    }
    
    private void disableFields() {
        setFields(false);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<IconItem> comboBoxCharacter;
    private javax.swing.JComboBox<String> comboBoxName;
    private javax.swing.JSpinner stocksLeft;
    private javax.swing.JSpinner stocksTaken;
    // End of variables declaration//GEN-END:variables
}