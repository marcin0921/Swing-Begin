package Tutorial;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;


public class ImagePanel extends JPanel {

    private BufferedImage image;
    private BufferedImage image2;

    public ImagePanel() {
        super();
        URL imageURL = null;
        try {
            imageURL = new URL("https://encrypted-tbn3.gstatic.com/images?q=tbn:ANd9GcQamYPq1pCQjihJ-vHTfDAl5bVXZ3IxGzEMakz-Ag3GcWr4yURg1FeOffs");
        } catch (MalformedURLException e) {
            System.err.println("Blad odczytu obrazka z serwera");
            e.printStackTrace();
        }

        File imageFle = new File("java.jpg");
        try {
            image = ImageIO.read(imageURL);
            image2 = ImageIO.read(imageFle);
        } catch (IOException e) {
            System.err.println("Blad odczytu obrazka");
            e.printStackTrace();
        }

        Dimension dimension = new Dimension(image.getWidth() + image2.getWidth(), image.getHeight() + image2.getHeight());
        setPreferredSize(dimension);
    }

    @Override
    protected void paintComponent(Graphics g) {
        Graphics2D g2d = (Graphics2D) g;
        g2d.drawImage(image, 0, 0, this);
        g2d.drawImage(image2, image.getWidth(), 0, this);
    }
}
