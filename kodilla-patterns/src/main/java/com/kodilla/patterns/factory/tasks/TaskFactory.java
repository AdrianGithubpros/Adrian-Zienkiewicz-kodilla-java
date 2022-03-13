package com.kodilla.patterns.factory.tasks;


public final class TaskFactory {
    public static final String SHOPPING = "Shopping Task";
    public static final String PAINTING = "Painting Task";
    public static final String DRIVING = "Driving Task";

    public final Task makeTask(final String taskClass,boolean isExecuted) {
        switch (taskClass) {
            case SHOPPING:
                return new ShoppingTask("Shopping Task","milk",2,isExecuted );
            case PAINTING:
                return new PaintingTask("Painting Task", "blue", "sea",isExecuted);
            case DRIVING:
                return new DrivingTask("Driving Task", "destination", "car cat. B",isExecuted);
            default:
                return null;
        }

    }
}
