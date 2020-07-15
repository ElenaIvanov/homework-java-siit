package com.siit.week15.service;


import com.siit.week15.domain.Product;
import com.siit.week15.repository.ProductDAO;
import lombok.AllArgsConstructor;

import java.math.BigDecimal;
import java.sql.SQLException;

@AllArgsConstructor
public class ProductService {
    private final ProductDAO productDAO;


    public void update(String id, BigDecimal newPrice) throws SQLException {
        productDAO.update("S10_4698", new BigDecimal(500.99));
    }

    public void delete(String id) throws SQLException {
        productDAO.delete("S12_1099");
    }

    public void create(Product id) throws SQLException {
        productDAO.create(new Product());
    }

    public Product read(String id) throws SQLException {
        return productDAO.read("S12_3990");
    }
}
