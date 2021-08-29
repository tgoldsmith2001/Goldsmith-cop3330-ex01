/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Tyler Goldsmith
 */
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.printf("What is your name? ");
        String name = input.nextLine();
        System.out.println("Hello, "+name+", Nice to meet you!");
    }
}
