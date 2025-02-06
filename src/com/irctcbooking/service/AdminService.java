package com.irctcbooking.service;

import com.irctcbooking.model.Admin;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class AdminService {

//    private int adminId;
//    private String adminName;
//    private String adminEmail;
//    private String adminPhone;


    private HashMap<Integer, Admin> admins = new HashMap<>();
    private Scanner sc = new Scanner(System.in);

    public void acceptAdminInfo() {

        Admin admin = new Admin();

        System.out.println("Enter Admin Id  ");
        int adminId = Integer.parseInt(sc.nextLine());

        System.out.println("Enter your Name ");
        String adminName= sc.nextLine();

        System.out.println("Enter Your Email ");
        String adminEmail= sc.nextLine();

        System.out.println("Enter your Phone No ");
        String adminPhone = sc.nextLine();

        admin.setAdminId(adminId);
        admin.setAdminName(adminName);
        admin.setAdminEmail(adminEmail);
        admin.setAdminPhone(adminPhone);
        admins.put(adminId, admin);

        System.out.println("Admin information saved successfully!");
    }

    public void displayAdminInfo(){

        for (Map.Entry<Integer, Admin> set : admins.entrySet()) {
            System.out.println("Admins Id: " + set.getKey() + ", Adnin Info: " + set.getValue());

            System.out.println("Admin information you requested");
        }

    }
}
