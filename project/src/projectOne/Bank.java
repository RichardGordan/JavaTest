package projectOne;

import java.util.Scanner;

public class Bank {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите сумму вклада: ");
        float deposit = scanner.nextFloat();
        System.out.print("Введите срок вклада в месяцах: ");
        int period = scanner.nextInt();
        int i = period;
        while (i > 0){
            deposit += deposit * 0.07;
            i--;
        }
        System.out.println("После " + period + " месяцев сумма вклада составит: " + deposit);



    }
}
