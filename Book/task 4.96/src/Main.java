import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите коэффициент a: ");
        double a = sc.nextDouble();
        System.out.print("Введите коэффициент b: ");
        double b = sc.nextDouble();
        System.out.print("Введите коэффициент c: ");
        double c = sc.nextDouble();

        double D = (b*b) - (4*a*c);

        if(D > 0){
            double x1 = (-b - Math.sqrt(D))/(2*a);
            double x2 = (-b + Math.sqrt(D))/(2*a);
            System.out.printf("x1: %.2f, x2: %.2f", x1, x2);
        }else if (D == 0){
            double x = -b/(2*a);
            System.out.printf("x: %.2f", x);
        }else {
            System.out.println("Корней нет.");
        }
    }
}