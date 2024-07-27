package org.example.Behavioral.State.UpdateFromAction.Actions;

import org.example.Behavioral.State.UpdateFromAction.Human;

public class Sleep implements Action {
    @Override
    public void doAction(Human human) {
        System.out.println("do sleep");
        human.setAction(new Work());
    }
}
