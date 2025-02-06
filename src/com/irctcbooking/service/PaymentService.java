package com.irctcbooking.service;

import com.irctcbooking.model.Payment;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class PaymentService {


    private HashMap<Integer, Payment> payments  = new HashMap<>();
    private Scanner sc = new Scanner(System.in);

    public void acceptPaymentInfo() {

        Payment payment = new Payment();

        System.out.println("Enter your payment Id  ");
        int paymentId = Integer.parseInt(sc.nextLine());

        System.out.println("Enter your paymentDate ");
        String paymentDate = sc.nextLine();

        System.out.println("Enter Payment Method ");
        String paymentMethod = sc.nextLine();

        System.out.println("Enter Amount ");
        double amount = sc.nextDouble();

        System.out.println("Enter Payment Status");
        String paymentStatus = sc.nextLine();

        payment.setPaymentId(paymentId);
        payment.setPaymentDate(paymentDate);
        payment.setPaymentMethod(paymentMethod);
        payment.setAmount(amount);
        payment.setPaymentStatus(paymentStatus);
        payments.put(paymentId, payment);

        System.out.println("payments information saved successfully!");
    }

    public void displayPaymentInfo(){

        for (Map.Entry<Integer, Payment> set : payments.entrySet()) {
            System.out.println("Payement ID: " + set.getKey() + ", Payment Info: " + set.getValue());

            System.out.println("Payment information you requested");
        }

    }
}
