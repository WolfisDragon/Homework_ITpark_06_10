import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Введите скорость в км.ч: ");
        int km = sc.nextInt();

        System.out.print("Введите скорость в м.с: ");
        int mc = sc.nextInt();

        double convertMC = mc * 3.6;

        if (km > convertMC){
            System.out.println("Первая скорость больше");
        }else {
            System.out.println("Вторая скорость больше");
        }
    }
}