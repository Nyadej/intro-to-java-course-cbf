package com.cbfacademy;

public class DicePlayer implements Player { // This means DicePlayer follows the Player interface, making it more flexible
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int roll() {
        int score = (int) (Math.random() * 6) + 1;
        
        System.out.println(name + " rolled a " + score);

        return score;
    }
}
