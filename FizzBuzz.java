package org.example;

import org.example.Rules.Rule;

import java.util.List;

public class FizzBuzz {
    private final List<Rule> rules;

    public FizzBuzz(String[] rulesToPlay) {
        RuleBuilder b = new RuleBuilder();
        rules = b.createRules(rulesToPlay);
    }

    public String stringTo(int number){
        StringBuilder returnString = new StringBuilder();
        for(int i = 1; i<=number; i++){
            returnString.append(getValueAt(i));
            if(i!=number){
                returnString.append(", ");
            }
        }
        return returnString.toString();
    }

    public String getValueAt(int number){
        StringBuilder returnString = new StringBuilder();
        for(Rule rule:rules){
            returnString.append(rule.apply(number));
        }
        if(!returnString.toString().isEmpty()) return returnString.toString();
        return Integer.toString(number);
    }
}
