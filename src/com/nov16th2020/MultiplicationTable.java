package com.nov16th2020;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MultiplicationTable {
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        try{
            System.out.print("Enter a number to display table: ");
            int value = scanner.nextInt();
            for(int i=1; i<11; i++){
                System.out.println(value+" X "+i+" = "+(value*i));
            }
        }catch (InputMismatchException e) {
            System.out.println(e+":Kindly enter an 'Integer'");
        }
    }
}
