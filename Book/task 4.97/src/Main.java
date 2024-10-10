import javax.swing.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Введите первое число: ");
        int num1 = sc.nextInt();
        System.out.print("Введите второе число: ");
        int num2 = sc.nextInt();
        System.out.print("Введите третье число: ");
        int num3 = sc.nextInt();

        int max, min, center;

        if(num1>num2){
            max = num1;
        }
        else {
            max = num2;
        }

        if(num3>max){
            max = num3;
        }

        if (num1<num2) {
            min = num1;
        }
        else min = num2;

        if (num3<min) {
            min = num3;
        }

        if(min != num1 && max != num1){
            center = num1;
        } else if (min != num2 && max != num2) {
            center = num2;
        }else{
            center = num3;
        }

        System.out.println("Самое большое: "+max);
        System.out.println("Самое маленькое: "+min);
        System.out.println("Средние: "+center);
    }
}