package bai15;

public enum RoomType {

    SINGLE(5),
    DOUBLE(30),
    SUITE(45);

    private final int price;

    RoomType(int price) {
        this.price = price;
    }

    public int getPrice() {
        return price;
    }
}