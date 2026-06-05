package day5.bai15;

public class Main {
    public static void main(String[] args) {
        Zoo myZoo = new Zoo();

        myZoo.addAnimal(new Dog());
        myZoo.addAnimal(new Dog());
        myZoo.addAnimal(new Dog());

        myZoo.addAnimal(new Dolphin());
        myZoo.addAnimal(new Dolphin());

        myZoo.addAnimal(new Eagle());

        // Thực thi các phương thức theo yêu cầu
        myZoo.feedAll();
        myZoo.trainAll();
        myZoo.swimAll();
        myZoo.thongKe();


    }
}
