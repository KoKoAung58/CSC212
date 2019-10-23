package shapes;

import javax.rmi.ssl.SslRMIClientSocketFactory;

public class YellowSpace1 {
    public static void main (String [] args)   {

        //Big Grey Square
        SSquare bigGreySquare = new SSquare (400);
        System.out.println("The area of the Gray Square = " + bigGreySquare.area());

        //Big Yellow Diamond
        SCircle imaginaryCircle = bigGreySquare.inscribingCircle();
        imaginaryCircle.shrink(60);
        SSquare bigYellowDiamond = imaginaryCircle.inscribingSquare();
        System.out.println("The Side of Big Yellow Diamond = " + bigYellowDiamond.side());
        System.out.println("The Area of Big Yellow Diamond = " + bigYellowDiamond.area());

        //Small Grey square
        SCircle imaginaryCircleTwo = bigYellowDiamond.inscribingCircle();
        imaginaryCircleTwo.shrink(30);
        SSquare smallGreySquare = imaginaryCircleTwo.inscribingSquare();
        System.out.println("The Side of Small Grey Square = " + smallGreySquare.side());
        System.out.println("The Area of Small Grey Square = " + smallGreySquare.area());

        //Small Yellow Diamond
        SCircle imaginaryCircleThree = smallGreySquare.inscribingCircle();
        imaginaryCircleThree.shrink(15);
        SSquare smallYellowDiamond = imaginaryCircleThree.inscribingSquare();
        System.out.println("The Side of Small Yellow Diamond = " + smallYellowDiamond.side());
        System.out.println("The Area of Small Yellow Diamond = " + smallYellowDiamond.area());

        //Big Yellow Diamond - Small Grey Square
        SSquare imaginarySquare = new SSquare(bigYellowDiamond.area());
        imaginarySquare.shrink(smallGreySquare.area());
        System.out.println("Area of Big Yellow Diamond - Small Grey Square = "+ imaginarySquare.side());

        //(Big Yellow Diamond - Small Grey Square) + Small Yellow Diamond
        imaginarySquare.expand(smallYellowDiamond.area());

        //Making a final Square for total Yellow Space
        double sideOfFinalSquare = Math.sqrt(imaginarySquare.side());
        SSquare yellowSpace = new SSquare(sideOfFinalSquare);
        System.out.println("Total Area of Yellow Space = "+ yellowSpace.area());




    }
}

