package javaswing;

import javax.swing.*;
import java.awt.*;

public class JFrameExample extends JFrame {

    public static void main(String[] args) {
        JFrameExample mn = new JFrameExample();

        // JMenuBar declaration
        JMenuBar jMenuBar = new JMenuBar();
        JMenu fileJMenu = new JMenu("File");
        jMenuBar.add(fileJMenu);

        JMenuItem jMenuItem = new JMenuItem("New");
        fileJMenu.add(jMenuItem);
        JCheckBoxMenuItem jCheckBoxMenuItem = new JCheckBoxMenuItem("JCheckBoxMenuItem");
        fileJMenu.add(jCheckBoxMenuItem);

        JTextField jTextField = new JTextField("TextField");
        JButton jButton = new JButton("Button");
        JCheckBox jCheckBox = new JCheckBox("CheckBox");

        JPanel jPanel = new JPanel(new FlowLayout());
        jPanel.add(jTextField);
        jPanel.add(jButton);
        jPanel.add(jCheckBox);
//        jPanel.add(jCheckBoxMenuItem);

        jPanel.setBackground(new Color(44, 97, 133));


        mn.add(jPanel);
        mn.setSize(500, 500);
        mn.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mn.setJMenuBar(jMenuBar);
        mn.setVisible(true);


    }
}
