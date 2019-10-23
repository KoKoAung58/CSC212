/*
 *program paints an image subject of own creation
 * In this program, the user will be the traffic police who have to handle the traffic light whether it should red,
 * green or yellow! Do ur job the best OFFICER!
 */
package npw;

import painter.SPainter;
import shapes.SCircle;
import shapes.SSquare;

import javax.swing.*;
import java.awt.*;
import java.util.Random;
import java.util.Scanner;


public class Invention1 {
    private void paintTheImage() {
        SPainter painter = new SPainter("Traffic Light", 300, 900);
        painter.setBrushWidth(3);
        SSquare square = new SSquare(300);
        SCircle smallCircle = new SCircle(120);
        painter.setColor(metallicGray());
        painter.paint(square);
        painter.setColor(Color.BLACK);
        painter.draw(square);
        painter.draw(smallCircle);
        painter.setColor(deadOrange());
        painter.paint(smallCircle);
        painter.setColor(Color.BLACK);
        //middle light

        painter.mfd(square.side());
        painter.setColor(metallicGray());
        painter.paint(square);
        painter.setColor(Color.BLACK);
        painter.draw(square);
        painter.draw(smallCircle);
        painter.setColor(deadRed());
        painter.paint(smallCircle);
        painter.setColor(Color.BLACK);
        //red

        painter.mbk(2 * square.side());
        painter.setColor(metallicGray());
        painter.paint(square);
        painter.setColor(Color.BLACK);
        painter.draw(square);
        painter.draw(smallCircle);
        painter.setColor(deadGreen());
        painter.paint(smallCircle);
        painter.setColor(Color.BLACK);
        painter.mfd(square.side());
        //green

        while (true) {
            String command = JOptionPane.showInputDialog(null, "Command?");
            if (command == null) {
                command = "exit";
            } //user clicked on Cancel
            if (command.equalsIgnoreCase("go")) {
                go(painter, square, smallCircle);
            } else if (command.equalsIgnoreCase("stop")) {
                ;
                stop(painter, square, smallCircle);
            } else if (command.equalsIgnoreCase("ready")) {
                ready(painter, square, smallCircle);
            } else if (command.equalsIgnoreCase("random") || command.equalsIgnoreCase("r")) {
                randomColor(painter, square, smallCircle);
            } else if (command.equalsIgnoreCase("exit")) {
                painter.end();
                System.out.println("Thanks You For Your Help!....");
                break;

            } else {
                JOptionPane.showMessageDialog(null, "Unrecognizable command:" + command.toUpperCase());
            }

        }
    }

    private void allDead(SPainter painter, SSquare square, SCircle smallCircle) {
        painter.setColor(deadOrange());
        painter.paint(smallCircle);
        painter.mfd(square.side());
        painter.setColor(deadRed());
        painter.paint(smallCircle);
        painter.mbk(2 * square.side());
        painter.setColor(deadGreen());
        painter.paint(smallCircle);
        painter.mfd(square.side());
    }

    private void go(SPainter painter, SSquare square, SCircle smallCircle) {
        allDead(painter, square, smallCircle);
        painter.setColor(Color.green);
        painter.mbk(square.side());
        painter.paint(smallCircle);
        painter.mfd(square.side());
    }

    private void stop(SPainter painter, SSquare square, SCircle smallCircle) {
        allDead(painter, square, smallCircle);
        painter.setColor(Color.RED);
        painter.mfd(square.side());
        painter.paint(smallCircle);
        painter.mbk(square.side());
    }

    private void ready(SPainter painter, SSquare square, SCircle smallCircle) {
        allDead(painter, square, smallCircle);
        painter.setColor(orange());
        painter.paint(smallCircle);
    }

    private Color metallicGray() {
        return new Color(67, 70, 75);
    }

    private Color orange() {
        return new Color(255, 165, 0);
    }

    private Color deadGreen() {
        return new Color(42, 163, 50);
    }

    private Color deadOrange() {
        return new Color(181, 96, 25);
    }

    private Color deadRed() {
        return new Color(181, 5, 5);
    }

    private void randomColor(SPainter painter, SSquare square, SCircle smallCircle) {
        Random rgen = new Random();
        int rn = rgen.nextInt(3);

        if (rn == 0) {
            go(painter, square, smallCircle);
        } else if (rn == 1) {
            ready(painter, square, smallCircle);
        } else if (rn == 2) {
            stop(painter, square, smallCircle);
        }
    }


    public Invention1() {
        paintTheImage();
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Invention1();
            }
        });
    }
}
