package com.colib;

import java.sql.*;

/**
 * Created by Vladimir on 17.04.2015.
 */
public class Main {

    public static void main(String[] args) {


        DBWorker dbWorker = new DBWorker();


        String query = "select * from users";
        try {
            Statement statement = dbWorker.getConnection().createStatement();

            String insert = "insert into users values(?,?,?)";
            String get = "SELECT * FROM users";

            PreparedStatement preparedStatement = dbWorker.getConnection().prepareStatement(get);

            ResultSet resultSet1 = preparedStatement.executeQuery();

            while (resultSet1.next()){
                
            }
        } catch (SQLException e) {

        }
    }
}
