package Exam;

import shapes.SCircle;
import shapes.SPolygon;
import shapes.SRectangle;
import shapes.SSquare;

import java.util.Scanner;

public class ExamPracticeNO1 {
    // THESE VARIABLES WILL COME INTO PLAY IN SOME OF THE QUESTIONS
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int he = scanner.nextInt();
        int we = scanner.nextInt();
        double dc = scanner.nextDouble();
        double hc = scanner.nextDouble();
        //For 4.
        int largerValue = 0;

        //1.
        System.out.println("the height of the envelope = " +he);

        //2.
        System.out.println("the width of the envelope = " +we);

        //3.
        double average = ((he+we)/2.0);

        //4.
        if (he>we){
            largerValue= he;
        }else {
            largerValue= we;
        }
        System.out.println("Larger Value = " +largerValue);

        //5.
        if (he>we){
            System.out.println(+we+"\n"+he);
        } else {
            System.out.println(+he+"\n"+we);
        }

        //6.
        SRectangle envelope = new SRectangle(he,we);

        //7.
        double diameterOfcc = envelope.diagonal();
        SCircle cc = new SCircle(diameterOfcc/2);

        //8.
        SCircle top = new SCircle(dc/2);

        //9.
        SRectangle side = new SRectangle(top.perimeter(),hc);

        //10.
        double radiusOfCircle = top.radius();
        double heightOfRectangle = top.perimeter();
        double surfaceArea = (((2*(Math.PI))*(radiusOfCircle*heightOfRectangle))+(2*top.area()));

        //11.
        SSquare redSquare = top.inscribingSquare();
        double areaOfRedSquare = redSquare.area();
        double silverArea = (top.area()-areaOfRedSquare);

        //12.
        double crypto = (9-8)+(6-5);



    }
}
