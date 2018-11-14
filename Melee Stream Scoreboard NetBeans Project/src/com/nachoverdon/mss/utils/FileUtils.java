/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.nachoverdon.mss.utils;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Arrays;
import java.util.Collections;
import org.json.JSONObject;

/**
 *
 * @author bazoo
 */
public class FileUtils {
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
            
            result = sb.toString();
        } catch(Exception e) {
            e.printStackTrace();
        }
        
        return result;
    }
    
    public static String[] readNames() {
        String[] names = readFile("data/players.txt", true).split("\n");
        
        Collections.sort(Arrays.asList(names), String.CASE_INSENSITIVE_ORDER);
        
        return names;
    }
}
