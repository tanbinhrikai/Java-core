package bai5;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.NoSuchFileException;
import java.nio.file.Path;

public class Main {
    public static void main(String[] args) {
        docFileDiem("src/bai5/diem.csv");

    }
    public static void docFileDiem(String path){
        int line = 0;
        try (BufferedReader br = Files.newBufferedReader(Path.of(path))) {
            String row ;

            while ((row = br.readLine()) != null) {
                line++;
                try {
                    String[] parts = row.split(",");
                    double diem = Double.parseDouble(parts[1]);
                    System.out.println("[OK] "+ " doc dong "+ line);
                    System.out.println(parts[0] +" - " + diem );

                } catch (NumberFormatException | ArrayIndexOutOfBoundsException e) {
                    System.out.println("[WARN] Dong " + line +
                            ": diem sai dinh dang '" + row + "'");
                }

            }



        }
        catch (FileNotFoundException | NoSuchFileException e) {
            System.out.println("[ERR] File khong ton tai: " + path);
        }
        catch (IOException e) {
            System.out.println("[ERROR] " + e.getMessage());
        }


    }
}
