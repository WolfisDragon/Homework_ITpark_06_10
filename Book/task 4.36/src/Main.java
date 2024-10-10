import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите время в минутах с начала часа: ");
        int t = sc.nextInt();

        if(t % 5 < 3){
            System.out.println("Зелёный");
        } else{
            System.out.println("Красный");
        }
    }
}