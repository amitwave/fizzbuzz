package com.wave.fizzbuzz;


public class FizzBuzzService {

    public final String fizz = "Fizz";
    public final String buzz = "Buzz";

    public String categoriseNumber(Integer number) {

        if(number == null) {
            return "";
        }

        Boolean isFizz = number %3 == 0 || number.toString().contains("3");
        Boolean isBuzz = number %5 == 0 || number.toString().contains("5");

        String result = number.toString();

        if(isFizz && isBuzz){
            result = fizz + buzz;
        }else  if(isFizz){
            result = fizz;
        } else if(isBuzz) {
            result = buzz;
        }

        return result;
    }



}
