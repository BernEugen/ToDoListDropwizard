package com.example.helloworld.core;

/**
 * Created with IntelliJ IDEA.
 * User: Eugen
 * Date: 07.05.13
 * Time: 23:55
 */
public class TaskBean {
    private int id;
    private String name;
    private int priority;

    public TaskBean(int id, String name, int priority) {
        this.id = id;
        this.name = name;
        this.priority = priority;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getPriority() {
        return priority;
    }
}
