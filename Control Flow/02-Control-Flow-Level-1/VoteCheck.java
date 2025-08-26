import java.util.*;
public class VoteCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Age:");
        int age = sc.nextInt();
        if(age>17){
            System.out.println("The person can vote");
        }else{
            System.out.println("The person cannot vote");
        }
    }
}
