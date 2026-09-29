package ma.youcode.clinic.Models;

import java.time.LocalDate;

public class Patient {

    private int id;
    private String Name;
    private LocalDate birthDate;
    private String number;

    
    public Patient(int id, String name, LocalDate birthDate, String number) {
        this.id = id;
        Name = name;
        this.birthDate = birthDate;
        this.number = number;
    }


    public int getId() {
        return id;
    }


    public void setId(int id) {
        this.id = id;
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
