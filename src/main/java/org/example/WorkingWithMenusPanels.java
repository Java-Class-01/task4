package org.example;

import javax.swing.*;
import java.awt.*;

public class WorkingWithMenusPanels {
    JFrame frame;
    CardLayout cardLayout;
    JPanel cardPanel;
    JMenuBar menuBar;

    public WorkingWithMenusPanels() {
        this.createMainFrame();
    }

    public JFrame createMainFrame() {
        // set look and feel
        JFrame.setDefaultLookAndFeelDecorated(true);

        frame = new JFrame("Swing Application with Menu and Panels");
        frame.setSize(600, 400);
        // add components
        frame.setJMenuBar(createMenuBar());
        frame.add(createCardLayoutPanel());

        frame.setVisible(true);
        return frame;
    }
    public JMenuBar createMenuBar() {
        menuBar = new JMenuBar();
        // File Menu
        JMenu fileMenu = new JMenu("File");
        JMenuItem homeItem = new JMenuItem("Home");
        JMenuItem settingsItem = new JMenuItem("Settings");
        homeItem.addActionListener(e -> cardLayout.show(cardPanel, "Home"));
        settingsItem.addActionListener(e -> cardLayout.show(cardPanel, "Settings"));
        fileMenu.add(homeItem);
        fileMenu.add(settingsItem);
        // View Menu
        JMenu viewMenu = new JMenu("View");
        JMenuItem aboutItem = new JMenuItem("About");
        JMenuItem exitItem = new JMenuItem("Exit");
        exitItem.addActionListener(e -> System.exit(0));
        aboutItem.addActionListener(e -> cardLayout.show(cardPanel, "About"));

        viewMenu.add(exitItem);
        viewMenu.add(aboutItem);
        // Add menus to menu bar
        menuBar.add(fileMenu);
        menuBar.add(viewMenu);

        return menuBar;
    }
    // Create card layout panel with multiple views
    public JPanel createCardLayoutPanel() {
        cardLayout = new CardLayout();
        cardPanel = new JPanel(cardLayout);

        cardPanel.add(createHomePanel(), "Home");
        cardPanel.add(createSettingsPanel(), "Settings");
        cardPanel.add(createAboutPanel(), "About");

        // Default view
        cardLayout.show(cardPanel, "Home");

        return cardPanel;
    }
//creating panel method
    public JPanel createHomePanel(){
        JPanel panel=new JPanel(new BorderLayout());
        JLabel label=new JLabel("Welcome to the Home  page",SwingConstants.CENTER);
        return panel;
    }
}
