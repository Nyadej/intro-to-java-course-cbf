package com.cbfacademy;

public class App {
    public static void main(String[] args) {
        DiceGame game = GameFactory.create(); // means the main application doesn't create the game directly, it asks the factory to create one
        String winner = game.play();

        if (winner == null) {
            System.out.println("It's a draw!");
        } else {
            System.out.println(winner + " wins!");
        }
    }
}
