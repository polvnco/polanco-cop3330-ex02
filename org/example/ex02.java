/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Christopher Polanco
 */
package org.example;


import java.util.Scanner;

public class ex02
{
    public static void main( String[] args )
    {
        System.out.print("What is the input string? ");
        Scanner readString = new Scanner(System.in);

        String inputString = readString.nextLine();
        System.out.print(inputString + " has " + inputString.length() + " characters.");
    }

}
