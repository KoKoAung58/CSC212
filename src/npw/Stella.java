package npw;

import painter.SPainter;
import shapes.SSquare;

import javax.swing.*;
import java.awt.*;
import java.util.Random;
import java.util.Scanner;


public class Stella {
    private void paintTheImage(){
        SPainter painter = new SPainter("Stella",800,800);
        SSquare square = new SSquare(700);
       int nrOfSquares = nrOfSquares("Number of Squares")+1;
       double shrinkFactor= square.side()/(nrOfSquares);
       Color color1 = randomColor1();
       Color color2 = randomColor2();

       for(int i = nrOfSquares; i >= 0;i = i - 1){
           if (i%2==0) {
               painter.setColor(color1);
               painter.paint(square);
               square.shrink(shrinkFactor);
           }else {
               painter.setColor(color2);
               painter.paint(square);
               square.shrink(shrinkFactor);
           }
       }
    }
    private Color randomColor1(){
        int rv = (int) (Math.random()*256);
        int gv = (int) (Math.random()*256);
        int bv = (int) (Math.random()*256);
        return new Color(rv,gv,bv);
    }
    private Color randomColor2(){
        int rv = (int) (Math.random()*256);
        int gv = (int) (Math.random()*256);
        int bv = (int) (Math.random()*256);
        return new Color(rv,gv,bv);
    }

    private static int nrOfSquares(String prompt){
        String command = JOptionPane.showInputDialog(null,prompt+"?");
        Scanner scanner = new Scanner(command);
        return scanner.nextInt();
    }

    public Stella(){
        paintTheImage();
    }
    public static void main(String[] args){
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Stella();
            }
        });
    }
}
