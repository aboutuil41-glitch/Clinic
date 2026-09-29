package ma.youcode.clinic.DAO;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import io.github.cdimascio.dotenv.Dotenv;

public class DBconnection {
    private static final Dotenv dotenv = Dotenv.load();
    
    private static final String URL = dotenv.get("DB_URL");
    private static final String USER = dotenv.get("DB_USER");
    private static final String PASSWORD = dotenv.get("DB_PASSWORD");

    public static Connection GetConnection() throws SQLException{
        return DriverManager.getConnection(URL, USER, PASSWORD);
    }
}
