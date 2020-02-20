package com.assignment.JJYJCensusApp.DAL;

import com.assignment.JJYJCensusApp.beans.Geographicarea;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class GeoareaDB {
    public static List<Geographicarea> selectProductsByName(String name) {

        System.out.println("In ProductDB: selectProductsByName() ");

        // load the db driver (not singleton pattern: for demo only)
        try {
            // Class.forName("com.mysql.jdbc.Driver");
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            System.err.println(e);
            return null;
        }

        // set the db connection parameter values (hard-coded for demo only)
        String dbURL = "jdbc:mysql://localhost:3306/hplus";
        String username = "root";
        String password = "";

        // construct the query
        String query = "SELECT * FROM product WHERE name LIKE '%" + name + "%' ";
        System.out.println(query);

        Connection connection = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        try {
            connection = DriverManager.getConnection(
                    dbURL, username, password);

            ps = connection.prepareStatement(query);
            rs = ps.executeQuery();
            ArrayList<Geographicarea> products = new ArrayList<>();
            while (rs.next()) {
                Geographicarea p = new Geographicarea();
                p.setAreaname(rs.getString("name"));
                p.setGeoareaid(rs.getString("image_path"));
                products.add(p);
            }
            rs.close();
            connection.close();
            return products;
        } catch (SQLException e) {
            System.err.println(e);
            return null;
        }
    }
}