/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.nachoverdon.mss;

import com.nachoverdon.mss.model.Icons;
import com.nachoverdon.mss.utils.FileUtils;
import com.nachoverdon.mss.view.MainWindow;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

/**
 *
 * @author Nacho Verdón Blázquez
 */
public class MeleeStreamScoreboard {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(MeleeStreamScoreboard.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            Logger.getLogger(MeleeStreamScoreboard.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            Logger.getLogger(MeleeStreamScoreboard.class.getName()).log(Level.SEVERE, null, ex);
        } catch (UnsupportedLookAndFeelException ex) {
            Logger.getLogger(MeleeStreamScoreboard.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        FileUtils.init();
        Icons.init();
        
        new MainWindow();
    }

}
