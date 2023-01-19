package com.practice;

import java.util.Scanner;

public class sumOfdigitOfNo {
    public static void main(String[] args) {
        int number, sum;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number: ");
        number=sc.nextInt();
        for(sum=0; number>0; number=number/10)
        {
            sum = sum + number % 10;
        }
        System.out.println("Sum of digits: "+sum);
    }
}
