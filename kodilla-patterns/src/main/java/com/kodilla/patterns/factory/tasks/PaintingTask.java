package com.kodilla.patterns.factory.tasks;

public class PaintingTask implements Task{
    String taskName;
    String color;
    String whatToPaint;
    boolean isExecuted;

    public PaintingTask(String taskName, String color, String whatToPaint, boolean isExecuted) {
        this.taskName = taskName;
        this.color = color;
        this.whatToPaint = whatToPaint;
        this.isExecuted = isExecuted;
    }

    @Override
    public String executeTask() {
        return "execute";
    }

    @Override
    public String getTaskName() {
        return taskName;
    }

    @Override
    public boolean isTaskExecuted() {
        return this.isExecuted;
    }
}
