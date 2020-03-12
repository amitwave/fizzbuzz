package com.wave.fizzbuzz;


import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FizzBuzzServiceTest {


    private FizzBuzzService fizzBuzzService;

    @Before
    public void setUp(){
        fizzBuzzService = new FizzBuzzService();
    }

    @Test
    public void shouldReturnEmptyStringWhenInputIsNull(){
        String result = fizzBuzzService.categoriseNumber(null);

        assertEquals("Unexpected result", "", result);
    }

    @Test
    public void shouldReturnFizzBuzzWhenNumbersIs0(){
        String result = fizzBuzzService.categoriseNumber(0);

        assertEquals("Unexpected result", "FizzBuzz", result);
    }

    @Test
    public void shouldReturnInputNumberWhenNumberCannotBeClassified(){
        String result = fizzBuzzService.categoriseNumber(1);

        assertEquals("Unexpected result", "1", result);
    }

    @Test
    public void shouldReturnFizzWhenNumbersAreDivisibleBy3(){
        String result = fizzBuzzService.categoriseNumber(3);

        assertEquals("Unexpected result", "Fizz", result);
    }

    @Test
    public void shouldReturnBuzzWhenNumbersAreDivisibleBy5(){
        String result = fizzBuzzService.categoriseNumber(5);

        assertEquals("Unexpected result", "Buzz", result);
    }

    @Test
    public void shouldReturnFizzBuzzWhenNumbersAreDivisibleBy3And5(){
        String result = fizzBuzzService.categoriseNumber(15);

        assertEquals("Unexpected result", "FizzBuzz", result);
    }

    @Test
    public void shouldReturnFizzWhenNumbersContains3ButIsNotDivisibleBy3(){
        String result = fizzBuzzService.categoriseNumber(31);

        assertEquals("Unexpected result", "Fizz", result);
    }

    @Test
    public void shouldReturnBuzzWhenNumbersContains5ButIsNotDivisibleBy5(){
        String result = fizzBuzzService.categoriseNumber(52);

        assertEquals("Unexpected result", "Buzz", result);
    }

    @Test
    public void shouldReturnFizzBuzzWhenNumbersContain3And5ButNotDivisibleBy3or5(){
        String result = fizzBuzzService.categoriseNumber(53);

        assertEquals("Unexpected result", "FizzBuzz", result);
    }



}
