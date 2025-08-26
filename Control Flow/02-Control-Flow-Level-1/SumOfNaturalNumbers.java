import java.util.Scanner;
public class SumOfNaturalNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int s=0;
        System.out.println("Enter any Number:");
        int n = sc.nextInt();
        if(n>=0){
            for(int i=1;i<=n;i++){
                s+=i;
            }
            System.out.println("The sum of n natural numbers is :"+s);
        }else{
            System.out.println("The given number is not natural number");
        }
    }
}
