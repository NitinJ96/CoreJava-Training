package com.Nov17th2020;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class MergeArray {
    public static void main(String[] args) {
        int firstArray[] = {2,9,7,6,4,3,1,9,6};
        int secondArray[] = {4,8,9,4,6,4,1,6,4,8,};
        ArrayList<Integer> list = new ArrayList<>();

        for (int value: firstArray) {
            list.add(value);
        }
        for (int value: secondArray) {
            list.add(value);
        }
        Collections.sort(list);
        Set<Integer> hashSet = new HashSet<>(list);
        System.out.println(hashSet);
    }
}
