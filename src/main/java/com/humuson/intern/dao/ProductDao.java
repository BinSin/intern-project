package com.humuson.intern.dao;

import com.humuson.intern.model.Offer;
import com.humuson.intern.model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import javax.sql.DataSource;
import java.util.List;

@Repository
public class ProductDao {

    private JdbcTemplate jdbcTemplate;

    @Autowired
    public void setDataSource(DataSource dataSource) {
        jdbcTemplate = new JdbcTemplate(dataSource);
    }

    public Product getProduct(int id) {
        String sqlStatement = "select * from product where id=?";

        return jdbcTemplate.queryForObject(sqlStatement, new Object[]{id},
                (rs, rowNum) -> {
                    Product product = new Product();
                    product.setId(rs.getInt("id"));
                    product.setCategory(rs.getString("category"));
                    product.setManufacturer(rs.getString("manufacturer"));
                    product.setUnitInStock(rs.getInt("unitInStock"));
                    product.setDescription(rs.getString("description"));
                    return product;
                }
        );
    }

    public List<Product> getProducts() {
        String sqlStatement = "select * from product";

        return jdbcTemplate.query(sqlStatement,
                (rs, rowNum) -> {
                    Product product = new Product();
                    product.setId(rs.getInt("id"));
                    product.setCategory(rs.getString("category"));
                    product.setManufacturer(rs.getString("manufacturer"));
                    product.setUnitInStock(rs.getInt("unitInStock"));
                    product.setDescription(rs.getString("description"));
                    return product;
                });
    }

    public boolean insert(Offer offer) {
        String name = offer.getName();
        String email = offer.getEmail();
        String text = offer.getText();
        String sqlStatement = "insert into offers (name, email, text) values (?, ?, ?)";
        return (jdbcTemplate.update(sqlStatement, new Object[]{name, email, text}) == 1);
    }

    public boolean update(Offer offer) {
        int id = offer.getId();
        String name = offer.getName();
        String email = offer.getEmail();
        String text = offer.getText();
        String sqlStatement = "update offers set name=?, email=?, text=? where id=?";
        return (jdbcTemplate.update(sqlStatement, new Object[]{name, email, text, id}) == 1);
    }

    public boolean delete(int id) {
        String sqlStatement = "delete from offers where id=?";
        return (jdbcTemplate.update(sqlStatement, new Object[]{id}) == 1);
    }

}
