package Exam;

import shapes.SCircle;
import shapes.SSquare;

import java.util.Scanner;

public class No2 {
    public static void main(String[] args){
        //introducing values to calculate the result
    double valueToCalRadiusOfYDC = (5.4);
        SSquare bigGraySquare = new SSquare(48.3);

        SCircle inscribCricleofBGS = bigGraySquare.inscribingCircle();
        double radiusOfInscribCircleOfBGS = inscribCricleofBGS.radius();

        double radiusOfCircumCircleOfYD = radiusOfInscribCircleOfBGS-valueToCalRadiusOfYDC;
        SCircle circumCricleOfYD = new SCircle(radiusOfCircumCircleOfYD);

        SSquare yellowDiamond = circumCricleOfYD.inscribingSquare();
        double areaOfYD = (yellowDiamond.area());

        double totalAreaOfBGS = bigGraySquare.area()-areaOfYD;
        System.out.println("the Dark Grey area of the square = " +totalAreaOfBGS);
    }
}
