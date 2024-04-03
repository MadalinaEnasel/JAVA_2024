package model;

import javax.swing.*;
import java.awt.*;

/**
 * @author Madalina-Bianca Enasel
 */
public class MainFrame extends JFrame {
    ConfigPanel configPanel;
    ControlPanel controlPanel;
    DrawingPanel canvas;

    /**
     * constructor for class Main frame
     * <p>
     * sets the title of the frame "My Drawing Application"
     * <p>
     * calls private method init()
     */
    public MainFrame() {
        super("My Drawing Application");
        init();
    }

    /**
     * creates one DrawingPanel object, one ConfigPanel object and one ControlPanel object and adds them to the frame
     */
    private void init() {
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        configPanel = new ConfigPanel(this);
        canvas = new DrawingPanel(this);
        controlPanel = new ControlPanel(this);

        add(canvas, BorderLayout.CENTER);
        add(configPanel, BorderLayout.NORTH);
        add(controlPanel, BorderLayout.SOUTH);

        pack();
    }
}