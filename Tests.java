package org.example;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Tests {
    @Test
    public void testNothing() {
        FizzBuzz engine = new FizzBuzz(new String[]{"Fizz", "Buzz"});
        String actual = engine.stringTo(0);
        String expected = "";
        assertEquals(expected,actual);
    }
    @Test
    public void testFirstNumber(){
        FizzBuzz engine = new FizzBuzz(new String[]{"Fizz", "Buzz"});
        String actual = engine.stringTo(1);
        String expected = "1";
        assertEquals(expected,actual);
    }
    @Test
    public void testFirstFizz(){
        FizzBuzz engine = new FizzBuzz(new String[]{"Fizz", "Buzz"});
        String actual = engine.stringTo(3);
        String expected = "1, 2, Fizz";
        assertEquals(expected,actual);
    }

    @Test
    public void testFirstBuzz(){
        FizzBuzz engine = new FizzBuzz(new String[]{"Fizz", "Buzz"});
        String actual = engine.stringTo(5);
        String expected = "1, 2, Fizz, 4, Buzz";
        assertEquals(expected,actual);
    }

    @Test
    public void testBuzzUsingGetValueAt(){
        FizzBuzz engine = new FizzBuzz(new String[]{"Fizz", "Buzz"});
        String actual = engine.getValueAt(5);
        String expected = "Buzz";
        assertEquals(expected,actual);
    }

    @Test
    public void testFirstFizzBuzz(){
        FizzBuzz engine = new FizzBuzz(new String[]{"Fizz", "Buzz"});
        String actual = engine.getValueAt(15);
        String expected = "FizzBuzz";
        assertEquals(expected,actual);
    }

    @Test
    public void testFirstFiftyNumbers(){
        FizzBuzz engine = new FizzBuzz(new String[]{"Fizz", "Buzz"});
        String actual = engine.stringTo(50);
        String expected = "1, 2, Fizz, 4, Buzz, Fizz, 7, 8, Fizz, Buzz, 11, Fizz, 13, 14, FizzBuzz, 16, 17, Fizz, 19, Buzz, Fizz, 22, 23, Fizz, Buzz, 26, Fizz, 28, 29, FizzBuzz, 31, 32, Fizz, 34, Buzz, Fizz, 37, 38, Fizz, Buzz, 41, Fizz, 43, 44, FizzBuzz, 46, 47, Fizz, 49, Buzz";
        assertEquals(expected,actual);
    }

    @Test
    public void playBuzzFizz(){
        FizzBuzz engine = new FizzBuzz(new String[]{"Buzz", "Fizz"});
        String actual = engine.stringTo(15);
        String expected = "1, 2, Fizz, 4, Buzz, Fizz, 7, 8, Fizz, Buzz, 11, Fizz, 13, 14, BuzzFizz";
        assertEquals(expected,actual);
    }

    @Test
    public void playBuzzFizzBang(){
        FizzBuzz engine = new FizzBuzz(new String[]{"Buzz", "Fizz", "Bang"});
        String actual = engine.stringTo(30);
        String expected = "1, 2, Fizz, 4, Buzz, Fizz, Bang, 8, Fizz, Buzz, 11, Fizz, 13, Bang, BuzzFizz, 16, 17, Fizz, 19, Buzz, FizzBang, 22, 23, Fizz, Buzz, 26, Fizz, Bang, 29, BuzzFizz";
        assertEquals(expected,actual);
    }

    @Test
    public void testBuzzFizzBang(){
        FizzBuzz engine = new FizzBuzz(new String[]{"Buzz", "Fizz", "Bang"});
        String actual = engine.getValueAt(105);
        String expected = "BuzzFizzBang";
        assertEquals(expected,actual);
    }

    @Test
    public void playBuzzSquareBang(){
        FizzBuzz engine = new FizzBuzz(new String[]{"Buzz","Square","Bang"});
        String actual = engine.stringTo(36);
        String expected = "Square, 2, 3, Square, Buzz, 6, Bang, 8, Square, Buzz, 11, 12, 13, Bang, Buzz, Square, 17, 18, 19, Buzz, Bang, 22, 23, 24, BuzzSquare, 26, 27, Bang, 29, Buzz, 31, 32, 33, 34, BuzzBang, Square";
        assertEquals(expected,actual);
    }

    @Test
    public void testBuzzSquareBang(){
        FizzBuzz engine = new FizzBuzz(new String[]{"Buzz","Square","Bang"});
        String actual = engine.getValueAt(35*35);
        String expected = "BuzzSquareBang";
        assertEquals(expected,actual);
    }
}
