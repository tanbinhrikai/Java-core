package bai5;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;

public class HoSoSinhVien implements Printable, Saveable {

    private String id;
    private String name;
    private double gpa;

    public HoSoSinhVien(String id, String name, double gpa) {
        this.id = id;
        this.name = name;
        this.gpa = gpa;
    }

    @Override
    public void print() {
        System.out.println(this);
    }

    @Override
    public void printToFile(String fileName) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))) {
            writer.write(this.toString());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void save(String fileName) {
        String json = String.format(
                "{\"id\":\"%s\",\"name\":\"%s\",\"gpa\":%.2f}",
                id, name, gpa
        );

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))) {
            writer.write(json);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void load(String fileName) {
        try {
            String content = Files.readString(Path.of(fileName));

            content = content.replace("{", "")
                    .replace("}", "")
                    .replace("\"", "");

            String[] parts = content.split(",");

            this.id = parts[0].split(":")[1];
            this.name = parts[1].split(":")[1];
            this.gpa = Double.parseDouble(parts[2].split(":")[1]);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public String toString() {
        return "Student{id='" + id + "', name='" + name + "', gpa=" + gpa + "}";
    }
}