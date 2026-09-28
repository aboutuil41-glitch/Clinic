package ma.youcode.clinic.Models;

import java.time.LocalDate;

public class Patient {

    private String Name;
    private LocalDate birthDate;
    private String SSNumber;

    
    public Patient(String name, LocalDate birthDate, String sSNumber) {
        Name = name;
        this.birthDate = birthDate;
        SSNumber = sSNumber;
    }


    public String getName() {
        return Name;
    }


    public void setName(String name) {
        Name = name;
    }


    public LocalDate getBirthDate() {
        return birthDate;
    }


    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }


    public String getSSNumber() {
        return SSNumber;
    }


    public void setSSNumber(String sSNumber) {
        SSNumber = sSNumber;
    }
    
    
}
