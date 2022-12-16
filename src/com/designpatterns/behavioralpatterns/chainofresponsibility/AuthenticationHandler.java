package com.designpatterns.behavioralpatterns.chainofresponsibility;

public class AuthenticationHandler implements Handler {

    // reference to the next handler in the chain
    AuthorizationHandler authorizationHandler = new AuthorizationHandler();

    @Override
    public void handleRequest() {
        System.out.println("Authentication is successful");
        checkAuthorization();
    }

    private void checkAuthorization() {
        authorizationHandler.handleRequest();
    }

}

