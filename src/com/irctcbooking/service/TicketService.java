package com.irctcbooking.service;

import com.irctcbooking.model.Ticket;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class TicketService {



    private HashMap<Integer, Ticket> tickets  = new HashMap<>();
    private Scanner sc = new Scanner(System.in);

    public void acceptTicketInfo(){

        Ticket ticket = new Ticket();

        System.out.println("Enter your ticket Id");
        int ticketId = Integer.parseInt(sc.nextLine());

        System.out.println("Enter your PNR number ");
        String pnrNumber = sc.nextLine();

        System.out.println("Enter your seat number");
        int seatNumber = Integer.parseInt(sc.nextLine());

        System.out.println("Enter your booking date");
        String bookingDate = sc.nextLine();

        System.out.println("Enter your ticket price");
        double ticketPrice = sc.nextDouble();

        ticket.setTicketId(ticketId);
        ticket.setPnrNumber(pnrNumber);
        ticket.setSeatNumber(seatNumber);
        ticket.setBookingDate(bookingDate);
        ticket.setTicketPrice(ticketPrice);
        tickets.put(ticketId,ticket);

        System.out.println("Ticket information saved successfully!");

    }

    public void displayTicketInfo(){

        for (Map.Entry<Integer, Ticket> set : tickets.entrySet()){
            System.out.println("Ticket ID: " + set.getKey() + ", Ticket Info: " + set.getValue());
        }
    }
}
