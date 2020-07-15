package com.siit.week15.repository;

import com.siit.week15.domain.Product;

import java.math.BigDecimal;
import java.sql.SQLException;

public interface ProductDAO {
    void update(String id, BigDecimal newPrice) throws SQLException;

    void delete(String id) throws SQLException;

    void create(Product id) throws SQLException;

    Product read(String id) throws SQLException;
}
