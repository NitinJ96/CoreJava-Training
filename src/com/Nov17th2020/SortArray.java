package com.Nov17th2020;

import java.util.Arrays;

public class SortArray {
    public static void main(String[] args) {
        int array[] = {5,7,9,1,2,59,6,3};
        int i = 0, j=0;
        while(i<array.length-2){
            if (j%2==0){
                if(array[j]<array[j+2]){
                    int temp = array[j];
                    array[j] = array[j+2];
                    array[j+2] = temp;
                }
            }
            if (j%2!=0){
                if(array[j]>array[j+2]){
                    int temp = array[j];
                    array[j] = array[j+2];
                    array[j+2] = temp;
                }
            }
            if(j<array.length-3){
                j++;
            }else {
                i++;
                j=0;
            }
        }
        System.out.println(Arrays.toString(array));
    }
}
