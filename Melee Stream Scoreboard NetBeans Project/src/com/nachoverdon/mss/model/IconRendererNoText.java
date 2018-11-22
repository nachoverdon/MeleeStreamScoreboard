/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.nachoverdon.mss.model;

import java.awt.Component;
import javax.swing.DefaultListCellRenderer;
import javax.swing.JList;

/**
 *
 * @author bazoo
 */
public class IconRendererNoText extends DefaultListCellRenderer {    
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
