package com.example.helloworld.configuration;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.hibernate.validator.constraints.NotEmpty;
import com.yammer.dropwizard.config.Configuration;

/**
 * Created with IntelliJ IDEA.
 * User: Eugen
 * Date: 26.04.13
 * Time: 19:55
 */
public class TaskConfiguration extends Configuration {

    @NotEmpty
    @JsonProperty
    private String taskView;

    public String getTaskView() {
        return taskView;
    }
}
