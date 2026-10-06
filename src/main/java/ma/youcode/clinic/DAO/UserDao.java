package ma.youcode.clinic.DAO;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import java.util.Optional;

import ma.youcode.clinic.Models.User;

public interface UserDao extends DAO<User> {

    Optional<User> findByEmail(String email);
}
