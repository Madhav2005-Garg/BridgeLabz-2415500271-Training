public class Doctor{
    private String name;
    private String specialisation;
    private String doctorid;
    public Doctor(String name,String specialisation,String doctorid) {
        this.name=name;
        this.specialisation=specialisation;
        this.doctorid=doctorid;
    }   
    public String getname(){
        return name;
    }
    public String getspecialisation(){
        return specialisation;
    }
    public String getdoctorid(){
        return doctorid;
    }
    @Override
    public String toString(){
        return "Doctor ID : "+getdoctorid()+"\nDoctor Name : "+getname()+"\nDoctor Specialization : "+getspecialisation()+"\n";
    }
}
