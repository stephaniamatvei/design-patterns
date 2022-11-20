package com.designpatterns.structuralpatterns.composite;

public class Main {
    public static void main(String[] args) {
        Human human = new Human();
        human.setName("Stef");
        human.setDepartment("Tech");

        Robot robot = new Robot();
        robot.setName("R2D2");
        robot.setDepartment("Star Wars");

        WorkManager workManager = new WorkManager();
        workManager.add(human);
        workManager.add(robot);
        System.out.println(workManager);
    }
}
