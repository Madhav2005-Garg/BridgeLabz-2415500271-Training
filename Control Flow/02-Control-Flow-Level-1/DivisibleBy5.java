import java.util.*;
public class DivisibleBy5{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any Number:");
        int a = sc.nextInt();
        if(a%5==0){
            System.out.println("Number is Divisible by 5");
        }else{
            System.out.println("Number not divisible by 5");
        }
    }
}