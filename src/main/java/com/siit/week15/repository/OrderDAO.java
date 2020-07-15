package com.siit.week15.repository;

import com.siit.week15.domain.Order;

import java.sql.SQLException;

public interface OrderDAO {

    void update(int id, String status) throws SQLException;

    void delete(int id) throws SQLException;

    void create(Order id) throws SQLException;

    Order read(int id) throws SQLException;
}
