import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int firstNum = sc.nextInt();
        int lastNum = 9 - firstNum;

        System.out.printf("%d9%d", firstNum, lastNum);
    }
}