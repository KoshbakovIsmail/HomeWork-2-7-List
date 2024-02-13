import java.util.*;

public class Main {
    public static void main(String[] args) {

        test1_2();
        test3();
        test4();
    }

    public static void test1_2() {
        List<Integer> numberList = new ArrayList<>(List.of(3, 1, 2, 3, 2, 5, 6, 6, 8, 9, 10, 10, 4, 4));
        for (int number : numberList) {
            if (number % 2 != 0) {
                System.out.print(" " + number);
            }
        }
        System.out.println();
        for (int num : numberList) {
            if (num % 2 == 0) {
                System.out.print(" " + num);
            }
        }
        System.out.println();
    }

    public static void test3() {
        List<String> string = new ArrayList<>(List.of("Jonni", "Di", "Jonni", "add", "try", "add", "Di"));
        System.out.print(" " + string);
        System.out.println();
        Set<String> unWord = new HashSet<>(string);
        for (
                String str : unWord) {
            System.out.print(" " + str);
        }
        System.out.println();
    }

    public static void test4() {
        List<String> stringList = new ArrayList<>(List.of("один", "два", "два", "три", "три", "три"));
        Map<String, Integer> wordCountMap = new HashMap<>();
        for (String word : stringList) {
            wordCountMap.put(word, wordCountMap.getOrDefault(word, 0) + 1);
        }
        for (Map.Entry<String, Integer> entry : wordCountMap.entrySet()) {
            System.out.println("Слово: " + entry.getKey() + ", количество дублей: " + entry.getValue());
        }
    }
}