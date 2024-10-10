import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Введите a (не равно 0): ");
        double a = sc.nextDouble();
        System.out.print("Введите b: ");
        double b = sc.nextDouble();
        System.out.print("Введите c: ");
        double c = sc.nextDouble();

        double D = b*b - 4*a*c;

        if(D > 0){
            System.out.println("Два корня");
        } else if (D == 0) {
            System.out.println("Один корень");
        }else {
            System.out.println("Корней нет.");
        }


    }
}