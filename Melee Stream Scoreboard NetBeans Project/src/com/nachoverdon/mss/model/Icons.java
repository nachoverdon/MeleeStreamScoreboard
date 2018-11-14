/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.nachoverdon.mss.model;

import com.nachoverdon.mss.utils.JSONReader;
import java.awt.Image;
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
        JSONObject charJson = JSONReader.read("data/characters_colors.json")
            .getJSONObject("characters");
        String path = "img/icons/stock_icons/";
        colors = new HashMap();
        
        for (String character: charJson.keySet()) {
            JSONArray colorsArr = charJson.getJSONArray(character);
            
            for (int i = 0; i < colorsArr.length(); i++) {
                String color = colorsArr.getString(i);
                
                ImageIcon icon = new ImageIcon(
                    path + character + "/" + color + ".png"
                );
                
                icon = new ImageIcon(
                    icon.getImage().getScaledInstance(24, -1, Image.SCALE_SMOOTH)
                );
                
                colors.put(character + color, icon);
            }
        }
    }
    
    private static void initSponsors() {
        JSONObject sponsorsJson = JSONReader.read("data/sponsors.json")
            .getJSONObject("sponsors");
        String path = "img/icons/sponsors/";
        ImageIcon noSponsor = new ImageIcon(path + "nosponsor.png");
        sponsors = new HashMap();

        sponsors.put("No sponsor", noSponsor);
        
        for (String sponsor: sponsorsJson.keySet()) {
            String fileName = sponsorsJson.getString(sponsor);
                
            ImageIcon icon = new ImageIcon(path + fileName + ".png");

            icon = new ImageIcon(
                icon.getImage().getScaledInstance(16, -1, Image.SCALE_SMOOTH)
            );
            
            sponsors.put(sponsor, icon);
        }
    }
    
    private static void initFlags() {
        
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
}
