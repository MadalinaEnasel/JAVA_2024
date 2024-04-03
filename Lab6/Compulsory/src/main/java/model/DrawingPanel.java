package model;

import javax.swing.*;
import java.awt.*;

/**
 * @author Madalina-Bianca Enasel
 */

public class DrawingPanel extends JPanel {
    MainFrame frame;
    int rows, cols;
    int canvasWidth = 400, canvasHeight = 400;
    int boardWidth, boardHeight;
    int cellWidth, cellHeight;
    int padX, padY;
    int stoneSize = 20;

    /**
     * constructor for DrawPanel
     * <p>
     * <p>
     * calls private method init()
     *
     * @param frame it works with
     */
    public DrawingPanel(MainFrame frame) {
        this.frame = frame;
        init(frame.configPanel.getRows(), frame.configPanel.getCols());
    }

    /**
     * sets value of rows and cols
     * <p>
     * sets cell width and height depending on the number of cols and rows and on the width and height of the canvas
     * <p>
     * sets size of the canvas
     */
    final void init(int rows, int cols) {
        this.rows = rows;
        this.cols = cols;

        this.padX = stoneSize + 10;
        this.padY = stoneSize + 10;

        this.cellWidth = (canvasWidth - 2 * padX) / (cols - 1);
        this.cellHeight = (canvasHeight - 2 * padY) / (rows - 1);

        this.boardWidth = (cols - 1) * cellWidth;
        this.boardHeight = (rows - 1) * cellHeight;

        setPreferredSize(new Dimension(canvasWidth, canvasHeight));
    }

    /**
     * creates a white rectangle of canvasWidth x canvasHeight size starting from x=0=y
     */
    @Override
    protected void paintComponent(Graphics graphics) {
        Graphics2D g = (Graphics2D) graphics;
        g.setColor(Color.WHITE);
        g.fillRect(0, 0, canvasWidth, canvasHeight);
        paintGrid(g);
    }

    /**
     * draws lines to create rows, and columns => cells
     * <p>
     * draws a circle on each line-column intersection
     */
    private void paintGrid(Graphics2D g) {
        g.setColor(Color.DARK_GRAY);

        for (int row = 0; row < rows; row++) {
            int x1 = padX;
            int y1 = padY + row * cellHeight;
            int x2 = padX + boardWidth;
            g.drawLine(x1, y1, x2, y1);
        }

        for (int col = 0; col < cols; col++) {
            int y1 = padY;
            int x1 = padX + col * cellWidth;
            int y2 = padY + boardHeight;
            g.drawLine(x1, y1, x1, y2);
        }

        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < cols; col++) {
                int x = padX + col * cellWidth;
                int y = padY + row * cellHeight;
                g.setColor(Color.LIGHT_GRAY);
                g.drawOval(x - stoneSize / 2, y - stoneSize / 2, stoneSize, stoneSize);
            }
        }
    }
}
