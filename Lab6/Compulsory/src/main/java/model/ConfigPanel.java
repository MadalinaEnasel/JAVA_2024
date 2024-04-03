package model;

import javax.swing.*;
import java.awt.event.ActionEvent;

import static java.awt.BorderLayout.CENTER;

/**
 * @author Madalina-Bianca Enasel
 * <p>
 * class responsible with the two spinners and their label + the create button
 */
public class ConfigPanel extends JPanel {

    private final MainFrame frame;

    private JSpinner spinnerRow;
    private JSpinner spinnerCol;

    private final JButton createBtn = new JButton("Create");

    /**
     * constructor for ConfigPanel
     * saves frame in this. frame
     * <p>
     * calls private method init()
     *
     * @param frame it works with
     */
    public ConfigPanel(MainFrame frame) {
        this.frame = frame;
        init();
    }

    public int getRows() {
        return (int) spinnerRow.getValue();
    }

    public int getCols() {
        return (int) spinnerCol.getValue();
    }

    /**
     * creates and adds spinners for columns and rows with "Grid size:" label
     * <p>
     * creates and adds create button
     */
    private void init() {
        JLabel label = new JLabel("Grid size:");
        spinnerRow = new JSpinner(new SpinnerNumberModel(10, 2, 100, 1));
        spinnerCol = new JSpinner(new SpinnerNumberModel(10, 2, 100, 1));

        createBtn.addActionListener(this::createGame);

        add(label);
        add(spinnerRow);
        add(spinnerCol);
        add(createBtn);
    }

    /**
     * describe the action done by the create button
     * <p>
     * deletes the drawing (canvas-object of type DrawingPanel) that is currently displayed
     * <p>
     * creates a new drawing (canvas-object of type DrawingPanel)
     * <p>
     * adds the new canvas to the frame
     * <p>
     * initialize each node's UI property with the current look and feel
     *
     * @param e the action event that takes place when create button is clicked
     */
    private void createGame(ActionEvent e) {
        remove(frame.canvas);
        frame.canvas = new DrawingPanel(frame);
        add(frame.canvas, CENTER);
        SwingUtilities.updateComponentTreeUI(this);
    }
}
