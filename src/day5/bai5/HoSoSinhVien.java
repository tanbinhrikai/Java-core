package day5.bai5;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class HoSoSinhVien implements Printable, Saveable{
    @Override
    public void print() {
        System.out.println("SV001");
    }

    @Override
    public void printToFile(String fileName) {
        Path path = Path.of(fileName);
        try {
            Files.writeString(path, "sv001");
            System.out.println("Ghi file thanh cong");
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    @Override
    public void save() {
        System.out.println("Luu Json");
    }

    @Override
    public void load(String source) {
        String content = null;
        try {
            content = Files.readString(Path.of(source));
            System.out.println("Doc va phuc hoi thanh cong: ");
            System.out.println(content);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
