package org.example.Rules;

public class SquareRule implements Rule {
    @Override
    public String apply(int number) {
        int sqrt = (int)Math.sqrt(number);
        if(Math.pow(sqrt,2) == number) return "Square";
        return "";
    }
}
