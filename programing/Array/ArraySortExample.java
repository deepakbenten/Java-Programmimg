package com.programing.Array;

import java.util.Arrays;

public class ArraySortExample {
    public static void main(String[] args) {
        int[] arr = {5, 3, 8, 1, 2};
        
        System.out.println("Array before sorting: " + Arrays.toString(arr));
        
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j+1]) {
                    
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
            
        }
        
        System.out.println("Array after sorting: " + Arrays.toString(arr));
    }
}
