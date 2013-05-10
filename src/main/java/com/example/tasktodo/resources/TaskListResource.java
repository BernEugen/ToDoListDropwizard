package com.example.tasktodo.resources;

import com.example.tasktodo.core.Task;
import com.example.tasktodo.core.TaskBean;
import com.example.tasktodo.dao.DaoHelper;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: Eugen
 * Date: 01.05.13
 * Time: 22:27
 */
@Path("/task")
public class TaskListResource {

    private DaoHelper daoHelper;

    public TaskListResource() throws SQLException {
        daoHelper = new DaoHelper();
    }

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<TaskBean> getAllTasks() throws SQLException {
        List<TaskBean> taskListBean = new ArrayList<TaskBean>();
        List<Task> taskList = daoHelper.getList();

        for (Task task : taskList) {
            TaskBean taskBean = new TaskBean(task.getId(), task.getTask(), task.getPriority());
            taskListBean.add(taskBean);
        }
        return taskListBean;
    }
}
