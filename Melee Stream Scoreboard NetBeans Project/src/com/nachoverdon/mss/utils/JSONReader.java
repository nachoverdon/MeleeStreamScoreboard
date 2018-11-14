/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.nachoverdon.mss.utils;

import java.io.BufferedReader;
import java.io.FileReader;
import org.json.JSONObject;

/**
 *
 * @author bazoo
 */
public class JSONReader {
    public static JSONObject read(String path) {
        return new JSONObject(readFile(path));
    }
    
    private static String readFile(String filename) {
        String result = "";
        try {
            BufferedReader br = new BufferedReader(new FileReader(filename));
            StringBuilder sb = new StringBuilder();
            String line = br.readLine();
            while (line != null) {
                sb.append(line);
                line = br.readLine();
            }
            result = sb.toString();
        } catch(Exception e) {
            e.printStackTrace();
        }
        return result.trim();
    }
}
