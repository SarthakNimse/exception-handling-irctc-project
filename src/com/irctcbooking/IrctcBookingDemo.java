package com.irctcbooking;

import com.irctcbooking.exception.*;
import com.irctcbooking.service.*;

import java.util.Scanner;

public class IrctcBookingDemo {

    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        UserService userService = new UserService();
        TrainService trainService = new TrainService();
        TicketService ticketService = new TicketService();
        PaymentService paymentService = new PaymentService();
        NotificationAlertService notificationAlertService = new NotificationAlertService();
        BookingHistoryService bookingHistoryService = new BookingHistoryService();
        AdminService adminService = new AdminService();

        int option = 0;
        do {
            System.out.println("------------------------ Welcome to IRCTC Booking System ------------------------");
            System.out.println("Please choose the option you want to process: ");
            System.out.println("1. Fill the User information");
            System.out.println("2. Display User information");
            System.out.println("3. Fill Train information");
            System.out.println("4. Display Train information");
            System.out.println("5. Fill Ticket information");
            System.out.println("6. Display Ticket information");
            System.out.println("7. Fill Payment information");
            System.out.println("8. Display Payment information");
            System.out.println("9. Fill Notification Alert information");
            System.out.println("10. Display Notification Alerts");
            System.out.println("11. Fill Booking History");
            System.out.println("12. Display Booking History");
            System.out.println("13. Fill Admin information");
            System.out.println("14. Display Admin information");
            System.out.println("0: Exit");
            System.out.print("Enter your choice: ");

            try {
                option = Integer.parseInt(sc.nextLine());

                switch (option) {
                    case 1:
                        try {
                            userService.acceptUserInfo();
                        } catch (InvalidUserDetailsException e) {
                            System.out.println("Error: " + e.getMessage());
                        }
                        break;

                    case 2:
                        try {
                            userService.displayUserInfo();
                        } catch (UserNotFoundException e) {
                            System.out.println("Error: " + e.getMessage());
                        }
                        break;

                    case 3:
                        trainService.acceptTrainInfo();
                        break;

                    case 4:
                        try {
                            trainService.displayTrainInfo();
                        } catch (TrainNotFoundException e) {
                            System.out.println("Error: " + e.getMessage());
                        }
                        break;

                    case 5:
                        ticketService.acceptTicketInfo();
                        break;

                    case 6:
                        try {
                            ticketService.displayTicketInfo();
                        } catch (TicketNotFoundException e) {
                            System.out.println("Error: " + e.getMessage());
                        }
                        break;

                    case 7:
                        try {
                            paymentService.acceptPaymentInfo();
                        } catch (InvalidPaymentMethodException e) {
                            System.out.println("Error: " + e.getMessage());
                        }
                        break;

                    case 8:
                        try {
                            paymentService.displayPaymentInfo();
                        } catch (PaymentFailedException e) {
                            System.out.println("Error: " + e.getMessage());
                        }
                        break;

                    case 9:
                        notificationAlertService.acceptNotificationAlertInfo();
                        break;

                    case 10:
                        try {
                            notificationAlertService.displayNotificationAlertInfo();
                        } catch (NotificationNotFoundException e) {
                            System.out.println("Error: " + e.getMessage());
                        }
                        break;

                    case 11:
                        bookingHistoryService.acceptBookingHistoryInfo();
                        break;

                    case 12:
                        try {
                            bookingHistoryService.displayBookingHistoryInfo();
                        } catch (BookingNotFoundException e) {
                            System.out.println("Error: " + e.getMessage());
                        }
                        break;

                    case 13:
                        try {
                            adminService.acceptAdminInfo();
                        } catch (AdminAccessDeniedException e) {
                            System.out.println("Error: " + e.getMessage());
                        }
                        break;

                    case 14:
                        try {
                            adminService.displayAdminInfo();
                        } catch (AdminNotFoundException e) {
                            System.out.println("Error: " + e.getMessage());
                        }
                        break;

                    case 0:
                        System.out.println("THANK YOU FOR USING THE IRCTC BOOKING SYSTEM! Safe Travels ");
                        break;

                    default:
                        System.out.println("Invalid option! Please enter a valid number.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid input! Please enter a number.");
            }

        } while (option != 0);
    }
}

