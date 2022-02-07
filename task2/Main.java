package task2;

import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a;
        System.out.print("Введите число: ");
        while (true) {
            if (sc.hasNextInt()) {
                a = sc.nextInt();
                break;
            } else {
                sc.next();
                System.out.print("Необходимо вводить только целые числа!\nчисло: ");
            }
        }
        for (int i = 2; i <= a; i++) {
            while(a % i == 0) {
                a /= i;
                System.out.print(i + " ");
                if (a == 1 || a % i != 0) {
                    break;
                }
            }
        }

    }
}
