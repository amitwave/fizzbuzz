package com.wave.fizzbuzz;


public class FizzBuzApplication {

    public static void main(String[] args) {
        FizzBuzzService fizzBuzzService = new FizzBuzzService();


        for(int i = 1; i<= 100; i++) {
            System.out.println(fizzBuzzService.categoriseNumber(i));
        }
    }
}
