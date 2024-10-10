import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Введите сторону a: ");
        double a = sc.nextDouble();
        System.out.print("Введите сторону b: ");
        double b = sc.nextDouble();
        System.out.print("Введите сторону c: ");
        double c = sc.nextDouble();

        if((a+b>c) && (a+c>b) && (c+b>a)){
            System.out.println("Треугольник существует.");
        }else {
            System.out.println("Треугольник не существует.");
        }
    }
}