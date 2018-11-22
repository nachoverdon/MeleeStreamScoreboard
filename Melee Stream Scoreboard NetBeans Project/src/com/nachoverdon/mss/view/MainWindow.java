/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.nachoverdon.mss.view;

import com.nachoverdon.mss.utils.FileUtils;
import java.awt.Image;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import org.json.JSONObject;

/**
 *
 * @author Nacho Verdón Blázquez
 */
public class MainWindow extends javax.swing.JFrame {

    /**
     * Creates new form MainWindow
     */
    public MainWindow() {
        initComponents();
        setVisible(true);
        setLocationRelativeTo(null);
        setIcons();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tabbedPane = new javax.swing.JTabbedPane();
        playersInfoPanel = new com.nachoverdon.mss.view.PlayersInfoPanel();
        generalInfoPanel = new com.nachoverdon.mss.view.GeneralInfoPanel();
        crewBattlePanel = new com.nachoverdon.mss.view.CrewBattlePanel();
        serverInfoPanel = new com.nachoverdon.mss.view.ServerInfoPanel();
        buttonUpdate = new javax.swing.JButton();
        menuBar = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        menuItemLoadPrevious = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        menuCredits = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Melee Stream Scoreboard");
        setResizable(false);

        tabbedPane.setMinimumSize(new java.awt.Dimension(625, 480));
        tabbedPane.setPreferredSize(new java.awt.Dimension(625, 480));
        tabbedPane.addTab("Players", playersInfoPanel);
        tabbedPane.addTab("General", generalInfoPanel);
        tabbedPane.addTab("Crews", crewBattlePanel);
        tabbedPane.addTab("Server", serverInfoPanel);

        buttonUpdate.setText("Update");
        buttonUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonUpdateActionPerformed(evt);
            }
        });

        jMenu1.setText("File");

        menuItemLoadPrevious.setText("Load previous data");
        menuItemLoadPrevious.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemLoadPreviousActionPerformed(evt);
            }
        });
        jMenu1.add(menuItemLoadPrevious);

        menuBar.add(jMenu1);

        jMenu2.setText("Edit");
        menuBar.add(jMenu2);

        menuCredits.setText("Credits");
        menuCredits.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menuCreditsMouseClicked(evt);
            }
        });
        menuBar.add(menuCredits);

        setJMenuBar(menuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tabbedPane, javax.swing.GroupLayout.DEFAULT_SIZE, 660, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(buttonUpdate)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(tabbedPane, javax.swing.GroupLayout.DEFAULT_SIZE, 499, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(buttonUpdate)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // Gathers all the possible info and saves it in a JSON file.
    private void buttonUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonUpdateActionPerformed
        JSONObject json = new JSONObject(),
            crews = crewBattlePanel.getInfo();
        
        json.put("players", playersInfoPanel.getInfo());
        json.put("general", generalInfoPanel.getInfo());
        
        if (crews != null) {
            json.put("crews", crews);
        }
        
        System.out.println("Saving...");
        FileUtils.writeJSON("output/output.json", json);
        System.out.println("Done.");
    }//GEN-LAST:event_buttonUpdateActionPerformed

    // Displays a window with the application credits and logo.
    private void menuCreditsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuCreditsMouseClicked
        ImageIcon icon = new ImageIcon("img/icons/mss_logo_128.png");
        String msg = "Melee Stream Scoreboard \n"
            + "Author: Nacho 'bazoo' Verdón \n"
            + "https://github.com/nachoverdon/MeleeStreamScoreboard";
        JOptionPane.showMessageDialog(
                null,
                msg,
                "Credits", JOptionPane.INFORMATION_MESSAGE,
                icon
        );
    }//GEN-LAST:event_menuCreditsMouseClicked

    private void menuItemLoadPreviousActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemLoadPreviousActionPerformed
        JSONObject json = FileUtils.readJSON("output/output.json"),
            crews = json.getJSONObject("crews");
        
        if (crews != null) {
            crewBattlePanel.setInfo(crews);
        }
    }//GEN-LAST:event_menuItemLoadPreviousActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainWindow().setVisible(true);
            }
        });
    }

    // Sets the icons for the application, window, appbar...
    private void setIcons() {
        String path = "./img/icons/mss_logo_";
        ArrayList<Image> icons = new ArrayList<Image>();

        for (String size: new String[]{"16", "32", "64", "128"})
            icons.add(new ImageIcon(path + size + ".png").getImage());

        setIconImages(icons);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonUpdate;
    private com.nachoverdon.mss.view.CrewBattlePanel crewBattlePanel;
    private com.nachoverdon.mss.view.GeneralInfoPanel generalInfoPanel;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JMenu menuCredits;
    private javax.swing.JMenuItem menuItemLoadPrevious;
    private com.nachoverdon.mss.view.PlayersInfoPanel playersInfoPanel;
    private com.nachoverdon.mss.view.ServerInfoPanel serverInfoPanel;
    private javax.swing.JTabbedPane tabbedPane;
    // End of variables declaration//GEN-END:variables
}
