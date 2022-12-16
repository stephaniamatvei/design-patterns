package com.designpatterns.behavioralpatterns.command;

// concrete command
public class GenerateReportOperation implements ReportOperation {
    @Override
    public void execute() {
        Report report = new Report();
        report.generate();
    }
}

