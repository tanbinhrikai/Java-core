package bai19;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TextAnalyzer {

    private static final Set<String> STOPWORDS = Set.of(
            "the", "is", "a", "an", "and", "or", "to", "of", "in", "on", "for"
    );

    private final String text;

    public TextAnalyzer(String text) {
        this.text = text;
    }

    public void analyze() {

        List<String> words = Stream.of(text.toLowerCase()
                        .replaceAll("[^a-zA-Z\\s]", "")
                        .split("\\s+"))
                .filter(w -> !w.isBlank())
                .toList();

        List<String> filtered = words.stream()
                .filter(w -> !STOPWORDS.contains(w))
                .toList();

        Map<String, Long> topWords = filtered.stream()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        List<Map.Entry<String, Long>> top10 = topWords.entrySet().stream()
                .sorted((a, b) -> Long.compare(b.getValue(), a.getValue()))
                .limit(10)
                .toList();

        Map<Integer, Long> lengthDist = filtered.stream()
                .collect(Collectors.groupingBy(String::length, Collectors.counting()));

        double avgLength = filtered.stream()
                .mapToInt(String::length)
                .average()
                .orElse(0);

        String[] sentences = text.split("[.!?]");
        int longestSentence = Arrays.stream(sentences)
                .mapToInt(s -> s.split("\\s+").length)
                .max()
                .orElse(0);

        int shortestSentence = Arrays.stream(sentences)
                .mapToInt(s -> s.split("\\s+").length)
                .min()
                .orElse(0);

        long unique = filtered.stream().distinct().count();
        double uniqueRatio = (double) unique / filtered.size() * 100;

        Map<String, Long> bigrams = new HashMap<>();

        for (int i = 0; i < filtered.size() - 1; i++) {
            String bigram = filtered.get(i) + " " + filtered.get(i + 1);
            bigrams.put(bigram, bigrams.getOrDefault(bigram, 0L) + 1);
        }

        List<Map.Entry<String, Long>> topBigrams = bigrams.entrySet().stream()
                .sorted((a, b) -> Long.compare(b.getValue(), a.getValue()))
                .limit(5)
                .toList();

        System.out.println("Tong tu: " + words.size()
                + " | Unique: " + unique + " (" + String.format("%.1f", uniqueRatio) + "%)");

        System.out.println("\n Top 10 words:");

        top10.forEach(e -> System.out.println(e.getKey() + " (" + e.getValue() + ")"));

        System.out.println("\nDo dai trung binh: " + String.format("%.2f", avgLength));

        System.out.println("\nCau dai nhat: " + longestSentence + " tu");
        System.out.println("Cau ngan nhat: " + shortestSentence + " tu");

        System.out.println("\nTop Bigrams:");
        topBigrams.forEach(e ->
                System.out.println(e.getKey() + " (" + e.getValue() + ")")
        );
    }

    public static void main(String[] args) {

        String sample = """
                Java is a programming language. Java is powerful and widely used.
                Stream API in Java makes data processing easy. Java class and method design is important!
                """;

        new TextAnalyzer(sample).analyze();
    }
}