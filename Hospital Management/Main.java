import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // System.out.println("1. For Patient");
        // System.out.println("2. For Doctor");
        // System.out.println("Choose any option:");
        // int choose=sc.nextInt();
        // if(choose==1){
        //     System.out.println("1. Patient Registration");
        //     System.out.println("2. Patient Login");
        //     System.out.println("3. Logout");
        // }
        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter Patient name:");
        // String pname=sc.nextLine();
        // sc.nextLine();
        // System.out.println("Enter Patient ID:");
        // String pid=sc.nextLine();
        // sc.nextLine();
        // System.out.println("Enter Patient Age:");
        // int page=sc.nextInt();
        // sc.nextLine();
        // System.out.println("Enter Contact Number of Patient:");
        // String pnumber=sc.nextLine();
        // sc.nextLine();
        // Patient p=new Patient(pid, pname, page, pnumber);
        Patient p1=new Patient("12345","Madhav",19,"9897468023");
        Patient p2=new Patient("12346","Venu",18,"9897444423");
        Patient p3=new Patient("12347","Rishabh",17,"9897768023");
        Patient p4=new Patient("12348","Utkarsh",19,"9891238023");
        Patient p5=new Patient("12349","Kusssy",19,"9897098023");
        Doctor d1=new Doctor("Anuradha","Neuro","12345");
        Doctor d2=new Doctor("Abhijeet","Bones","12346");
        Doctor d3=new Doctor("Anurag","Heart","12347");
        Doctor d4=new Doctor("Amrita","Kidney","12348");
        Doctor d5=new Doctor("Anukrati","Brain","12349");
        Appointment a1=new Appointment("91", null, p1, d1);
        Appointment a2=new Appointment("92", null, p2, d2);
        Appointment a3=new Appointment("93", null, p3, d3);
        Appointment a4=new Appointment("94", null, p4, d4);
        Appointment a5=new Appointment("95", null, p5, d5);
        Appointmentreport ar1=new Appointmentreport(a1,p1,d1);
        Appointmentreport ar2=new Appointmentreport(a2,p2,d2);
        Appointmentreport ar3=new Appointmentreport(a3,p3,d3);
        Appointmentreport ar4=new Appointmentreport(a4,p4,d4);
        Appointmentreport ar5=new Appointmentreport(a5,p5,d5);
        ar1.generatereport();
        ar2.generatereport();
        ar3.generatereport();
        ar4.generatereport();
        ar5.generatereport();

    }
}
