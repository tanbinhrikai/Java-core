package bai15;

import java.time.LocalDate;
import java.util.List;
import java.util.Map;

public class HotelRoom {

    private int roomNumber;
    private RoomType roomType;
    private String status;
    private LocalDate checkInDate;
    private LocalDate checkOutDate;

    private static Map<String, HotelRoom> roomMap;

    public HotelRoom(int roomNumber, RoomType roomType, String status,
                     LocalDate checkInDate, LocalDate checkOutDate) {
        this.roomNumber = roomNumber;
        this.roomType = roomType;
        this.status = status;
        this.checkInDate = checkInDate;
        this.checkOutDate = checkOutDate;
    }

    public int calculatePrice(int nights) {
        double base = roomType.getPrice() * nights;
        return (int) (base * 1.1); // +10%
    }

    public static List<HotelRoom> findAvailableRooms(RoomType type) {
        return roomMap.values()
                .stream()
                .filter(r -> r.roomType == type && "available".equals(r.status))
                .toList();
    }

    public void checkIn(LocalDate checkIn, LocalDate checkOut) {
        this.checkInDate = checkIn;
        this.checkOutDate = checkOut;
        this.status = "occupied";
    }

    public void checkOut(LocalDate checkOut) {
        this.checkOutDate = checkOut;
        this.status = "available";
    }

    // getters & setters
    public int getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(int roomNumber) {
        this.roomNumber = roomNumber;
    }

    public RoomType getRoomType() {
        return roomType;
    }

    public void setRoomType(RoomType roomType) {
        this.roomType = roomType;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public LocalDate getCheckInDate() {
        return checkInDate;
    }

    public void setCheckInDate(LocalDate checkInDate) {
        this.checkInDate = checkInDate;
    }

    public LocalDate getCheckOutDate() {
        return checkOutDate;
    }

    public void setCheckOutDate(LocalDate checkOutDate) {
        this.checkOutDate = checkOutDate;
    }
}