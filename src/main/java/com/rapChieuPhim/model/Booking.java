package com.rapChieuPhim.model;

public class Booking {
    private String id;
    private String customerId;
    private String showtimeId;
    private String seatNumber;
    private String bookingDate;

    public Booking(String id, String customerId, String showtimeId, String seatNumber, String bookingDate) {
        this.id = id;
        this.customerId = customerId;
        this.showtimeId = showtimeId;
        this.seatNumber = seatNumber;
        this.bookingDate = bookingDate;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public String getShowtimeId() {
        return showtimeId;
    }

    public void setShowtimeId(String showtimeId) {
        this.showtimeId = showtimeId;
    }

    public String getSeatNumber() {
        return seatNumber;
    }

    public void setSeatNumber(String seatNumber) {
        this.seatNumber = seatNumber;
    }

    public String getBookingDate() {
        return bookingDate;
    }

    public void setBookingDate(String bookingDate) {
        this.bookingDate = bookingDate;
    }

    
    
}

