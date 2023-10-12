package org.example.Rules;

public class FizzRule implements Rule {
    @Override
    public String apply(int number) {
        if(number%3==0) return "Fizz";
        return "";
    }
}
