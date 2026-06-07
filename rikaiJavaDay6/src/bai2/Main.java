package bai2;

import java.util.HashMap;
import java.util.Map;

public class Main {

    private static final Map<String, Map<String, Double>> studentScores = new HashMap<>();

    public static void main(String[] args) {

        String[] studentNames = {
                "Le Xuan Cong",
                "Ha Thi Nhi",
                "Nguyen Thi Thu",
                "Ha Thi Thuong",
                "Vo Thi To Loan"
        };

        String[] subjects = {"Toan", "Ly", "Hoa", "Van"};

        for (int i = 0; i < 20; i++) {

            String studentName =
                    studentNames[(int) (Math.random() * studentNames.length)];

            String subject =
                    subjects[(int) (Math.random() * subjects.length)];

            double score =
                    (int) (Math.random() * 10) + 1;

            addScore(studentName, subject, score);
        }

        System.out.println(" BANG DIEM ");
        printAllScores();

        String randomStudent =
                studentNames[(int) (Math.random() * studentNames.length)];

        System.out.printf(
                "%nDiem trung binh cua %s: %.2f%n",
                randomStudent,
                calculateAverageScore(randomStudent)
        );

        String randomSubject =
                subjects[(int) (Math.random() * subjects.length)];

        System.out.printf(
                "%nSinh vien diem cao nhat mon %s:%n%s%n",
                randomSubject,
                findTopStudent(randomSubject)
        );
    }

    public static void addScore(
            String studentName,
            String subject,
            double score
    ) {
        studentScores
                .computeIfAbsent(studentName, key -> new HashMap<>())
                .put(subject, score);
    }

    public static double calculateAverageScore(String studentName) {

        Map<String, Double> scores = studentScores.get(studentName);

        if (scores == null || scores.isEmpty()) {
            return 0;
        }

        return scores.values()
                .stream()
                .mapToDouble(Double::doubleValue)
                .average()
                .orElse(0);
    }

    public static String findTopStudent(String subject) {

        String topStudent = null;
        double highestScore = -1;

        for (Map.Entry<String, Map<String, Double>> entry : studentScores.entrySet()) {

            Double score = entry.getValue().get(subject);

            if (score != null && score > highestScore) {
                highestScore = score;
                topStudent = entry.getKey();
            }
        }

        if (topStudent == null) {
            return "Chua co sinh vien nao hoc mon nay";
        }

        return topStudent + " - " + highestScore;
    }

    public static void printAllScores() {

        studentScores.forEach((studentName, scores) -> {

            System.out.println("\nBang diem cua: " + studentName);

            scores.forEach((subject, score) ->
                    System.out.printf(
                            "%-10s : %.1f%n",
                            subject,
                            score
                    )
            );
        });
    }
}