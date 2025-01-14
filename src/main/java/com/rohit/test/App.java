package com.rohit.test;
import java.sql.*;
import java.util.List;

//-----------------------------------------------------> Presentation Layer <---------------------------------------------------------
public class App
{
    public static void main( String[] args ) throws ClassNotFoundException, SQLException {

        //creating object of the Truck Service
        TruckServices truckServices = new TruckServices();

        //Inserting data into Truck class using class Truck().
        Truck tata = new Truck(1,"TATA","2015-MODEL",2000,"Rajesh-Bhaii");
        Truck volvo = new Truck(2,"VOLVO","2010-MODEL",4000,"Sukhi-Bhaii");
        Truck layland = new Truck(3,"LAYLAND","2011-MODEL",1000,"Robin-Bhaii");
        Truck hundai = new Truck(4,"HUNDAI","2015-MODEL",3000,"Harpreet-Bhaii");
        Truck mahindra = new Truck(5,"MAHINDRA","2019-MODEL",1000,"Shera-Bhaii");
        Truck Elchair = new Truck(6,"Elchair","2016-MODEL",1000,"Jaggu-Bhaii");

        System.out.println("Adding data......");
        //Adding data into the Database
        truckServices.addTruck(tata);
        truckServices.addTruck(volvo);
        truckServices.addTruck(layland);
        truckServices.addTruck(hundai);
        truckServices.addTruck(mahindra);
        truckServices.addTruck(Elchair);

        System.out.println("Fetching  data......");
        //fetching the Data
        Truck truck = truckServices.getTruckById(1);
        System.out.println("Truck at id 1 "+truck);

        System.out.println("updating data......");
        //updating truck driver by index
        Truck upTruck = truckServices.getTruckById(3);
        upTruck.setDriver_name("Michel"); // Robin-bhaii ---> Michel
        truckServices.UpdateTruck(upTruck);
        System.out.println("Updated truck data : "+truckServices.getTruckById(3));

        //get all trucks
        System.out.println("get all trucks data......");
        List<Truck> allTrucks = truckServices.getAllTruck();
        System.out.println("all trucks in DataBase : ");
        for(Truck truck1 : allTrucks){    // printing using the For each Loop
            System.out.println(truck1);
        }

        // Delete the Truck
        System.out.println("Delete the Truck......");
        truckServices.DeleteTruck(6);
        System.out.println("Data Deleted at Id : "+6);

        allTrucks=truckServices.getAllTruck();
        System.out.println("all trucks After performing all Operations : ");
        System.out.println(allTrucks);

    }
}
