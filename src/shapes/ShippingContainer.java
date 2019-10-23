/*
 *Program to find the longest object can be shoved in a shipping container diagonally from the bottom in one corner to the top in another corner.
 */

package shapes;

import java.util.Scanner;

public class ShippingContainer {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Width, Length and Height in order = ");
        int Width = scanner.nextInt();
        int Length = scanner.nextInt();
        int Height = scanner.nextInt();
        System.out.println("Width = "+Width+"\nLength = "+Length+"\nHeight = "+Height);

        int largestSide = 0, secondLargestSide = 0, smallestSide = 0;

        //Finding Largest Side to find Diagonal
        if ((Width>Length)&&(Width>Height)){
            largestSide = Width;
        }
        else if ((Length>Width)&&(Length>Height))
        {
            largestSide = Length;
        }
        else if ((Height>Length)&&(Height>Width))
        {
            largestSide = Height;
        }
        System.out.println("Largest Side of the container = "+largestSide);

        //Finding the Second Largest Side to find Diagonal
        if ((Width<largestSide)&&(Width>Length)&&(Width>Height))
        {
            secondLargestSide = Width;
        }
        else if ((Length<largestSide)&&((Length>Width)||(Length>Height)))
        {
            secondLargestSide = Length;
        }
        else if ((Height<largestSide)&&((Height>Width)||(Height>Length)))
        {
            secondLargestSide = Height;
        }
        System.out.println("Second Largest Side of the container = "+secondLargestSide);

        //Finding the smallest Side
        if ((Width < largestSide)&&(Width < secondLargestSide))
        {
            smallestSide = Width;
        }
        else if ((Length < largestSide)&&(Length < secondLargestSide))
        {
            smallestSide = Length;
        }
        else if ((Height < largestSide)&&(Height < secondLargestSide))
        {
            smallestSide = Height;
        }
        System.out.println("Smallest Side for the container = " + smallestSide);

        //Calculating Diagonal
        if ((largestSide !=0 )&&(secondLargestSide !=0 )&&(smallestSide != 0))
        {
            SRectangle face = new SRectangle(smallestSide, secondLargestSide);
            System.out.println("The dimensions of the Face rectangle = " + face.height()+" , "+ face.width());
            SRectangle distance = new SRectangle(smallestSide, largestSide);
            System.out.println("The dimensions of the Distance rectangle = "+distance.height()+" , "+distance.width());
            double sideOfKey = distance.diagonal();
            SRectangle key = new SRectangle(secondLargestSide, sideOfKey);
            System.out.println("The dimensions of the Key rectangle = "+key.height()+" , " +key.width());

        }

    }
}
