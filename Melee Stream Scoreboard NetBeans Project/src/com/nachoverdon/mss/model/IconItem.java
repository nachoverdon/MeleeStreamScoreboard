/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.nachoverdon.mss.model;

import javax.swing.ImageIcon;

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
}
