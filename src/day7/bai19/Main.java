package day7.bai19;

import java.util.*;
import java.util.regex.MatchResult;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    static final Set<String> STOP_WORDS = Set.of(
            "the", "a", "an", "and", "or", "but", "is", "are", "was", "were",
            "in", "on", "at", "to", "from", "by", "of", "for", "with", "it", "this", "that", "i", "you", "he", "she", "they", "we"
    );

    public static void main(String[] args) {
        String paragraph =
                "Java is a popular programming language used by millions of developers around the world " +
                        "Java is known for its simplicity portability and reliability " +
                        "Many enterprise applications are written in Java because Java provides a rich ecosystem of libraries frameworks and tools " +
                        "Developers use Java to build web applications desktop applications mobile applications and cloud services " +
                        "Learning Java helps programmers understand object oriented programming design patterns and software architecture " +
                        "Java applications run on the Java Virtual Machine which allows Java programs to run on different operating systems " +
                        "Many companies choose Java because Java is secure stable scalable and easy to maintain " +
                        "Spring is one of the most popular frameworks in the Java ecosystem and Spring makes it easier to develop enterprise software " +
                        "Modern Java versions include many improvements that increase developer productivity and application performance " +
                        "Java streams collections concurrency utilities and functional programming features help developers write clean and efficient code " +
                        "Students often start with Java because Java has strong community support extensive documentation and countless learning resources " +
                        "As technology evolves Java continues to remain one of the most important programming languages in the software industry " +
                        "Developers who master Java can work on backend systems financial platforms e commerce applications cloud infrastructure and large scale distributed systems";

        // Top 10 từ xuất hiện nhiều nhất (loại stopwords)
        List<String> words = Arrays.asList(paragraph.split("\\s+"));
        System.out.println(words);
        List<Map.Entry<String, Long>> wordsFiltered = words.stream()
                .filter(s -> !STOP_WORDS.contains(s))
                .collect(
                        Collectors.groupingBy(s -> s, Collectors.counting())
                )
                .entrySet().stream()
                .sorted(Map.Entry.<String, Long>comparingByValue().reversed())
                .limit(10)
                .toList();
        System.out.println(wordsFiltered);



//        wordsFiltered.forEach((key, value) -> {
//            System.out.println(key + " " + value);
//        });

    }
}
