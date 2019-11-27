package lesson3.homework;

import java.util.LinkedHashMap;
import java.util.Map;

public class Task1 {

    private static String[] array = {
            "яблоко", "велосипед", "лампа", "чашка", "книга",
            "ковер", "блокнот", "яблоко", "расческа", "бутылка", "коробка",
            "камера", "панда", "яблоко", "матрац", "расческа", "книга", "яблоко"
    };

    public static void main(String[] args) {
        Map<String, Integer> wordsFrequency = new LinkedHashMap<>();
        for (String word : array) {
//            Integer frequency = wordsFrequency.get(word);
//            if (frequency == null) {
//                frequency = 0;
//            }
//            wordsFrequency.put(word, frequency + 1);
            wordsFrequency.merge(word, 1, Integer::sum);
        }

        wordsFrequency.forEach((word, frequency) -> {
            System.out.println(word + ": " + frequency);
        });
    }
}
