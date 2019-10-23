package npw;

import painter.SPainter;
import shapes.SSquare;

import javax.swing.*;
import java.awt.*;
import java.util.Scanner;


public class BlueDots {
    private void paintTheImage(){
        SPainter painter = new SPainter("Stella",800,800);
        SSquare square = new SSquare(700);
        painter.setColor(Color.CYAN);
        painter.paint(square);
        }


    public BlueDots(){
        paintTheImage();
    }
    public static void main(String[] args){
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new BlueDots();
            }
        });
    }
}
