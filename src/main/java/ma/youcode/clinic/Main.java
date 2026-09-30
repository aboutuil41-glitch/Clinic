package ma.youcode.clinic;

import ma.youcode.clinic.DAO.ConsultationDao;
import ma.youcode.clinic.DAO.PatientDao;
import ma.youcode.clinic.Models.Consultation;
import ma.youcode.clinic.Models.Patient;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Main {

    public static void main(String[] args) {

        PatientDao patientDao = new PatientDao();

        // Patient patient = new Patient(
        //         "SuperNoob",
        //         LocalDate.of(2006, 2, 17),
        //         "0713399651"
        // );

        // patientDao.save(patient);

        // patientDao.findById(2).ifPresent(patient -> {
        //     System.out.println(patient.getId());
        //     System.out.println(patient.getName());
        //     System.out.println(patient.getBirthDate());
        //     System.out.println(patient.getNumber());
        // });


        ConsultationDao consultationDao = new ConsultationDao();

        patientDao.delete(1);

        // Consultation consultation = new Consultation(
        //         1,
        //         "Blood pressure: normal",
        //         Consultation.Status.WAITING,
        //         "Patient feels fine",
        //         LocalDateTime.now(),
        //         1,
        //         1
        // );

        // consultationDao.save(consultation);

        // System.out.println(
        //         consultationDao.findById(1)
        // );

    // consultationDao.findById(1).ifPresent(consultation -> {
    // System.out.println(consultation.getId());
    // System.out.println(consultation.getVital());
    // System.out.println(consultation.getStatue());
    // System.out.println(consultation.getObservation());
    // System.out.println(consultation.getTime());
    // System.out.println(consultation.getPatientId());
    // System.out.println(consultation.getDoctorId());
    // });


    }
}