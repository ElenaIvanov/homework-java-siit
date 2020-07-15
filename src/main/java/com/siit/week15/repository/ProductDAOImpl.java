package com.siit.week15.repository;

import com.siit.week15.connexion.DatabaseConnexion;
import com.siit.week15.domain.Product;

import java.math.BigDecimal;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ProductDAOImpl implements ProductDAO {
    @Override
    public void update(String id, BigDecimal newPrice) throws SQLException {
        String query = "UPDATE products SET buyPrice=? WHERE productCode=?";
        PreparedStatement preparedStatement = DatabaseConnexion.getPreparedStatement(query);

        preparedStatement.setString(1, String.valueOf(newPrice));
        preparedStatement.setString(2, "" + id);

        if (preparedStatement.executeUpdate() > 0) {
            System.out.println("Product with ID no. " + id + " has changed his price to: " + newPrice + ".");
        }
    }

    @Override
    public void delete(String id) throws SQLException {
        String query = "DELETE FROM products WHERE productCode='" + id + "'";
        PreparedStatement preparedStatement = DatabaseConnexion.getPreparedStatement(query);


        if (preparedStatement.executeUpdate() > 0) {
            System.out.println("The row selected was successfully deleted.");
        }

    }

    @Override
    public void create(Product id) throws SQLException {
        String query = "INSERT INTO products VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?)";
        PreparedStatement stm = DatabaseConnexion.getPreparedStatement(query);

        stm.setString(1, id.getProductCode());
        stm.setString(2, id.getProductName());
        stm.setString(3, id.getProductLine());
        stm.setString(4, id.getProductScale());
        stm.setString(5, id.getProductVendor());
        stm.setString(6, id.getProductDescription());
        stm.setShort(7, id.getQuantityInStock());
        stm.setBigDecimal(8, id.getBuyPrice());
        stm.setBigDecimal(9, id.getMSRP());

        if (stm.executeUpdate() > 0) {
            System.out.println("Product with code no. " + id.getProductCode() + " was successfully added to database.");
        }
    }

    @Override
    public Product read(String id) throws SQLException {
        Product product;
        String query = "Select *  from products where productCode='" + id + "'";
        PreparedStatement preparedStatement = DatabaseConnexion.getPreparedStatement(query);
        ResultSet executeQuery = preparedStatement.executeQuery();

        if (executeQuery.next()) {

            product = new Product(executeQuery.getString("productCode"),
                    executeQuery.getString("productName"),
                    executeQuery.getString("productLine"),
                    executeQuery.getString("productScale"),
                    executeQuery.getString("productVendor"),
                    executeQuery.getString("productDescription"),
                    executeQuery.getShort("quantityInStock"),
                    executeQuery.getBigDecimal("buyPrice"),
                    executeQuery.getBigDecimal("MSRP"));

            System.out.println("Product with code no. " + product.getProductCode() + " has the following price: " + product.getBuyPrice());

            return product;
        }
        return null;
    }
}
