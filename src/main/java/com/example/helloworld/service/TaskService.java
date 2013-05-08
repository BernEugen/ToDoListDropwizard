package com.example.helloworld.service;

import com.example.helloworld.configuration.TaskConfiguration;
import com.example.helloworld.resources.TaskAddResource;
import com.example.helloworld.resources.TaskListResource;
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
        final String dbNameService = configuration.getDbName();

        environment.addResource(new TaskListResource());
        environment.addResource(new TaskAddResource());
    }

    public static void main(String[] args) throws Exception {
                new TaskService().run(args);
    }
}
