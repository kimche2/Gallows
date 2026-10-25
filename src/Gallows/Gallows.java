package Gallows;

import java.security.PublicKey;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Gallows {

    private static final Scanner SCANNER = new Scanner(System.in);
    private static final String START = "1";
    private static final String EXIT = "2";
    private static final Random RANDOM = new Random();
    private static ArrayList<String> words = new ArrayList<>();

    public static ArrayList<String> getWords() {
        return words;
    }

    public static void startMenu() {

        // 1. При старте приложение предлагает начать новую игру или выйти из приложения. Нужно добаавить защиту от дурака. Нужно наверное разбить на два метода.

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

    public static void wordsArrayList() {

        // 2. При начале новой игры случайным образом загадывается слово(Нужен список слов) и (метод который выбирает слово в рандомном порядке)игрок начинает процесс по его отгадыванию.

        words.add("Сова");
        words.add("Папаня");
        words.add("Чуня");

    }

    public static String randomWords (String words) {
        String word =

    }


    // 3. После каждой введенной буквы выводим в консоль счетчик ошибок, текущее состояние виселицы. (Нарисованная ASCll символами)

    // 4. По завершению игры выводим результат (победа или поражение) и возвращает к состоянию 1 - предложение начать новую игру или выйти из приложения.


}