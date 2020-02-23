package com.assignment.JJYJCensusApp.DAL;

import com.assignment.JJYJCensusApp.beans.Age;
import com.assignment.JJYJCensusApp.beans.Geographicarea;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class GeoareaDB {
    public static List<Geographicarea> selectAreasByLevel(String selectLevel) {

        System.out.println("In CensusDB: selectAreasByLevel() ");

        // load the db driver (not singleton pattern: for demo only)
        try {
            // Class.forName("com.mysql.jdbc.Driver");
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            System.err.println(e);
            return null;
        }

        // set the db connection parameter values (hard-coded for demo only)
        String dbURL = "jdbc:mysql://localhost:3306/censusdb";
        String username = "root";
        String password = "";

        // construct the query
        String query = "SELECT * FROM geographicarea WHERE level like '%" + selectLevel + "%' ";
        System.out.println(query);

        Connection connection = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        try {
            connection = DriverManager.getConnection(
                    dbURL, username, password);

            ps = connection.prepareStatement(query);
            rs = ps.executeQuery();
            ArrayList<Geographicarea> areas = new ArrayList<>();
            while (rs.next()) {
                Geographicarea p = new Geographicarea();
                p.setGeographicAreaID(rs.getInt("geographicAreaID"));
                p.setCode(rs.getString("code"));
                p.setLevel(rs.getString("level"));
                p.setName(rs.getString("name"));
                p.setAltCode(rs.getString("alternativeCode"));
                areas.add(p);
            }
            rs.close();
            connection.close();
            return areas;
        } catch (SQLException e) {
            System.err.println(e);
            return null;
        }
    }

    public static List<Geographicarea> selectAreasByKeyword(String keyword) {

        System.out.println("In CensusDB: selectAreasByKeyword() ");

        // load the db driver (not singleton pattern: for demo only)
        try {
            // Class.forName("com.mysql.jdbc.Driver");
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            System.err.println(e);
            return null;
        }

        // set the db connection parameter values (hard-coded for demo only)
        String dbURL = "jdbc:mysql://localhost:3306/censusdb";
        String username = "root";
        String password = "";

        // construct the query
        String query = "SELECT * FROM geographicarea WHERE name like '%" + keyword + "%' ";
        System.out.println(query);

        Connection connection = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        try {
            connection = DriverManager.getConnection(
                    dbURL, username, password);

            ps = connection.prepareStatement(query);
            rs = ps.executeQuery();
            ArrayList<Geographicarea> areas = new ArrayList<>();
            while (rs.next()) {
                Geographicarea p = new Geographicarea();
                p.setGeographicAreaID(rs.getInt("geographicAreaID"));
                p.setCode(rs.getString("code"));
                p.setLevel(rs.getString("level"));
                p.setName(rs.getString("name"));
                p.setAltCode(rs.getString("alternativeCode"));
                areas.add(p);
            }
            rs.close();
            connection.close();
            return areas;
        } catch (SQLException e) {
            System.err.println(e);
            return null;
        }
    }

    public static List<Age> selectPopulationByAltCode(String altCode) {

        System.out.println("In CensusDB: selectPopulationByAltCode() ");

        // load the db driver (not singleton pattern: for demo only)
        try {
            // Class.forName("com.mysql.jdbc.Driver");
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            System.err.println(e);
            return null;
        }

        // set the db connection parameter values (hard-coded for demo only)
        String dbURL = "jdbc:mysql://localhost:3306/censusdb";
        String username = "root";
        String password = "";

        // construct the query
        String query = "SELECT * FROM age WHERE censusYear = 1 AND ageGroup = 1 AND geographicArea = (SELECT geographicAreaID FROM geographicarea WHERE alternativecode like '" + altCode + "')";
        System.out.println(query);

        Connection connection = null;
        PreparedStatement ps = null;
        ResultSet rs = null;

        try {
            connection = DriverManager.getConnection(
                    dbURL, username, password);
            ps = connection.prepareStatement(query);
            rs = ps.executeQuery();
            ArrayList<Age> Age = new ArrayList<>();
            while (rs.next()) {
                Age p = new Age();
                p.setAgeID(rs.getInt("ageID"));
                p.setAgeGroup(rs.getInt("ageGroup"));
                p.setCensusYear(rs.getInt("censusYear"));
                p.setGeographicArea(rs.getInt("geographicArea"));
                p.setCombined(rs.getInt("combined"));
                Age.add(p);
            }
            rs.close();
            connection.close();
            return Age;
        } catch (SQLException e) {
            System.err.println(e);
            return null;
        }
    }

    public static List<Geographicarea> selectAreaByAltCode(String altCode) {

        System.out.println("In CensusDB: selectAreaByAltCode() ");

        // load the db driver (not singleton pattern: for demo only)
        try {
            // Class.forName("com.mysql.jdbc.Driver");
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            System.err.println(e);
            return null;
        }

        // set the db connection parameter values (hard-coded for demo only)
        String dbURL = "jdbc:mysql://localhost:3306/censusdb";
        String username = "root";
        String password = "";

        // construct the query
        String query = "SELECT * FROM geographicarea WHERE alternativecode = '" + altCode + "' ";
        System.out.println(query);

        Connection connection = null;
        PreparedStatement ps = null;
        ResultSet rs = null;

        try {
            connection = DriverManager.getConnection(
                    dbURL, username, password);
            ps = connection.prepareStatement(query);
            rs = ps.executeQuery();
            ArrayList<Geographicarea> Geographicarea = new ArrayList<>();
            while (rs.next()) {
                Geographicarea p = new Geographicarea();
                p.setGeographicAreaID(rs.getInt("geographicAreaID"));
                p.setCode(rs.getString("code"));
                p.setLevel(rs.getString("level"));
                p.setName(rs.getString("name"));
                p.setAltCode(rs.getString("alternativeCode"));
                Geographicarea.add(p);
            }
            rs.close();
            connection.close();
            return Geographicarea;
        } catch (SQLException e) {
            System.err.println(e);
            return null;
        }
    }
}