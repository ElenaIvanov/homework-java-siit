package com.siit.week15.service;

import com.siit.week15.domain.Order;
import com.siit.week15.repository.OrderDAO;
import lombok.AllArgsConstructor;

import java.sql.SQLException;

@AllArgsConstructor
public class OrderService {
    private final OrderDAO orderDAO;


    public void update(int id, String status) throws SQLException {
        orderDAO.update(1, "");
    }

    public void delete(int id) throws SQLException {
        orderDAO.delete(2);
    }

    public void create(Order id) throws SQLException {
        orderDAO.create(new Order());
    }

    public Order read(int id) throws SQLException {
        return orderDAO.read(4);
    }
}


