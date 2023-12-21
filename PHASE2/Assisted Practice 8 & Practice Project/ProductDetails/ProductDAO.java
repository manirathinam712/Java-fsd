package com.example.DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.example.model.Product;

public class ProductDAO {
	 private static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
	    private static final String DB_URL = "jdbc:mysql://localhost:3306/mydatabase33";
	    private static final String USER = "root";
	    private static final String PASS = "donthu@192";

	    public Product getProductById(int productId) {
	        Connection conn = null;
	        PreparedStatement stmt = null;
	        ResultSet rs = null;
	        Product product = null;

	        try {
	            Class.forName(JDBC_DRIVER);
	            conn = DriverManager.getConnection(DB_URL, USER, PASS);
	            String sql = "SELECT id, name, price FROM product WHERE id = ?";
	            stmt = conn.prepareStatement(sql);
	            stmt.setInt(1, productId);
	            rs = stmt.executeQuery();

	            if (rs.next()) {
	                product = new Product();
	                product.setId(rs.getInt("id"));
	                product.setName(rs.getString("name"));
	                product.setPrice(rs.getDouble("price"));
	            }
	        } catch (ClassNotFoundException | SQLException e) {
	            e.printStackTrace();
	        } finally {
	            try {
	                if (rs != null) rs.close();
	                if (stmt != null) stmt.close();
	                if (conn != null) conn.close();
	            } catch (SQLException e) {
	                e.printStackTrace();
	            }
	        }

	        return product;
	    }

}
