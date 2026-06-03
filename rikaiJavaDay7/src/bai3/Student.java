package bai3;

public record Student(String id,String name ,Double gpa) {
    public Student{
        if (id == null || id.isEmpty()) {
            throw new IllegalArgumentException("id invalid");
        }

        if (gpa < 0 || gpa > 10) {
            throw new IllegalArgumentException("gpa invalid");
        }

    }
}
