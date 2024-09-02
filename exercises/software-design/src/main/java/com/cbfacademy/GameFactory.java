package com.cbfacademy;

public class GameFactory { // factory accepts player objects
    /**
     * Creates a new dice game.
     *
     * @return A dice game.
     */
    public static Game create(Player player1, Player player2) { // and injects players into the DiceGame
        return new DiceGame(player1, player2); // injects the players into the game
    }
}
