package org.example.Behavioral.State.UpdateFromAction.Actions;

import org.example.Behavioral.State.UpdateFromAction.Human;

public class Rest implements Action {
    @Override
    public void doAction(Human human) {
        System.out.println("do rest");
        human.setAction(new Sleep());
    }
}
