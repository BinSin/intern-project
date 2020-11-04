package com.humuson.intern.dao;

import com.humuson.intern.model.Offer;
import com.humuson.intern.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import javax.sql.DataSource;
import java.util.List;

@Component("serviceDAO")
public class UserDAO {

    private JdbcTemplate jdbcTemplate;

    @Autowired
    public void setDataSource(DataSource dataSource) {
        jdbcTemplate = new JdbcTemplate(dataSource);
    }

    public int getRowCount() {
        String sqlStatement = "select count(*) from users";
        return jdbcTemplate.queryForObject(sqlStatement, Integer.class);
    }
/*

    public List<Offer> getUsers() {
        String sqlStatement = "select * from users";

        return jdbcTemplate.query(sqlStatement,
                (rs, rowNum) -> {
                    User user = new User();
                    user.setName(rs.getInt("id"));
                    user.setName(rs.getString("name"));
                    user.setEmail(rs.getString("email"));
                    user.setText(rs.getString("text"));
                    return offer;
                });
    }
*/

}
