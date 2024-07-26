package org.example.Behavioral.Memento;

import java.util.ArrayList;
import java.util.List;

import static org.example.Behavioral.Memento.Game.*;


public class GameHistory {

    private final List<LevelMemento> snapshotList = new ArrayList<>();

    public void add(LevelMemento memento){
        snapshotList.add(memento);
    }
    public LevelMemento get(int index){
        return snapshotList.get(index);
    }
}
