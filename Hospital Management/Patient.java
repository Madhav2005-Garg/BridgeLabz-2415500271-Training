public class Patient{
    private String patientid;
    private String name;
    private int age;
    private String contactNumber;
    public Patient(String patientid,String name, int age,String contactNumber){
        this.patientid=patientid;
        this.name=name;
        this.age=age;
        this.contactNumber=contactNumber;
    }
    public int getage(){
        return age;
    }
    public String getname(){
        return name;
    }
    public String getpatientid(){
        return patientid;
    }
    public String getcontactnumber(){
        return contactNumber;
    }
    @Override
    public String toString(){
        return "Patient ID : "+getpatientid()+"\nPatient Name : "+getname()+"\nPatient Age : "+getage()+"\nStudent Contact number : "+getcontactnumber()+"\n";
    }
}