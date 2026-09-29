package ma.youcode.clinic.DAO;

import java.sql.Connection;
import java.sql.Statement;

public class DataInit {
    public static void init(){
        try(Connection conn = DBconnection.GetConnection();
         Statement stmt = conn.createStatement())
         {
            stmt.execute("CREATE TABLE IF NOT EXISTS users ("
                    + "id INT AUTO_INCREMENT PRIMARY KEY, "
                    + "name VARCHAR(100), "
                    + "email VARCHAR(100), "
                    + "password VARCHAR(255), "
                    + "role VARCHAR(20))");

            stmt.execute("CREATE TABLE IF NOT EXISTS patients ("
                    + "id INT AUTO_INCREMENT PRIMARY KEY, "
                    + "name VARCHAR(100), "
                    + "number VARCHAR(20))");

            stmt.execute("CREATE TABLE IF NOT EXISTS consultations ("
                    + "id INT AUTO_INCREMENT PRIMARY KEY, "
                    + "patient_id INT, "
                    + "doctor_id INT, "
                    + "date DATETIME, "
                    + "status VARCHAR(20), "
                    + "FOREIGN KEY (patient_id) REFERENCES patients(id), "
                    + "FOREIGN KEY (doctor_id) REFERENCES users(id))");

            System.out.println("Database ready.");

        }
        catch(Exception e){
            System.out.println("Creation Error : " + e.getMessage());
        }
    }
    
}
