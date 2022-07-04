package projectFive;

import java.util.Arrays;
import java.util.Random;

public class RandomGena {
    public static void main(String[] args) {
        Random random = new Random();
        int[] arr = new int[10];
        System.out.println("Первоночальный массив");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(20) + 1;
            System.out.println("Arr[" + i + "]" + arr[i]);
            
        }
        Arrays.sort(arr);
        System.out.println("Массив после сортировки");
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Arr[" + i + "]" + arr[i]);


        }
    }
}
