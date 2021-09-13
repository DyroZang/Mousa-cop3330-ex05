/*
 *  UCF COP3330 Fall 2021 Assignment 5 Solution
 *  Copyright 2021 Gabriel Mousa
 */

import java.util.Scanner;

public class App {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("What is the first number?");
        int num1 = Integer.parseInt(input.nextLine());
        System.out.println("What is the second number? ");
        int num2 = Integer.parseInt(input.nextLine());

        System.out.println(num1 + " + " + num2 + " = " + (num1 + num2) + "\n" + num1 + " - " + num2 + " = " + (num1-num2) + "\n" + num1 + " * " + num2 + " = " + (num1*num2) + "\n" + num1 + " / " + num2 + " = " + (num1/num2));

    }
}
