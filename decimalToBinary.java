package com.practice;

public class decimalToBinary {
    public static void toBinary(int decimal){
            int binary[] = new int[40];
            int index = 0;
            while(decimal > 0){
                binary[index++] = decimal%2;
                decimal = decimal/2;
            }
            for(int i = index-1;i >= 0;i--){
                System.out.print(binary[i]);
            }
            System.out.println();//new line
        }
        public static void main(String args[]){
            System.out.println("Decimal of 23 is: ");
            toBinary(23);
            System.out.println("Decimal of 69 is: ");
            toBinary(69);
            System.out.println("Decimal of 291 is: ");
            toBinary(291);
        }
}


