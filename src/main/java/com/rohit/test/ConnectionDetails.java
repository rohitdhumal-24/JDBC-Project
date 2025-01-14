package com.rohit.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

//-----------------------------------------------------> Database connection/ persistance  layer <---------------------------------------------------------
//Establish secure Connection.
public class ConnectionDetails {
//    public static final String LOAD_DRIVER="com.mysql.cj.jdbc.Driver";

    public static final String URL="jdbc:mysql://localhost:3306/truckmgt";

    public static final String PASSWORD="*******";

    public static final String USERNAME="********";

    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(URL,USERNAME,PASSWORD);
    }
}
