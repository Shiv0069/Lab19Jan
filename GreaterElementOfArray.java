package com.practice;

import java.util.ArrayList;

public class GreaterElementOfArray {
    public static void main(String[] args) {
        int []arr={3,15,31,6,44,69,23,41,22};
        int number=0;
        int index=0;
        for (int i=0;i<arr.length;i++){
            if (number<arr[i]){
                number=arr[i];
                if (arr[i]==number){
                    index=i;
                }
            }
        }
        System.out.println("The Greatest No In this Array is: "+number);
        System.out.println("The Index of this Number is: "+index);
    }
}
