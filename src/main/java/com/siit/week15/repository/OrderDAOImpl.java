package com.siit.week15.repository;

import com.siit.week15.connexion.DatabaseConnexion;
import com.siit.week15.domain.Order;

import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class OrderDAOImpl implements OrderDAO {
    @Override
    public void update(int id, String status) throws SQLException {
        String query = "UPDATE orders SET status=? WHERE orderNumber=?";
        PreparedStatement preparedStatement = DatabaseConnexion.getPreparedStatement(query);

        preparedStatement.setString(1, status);
        preparedStatement.setString(2, "" + id);

        if (preparedStatement.executeUpdate() > 0) {
            System.out.println("Status on order no. " + id + " has been changed to " + status + ".");
        }
    }

    @Override
    public void delete(int id) throws SQLException {

        String query = "DELETE FROM orders WHERE orderNumber = ?";
        PreparedStatement preparedStatement = DatabaseConnexion.getPreparedStatement(query);

        if (preparedStatement.executeUpdate() > 0) {
            System.out.println("The row corresponding to order no. selected was successfully deleted.");
        }
    }

    @Override
    public void create(Order id) throws SQLException {
        String query = "INSERT INTO orders VALUES(?, ?, ?, ?, ?, ?, ?)";
        PreparedStatement preparedStatement = DatabaseConnexion.getPreparedStatement(query);

        preparedStatement.setInt(1, id.getOrderNumber());
        Date date = Date.valueOf(id.getOrderDate());
        preparedStatement.setDate(2, date);
        date = Date.valueOf(id.getRequiredDate());
        preparedStatement.setDate(3, date);
        date = Date.valueOf(id.getShippedDate());
        preparedStatement.setDate(4, date);
        preparedStatement.setString(5, id.getStatus());
        preparedStatement.setString(6, id.getComments());
        preparedStatement.setInt(7, id.getCustomerNumber());

        if (preparedStatement.executeUpdate() > 0) {
            System.out.println("Order no. " + id.getOrderNumber() + " was successfully added.");
        }
    }

    @Override
    public Order read(int id) throws SQLException {
        Order order;

        String query = "Select *  from orders where orderNumber=" + id;
        PreparedStatement preparedStatement = DatabaseConnexion.getPreparedStatement(query);
        ResultSet executeQuery = preparedStatement.executeQuery();

        if (executeQuery.next()) { //true if the new current row is valid; false if there are no more rows
            order = new Order(executeQuery.getInt("orderNumber"),
                    executeQuery.getString("comments"),
                    executeQuery.getInt("customerNumber"),
                    executeQuery.getDate("orderDate").toLocalDate(),
                    executeQuery.getDate("requiredDate").toLocalDate(),
                    executeQuery.getDate("shippedDate").toLocalDate(),
                    executeQuery.getString("status"));

            System.out.println("Order no. r " + order.getOrderNumber() + " with attached customer no. "
                    + order.getCustomerNumber() + " has  the following status: "
                    + order.getStatus());

            return order;
        }
        return null;
    }
}
