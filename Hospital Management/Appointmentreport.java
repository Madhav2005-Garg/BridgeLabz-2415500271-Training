public class Appointmentreport implements Ireportgenerator{
    private Appointment appointment;
    private Patient patient;
    private Doctor doctor;
    public Appointmentreport(Appointment appointment,Patient patient,Doctor doctor){
        this.appointment=appointment;
        this.patient=patient;
        this.doctor=doctor;
    }
    @Override
    public  void generatereport(){
        System.out.println(patient.toString());
        System.out.println(doctor.toString());
    }
}