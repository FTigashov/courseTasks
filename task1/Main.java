package task1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        System.out.print("Введите строку: ");
        String string = sc.nextLine();
        String[] data;
        int a;
        data = string.split("");
        for (int i = 0; i < data.length; i++) {
            try {
                a = Integer.parseInt(data[i].trim());
            }
            catch (Exception e) {
                continue;
            }
            switch (a) {
                case 1, 2, 3, 4, 5, 6, 7, 8, 9, 0:
                    sum += a;
                    break;
                default:
                    continue;
            }
        }
        System.out.println("\nСумма цифр = " + sum);
    }
}
