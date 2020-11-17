package com.Nov17th2020;

public class ArraySum {
    public static void main(String[] args) {
        int newArray[] = {1,2,3,2,1};
        int sameSum = 0;

        for (int i=1; i<newArray.length; i++) {
            int sumLeft = splitSum(newArray, 0, i - 1);
            int sumRight = splitSum(newArray, i + 1, newArray.length - 1);
            if (sumLeft == sumRight) {
                sameSum = newArray[i];
                break;
            }
        }
        System.out.println("The element where the sum on left and right is same: "+sameSum);
    }

    public static int splitSum(int a[], int start, int end){
        //Returns the sum of the split array
        int sum = 0;
        for(int i=start; i<=end; i++){
            sum+=a[i];
        }
        return sum;
    }
}
