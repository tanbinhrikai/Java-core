package bai5;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.NoSuchFileException;
import java.nio.file.Path;

public class Main {

    public static void main(String[] args) {
        docFileDiem("src/bai5/diem.csv");
    }

    public static void docFileDiem(String path) {

        int lineNumber = 0;

        try (BufferedReader reader =
                     Files.newBufferedReader(Path.of(path))) {

            String line;

            while ((line = reader.readLine()) != null) {

                lineNumber++;

                try {
                    String[] parts = line.split(",");

                    String name = parts[0];
                    double score = Double.parseDouble(parts[1]);

                    System.out.println(
                            "[OK] Dong " + lineNumber
                    );

                } catch (NumberFormatException | ArrayIndexOutOfBoundsException e) {

                    String[] parts = line.split(",");

                    String invalidValue =
                            parts.length > 1 ? parts[1] : line;

                    System.out.println(
                            "[WARN] Dong "
                                    + lineNumber
                                    + ": diem sai dinh dang '"
                                    + invalidValue
                                    + "'"
                    );
                }
            }

        } catch (FileNotFoundException e) {

            System.out.println(
                    "[ERR] File khong ton tai: " + path
            );

        } catch (IOException e) {

            System.out.println(
                    "[ERR] Loi doc file: " + e.getMessage()
            );

        } finally {

            System.out.println(
                    "[FINALLY] Da dong stream"
            );
        }
    }
}