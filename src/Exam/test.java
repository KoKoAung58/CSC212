package Exam;

import java.util.Scanner;

public class test {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int he = scanner.nextInt();
        int we = scanner.nextInt();

        if (he>we) {
            System.out.println(+he);
        } else {
            System.out.println(+we);
        }
    }

}
