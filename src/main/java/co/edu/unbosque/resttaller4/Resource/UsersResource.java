package co.edu.unbosque.resttaller4.Resource;

import co.edu.unbosque.resttaller4.dtos.DetectStatus;
import co.edu.unbosque.resttaller4.dtos.UserApp;
import co.edu.unbosque.resttaller4.services.UsersService;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.UriBuilder;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

@Path("/users")
public class UsersResource {
    // JDBC driver name and database URL
    static final String JDBC_DRIVER = "org.postgresql.Driver";
    static final String DB_URL = "jdbc:postgresql://localhost/Taller5";

    // Database credentials
    static final String USER = "postgres";
    static final String PASS = "1234";

    @GET
    @Path("/getlist")
    @Produces("application/json")
    public Response listUsers() {

        // Objects for handling connection
        Connection conn = null;
        List<UserApp> users=null;

        try {

            // Registering the JDBC driver
            Class.forName(JDBC_DRIVER);

            // Opening database connection
            System.out.println("Connecting to database...");
            conn = DriverManager.getConnection(DB_URL, USER, PASS);

            UsersService usersService = new UsersService(conn);
            users=usersService.listUsers();

            // Closing database connection
            conn.close();
        } catch (SQLException se) {
            se.printStackTrace(); // Handling errors from database
        } catch (ClassNotFoundException e) {
            e.printStackTrace(); // Handling errors from JDBC driver
        } finally {
            // Cleaning-up environment
            try {
                if (conn != null) conn.close();
            } catch (SQLException se) {
                se.printStackTrace();
            }
        }
        return Response.ok().entity(users).build();
    }

    @POST
    @Path("/register")
    @Consumes(MediaType.APPLICATION_FORM_URLENCODED)
    @Produces(MediaType.APPLICATION_JSON)
    public Response createForm(
            @QueryParam("email") String email,
            @QueryParam("password") String password,
            @QueryParam("username") String username,
            @QueryParam("role") String role

    ) {
        Connection conn = null;
        List<UserApp> userapp = null;
        UserApp user = null;
        Response resp;

        try {
            Class.forName(JDBC_DRIVER);
            conn = DriverManager.getConnection(DB_URL, USER, PASS);

            UsersService usersService = new UsersService(conn);
            System.out.println(email);
            System.out.println(password);
            System.out.println(username);
            System.out.println(role);

            user = new UserApp(
                    email,
                    password,
                    username,
                    role
            );
            usersService.newUserApp(user);

            conn.close();
        } catch (SQLException se) {
            se.printStackTrace(); // Handling errors from database
        } catch (ClassNotFoundException e) {
            e.printStackTrace(); // Handling errors from JDBC driver
        } finally {
            // Cleaning-up environment
            try {
                if (conn != null) conn.close();
            } catch (SQLException se) {
                se.printStackTrace();
            }
        }
      return Response.created(UriBuilder.fromResource(UsersResource.class).path(username).build())
                .entity(user)
                .build();
    }
    @GET
    @Path("/{username}")
    @Produces(MediaType.APPLICATION_JSON)

    public Response getUser (@PathParam("username") String username){

        Connection conn = null;
        UserApp user = null;

        try {

            Class.forName(JDBC_DRIVER);
            conn = DriverManager.getConnection(DB_URL, USER, PASS);

            UsersService usersService = new UsersService(conn);
            user = usersService.getUser(username);

            conn.close();
        } catch (SQLException se) {
            se.printStackTrace(); // Handling errors from database
        } catch (ClassNotFoundException e) {
            e.printStackTrace(); // Handling errors from JDBC driver
        } finally {
            // Cleaning-up environment
            try {
                if (conn != null) conn.close();
            } catch (SQLException se) {
                se.printStackTrace();
            }
        }
        if (user != null) {
            return Response.ok()
                    .entity(user)
                    .build();
        } else {
            return Response.status(404).entity(new DetectStatus(404, "El usuario no existe en la base de datos")).build();
        }

    }




}