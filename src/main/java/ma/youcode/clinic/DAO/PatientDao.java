package ma.youcode.clinic.DAO;

import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Optional;

import ma.youcode.clinic.Models.Patient;

public class PatientDao extends AbstractDao<Patient>{

    @Override 
    public void save(Patient patient){
        String prmt = "INSERT INTO `patients`(`name`, `birth_date`, `number`) VALUES ('?','?','?')";
        try(PreparedStatement stmt = getConnection().prepareStatement(prmt)){
            stmt.setString(1, patient.getName());
            stmt.setDate(2, Date.valueOf(patient.getBirthDate()));
            stmt.setString(3, patient.getNumber());
            stmt.executeUpdate();
        }catch(SQLException e){
            System.out.println("Fail");
        }
    }

        @Override 
    public Optional<Patient> findById(int id){
        String prmt = "SELECT * FROM patients WHERE id = ?";
        try (PreparedStatement stmt = getConnection().prepareStatement(prmt)){
            stmt.setInt(1, id);
            ResultSet rs = stmt.executeQuery();
            if (rs.next()) {
                return Optional.of(new Patient(rs.getInt("id"), rs.getString("name"), rs.getDate("birth_date").toLocalDate(), rs.getString("number")));
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return Optional.empty();
    }

        @Override
    public void delete(int id){
        String prmt = "DELETE FROM patients WHERE id = ?";
        try (PreparedStatement stmt = getConnection().prepareStatement(prmt)){
            stmt.setInt(1, id);
            stmt.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
    
}
