package ma.youcode.clinic.Models;

import java.time.LocalDate;

public class Patient {

    private String Name;
    private LocalDate birthDate;
    private String number;

    
    public Patient(String name, LocalDate birthDate, String number) {
        Name = name;
        this.birthDate = birthDate;
        this.number = number;
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


    public String getNumber() {
        return number;
    }


    public void setNumber(String number) {
        this.number = number;
    }    
}
