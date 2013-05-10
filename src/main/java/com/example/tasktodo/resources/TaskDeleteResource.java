package com.example.tasktodo.resources;

import com.example.tasktodo.dao.DaoHelper;

import javax.ws.rs.DELETE;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.sql.SQLException;

/**
 * Created with IntelliJ IDEA.
 * User: Eugen
 * Date: 08.05.13
 * Time: 8:43
 */
@Path("/task/{id}")
public class TaskDeleteResource {
    DaoHelper daoHelper;

    public TaskDeleteResource() throws SQLException {
        daoHelper = new DaoHelper();
    }

    @DELETE
    @Produces(MediaType.APPLICATION_JSON)
    public void  deleteTask(@PathParam("id") int id) throws SQLException {
        if (daoHelper.isIdExist(id)) {
            daoHelper.deleteTask(id);
        }
    }
}
