package com.nov16th2020;

import java.util.Scanner;

public class AnglePyramid {
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Enter a number: ");
        int value = scanner.nextInt();
        for (int i=1; i<=value;i++){
            for (int k=value-1; k>=i;k--){
                System.out.print("  ");
            }
            for (int j=1;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println("");
        }
    }
}

