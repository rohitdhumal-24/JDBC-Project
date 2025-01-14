package com.rohit.test;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
//-----------------------------------------------------> Service layer <---------------------------------------------------------
// Application Functionality provide by app
public class TruckServices {

    // Adding the Truck
    public void addTruck(Truck truck) {
        String query = "insert into truck(id,name,model,capacity,driver_name) values(?,?,?,?,?)";//Parameter should be Same mention Database
        try {
            Connection connection = ConnectionDetails.getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setInt(1, truck.getId());
            preparedStatement.setString(2, truck.getName());
            preparedStatement.setString(3, truck.getModel());
            preparedStatement.setInt(4, truck.getCapacity());
            preparedStatement.setString(5, truck.getDriver_name());

            int RowAffected = preparedStatement.executeUpdate();
            System.out.println("Total row Affected is : " + RowAffected);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    //Getting trck by its Id
    public Truck getTruckById(int id) {
        String query = "select * from truck where id = ?";
        Truck truck = new Truck();
        try {
            Connection connection = ConnectionDetails.getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setInt(1, id);
            ResultSet resultSet = preparedStatement.executeQuery();

            if (resultSet.next()) {
                truck.setId(resultSet.getInt("id"));
                truck.setName(resultSet.getString("name"));
                truck.setModel(resultSet.getString("model"));
                truck.setCapacity(resultSet.getInt("capacity"));
                truck.setDriver_name(resultSet.getString("driver_name"));
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return truck;
    }

    //Updating the TRUCK
    public void UpdateTruck(Truck truck) throws SQLException {
        String query = "update truck set name = ?,model=?,capacity=?,driver_name=? where id = ?";
        try {
            Connection connection = ConnectionDetails.getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setString(1, truck.getName());
            preparedStatement.setString(2, truck.getModel());
            preparedStatement.setInt(3, truck.getCapacity());
            preparedStatement.setString(4, truck.getDriver_name());
            preparedStatement.setInt(5, truck.getId());

            int RowAffected = preparedStatement.executeUpdate();
            System.out.println("Total row Affected is : " + RowAffected);
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }

    //Get all truck
    public List<Truck> getAllTruck(){
        String query = "select * from truck";
        List<Truck> trucks = new ArrayList<>();
        try{
            Connection connection = ConnectionDetails.getConnection();
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(query);

            while(resultSet.next()){
                Truck truck = new Truck();
                truck.setId(resultSet.getInt("id"));
                truck.setName(resultSet.getString("name"));
                truck.setModel(resultSet.getString("model"));
                truck.setCapacity(resultSet.getInt("capacity"));
                truck.setDriver_name(resultSet.getString("driver_name"));

                //add truck in Trucks ArryList
                trucks.add(truck);
            }
        }
        catch (Exception e){
            e.printStackTrace();
        }
        return trucks;
    }

    //Delete Truck from the Database
    public void DeleteTruck(int id){
        String query = "delete from truck where id = ? ";
        try{
            Connection connection = ConnectionDetails.getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setInt(1,id);
            int RowAffected = preparedStatement.executeUpdate();
            System.out.println("Row deleted : " + RowAffected);

        }
        catch (Exception e){
            e.printStackTrace();
        }
    }


}
