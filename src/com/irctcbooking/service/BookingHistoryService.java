package com.irctcbooking.service;

import com.irctcbooking.model.BookingHistory;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class BookingHistoryService {

    private HashMap<Integer, BookingHistory> bookinghistoryservices = new HashMap<>();
    private Scanner sc = new Scanner(System.in);

    public void acceptBookingHistoryInfo() {

       BookingHistory bookinghistory = new BookingHistory();

        System.out.println("Enter Booking Id  ");
        int bookingId = Integer.parseInt(sc.nextLine());

        bookinghistory.setBookingId(bookingId);
        bookinghistoryservices.put(bookingId, bookinghistory);

        System.out.println("Booking information saved successfully!");
    }

    public void displayBookingHistoryInfo(){

        for (Map.Entry<Integer, BookingHistory> set : bookinghistoryservices.entrySet()) {
            System.out.println("Booking ID: " + set.getKey() + ", Booking Info: " + set.getValue());

            System.out.println("BookingHistory information you requested");
        }

    }
}
