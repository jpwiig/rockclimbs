<package repository;

import model.Route;
import model.SavedRoutes;
import org.springframework.boot.autoconfigure.batch.BatchProperties;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@Repository
public class routeRepository {
   private JdbcTemplate db;
    public List<Route> searchForRoute(String search, HttpServletResponse response) throws IOException {
        String sql ="SELECT * FROM countries where country = ?"; //Fix the damn server connection
        try{
            return db.query(sql, new BeanPropertyRowMapper<>(Route.class));
        } catch (Exception e){
            response.sendError(HttpServletResponse.SC_INTERNAL_SERVER_ERROR, "Error in the repository of the routes");
        }
        return null;
    }
}
