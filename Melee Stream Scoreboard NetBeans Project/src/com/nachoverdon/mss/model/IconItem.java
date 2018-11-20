/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.nachoverdon.mss.model;

import javax.swing.ImageIcon;
import javax.swing.JComboBox;

/**
 *
 * @author bazoo
 */
public class IconItem {
    public IconItem(String name, ImageIcon icon) {
        this.name = name;
        this.icon = icon;
    }
    public String name;
    public ImageIcon icon;
    
    
    public static String getItemName(JComboBox<IconItem> comboBox) {
        IconItem item = (IconItem) comboBox.getSelectedItem();
        return item.name;
    }
}
