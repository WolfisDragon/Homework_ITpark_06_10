import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double pi = Math.PI;
        System.out.print("Введите радиус круга: ");
        int radius = sc.nextInt();
        System.out.print("Введите сторону квадрата: ");
        int side = sc.nextInt();

        if ((side*side) > (radius*2*pi)){
            System.out.println("Площадь квадрата больше.");
        }else {
            System.out.println("Площадь круга больше");
        }
    }
}