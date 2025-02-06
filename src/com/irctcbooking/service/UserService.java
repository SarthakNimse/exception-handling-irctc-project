package com.irctcbooking.service;

import com.irctcbooking.model.User;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class UserService {



    private HashMap<Integer, User> users = new HashMap<>();
    private Scanner sc = new Scanner(System.in);

    public void acceptUserInfo() {

        User user = new User();

        System.out.println("Enter your user id ");
        int userId = Integer.parseInt(sc.nextLine());

        System.out.println("Enter Your Full Name ");
        String fullName = sc.nextLine();

        System.out.println("Enter Your User Name ");
        String username = sc.nextLine();

        System.out.println("Enter Your Email");
        String email = sc.nextLine();

        System.out.println("Enter Your Phone no ");
        String phoneNo = sc.nextLine();

        user.setUserId(userId);
        user.setFullName(fullName);
        user.setUsername(username);
        user.setEmail(email);
        user.setPhoneNo(phoneNo);
        users.put(userId, user);

        System.out.println("User information saved successfully!");
    }

    public void displayUserInfo(){

        for (Map.Entry<Integer, User> set : users.entrySet()) {
            System.out.println("User ID: " + set.getKey() + ", User Info: " + set.getValue());

            System.out.println("User information you requested");
        }

    }




}
