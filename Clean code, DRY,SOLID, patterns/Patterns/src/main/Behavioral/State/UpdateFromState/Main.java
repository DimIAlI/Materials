package org.example.Behavioral.State.UpdateFromState;


import org.example.Behavioral.State.UpdateFromState.Actions.Action;
import org.example.Behavioral.State.UpdateFromState.Actions.Work;

/*
 * Подразумевает изменение состояния в классе контексте
 */
public class Main {
    public static void main(String[] args) {

        Action action = new Work();
        Human human = new Human(25, "Mike", action);

        for (int i = 0; i < 5; i++) {
            human.doAction();
        }
    }
}
