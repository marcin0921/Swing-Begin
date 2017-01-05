package Exercises;


import javax.swing.*;

public class Frame extends JFrame {

    public Frame() {
        super("Title of my Frame");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        setLocation(300, 200);

        JPanel panel = new MyPanel();
        add(panel);

        pack();

        setVisible(true);
    }


}

