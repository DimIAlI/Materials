package org.example.Behavioral.Memento;

import static org.example.Behavioral.Memento.Game.*;

public class Main {

    public static void main(String[] args) {

        GameHistory history = new GameHistory();

        Game game = new Game();
        game.setLevel(1);
        game.setCheckpoint("checkpoint_1");
        game.setScore(10000);

        System.out.println(game);

        LevelMemento save = game.save();
        history.add(save);

        game.setLevel(2);
        game.setCheckpoint("checkpoint_2");
        game.setScore(20000);

        System.out.println(game);

        game.restore(history.get(0));

        System.out.println(game);
    }
}
