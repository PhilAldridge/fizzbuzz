package org.example.Rules;

public class BangRule implements Rule {
    @Override
    public String apply(int number) {
        if(number%7==0) return "Bang";
        return "";
    }
}
