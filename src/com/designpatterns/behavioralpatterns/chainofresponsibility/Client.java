package com.designpatterns.behavioralpatterns.chainofresponsibility;

public class Client {
    public static void main(String[] args) {
        Handler handler = new AuthenticationHandler();
        handler.handleRequest();
    }
}

