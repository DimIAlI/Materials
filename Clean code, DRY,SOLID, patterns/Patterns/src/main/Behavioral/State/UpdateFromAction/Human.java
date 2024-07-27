package org.example.Behavioral.State.UpdateFromAction;

import org.example.Behavioral.State.UpdateFromAction.Actions.Action;

public class Human {

    private int age;
    private String name;
    private Action action;

    public Human(int age, String name, Action action) {
        this.age = age;
        this.name = name;
        this.action = action;
    }

    public void setAction(Action action) {
        this.action = action;
    }

    void doAction() {
        action.doAction(this);
    }

}
