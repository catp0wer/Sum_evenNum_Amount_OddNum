package com.company;

public class Main {

    public static void main(String[] args) {

        int[] my_array = {2,4,6,8,10};

        int sum = 0;
        int amount = 0;

        for(int i = 0; i < my_array.length; i++){
            if(my_array[i] % 2 == 0){
                amount++;
            }
            else{

                sum += my_array[i];
            }
        }

        System.out.println("Sum of odd number "+sum);
        System.out.println("Amount of even number "+amount);
    }
}
