public class Reportgeneraator implements Ireportgenerator{
    private Patient patient;
    public Reportgeneraator(Patient patient){
        this.patient=patient;
    }
    @Override
    public void generatereport(){
        System.out.println(patient.toString());
    }
}

