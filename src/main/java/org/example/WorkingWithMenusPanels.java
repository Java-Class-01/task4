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

        return frame;
    }

}
