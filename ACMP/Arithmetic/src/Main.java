import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int result = sc.nextInt();

        if (num1 * num2 == result){
            System.out.println("YES");
        }else {
            System.out.println("NO");
        }
    }
}