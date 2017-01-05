package Exercises;


import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class MyPanel extends JPanel implements ActionListener {

    private static final int WIDTH = 800;
    private static final int HEIGHT = 400;

    private JButton randomBgButton;
    private JButton blueBgButton;
    private JButton labelButton;


    public MyPanel() {

        randomBgButton = new JButton("Zmień tło na losowe");
        blueBgButton = new JButton("Zmień tło na niebieskie");
        labelButton = new JButton("Zmień tytuł przycisku");

        randomBgButton.addActionListener(this);
        blueBgButton.addActionListener(this);
        labelButton.addActionListener(this);

        setLayout(new FlowLayout());
        setPreferredSize(new Dimension(WIDTH, HEIGHT));
        add(randomBgButton);
        add(blueBgButton);
        add(labelButton);

    }


    private int previousRandom;

    @Override
    public void actionPerformed(ActionEvent e) {
        Object s = e.getSource();

        if (s == blueBgButton)
            setBackground(Color.BLUE);
        if (s == labelButton)
            labelButton.setText("Wciśnięty");
        if (s == randomBgButton) {
            Random rand = new Random();
            int random = rand.nextInt(3);
            while(random == previousRandom)
                random = rand.nextInt(3);

            previousRandom = random;

            switch (random) {
                case 0:
                    setBackground(Color.GREEN);
                    break;
                case 1:
                    setBackground(Color.BLUE);
                    break;
                case 2:
                    setBackground(Color.RED);
                    break;
            }
        }
    }
}
