/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.nachoverdon.mss.model;

import com.nachoverdon.mss.utils.FileUtils;
import java.awt.Image;
import java.io.File;
import java.util.HashMap;
import java.util.Map;
import javax.swing.ImageIcon;
import org.json.JSONArray;
import org.json.JSONObject;

/**
 *
 * @author bazoo
 */
public class Icons {
    private static boolean isInit = false;
    private static Map<String, ImageIcon> colors, sponsors, flags;
    
    public static void init() {
        if (isInit) return;
        initCharacters();
        initSponsors();
        initFlags();
        isInit = true;
    }
    
    private static void initCharacters() {
        JSONObject charJson = FileUtils.readJSON("data/characters.json")
            .getJSONObject("characters");
        String path = "img/icons/stock_icons/";
        colors = new HashMap();
        
        for (String character: charJson.keySet()) {
            JSONArray colorsArr = charJson.getJSONArray(character);
            
            for (int i = 0; i < colorsArr.length(); i++) {
                String color = colorsArr.getString(i);
                
                ImageIcon icon = getScaledIcon(
                    path + character + "/" + color + ".png", 24, -1
                );
                
                colors.put(character + color, icon);
            }
        }
    }
    
    private static void initSponsors() {
        JSONObject sponsorsJson = FileUtils.readJSON("data/sponsors.json")
            .getJSONObject("sponsors");
        String path = "img/icons/sponsors/";
        ImageIcon noSponsor = new ImageIcon(path + "nosponsor.png");
        sponsors = new HashMap();

        sponsors.put("No sponsor", noSponsor);
        
        for (String sponsor: sponsorsJson.keySet()) {
            String fileName = sponsorsJson.getString(sponsor);
                
            ImageIcon icon = getScaledIcon(path + fileName + ".png", 32, -1);
            
            sponsors.put(sponsor, icon);
        }
    }
    
    private static void initFlags() {
        File dir = new File("img/icons/flags");
        File[] iconFiles = dir.listFiles();
        flags = new HashMap();
            
        for (int i = 0; i < iconFiles.length; i++) {
            String name = iconFiles[i].getName()
                .substring(0, iconFiles[i].getName().length() - 4);
            
            ImageIcon icon = getScaledIcon(iconFiles[i].getPath(), 16, -1);
           
            flags.put(name, icon);
        }
    }
    
    public static Map<String, ImageIcon> getColors() {
        return colors;
    }

    public static Map<String, ImageIcon> getSponsors() {
        return sponsors;
    }

    public static Map<String, ImageIcon> getFlags() {
        return flags;
    }
    
    private static ImageIcon getScaledIcon(String path, int width, int height) {
        ImageIcon icon = new ImageIcon(path);

        icon = new ImageIcon(
            icon.getImage().getScaledInstance(width, height, Image.SCALE_SMOOTH)
        );
        
        return icon;
    }
}
