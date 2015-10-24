package javaswing;

import javax.swing.*;
import java.awt.*;

/**
 * Created by Microsoft on 10/16/2015.
 */
public class GraphicsDrawMain extends JFrame {
    public static void main(String[] args) {
        GraphicsDraw g = new GraphicsDraw();
        GraphicsDrawMain graphicsDrawMain = new GraphicsDrawMain();
        JPanel jPanel = new JPanel(new FlowLayout());
        jPanel.add(g);
        graphicsDrawMain.add(jPanel);
        graphicsDrawMain.setVisible(true);
        graphicsDrawMain.setSize(500, 500);
        graphicsDrawMain.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
