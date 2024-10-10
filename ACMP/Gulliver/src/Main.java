import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int K = sc.nextInt();
        int M = sc.nextInt();

        int result = K * K * M;

        System.out.println(result);
    }
}