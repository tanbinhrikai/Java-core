package bai9;

public class StudentManager {

    private Student[] students;
    private int size;

    public StudentManager(int capacity) {
        this.students = new Student[capacity];
        this.size = 0;
    }

    public void add(Student student) {
        if (size == students.length) {
            resize();
        }
        students[size++] = student;
    }

    public void remove(String studentId) {
        int index = findById(studentId);

        if (index == -1) {
            System.out.println("Student not found!");
            return;
        }

        removeBySwap(index);
    }

    public void sortByScoreDesc() {
        for (int i = 0; i < size - 1; i++) {
            for (int j = 0; j < size - 1 - i; j++) {
                if (students[j].getScore() < students[j + 1].getScore()) {
                    swap(j, j + 1);
                }
            }
        }
    }

    public int findById(String studentId) {
        for (int i = 0; i < size; i++) {
            if (students[i].getStudentId().equals(studentId)) {
                return i;
            }
        }
        return -1;
    }

    public void printAll() {
        for (int i = 0; i < size; i++) {
            Student s = students[i];
            System.out.println(s.getStudentId() + " | " + s.getName() + " | " + s.getScore());
        }
    }

    public void statistics() {
        if (size == 0) return;

        double min = students[0].getScore();
        double max = students[0].getScore();
        double sum = students[0].getScore();

        for (int i = 1; i < size; i++) {
            double score = students[i].getScore();
            sum += score;

            if (score < min) min = score;
            if (score > max) max = score;
        }

        double avg = sum / size;

        System.out.println("Min: " + min);
        System.out.println("Max: " + max);
        System.out.println("Avg: " + avg);
    }


    private void resize() {
        Student[] newArray = new Student[students.length * 2];
        for (int i = 0; i < students.length; i++) {
            newArray[i] = students[i];
        }
        students = newArray;
    }

    private void removeBySwap(int index) {
        swap(index, size - 1);
        students[size - 1] = null;
        size--;
    }

    private void swap(int i, int j) {
        Student temp = students[i];
        students[i] = students[j];
        students[j] = temp;
    }
}