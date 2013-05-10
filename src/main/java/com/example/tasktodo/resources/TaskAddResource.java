package com.example.tasktodo.resources;

import com.example.tasktodo.core.Task;
import com.example.tasktodo.core.TaskBean;
import com.example.tasktodo.dao.DaoHelper;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.sql.SQLException;

/**
 * Created with IntelliJ IDEA.
 * User: Eugen
 * Date: 08.05.13
 * Time: 0:29
 */
@Path("task/{task}/{priority}")
public class TaskAddResource {

    private DaoHelper daoHelper;

    public TaskAddResource() throws SQLException {
        daoHelper = new DaoHelper();
    }

    @POST
    @Produces(MediaType.APPLICATION_JSON)
    public TaskBean newTask(@PathParam("task") String title,
                            @PathParam("priority") int priority) throws SQLException {
        Task task = new Task(title, priority);
        daoHelper.addTask(task);
        return new TaskBean(task.getId(), task.getTask(), task.getPriority());
    }


}
