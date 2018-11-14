/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.nachoverdon.mss.view;

import com.nachoverdon.mss.model.IconItem;
import com.nachoverdon.mss.model.Icons;
import com.nachoverdon.mss.utils.JSONReader;
import java.awt.Component;
import java.awt.Image;
import java.io.File;
import java.util.Arrays;
import javax.swing.DefaultListCellRenderer;
import javax.swing.ImageIcon;
import javax.swing.JList;
import javax.swing.border.TitledBorder;
import org.json.*;
/**
 *
 * @author Nacho Verdón Blázquez
 */
public class PlayerPanel extends javax.swing.JPanel {
    
    /**
     * Creates new form PlayerPanel
     */
    public PlayerPanel() {
        Icons.init();
        initComponents();
        initNames();
        initCharacters();
        initSponsors();
        initFlags();
        
        comboBoxColor.setRenderer(new IconRenderer());
        
//        changeColorsComboBox();
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

        comboBoxColor.setMinimumSize(new java.awt.Dimension(28, 30));
        comboBoxColor.setPreferredSize(new java.awt.Dimension(28, 30));

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

        comboBoxCharacter.setMinimumSize(new java.awt.Dimension(28, 30));
        comboBoxCharacter.setPreferredSize(new java.awt.Dimension(28, 30));
        comboBoxCharacter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboBoxCharacterActionPerformed(evt);
            }
        });

        comboBoxFlag.setMinimumSize(new java.awt.Dimension(28, 30));
        comboBoxFlag.setPreferredSize(new java.awt.Dimension(28, 30));

        comboBoxSponsor.setMinimumSize(new java.awt.Dimension(28, 30));
        comboBoxSponsor.setPreferredSize(new java.awt.Dimension(28, 30));

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
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(labelSponsor, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(comboBoxSponsor, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(comboBoxCharacter, javax.swing.GroupLayout.Alignment.LEADING, 0, 128, Short.MAX_VALUE)
                        .addComponent(labelCharacter, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 128, Short.MAX_VALUE)
                        .addComponent(labelName, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 128, Short.MAX_VALUE)
                        .addComponent(comboBoxName, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(labelColor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(labelScore, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(labelFlag, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(comboBoxColor, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(spinnerScore, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(comboBoxFlag, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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

    public void setBorderTitle(String title) {
        TitledBorder border = (TitledBorder)getBorder();
        border.setTitle(title);
    }
    
    private void initNames() {
        JSONArray names = JSONReader.read("data/players.json")
            .getJSONArray("players");
        
        for (int i = 0; i < names.length(); i++) {
            comboBoxName.addItem(names.getString(i));
        }
    }
    
    private void initCharacters() {
        comboBoxCharacter.removeAllItems();
        comboBoxCharacter.setRenderer(new IconRenderer());

        JSONObject charJson = JSONReader.read("data/characters_colors.json")
            .getJSONObject("characters");
        
        String[] characters = new String[]{};
        characters = charJson.keySet().toArray(characters);
        Arrays.sort(characters);
        
        for (String character: characters) {
            
            IconItem item = new IconItem(
                character,
                Icons.getColors().get(character + "Vanilla")
            );

            comboBoxCharacter.addItem(item);
        }
    }
    
    private void initSponsors() {
        JSONObject json = JSONReader.read("data/sponsors.json")
            .getJSONObject("sponsors");        
        ImageIcon noSponsor = Icons.getSponsors().get("No sponsor");
        
        comboBoxSponsor.removeAllItems();
        comboBoxSponsor.setRenderer(new IconRenderer());        
        comboBoxSponsor.addItem(new IconItem("No sponsor", noSponsor));
        
        for (String sponsor: json.keySet()) {
            if (sponsor == "No sponsor") continue;
           
            IconItem item = new IconItem(
                sponsor, Icons.getSponsors().get(sponsor)
            );
            
            comboBoxSponsor.addItem(item);
        }
    }
    
    private void initFlags() {
        comboBoxFlag.removeAllItems();
        comboBoxFlag.setRenderer(new FlagRenderer());
        
        String[] flags = new String[]{};
        flags = Icons.getFlags().keySet().toArray(flags);
        Arrays.sort(flags);
        
        for (String flag: flags) {
            comboBoxFlag.addItem(flag);
        }
    }
    
    private void comboBoxNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboBoxNameActionPerformed
//        JSONObject file = JSONReader.read("data/players.json");
        
        // check if new name is in json, and add it if not
        // save file
    }//GEN-LAST:event_comboBoxNameActionPerformed
    
    public void changeColorsComboBox() {
        IconItem selected = (IconItem)comboBoxCharacter.getSelectedItem();
        JSONArray colorsArr = JSONReader.read("data/characters_colors.json")
            .getJSONObject("characters").getJSONArray(selected.name);
        
        String[] colors = new String[]{};
        colors = colorsArr.toList().toArray(colors);
        Arrays.sort(colors);
        
        comboBoxColor.removeAllItems();        
        comboBoxColor.addItem(new IconItem(
            "Vanilla",
            Icons.getColors().get(selected.name + "Vanilla")
        ));
        
        for (String color: colors) {
            if (color.equals("Vanilla")) continue;
            
            IconItem item = new IconItem(
                color,
                Icons.getColors().get(selected.name + color)
            );
            
            comboBoxColor.addItem(item);
        }
    }
    
    private void comboBoxCharacterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboBoxCharacterActionPerformed
        changeColorsComboBox();
    }//GEN-LAST:event_comboBoxCharacterActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<IconItem> comboBoxCharacter;
    private javax.swing.JComboBox<IconItem> comboBoxColor;
    private javax.swing.JComboBox<String> comboBoxFlag;
    private javax.swing.JComboBox<String> comboBoxName;
    private javax.swing.JComboBox<IconItem> comboBoxSponsor;
    private javax.swing.JLabel labelCharacter;
    private javax.swing.JLabel labelColor;
    private javax.swing.JLabel labelFlag;
    private javax.swing.JLabel labelName;
    private javax.swing.JLabel labelScore;
    private javax.swing.JLabel labelSponsor;
    private javax.swing.JSpinner spinnerScore;
    // End of variables declaration//GEN-END:variables
}

class IconRenderer extends DefaultListCellRenderer {    
    @Override
    public Component getListCellRendererComponent(JList<?> list, Object value,
            int index, boolean isSelected, boolean cellHasFocus) {
        super.getListCellRendererComponent(list, value, index, isSelected, cellHasFocus);
        
        IconItem item = (IconItem) value;
        
        if (item == null) return this;
        
        this.setText(item.name);
        this.setIcon(item.icon);
        
        return this;
    }
}
class FlagRenderer extends DefaultListCellRenderer {    
    @Override
    public Component getListCellRendererComponent(JList<?> list, Object value,
            int index, boolean isSelected, boolean cellHasFocus) {
        super.getListCellRendererComponent(list, value, index, isSelected, cellHasFocus);
        
        String name = (String) value;
        this.setText(name.toUpperCase());
        this.setIcon(Icons.getFlags().get(name));
        
        return this;
    }
}