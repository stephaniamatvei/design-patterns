package com.designpatterns.behavioralpatterns.command;

// invoker class
public class ReportGenerationExecutor {
    public void executeOperation(ReportOperation reportOperation) {
        reportOperation.execute();
    }
}

