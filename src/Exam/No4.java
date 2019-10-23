package Exam;

import java.util.Scanner;

public class No4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String firstWord = scanner.nextLine();
        String secondWord = scanner.nextLine();

        if (firstWord.length()>secondWord.length()){
            System.out.println("short line = " +secondWord);
            System.out.println("long line = " +firstWord);
        }
        else{
            System.out.println("short line = " +firstWord);
            System.out.println("long line = " +secondWord);
        }
    }
}
