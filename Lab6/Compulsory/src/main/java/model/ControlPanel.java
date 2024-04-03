package model;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

/**
 * * @author Madalina-Bianca Enasel
 * <p>
 * responsible for the load, exit and save buttons
 */
public class ControlPanel extends JPanel {

    private final MainFrame frame;

    private final JButton exitBtn = new JButton("Exit");
    private final JButton loadBtn = new JButton("Load");
    private final JButton saveBtn = new JButton("Save");

    /**
     * constructor for ControlPanel
     * saves frame in this. frame
     * <p>
     * calls private method init()
     *
     * @param frame it works with
     */
    public ControlPanel(MainFrame frame) {
        this.frame = frame;
        init();
    }

    /**
     * adds all buttons to frame
     * <p>
     * set layout to grid
     * <p>
     * listener for exit button
     */
    private void init() {
        setLayout(new GridLayout(1, 4));

        add(loadBtn);
        add(exitBtn);
        add(saveBtn);

        exitBtn.addActionListener(this::exitGame);
    }

    /**
     * describe the action done by the exit button
     * <p>
     * closes and cleans the frame, stopping the execution
     *
     * @param e the action event that takes place when exit button is clicked
     */
    private void exitGame(ActionEvent e) {
        frame.dispose();
    }
}