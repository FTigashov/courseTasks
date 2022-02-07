package task3;

import java.util.Scanner;

public class Main {
    public static int sum = 0;

    public static String[] myWords;
    public static String[] word;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String mySentence = sc.nextLine();

        myWords = mySentence.split(" ");

        for (int i = 0; i < myWords.length; i++) {
            word = myWords[i].split("");
            sumOfVowels();
        }

        System.out.println("Всего гласных: " + sum);
    }


    public static void sumOfVowels() {
        for (int i = 0; i < word.length; i++) {
            String symbol = word[i];
            switch (symbol) {
                case "а", "о", "э", "е", "и", "ы", "у", "ё", "ю", "я":
                    sum += 1;
                    break;
                case "А", "О", "Э", "Е", "И", "Ы", "У", "Ё", "Ю", "Я":
                    sum += 1;
                    break;
            }
        }
    }
}
