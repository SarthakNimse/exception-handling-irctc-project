package com.irctcbooking;

import com.irctcbooking.service.*;

import java.util.Scanner;

public class IrctcBookingDemo {



    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        UserService userService = new UserService();
        TrainService trainService= new TrainService();
        TicketService ticketService = new TicketService();
        PaymentService paymentService = new PaymentService();
        NotificationAlertService notificationAlertService = new NotificationAlertService();
        BookingHistoryService bookingHistoryService = new BookingHistoryService();
        AdminService adminService = new AdminService();

        int option = 0;
        do {
            System.out.println("------------------------Welcome into IRCTC Booking System---------------");
            System.out.println("please choose the option you want to process: ");
            System.out.println("1. Fill the User information");
            System.out.println("2. Display User information");
            System.out.println("3. Fill the Train information");
            System.out.println("4. Display Train information");
            System.out.println("5. Fill Ticket information");
            System.out.println("6. Display Ticket information");
            System.out.println("7. Fill Payment information");
            System.out.println("8. Display Payment information");
            System.out.println("9. Fill Notification Alert Service information");
            System.out.println("10. Display Fill Notification Alert Service information");
            System.out.println("11. Fill Booking History Service information");
            System.out.println("12. Display Booking History Service information");
            System.out.println("13. Fill Admin information");
            System.out.println("14. Display Admin information");
            System.out.println("0: Exit");

            option = Integer.parseInt(sc.nextLine());

            switch (option){
                case 1:
                    userService.acceptUserInfo();
                    break;

                case 2:
                    userService.displayUserInfo();
                    break;

                case 3:
                    trainService.acceptTrainInfo();
                    break;

                case 4:
                    trainService.displayTrainInfo();
                    break;

                case 5:
                    ticketService.acceptTicketInfo();
                    break;

                case 6:
                    ticketService.displayTicketInfo();
                    break;

                case 7:
                    paymentService.acceptPaymentInfo();
                    break;

                case 8:
                    paymentService.displayPaymentInfo();
                    break;

                case 9:
                    notificationAlertService.acceptNotificationAlertInfo();
                    break;

                case 10:
                    notificationAlertService.displayNotificationAlertInfo();
                    break;

                case 11:
                    bookingHistoryService.acceptBookingHistoryInfo();
                    break;

                case 12:
                    bookingHistoryService.displayBookingHistoryInfo();
                    break;

                case 13:
                    adminService.acceptAdminInfo();
                    break;

                case 14:
                    adminService.displayAdminInfo();
                    break;
            }

        }
        while (option != 0);
        System.out.println("THANK YOU FOR USING IRCTC WEBSITE!");
    }



}
