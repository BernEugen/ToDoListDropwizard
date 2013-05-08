package com.example.helloworld.resources;

import com.example.helloworld.core.Task;
import com.example.helloworld.core.TaskBean;
import com.example.helloworld.dao.DaoHelper;
import com.yammer.dropwizard.jersey.params.IntParam;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

/**
 * Created with IntelliJ IDEA.
 * User: Eugen
 * Date: 08.05.13
 * Time: 0:29
 */
@Path("task/{task}/{priority}")
public class TaskAddResource {

    private DaoHelper daoHelper;
    private String dbConnect;

    public TaskAddResource() throws SQLException {
//        this.dbConnect = dbConnect;
        daoHelper = new DaoHelper();
    }

    @POST
    @Produces(MediaType.APPLICATION_JSON)
    public TaskBean newTask(@PathParam("task") String title,
                            @PathParam("priority") int priority) throws SQLException {
        Task task = new Task(title, priority);

        return new TaskBean(task.getId(), task.getTask(), task.getPriority());
    }


}
