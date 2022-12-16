package com.designpatterns.behavioralpatterns.memento;

import java.util.ArrayList;
import java.util.List;

public class Caretaker {
    private List<Memento> mementoList;

    public Caretaker() {
        initializeList();
    }

    private void initializeList() {
        this.mementoList = new ArrayList<>();
    }

    public void add(Memento state) {
        mementoList.add(state);
    }

    public Memento get(int index) {
        return mementoList.get(index);
    }

    public int getSize() {
        return mementoList.size();
    }
}
