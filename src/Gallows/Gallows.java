package Gallows;

import java.security.PublicKey;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;


public class Gallows {

    private static final Scanner SCANNER = new Scanner(System.in);
    private static final String START = "1";
    private static final String EXIT = "2";
    private static Random random = new Random();


    public static void startMenu() {

        // 1. При старте приложение предлагает начать новую игру или выйти из приложения. Нужно добаавить защиту от дурака. Нужно наверное разбить на два метода.

        System.out.println(Symbols.MENU);

        while (true) {
            switch (SCANNER.nextLine()) {
                case START:
                    splitWord();
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

    public static List<String> addToWordList() {

        // 2. При начале новой игры случайным образом загадывается слово(Нужен список слов) и (метод который выбирает слово в рандомном порядке)игрок начинает процесс по его отгадыванию.
        List <String> words = new ArrayList<>();
        words.add("Сова");
        words.add("Папаня");
        words.add("Чуня");

        return words;
    }

    public static String getRandomWord(List<String> word) {
        int index = random.nextInt(word.size());
        return word.get(index);
    }


    public static char[] splitWord() {
        String words = getRandomWord(addToWordList());
        char[] letters = words.toCharArray();
        return letters;
    }

    public static char[] getMask(char[] letter) {
        char[] mask = letter;
        for (int i = 0; i < letter.length; i++) {
        mask[i] = '_';
        }
        return mask;
    }

    // 3. После каждой введенной буквы выводим в консоль счетчик ошибок, текущее состояние виселицы. (Нарисованная ASCll символами)

    // 4. По завершению игры выводим результат (победа или поражение) и возвращает к состоянию 1 - предложение начать новую игру или выйти из приложения.


}