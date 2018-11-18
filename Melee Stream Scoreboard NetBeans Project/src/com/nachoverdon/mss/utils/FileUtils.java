/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.nachoverdon.mss.utils;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.json.JSONArray;
import org.json.JSONObject;

/**
 *
 * @author bazoo
 */
public class FileUtils {
    private static final String PLAYERS_FILE = "data/players.txt";
    private static final String CHARACTERS_FILE = "data/characters.json";
    private static final String SPONSORS_FILE = "data/sponsors.json";
    private static String[] names;
    private static JSONObject charactersJson, sponsorsJson;
    
    public static void init() {
        names = readFile(PLAYERS_FILE, true).split("\n");
        Collections.sort(Arrays.asList(names), String.CASE_INSENSITIVE_ORDER);
        charactersJson = readJSON(CHARACTERS_FILE).getJSONObject("characters");
        sponsorsJson = readJSON(SPONSORS_FILE).getJSONObject("sponsors");  
    }
    
    public static JSONObject readJSON(String path) {
        return new JSONObject(readFile(path));
    }
    
    public static String readFile(String filename) {
        return readFile(filename, false);
    }
    
    public static String readFile(String filename, boolean split) {
        String result = "";
        
        try {
            BufferedReader br = new BufferedReader(new FileReader(filename));
            StringBuilder sb = new StringBuilder();
            String line = br.readLine();
            
            while (line != null) {
                sb.append(line);
                
                if (split) sb.append("\n");
                
                line = br.readLine();
            }
            br.close();
            result = sb.toString();
        } catch(Exception e) {
            e.printStackTrace();
        }
        
        return result;
    }
    
    public static void writeFile(String path, String content) {
        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter(path));
            bw.write(content);
            bw.close();
        } catch(Exception e) {
            e.printStackTrace();
        }
    }
    
    public static void writeJSON(String path, JSONObject json) {
        writeFile(path, json.toString(2));
    }
    
    public static String[] getNames() {        
        return names;
    }
    
    public static JSONObject getCharacters() {
        return charactersJson;
    }
    
    public static JSONObject getSponsors() {
        return sponsorsJson;  
    }
    
    public static JSONArray getColors(String character) {
        return charactersJson.getJSONArray(character);
    }
}
