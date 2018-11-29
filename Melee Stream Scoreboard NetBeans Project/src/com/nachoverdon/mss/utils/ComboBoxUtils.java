/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.nachoverdon.mss.utils;

import com.nachoverdon.mss.model.IconItem;
import com.nachoverdon.mss.model.IconRenderer;
import com.nachoverdon.mss.model.Icons;
import com.nachoverdon.mss.model.IconRendererNoText;
import java.util.Arrays;
import javax.swing.JComboBox;
import org.json.JSONObject;

/**
 *
 * @author bazoo
 */
public class ComboBoxUtils {
    public static String getSelectedItemName(JComboBox<IconItem> comboBox) {
        IconItem item = (IconItem) comboBox.getSelectedItem();
        return item.name;
    }
    
    // Sets the selected item of the combobox to the IconItem that matches the 
    // name.
    public static void setSelectedByName(JComboBox<IconItem> comboBox, 
        String name) {
        
        for (int i = 0; i < comboBox.getItemCount(); i++) {
            IconItem item = (IconItem) comboBox.getItemAt(i);
            
            if (item.name.equals(name)) {
                comboBox.setSelectedIndex(i);
                break;
            }
        
        }
    }
    
    // Fills the combobox with the names of the players, and adds an empty string
    // optionally.
    public static void initPlayers(JComboBox<String> comboBox, 
            boolean addEmpty) {
        if (addEmpty) comboBox.addItem("");
        
        for (String name: FileUtils.getNames()) {
            comboBox.addItem(name.trim());
        }
        
        AutoCompletion.enable(comboBox);
    }
    
    public static void initPlayers(JComboBox<String> comboBox) {
        initPlayers(comboBox, true);
    }
    
    // Fills the combobox with the character icons, and sets the renderer to
    // display the names or not.
    public static void initCharacters(JComboBox<IconItem> comboBox, 
            boolean showText) {
        comboBox.removeAllItems();
        if (showText) {
            comboBox.setRenderer(new IconRenderer());
        } else {
            comboBox.setRenderer(new IconRendererNoText());
        }

        JSONObject charJson = FileUtils.getCharacters();

        String[] characters = new String[]{};
        characters = charJson.keySet().toArray(characters);
        Arrays.sort(characters);

        for (String character : characters) {
            
            IconItem item = new IconItem(
                    character,
                    Icons.getColors().get(character + "Vanilla")
            );

            comboBox.addItem(item);
        }
    }
    
    public static void initCharacters(JComboBox<IconItem> comboBox) {
        initCharacters(comboBox, true);
    }
    
    public static void swapSelectedItems(JComboBox<String> comboBox1, JComboBox<String> comboBox2) {
        Object item1 = comboBox1.getSelectedItem(),
                item2 = comboBox2.getSelectedItem();
        comboBox1.setSelectedItem(item2);
        comboBox2.setSelectedItem(item1);
    }
}
