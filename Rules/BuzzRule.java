package org.example.Rules;

public class BuzzRule implements Rule {
    @Override
    public String apply(int number) {
        if(number%5==0) return "Buzz";
        return "";
    }
}
