import java.util.Date;
public class Appointment {
    private String appointmentid;
    private Date appointmentdate;
    private Doctor doctor;
    private Patient patient;
    public Appointment(String appointmentid, Date appointmentdate,Patient patient,Doctor doctor){
        this.appointmentdate=appointmentdate;
        this.appointmentid=appointmentid;
        this.doctor=doctor;
        this.patient=patient;
    }
    public String getappointmentid(){
        return appointmentid;
    }
    public Date getappointmentdate(){
        return appointmentdate;
    }
}
