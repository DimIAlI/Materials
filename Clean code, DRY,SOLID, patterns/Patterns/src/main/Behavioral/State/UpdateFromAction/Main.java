package org.example.Behavioral.State.UpdateFromAction;

import org.example.Behavioral.State.UpdateFromAction.Actions.Action;
import org.example.Behavioral.State.UpdateFromAction.Actions.Work;

/*
* Реализация предполагает переключение состояния в самом состоянии
* (пробрасывается объект контекста в состояние)
*/
public class Main {
    public static void main(String[] args) {

        Action action = new Work();
        Human human = new Human(25,"Mike", action);

        for (int i = 0; i < 5; i++) {
            human.doAction();
        }
    }
}
