package com.company;

import org.omg.PortableInterceptor.SYSTEM_EXCEPTION;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Hi, who are you? ");
        String n = input.nextLine();

        System.out.print("Hello, " + n + " nice to meet you.");
        System.out.println(" How many years have you been at Howard? ");
        int y = input.nextInt();
        System.out.println("Wow, " + y + " years, you must be a junior!");
        System.out.println("What is your GPA?");
        float g = input.nextFloat();
        System.out.println("Wow a " + g + " GPA, you are really smart!!");
    }
}
