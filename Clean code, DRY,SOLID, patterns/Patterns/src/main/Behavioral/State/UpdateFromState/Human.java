package org.example.Behavioral.State.UpdateFromState;


import org.example.Behavioral.State.UpdateFromState.Actions.Action;
import org.example.Behavioral.State.UpdateFromState.Actions.Rest;
import org.example.Behavioral.State.UpdateFromState.Actions.Sleep;
import org.example.Behavioral.State.UpdateFromState.Actions.Work;

public class Human {

    private int age;
    private String name;
    private Action action;

    public Human(int age, String name, Action action) {
        this.age = age;
        this.name = name;
        this.action = action;
    }

    void doAction() {
        action.doAction();
        updateState();
    }

    //Логика обновления состояния из класса контекста
    private void updateState() {
        switch (action) {
            case Work w -> action = new Rest();
            case Rest r -> action = new Sleep();
            case Sleep s -> action = new Work();
            default -> throw new IllegalArgumentException("Invalid action");
        }
        /*
         То же самое что и:
        if (action instanceof Work) {
            action = new Rest();
        } else if (action instanceof Rest) {
            action = new Sleep();
        } else if (action instanceof Sleep) {
            action = new Work();
        } else {
            throw new IllegalStateException("Unexpected value: " + action);
        }
        */
    }
}
