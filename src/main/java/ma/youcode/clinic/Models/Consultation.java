package ma.youcode.clinic.Models;

import java.time.LocalDateTime;

public class Consultation {
    private int id;
    
    
    private String Vital;
    private Status statue;
    private String Observation;
    private LocalDateTime Time;
    private int PatientId;
    private int DoctorId;
    
    public enum Status {
        WAITING,
        IN__PROGRESS,
        CLOSED
    }
    
    
    public Consultation(int id, String vital, Status statue, String observation, LocalDateTime time, int patientId,
        int doctorId) {
            this.id = id;
            Vital = vital;
            this.statue = statue;
            Observation = observation;
            Time = time;
            PatientId = patientId;
            DoctorId = doctorId;
        }
        
    public int getId() {
        return id;
    }


    public void setId(int id) {
        this.id = id;
    }

    public String getVital() {
        return Vital;
    }


    public void setVital(String vital) {
        Vital = vital;
    }


    public Status getStatue() {
        return statue;
    }


    public void setStatue(Status statue) {
        this.statue = statue;
    }


    public String getObservation() {
        return Observation;
    }


    public void setObservation(String observation) {
        Observation = observation;
    }


    public LocalDateTime getTime() {
        return Time;
    }


    public void setTime(LocalDateTime time) {
        Time = time;
    }


    public int getPatientId() {
        return PatientId;
    }


    public void setPatientId(int patientId) {
        PatientId = patientId;
    }


    public int getDoctorId() {
        return DoctorId;
    }


    public void setDoctorId(int doctorId) {
        DoctorId = doctorId;
    }


}
