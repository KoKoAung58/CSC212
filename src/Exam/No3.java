package Exam;

public class No3 {
    public static void main(String[] args) {
        int x = 1;
        int y = 1;
        while ((x + y) < 10) {
            int next = x + y;
            System.out.println(next);
            x = y;
            y = next;
        }
    }
}