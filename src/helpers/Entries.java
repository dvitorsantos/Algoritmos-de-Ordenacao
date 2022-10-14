package helpers;

import elements.Box;
import elements.Element;

import java.util.Random;

public class Entries {

    public static Element<Integer, Box>[] integerEntrie(int size, int min, int max) {
        Element<Integer, Box> integer_entrance[] = new Element[size];

        Random random = new Random();

        for (int i = 0; i < integer_entrance.length; i++) {
            integer_entrance[i] = new Element<>(random.nextInt(max - min) + min, new Box());
        }

        return integer_entrance;
    }

    public static Element<Double, Box>[] doubleEntrie(int size, double min, double max) {
        Element<Double, Box> double_entrance[] = new Element[size];

        Random random = new Random();

        for (int i = 0; i < double_entrance.length; i++) {
            double_entrance[i] = new Element<>(random.nextDouble() * (max - min) + min, new Box());
        }

        return double_entrance;
    }

    public static Element<String, Box>[] stringEntrie(int size, int string_size) {
        Element<String, Box> string_entrance[] = new Element[size];

        Random random = new Random();

        for (int i = 0; i < string_entrance.length; i++) {
            string_entrance[i] = new Element<>(randomString(string_size), new Box());
        }

        return string_entrance;
    }

    private static String randomString(int size) {
        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        String random_string = "";

        Random random = new Random();

        for (int i = 0; i < size; i++) {
            random_string += alphabet.charAt(random.nextInt(alphabet.length()));
        }

        return random_string;
    }
}
