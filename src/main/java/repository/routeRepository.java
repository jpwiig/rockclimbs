package repository;

import org.springframework.boot.autoconfigure.batch.BatchProperties;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class routeRepository {
   private JdbcTemplate db;
    public String searchForRoute(String search){
        String sql ="";

    }
}
