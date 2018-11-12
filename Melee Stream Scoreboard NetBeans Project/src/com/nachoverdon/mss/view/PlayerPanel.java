/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.nachoverdon.mss.view;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.border.TitledBorder;
import javax.swing.text.html.CSS;
import org.json.*;
/**
 *
 * @author Nacho Verdón Blázquez
 */
public class PlayerPanel extends javax.swing.JPanel {

    static JSONObject json;
    
    /**
     * Creates new form PlayerPanel
     */
    public PlayerPanel() {
        initComponents();
        
        if (json == null) {
            json = new JSONObject(readFile("data/characters_colors.json"));
        }
        
        changeColorsComboBox();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        labelScore = new javax.swing.JLabel();
        comboBoxColor = new javax.swing.JComboBox<>();
        labelCharacter = new javax.swing.JLabel();
        labelColor = new javax.swing.JLabel();
        labelSponsor = new javax.swing.JLabel();
        labelFlag = new javax.swing.JLabel();
        comboBoxName = new javax.swing.JComboBox<>();
        comboBoxCharacter = new javax.swing.JComboBox<>();
        comboBoxFlag = new javax.swing.JComboBox<>();
        comboBoxSponsor = new javax.swing.JComboBox<>();
        labelName = new javax.swing.JLabel();
        spinnerScore = new javax.swing.JSpinner();

        setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1), "Player X", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 1, 14))); // NOI18N

        labelScore.setText("Score");
        labelScore.setMaximumSize(new java.awt.Dimension(65, 14));
        labelScore.setMinimumSize(new java.awt.Dimension(65, 14));
        labelScore.setPreferredSize(new java.awt.Dimension(65, 14));

        comboBoxColor.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Vanilla" }));

        labelCharacter.setText("Character");
        labelCharacter.setMaximumSize(new java.awt.Dimension(65, 14));
        labelCharacter.setMinimumSize(new java.awt.Dimension(65, 14));
        labelCharacter.setPreferredSize(new java.awt.Dimension(65, 14));

        labelColor.setText("Color");
        labelColor.setMaximumSize(new java.awt.Dimension(65, 14));
        labelColor.setMinimumSize(new java.awt.Dimension(65, 14));
        labelColor.setPreferredSize(new java.awt.Dimension(65, 14));

        labelSponsor.setText("Sponsor");
        labelSponsor.setMaximumSize(new java.awt.Dimension(65, 14));
        labelSponsor.setMinimumSize(new java.awt.Dimension(65, 14));
        labelSponsor.setPreferredSize(new java.awt.Dimension(65, 14));

        labelFlag.setText("Flag");
        labelFlag.setMaximumSize(new java.awt.Dimension(65, 14));
        labelFlag.setMinimumSize(new java.awt.Dimension(65, 14));
        labelFlag.setPreferredSize(new java.awt.Dimension(65, 14));

        comboBoxName.setEditable(true);
        comboBoxName.setMaximumSize(new java.awt.Dimension(128, 26));
        comboBoxName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboBoxNameActionPerformed(evt);
            }
        });

        comboBoxCharacter.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Bowser", "Captain Falcon", "Donkey Kong", "Dr. Mario", "Falco", "Fox", "Ganondorf", "Ice Climbers", "Jigglypuff", "Kirby", "Link", "Luigi", "Mario", "Marth", "Mewtwo", "Mr. Game & Watch", "Ness", "Peach", "Pichu", "Pikachu", "Roy", "Samus", "Sheik", "Yoshi", "Young Link", "Zelda" }));
        comboBoxCharacter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboBoxCharacterActionPerformed(evt);
            }
        });

        comboBoxFlag.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-----", "USA", "Spain" }));

        comboBoxSponsor.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-----", "TSM", "C9", "Alliance" }));

        labelName.setText("Name");
        labelName.setMaximumSize(new java.awt.Dimension(65, 14));
        labelName.setMinimumSize(new java.awt.Dimension(65, 14));
        labelName.setPreferredSize(new java.awt.Dimension(65, 14));

        spinnerScore.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));
        spinnerScore.setMaximumSize(new java.awt.Dimension(37, 26));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(labelSponsor, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(comboBoxSponsor, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(comboBoxCharacter, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(labelCharacter, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(comboBoxName, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(labelName, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(spinnerScore, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(labelColor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(comboBoxColor, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(labelScore, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(comboBoxFlag, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(labelFlag, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelScore, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(comboBoxName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(spinnerScore, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelCharacter, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelColor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(comboBoxCharacter, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(comboBoxColor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelSponsor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelFlag, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(comboBoxSponsor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(comboBoxFlag, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        getAccessibleContext().setAccessibleDescription("");
    }// </editor-fold>//GEN-END:initComponents

    public void setPlayerNumber(int number) {
        TitledBorder border = (TitledBorder)getBorder();
        border.setTitle("Player " + number);
    }
    
    private void comboBoxNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboBoxNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboBoxNameActionPerformed

    public static String readFile(String filename) {
        String result = "";
        try {
            BufferedReader br = new BufferedReader(new FileReader(filename));
            StringBuilder sb = new StringBuilder();
            String line = br.readLine();
            while (line != null) {
                sb.append(line);
                line = br.readLine();
            }
            result = sb.toString();
        } catch(Exception e) {
            e.printStackTrace();
        }
        return result;
    }
    
    public void changeColorsComboBox() {
        String character = (String)comboBoxCharacter.getSelectedItem();
        JSONArray jarr = json.getJSONObject("characters").getJSONArray(character.toLowerCase());
        
        comboBoxColor.removeAllItems();
        
        for (int i = 0; i < jarr.length(); i++) {
            comboBoxColor.addItem(jarr.getString(i));
        } 
    }
    
    private void comboBoxCharacterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboBoxCharacterActionPerformed
        changeColorsComboBox();
    }//GEN-LAST:event_comboBoxCharacterActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> comboBoxCharacter;
    private javax.swing.JComboBox<String> comboBoxColor;
    private javax.swing.JComboBox<String> comboBoxFlag;
    private javax.swing.JComboBox<String> comboBoxName;
    private javax.swing.JComboBox<String> comboBoxSponsor;
    private javax.swing.JLabel labelCharacter;
    private javax.swing.JLabel labelColor;
    private javax.swing.JLabel labelFlag;
    private javax.swing.JLabel labelName;
    private javax.swing.JLabel labelScore;
    private javax.swing.JLabel labelSponsor;
    private javax.swing.JSpinner spinnerScore;
    // End of variables declaration//GEN-END:variables
}