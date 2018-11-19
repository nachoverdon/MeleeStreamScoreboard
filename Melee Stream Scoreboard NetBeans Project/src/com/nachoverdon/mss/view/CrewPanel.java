/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.nachoverdon.mss.view;

import com.nachoverdon.mss.model.IconItem;
import com.nachoverdon.mss.model.Icons;
import com.nachoverdon.mss.utils.AutoCompletion;
import com.nachoverdon.mss.utils.FileUtils;
import java.awt.Component;
import java.util.Arrays;
import javax.swing.DefaultListCellRenderer;
import javax.swing.JComboBox;
import javax.swing.JList;
import javax.swing.JSpinner;
import javax.swing.border.TitledBorder;
import org.json.JSONObject;

/**
 *
 * @author bazoo
 */
public class CrewPanel extends javax.swing.JPanel {
    private CrewMember[] players;
    
    /**
     * Creates new form CrewPanel
     */
    public CrewPanel() {
        initComponents();
        players = new CrewMember[]{
            new CrewMember(name1, character1, stocksTaken1),
            new CrewMember(name2, character2, stocksTaken2),
            new CrewMember(name3, character3, stocksTaken3),
            new CrewMember(name4, character4, stocksTaken4),
            new CrewMember(name5, character5, stocksTaken5),
            new CrewMember(name6, character6, stocksTaken6),
            new CrewMember(name7, character7, stocksTaken7),
            new CrewMember(name8, character8, stocksTaken8),
            new CrewMember(name9, character9, stocksTaken9),
            new CrewMember(name10, character10, stocksTaken10)
        };
//        initCrewPlayers();
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        labelName = new javax.swing.JLabel();
        labelStocks = new javax.swing.JLabel();
        comboBoxName = new javax.swing.JComboBox<>();
        stocks = new javax.swing.JSpinner();
        jScrollPane = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
        labelPlayersName = new javax.swing.JLabel();
        labelPlayerCharacter = new javax.swing.JLabel();
        labalPlayerStocksTaken = new javax.swing.JLabel();
        name1 = new javax.swing.JComboBox<>();
        character1 = new javax.swing.JComboBox<>();
        stocksTaken1 = new javax.swing.JSpinner();
        name2 = new javax.swing.JComboBox<>();
        character2 = new javax.swing.JComboBox<>();
        stocksTaken2 = new javax.swing.JSpinner();
        name3 = new javax.swing.JComboBox<>();
        character3 = new javax.swing.JComboBox<>();
        stocksTaken3 = new javax.swing.JSpinner();
        name4 = new javax.swing.JComboBox<>();
        character4 = new javax.swing.JComboBox<>();
        stocksTaken4 = new javax.swing.JSpinner();
        name5 = new javax.swing.JComboBox<>();
        character5 = new javax.swing.JComboBox<>();
        stocksTaken5 = new javax.swing.JSpinner();
        name6 = new javax.swing.JComboBox<>();
        character6 = new javax.swing.JComboBox<>();
        stocksTaken6 = new javax.swing.JSpinner();
        name7 = new javax.swing.JComboBox<>();
        character7 = new javax.swing.JComboBox<>();
        stocksTaken7 = new javax.swing.JSpinner();
        name8 = new javax.swing.JComboBox<>();
        character8 = new javax.swing.JComboBox<>();
        stocksTaken8 = new javax.swing.JSpinner();
        name9 = new javax.swing.JComboBox<>();
        character9 = new javax.swing.JComboBox<>();
        stocksTaken9 = new javax.swing.JSpinner();
        name10 = new javax.swing.JComboBox<>();
        character10 = new javax.swing.JComboBox<>();
        stocksTaken10 = new javax.swing.JSpinner();

        setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1), "Crew", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 1, 14))); // NOI18N

        labelName.setText("Name");

        labelStocks.setText("Stocks");

        comboBoxName.setEditable(true);
        comboBoxName.setMaximumSize(new java.awt.Dimension(128, 26));

        jScrollPane.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1)));

        labelPlayersName.setText("Name");

        labelPlayerCharacter.setText("Character");

        labalPlayerStocksTaken.setText("Stocks Taken");

        name1.setEditable(true);
        name1.setMaximumSize(new java.awt.Dimension(128, 26));

        character1.setMaximumSize(new java.awt.Dimension(128, 26));

        name2.setEditable(true);
        name2.setMaximumSize(new java.awt.Dimension(128, 26));

        character2.setMaximumSize(new java.awt.Dimension(128, 26));

        name3.setEditable(true);
        name3.setMaximumSize(new java.awt.Dimension(128, 26));

        character3.setMaximumSize(new java.awt.Dimension(128, 26));

        name4.setEditable(true);
        name4.setMaximumSize(new java.awt.Dimension(128, 26));

        character4.setMaximumSize(new java.awt.Dimension(128, 26));

        name5.setEditable(true);
        name5.setMaximumSize(new java.awt.Dimension(128, 26));

        character5.setMaximumSize(new java.awt.Dimension(128, 26));

        name6.setEditable(true);
        name6.setMaximumSize(new java.awt.Dimension(128, 26));

        character6.setMaximumSize(new java.awt.Dimension(128, 26));

        name7.setEditable(true);
        name7.setMaximumSize(new java.awt.Dimension(128, 26));

        character7.setMaximumSize(new java.awt.Dimension(128, 26));

        name8.setEditable(true);
        name8.setMaximumSize(new java.awt.Dimension(128, 26));

        character8.setMaximumSize(new java.awt.Dimension(128, 26));

        name9.setEditable(true);
        name9.setMaximumSize(new java.awt.Dimension(128, 26));

        character9.setMaximumSize(new java.awt.Dimension(128, 26));

        name10.setEditable(true);
        name10.setMaximumSize(new java.awt.Dimension(128, 26));

        character10.setMaximumSize(new java.awt.Dimension(128, 26));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(name3, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(name4, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(name5, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(name6, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(name7, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(name8, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(name9, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(name10, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(labelPlayersName, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(name1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(name2, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(character10, javax.swing.GroupLayout.Alignment.LEADING, 0, 1, Short.MAX_VALUE)
                        .addComponent(character9, javax.swing.GroupLayout.Alignment.LEADING, 0, 1, Short.MAX_VALUE)
                        .addComponent(character8, javax.swing.GroupLayout.Alignment.LEADING, 0, 1, Short.MAX_VALUE)
                        .addComponent(character7, javax.swing.GroupLayout.Alignment.LEADING, 0, 1, Short.MAX_VALUE)
                        .addComponent(character6, javax.swing.GroupLayout.Alignment.LEADING, 0, 1, Short.MAX_VALUE)
                        .addComponent(character5, javax.swing.GroupLayout.Alignment.LEADING, 0, 1, Short.MAX_VALUE)
                        .addComponent(character4, javax.swing.GroupLayout.Alignment.LEADING, 0, 1, Short.MAX_VALUE)
                        .addComponent(character3, javax.swing.GroupLayout.Alignment.LEADING, 0, 1, Short.MAX_VALUE)
                        .addComponent(character2, javax.swing.GroupLayout.Alignment.LEADING, 0, 1, Short.MAX_VALUE)
                        .addComponent(character1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(labelPlayerCharacter))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(stocksTaken1)
                    .addComponent(labalPlayerStocksTaken, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(stocksTaken2)
                    .addComponent(stocksTaken3)
                    .addComponent(stocksTaken4)
                    .addComponent(stocksTaken5)
                    .addComponent(stocksTaken6)
                    .addComponent(stocksTaken7)
                    .addComponent(stocksTaken8)
                    .addComponent(stocksTaken9)
                    .addComponent(stocksTaken10))
                .addGap(0, 0, 0))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelPlayersName)
                    .addComponent(labelPlayerCharacter)
                    .addComponent(labalPlayerStocksTaken))
                .addGap(7, 7, 7)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(name1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(character1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(stocksTaken1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(7, 7, 7)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(name2, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(character2, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(stocksTaken2, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(7, 7, 7)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(name3, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(character3, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(stocksTaken3, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(7, 7, 7)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(name4, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(character4, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(stocksTaken4, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(7, 7, 7)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(name5, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(character5, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(stocksTaken5, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(7, 7, 7)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(name6, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(character6, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(stocksTaken6, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(7, 7, 7)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(name7, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(character7, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(stocksTaken7, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(7, 7, 7)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(name8, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(character8, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(stocksTaken8, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(7, 7, 7)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(name9, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(character9, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(stocksTaken9, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(7, 7, 7)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(name10, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(character10, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(stocksTaken10, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jScrollPane.setViewportView(jPanel1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(comboBoxName, 0, 220, Short.MAX_VALUE)
                    .addComponent(labelName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(labelStocks, javax.swing.GroupLayout.DEFAULT_SIZE, 64, Short.MAX_VALUE)
                    .addComponent(stocks)))
            .addComponent(jScrollPane)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelName)
                    .addComponent(labelStocks))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(comboBoxName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(stocks, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void initCrewPlayers() {
        JSONObject charJson = FileUtils.getCharacters();

        String[] characters = new String[]{};
        characters = charJson.keySet().toArray(characters);
        Arrays.sort(characters);
        
        String[] names = FileUtils.getNames();
        
        for (CrewMember player: players) {
            player.character.removeAllItems();
            player.character.setRenderer(new IconRendererNoText());
            AutoCompletion.enable(player.name);

            player.name.addItem("");
            for (String name: names) {
                player.name.addItem(name);
            }
            
            for (String character: characters) {

                IconItem item = new IconItem(
                    character,
                    Icons.getColors().get(character + "Vanilla")
                );

                player.character.addItem(item);
            }
        }
    }
    
    public void setBorderTitle(String title) {
        TitledBorder border = (TitledBorder)getBorder();
        border.setTitle(title);
    }
    
    public JSONObject getInfo() {
        JSONObject json = new JSONObject();
        
        String name = (String) comboBoxName.getSelectedItem();
        
        if (name == null || name.equals("")) return json;
        
        json.put("name", name);
        json.put("stocks", stocks.getValue());
        

        
        for (int i = 0; i < players.length; i++) {
            CrewMember p = players[i];
            if (p.name.getSelectedItem().equals("")) {
                continue;
            }
            json.put("player" + (i + 1), getPlayerInfo(p.name, p.character, p.stocksTaken));
        }

        
        return json;
    }
    
    private String getItemName(JComboBox<IconItem> comboBox) {
        IconItem item = (IconItem)comboBox.getSelectedItem();
        return item.name;
    }
    
    private JSONObject getPlayerInfo(JComboBox<String> name, 
        JComboBox<IconItem> character, JSpinner stocksTaken) {
        JSONObject json = new JSONObject();
        
        json.put("name", name.getSelectedItem());
        json.put("character", getItemName(character));
        json.put("stocksTaken", stocksTaken.getValue());
        
        return json;
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<IconItem> character1;
    private javax.swing.JComboBox<IconItem> character10;
    private javax.swing.JComboBox<IconItem> character2;
    private javax.swing.JComboBox<IconItem> character3;
    private javax.swing.JComboBox<IconItem> character4;
    private javax.swing.JComboBox<IconItem> character5;
    private javax.swing.JComboBox<IconItem> character6;
    private javax.swing.JComboBox<IconItem> character7;
    private javax.swing.JComboBox<IconItem> character8;
    private javax.swing.JComboBox<IconItem> character9;
    private javax.swing.JComboBox<String> comboBoxName;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane;
    private javax.swing.JLabel labalPlayerStocksTaken;
    private javax.swing.JLabel labelName;
    private javax.swing.JLabel labelPlayerCharacter;
    private javax.swing.JLabel labelPlayersName;
    private javax.swing.JLabel labelStocks;
    private javax.swing.JComboBox<String> name1;
    private javax.swing.JComboBox<String> name10;
    private javax.swing.JComboBox<String> name2;
    private javax.swing.JComboBox<String> name3;
    private javax.swing.JComboBox<String> name4;
    private javax.swing.JComboBox<String> name5;
    private javax.swing.JComboBox<String> name6;
    private javax.swing.JComboBox<String> name7;
    private javax.swing.JComboBox<String> name8;
    private javax.swing.JComboBox<String> name9;
    private javax.swing.JSpinner stocks;
    private javax.swing.JSpinner stocksTaken1;
    private javax.swing.JSpinner stocksTaken10;
    private javax.swing.JSpinner stocksTaken2;
    private javax.swing.JSpinner stocksTaken3;
    private javax.swing.JSpinner stocksTaken4;
    private javax.swing.JSpinner stocksTaken5;
    private javax.swing.JSpinner stocksTaken6;
    private javax.swing.JSpinner stocksTaken7;
    private javax.swing.JSpinner stocksTaken8;
    private javax.swing.JSpinner stocksTaken9;
    // End of variables declaration//GEN-END:variables
}

class IconRendererNoText extends DefaultListCellRenderer {    
    @Override
    public Component getListCellRendererComponent(JList<?> list, Object value,
            int index, boolean isSelected, boolean cellHasFocus) {
        super.getListCellRendererComponent(list, value, index, isSelected, cellHasFocus);
        
        IconItem item = (IconItem) value;
        
        if (item == null) return this;
        
        this.setText("");
        this.setIcon(item.icon);
        
        return this;
    }
}

class CrewMember {
    public JComboBox<String> name;
    public JComboBox<IconItem> character;
    public JSpinner stocksTaken;
    
    public CrewMember(JComboBox<String> name, JComboBox<IconItem> character,
        JSpinner stocksTaken) {
        this.name = name;
        this.character = character;
        this.stocksTaken = stocksTaken;
    }
}