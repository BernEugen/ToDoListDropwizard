package com.example.tasktodo.service;

import com.example.tasktodo.configuration.TaskConfiguration;
import com.example.tasktodo.resources.TaskAddResource;
import com.example.tasktodo.resources.TaskDeleteResource;
import com.example.tasktodo.resources.TaskListResource;
import com.yammer.dropwizard.Service;
import com.yammer.dropwizard.config.Bootstrap;
import com.yammer.dropwizard.config.Environment;

/**
 * Created with IntelliJ IDEA.
 * User: Eugen
 * Date: 26.04.13
 * Time: 20:44
 */
public class TaskService extends Service<TaskConfiguration> {

    @Override
    public void initialize(Bootstrap<TaskConfiguration> bootstrap) {
        bootstrap.setName("taskYaml");
    }

    @Override
    public void run(TaskConfiguration configuration, Environment environment) throws Exception {
        environment.addResource(new TaskListResource());
        environment.addResource(new TaskAddResource());
        environment.addResource(new TaskDeleteResource());
    }

    public static void main(String[] args) throws Exception {
                new TaskService().run(args);
    }
}
