package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);                             //Scanner opbejkt
        String[] names = {"Peter","Isabella","Hans","Signe","Niels"};       //String array af navnene
        int[5] age = new int[];                                             //Opretter et array af tal
        int x=0;                                                            //Ny variabel x sat til 0
        do{                                                                 //Gør dette en gang og så længe "while" gør sig gælende
            System.out.println("What is the age of " + names[x]);          //Spørger brugeren hvad alder personen har
            age[x] = input.nextInt();                                       //Læser brugerens input
        }while(x< names.length);                                            //Så længe x er mindre end længden på String arrayet

        int data = 0;                                                       //Ny variable 'data' sat til 0
        do {                                                                //Gør dette en gang og så længe "while" gør sig gælende
            System.out.println("What data would you like to see? Write a number between 1 and 5:"); //Spørger brugene hvilken person man vil have data fra
            data = input.nextInt();                                         //Læser brugerens input
        }while (data<names.length);                                         //Hvis brugeren indtaster et for stort tal gentages loopet, for at sikre brugeren ikke crasher programmet.

        System.out.println("Name of person " + data + " is " + names[data] + " and the age is " + age[data-1]  ); //Udskriver data fra personen der er valgt.
    }
}