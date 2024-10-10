import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите четырёхзначное число: ");
        int number = sc.nextInt();
        int sum = 0 , umn = 1;

        for(int i = 0; i<4; i++){
            sum += number%10;
            umn *= number%10;
            number /= 10;
        }
        System.out.println("Сумма: "+sum);
        System.out.println("Умножение: "+umn);
    }
}