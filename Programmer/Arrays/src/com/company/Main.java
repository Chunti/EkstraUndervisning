package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] names = {"Peter", "Isabella", "Hans", "Signe", "Niels"};
        int[] age = new int[5];
        int x = 0;
        do {
            System.out.println("What is the age of " + names[x]);
            age[x] = input.nextInt();
            x++;
        } while (x < names.length);

        int data = 0;
        do {
            System.out.println("What data would you like to see? Write a number between 1 and 5:");
            data = input.nextInt();
        } while (data > names.length);

        System.out.println("Name of the person " + data + " is " + names[data-1] + " and the age is " + age[data - 1]);
    }
}
