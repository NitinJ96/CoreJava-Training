package com.oct16th2020;

import java.util.Scanner;

public class SubString {
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Enter a String: ");
        String str = scanner.nextLine();
        System.out.println("Enter the range of substring in 0 - "+(str.length()-1));
        System.out.print("Starting index: ");
        int start = scanner.nextInt();
        System.out.print("Ending index: ");
        int end = scanner.nextInt();
        System.out.println(str.substring(start, end));
    }
}
