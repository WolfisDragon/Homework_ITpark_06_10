import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int firstSalary, secondSalary, thirdSalary, maxSalary, minSalary;

        firstSalary = scanner.nextInt();
        secondSalary = scanner.nextInt();
        thirdSalary = scanner.nextInt();

        if(firstSalary > secondSalary){
            maxSalary = firstSalary;
        }
        else {
            maxSalary = secondSalary;
        }

        if(thirdSalary > maxSalary){
            maxSalary = thirdSalary;
        }

        if (firstSalary < secondSalary) {
            minSalary = firstSalary;
        }
        else minSalary = secondSalary;

        if (thirdSalary < minSalary) {
            minSalary = thirdSalary;
        }

        System.out.print(maxSalary - minSalary);
    }
}