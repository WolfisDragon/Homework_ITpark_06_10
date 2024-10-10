import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Введите кол-во секунд: ");
        int n = sc.nextInt();
        int hours, minutes, sec;

        hours = n/3600;
        minutes = (n%3600)/60;
        sec = (n%3600)%60;

        System.out.println(String.format("Часов: %d, Минут: %d, Секунд: %d.", hours, minutes, sec));
    }
}