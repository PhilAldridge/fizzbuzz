package org.example;

import org.example.Rules.*;

import java.util.ArrayList;
import java.util.List;

public class RuleBuilder {
    public List<Rule> createRules(String[] rulesToCreate){
        List<Rule> rules = new ArrayList<>();
        for(String ruleToCreate: rulesToCreate) {
            switch (ruleToCreate) {
                case "Fizz" -> rules.add(new FizzRule());
                case "Buzz" -> rules.add(new BuzzRule());
                case "Bang" -> rules.add(new BangRule());
                case "Square" -> rules.add(new SquareRule());
            };
        }
        return rules;
    }
}
