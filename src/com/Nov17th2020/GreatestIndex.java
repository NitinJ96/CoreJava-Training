package com.Nov17th2020;

import java.util.Arrays;

public class GreatestIndex {
    public static void main(String[] args) {
        int newArray[] = {6,3,9,8,10,2,1,15,7};
        int alternateArray[] = Arrays.copyOf(newArray, newArray.length);
        int backup[] = Arrays.copyOf(newArray, newArray.length);
        sortArray(backup);
        
        boolean check = true;
        int i=0, j=0, max = 0;
        while(i<newArray.length){
            if(newArray[i]==backup[j]){
                if(j+1<newArray.length){
                    alternateArray[i]= backup[j+1];
                    i++;
                    j=0;
                }else{
                    alternateArray[i] = _;
                    i++;
                    j=0;
                }
            }else {
                j++;
            }
        }
        System.out.println(Arrays.toString(newArray));
        System.out.println(Arrays.toString(alternateArray));
    }
    
    public static int[] sortArray(int a[]){
        for (int i = 0; i < ( a.length - 1 ); i++) {
            for (int j = 0; j < a.length - i - 1; j++) {
                if (a[j] > a[j+1])
                {
                    int temp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = temp;
                }
            }
        }
        return a;
    }
}
