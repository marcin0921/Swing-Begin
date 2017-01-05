package Tutorial;

import javax.swing.*;


public class MyFrame extends JFrame {

    public MyFrame() {
        super("Title of Tutorial.MyFrame");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel imagePanel = new ImagePanel();
        add(imagePanel);
//        JPanel buttonPanel = new ButtonPanel();
//        add(buttonPanel);

        pack();

        setVisible(true);
    }
}
