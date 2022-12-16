package com.designpatterns.behavioralpatterns.mediator;

public interface Mediator {
    void addColleague(Colleague user);
    void sendMessage(String msg, Colleague user);
}

