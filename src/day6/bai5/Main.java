package day6.bai5;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    static void docFileDiem(String path) {
        String csvFile = "data.csv";
        int i = 0;
        String line = "";
        try (
                BufferedReader br = new BufferedReader(new FileReader(csvFile))
        ) {
            while ((line = br.readLine()) != null) {
                Integer x = Integer.parseInt(line);
                i++;
            }

            System.out.println("[OK] Doc " + i + " dong");
        } catch (NumberFormatException | IOException e) {
            System.out.printf("[WARN] Dong %d: diem sai dinh dang '%s'", i, line);
        }
    }

    static void main() {
        docFileDiem("diem.csv");
    }
}
