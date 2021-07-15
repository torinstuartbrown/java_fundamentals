package mysql.labs;


/*
 *  MySQL Exercise 4:
 *
 *   Now that you have mastered your air travel database, it's time to connect this DB to a Java application
 *   using JDBC. You can start simple here and build your way up. Within a Java application, using JDBC, please
 *   demonstrate how to:
 *
 *   Note: CRUD means (Create, Read, Update, Delete)
 *
 *       1.) CRUD new flights
 *       2.) CRUD new passengers
 *       3.) Bonus: flex those JDBC muscles! How nice, clean, useful can you make this? Show us what you've got!
 *
 */

import javax.xml.transform.Result;
import java.sql.Connection;
import java.sql.*;

public class Exercise_04 {

    public static void main(String[] args) {
        Connection connection = null;
        Statement statement = null;
        ResultSet resultSet = null;

        try {
            // This will load the MySQL driver, each DB has its own driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            String connectionString = "jdbc:mysql://localhost/airtravel?"
                    + "user=root&password=Sql@96768&&useSSL=false&allowPublicKeyRetrieval=true";

            // Setup the connection with the DB
            connection = DriverManager
                    .getConnection(connectionString);


//          passenger insert
//            statement = connection.createStatement();
//            statement.executeUpdate("INSERT INTO airtravel.passengers (passenger_id, name, email, " +
//                    "country_of_origin, meal_prefrences) VALUES (9, 'Kyle Buffet', 'kbb@gmail.com', 'FRN', 'chicken')");

//            passenger update
//            statement = connection.createStatement();
//            statement.executeUpdate("UPDATE airtravel.passengers set email = 'kgb@gmail.com' where name = 'Kyle Buffet'");

//            passenger delete
//            statement = connection.createStatement();
//            statement.executeUpdate("DELETE from airtravel.passengers where passenger_id = 9");

            //passenger query
            statement = connection.createStatement();
            resultSet = statement.executeQuery("select * from airtravel.passengers");

            while (resultSet.next()) {

                int passenger_id = resultSet.getInt("passenger_id");
                String name = resultSet.getString("name");
                String email = resultSet.getString("email");
                String country_of_origin = resultSet.getString("country_of_origin");
                String meal_prefrences = resultSet.getString("meal_prefrences");

                // print out the result
                System.out.println("Name: " + name + " Email: " + email + " Country of Origin: " + country_of_origin);
            }

            //          flight insert
//            statement = connection.createStatement();
//            statement.executeUpdate("INSERT INTO airtravel.flights (flight_id, duration, departure_time, " +
//                    "arrival_time, departure_id, arrival_id, plane_id) VALUES (8, 50, '2021-01-01 13:00:00', '2021-01-01 13:50:00', 2, 5, 2)");

//            passenger update
//            statement = connection.createStatement();
//            statement.executeUpdate("UPDATE airtravel.flights set duration = 30 where flight_id = 8");
//            statement.executeUpdate("UPDATE airtravel.flights set arrival_time = '2021-01-01 13:30:00' where flight_id = 8");

//            passenger delete
            statement = connection.createStatement();
            statement.executeUpdate("DELETE from airtravel.flights where flight_id = 8");

            //flight query
            statement = connection.createStatement();
            resultSet = statement.executeQuery("select * from airtravel.flights");

            while (resultSet.next()) {

                // get the id, name and units fields from the result set and assign them to local variables
                int flight_id = resultSet.getInt("flight_id");
                int duration = resultSet.getInt("duration");
                String departure_time = resultSet.getString("departure_time");
                String arrival_time = resultSet.getString("arrival_time");
                int departure_id = resultSet.getInt("departure_id");
                int arrival_id = resultSet.getInt("arrival_id");
                int plane_id = resultSet.getInt("plane_id");


                // print out the result
                System.out.println("Flight" + flight_id + " departed at: " + departure_time + " and will arrive at: " + arrival_time + " " + duration + " minutes later.");
            }


        } catch (SQLException exc) {
            System.out.println("Exception occurred");
            exc.printStackTrace();
        } catch (ClassNotFoundException e) {
            System.out.println("Exception occured - driver not found on classpath");
            e.printStackTrace();
        } finally {
            try {
                // close all JDBC elements
                if (statement != null) statement.close();
                if (resultSet != null) resultSet.close();
                if (connection != null) connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }


        /*
        Just as a casual example - each of these operations should be in it's own method. Feel free to
        create all required classes/methods to accomplish this.

        createFlight(...);
        queryFlight(...);
        updateFlight(...);
        deleteFlight(...);

        createPassenger(...);
        queryPassenger(...);
        updatePassenger(...);
        deletePassenger(...);

        ...


         */
    }

}
