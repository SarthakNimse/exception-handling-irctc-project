package com.irctcbooking.model;

public class BookingHistory {

    private int bookingId;
    private int userId;
    private String trainName;
    private int ticketId;
    private String payment;

    public String getPayment() {
        return payment;
    }

    public void setPayment(String payment) {
        this.payment = payment;
    }

    public int getTicketId() {
        return ticketId;
    }

    public void setTicketId(int ticketId) {
        this.ticketId = ticketId;
    }

    public String getTrainName() {
        return trainName;
    }

    public void setTrainName(String trainName) {
        this.trainName = trainName;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public int getBookingId() {
        return bookingId;
    }

    public void setBookingId(int bookingId) {
        this.bookingId = bookingId;
    }


    @Override
    public String toString() {
        return "BookingHistory{" +
                "bookingId=" + bookingId +
                ", userId=" + userId +
                ", trainName='" + trainName + '\'' +
                ", ticketId=" + ticketId +
                ", payment='" + payment + '\'' +
                '}';
    }
}

