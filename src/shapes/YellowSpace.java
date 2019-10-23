/*
 *Program to compute the area of the yellow space
 */

package shapes;

public class YellowSpace {
    public static void main (String [] args){
        SSquare BigGraySquare = new SSquare(400);
        System.out.println("Area of Big Gray Square = " +BigGraySquare.area());
        SCircle BigCircle = new SCircle(140);
        SSquare BigDiamond = BigCircle.inscribingSquare();
        System.out.println("Area of Big Yellow Diamond = " +BigDiamond.area());
        double areaOfBigDiamond = (BigDiamond.area());
        SSquare bigYellowDiamond = new SSquare(areaOfBigDiamond);
        System.out.println("Side length of Big Diamond = " +areaOfBigDiamond);
        SCircle SmallCircle = new SCircle(  68.99494936611666);
        SSquare SmallSquare = SmallCircle.inscribingSquare();
        System.out.println("Area of Small Gray Square = " +SmallSquare.area());
        double sideOfSmallSquare = (SmallSquare.side());
        System.out.println("Side of Small Gray Square = " +SmallSquare.side());
        SCircle SmallCircleofSD = new SCircle(33.78679656440357);
        SSquare SmallDiamond = SmallCircleofSD.inscribingSquare();
        System.out.println("Area of Small Diamond = " +SmallDiamond.area());
        double sideOfSmallDiamond = (SmallDiamond.side());
        double NetBigDiamondArea = (BigDiamond.area()-SmallSquare.area());
        System.out.println("Net Area of Big Diamond Area with AO= " +NetBigDiamondArea);
        double TotalAreaofYellowSpace = (NetBigDiamondArea+SmallDiamond.area());
        System.out.println("Total Area of Yellow Space with AO= " +TotalAreaofYellowSpace);

    }
}
