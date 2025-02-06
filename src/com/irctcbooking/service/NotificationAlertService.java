package com.irctcbooking.service;

import com.irctcbooking.model.NotificationAlert;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class NotificationAlertService {



    private HashMap<Integer, NotificationAlert> notificationalerts = new HashMap<>();
    private Scanner sc = new Scanner(System.in);

    public void acceptNotificationAlertInfo() {

       NotificationAlert notificationalert = new NotificationAlert();

        System.out.println("Enter Notification Alert Id  ");
        int notificationAlertId = Integer.parseInt(sc.nextLine());

        System.out.println("Enter your Notification Type ");
        String type= sc.nextLine();

        System.out.println("Enter Notification message that you want to send ");
        String message= sc.nextLine();

        System.out.println("Enter date & Time");
        String dateTime = sc.nextLine();

        notificationalert.setNotificationAlertId(notificationAlertId);
        notificationalert.setType(type);
        notificationalert.setMessage(message);
        notificationalert.setDateTime(dateTime);
        notificationalerts.put(notificationAlertId, notificationalert);

        System.out.println("Notification Alert information saved successfully!");
    }

    public void displayNotificationAlertInfo(){

        for (Map.Entry<Integer, NotificationAlert> set : notificationalerts.entrySet()) {
            System.out.println("NotificationAlert ID: " + set.getKey() + ", NotificationAlert Info: " + set.getValue());

            System.out.println("Notification Alert information you requested");
        }

    }
}
