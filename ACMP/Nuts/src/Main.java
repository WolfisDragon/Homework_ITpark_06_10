import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();
        int K = sc.nextInt();

        if (N * M >= K){
            System.out.println("YES");
        }else {
            System.out.println("NO");
        }
    }
}