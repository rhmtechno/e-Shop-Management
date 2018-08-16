package com.exam;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class ResizeImageExample {

    public void m1(String p) throws IOException {
        System.out.println(p);
        File input = new File(p);
        BufferedImage image = ImageIO.read(input);

        BufferedImage resized = resize(image, 200, 200);

        File output = new File(p);
        ImageIO.write(resized, "jpg", output);

    }

    public static BufferedImage resize(BufferedImage img, int height, int width) throws IOException {

        Image tmp = img.getScaledInstance(width, height, Image.SCALE_SMOOTH);
        BufferedImage resized = new BufferedImage(width, height, BufferedImage.TYPE_INT_ARGB);
        Graphics2D g2d = resized.createGraphics();
        g2d.drawImage(tmp, 0, 0, null);
        g2d.dispose();
        return resized;
    }

}


