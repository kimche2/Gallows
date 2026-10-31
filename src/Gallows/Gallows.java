package Gallows;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;


public class Gallows {

    private static final Scanner SCANNER = new Scanner(System.in);
    private static final String START = "1";
    private static final String EXIT = "2";
    private static final int MAX_ERRORS = 7;
    private static int errorCounter = 0;


    public static String enteringLetter() {
        return SCANNER.nextLine();
    }

    public static void startMenu() {

        // 1. При старте игра предлагает начать новую игру или выйти из игры Нужно добавить защиту от дурака. Нужно наверное разбить на два метода.

        System.out.println(Symbols.MENU);

        while (true) {
            switch (SCANNER.nextLine()) {
                case START:
                    System.out.println("Страт игры");

                    break;
                case EXIT:
                    System.out.println("Выйти из игры");
                    break;
                default:
                    System.out.println("Вы ввели некорректное значение");
                    break;
            }

        }

    }

    public static List<String> wordList() {

        // Нужен список слов
        List<String> words = new ArrayList<>();
        words.add("Сова");
        words.add("Папаня");
        words.add("Чуня");

        return words;
    }

    public static String getRandomWord(List<String> word) {
        // 2. При начале новой игры случайным образом загадывается слово
        Random random = new Random();
        int index = random.nextInt(word.size());
        return word.get(index);
    }


    public static char[] splitWord() {
        String words = getRandomWord(wordList());
        return words.toCharArray();
    }

    public static char[] getMask(char[] letter) {
        for (int i = 0; i < letter.length; i++) {
            letter[i] = '_';
        }
        return letter;
    }

    public static void openMask(char[] mask, String secretWord, char symbol) {
        for (int i = 0; i < mask.length; i++) {
            char word = secretWord.charAt(i);
            if (word == symbol) {
                mask[i] = symbol;

            }

        }
    }

    public static int countMistake(int count) {
        if (errorCounter < MAX_ERRORS) {
            errorCounter++;
            // отображение виселицы, но нужно разбить метод на два или на три .
        } else if (count == MAX_ERRORS) {
            System.out.println("Игра окончена!");
            return count;
    }

// 3. После каждой введенной буквы выводим в консоль счетчик ошибок, текущее состояние виселицы. (Нарисованная ASCll символами)
    // 4. По завершению игры выводим результат (победа или поражение) и возвращает к состоянию 1 - предложение начать новую игру или выйти из приложения.


}
}