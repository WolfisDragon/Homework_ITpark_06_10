import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        int a, b, c;

        a = num % 10;

        num /= 10;

        b = num % 10;

        num /= 10;

        c = num % 10;

        System.out.print(a);
        System.out.print(b);
        System.out.print(c);
//        System.out.println(String.format("%d%d%d", a,b,c));

    }
}