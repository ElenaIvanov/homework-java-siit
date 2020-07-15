package com.siit.week15.service;

import com.siit.week15.domain.Order;
import com.siit.week15.domain.Product;
import com.siit.week15.repository.OrderDAOImpl;
import com.siit.week15.repository.ProductDAOImpl;

import java.math.BigDecimal;
import java.sql.SQLException;

public class Main {
    public static void main(String[] args) throws SQLException {
        ProductDAOImpl productDAO = new ProductDAOImpl();
        OrderDAOImpl orderDAO = new OrderDAOImpl();
        Order checkOrder;

        checkOrder = orderDAO.read(10101);
        checkOrder.setOrderNumber(89898);
        checkOrder.setComments("hihi");
        orderDAO.create(checkOrder);
        orderDAO.update(89898, "updated");


        Product checkProduct;
        checkProduct = productDAO.read("S18_1749");
        productDAO.update("S18_1749", new BigDecimal(999.00));
        checkProduct.setProductCode("S89_8999");
        checkProduct.setBuyPrice(new BigDecimal(998.89));
        productDAO.delete("S18_3685");
        productDAO.create(checkProduct);
    }
}

