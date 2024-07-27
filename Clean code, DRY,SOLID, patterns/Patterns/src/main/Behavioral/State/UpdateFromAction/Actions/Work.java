package org.example.Behavioral.State.UpdateFromAction.Actions;

import org.example.Behavioral.State.UpdateFromAction.Human;

public class Work implements Action {
    @Override
    public void doAction(Human human) {
        System.out.println("do work");
        human.setAction(new Rest());
    }
}
