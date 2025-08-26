import java.util.Scanner;
public class CheckLargestOfThree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the First Number:");
        int a = sc.nextInt();
        System.out.println("Enter the Second Number:");
        int b = sc.nextInt();
        System.out.println("Enter the Third Number:");
        int c = sc.nextInt();
        if(a>b && a>c){
            System.out.println(a+" is the largest number");
        }else if(b>a && b>c){
            System.out.println(b+" is the largest number");
        }else if(c>a && c>b){
            System.out.println(c+" is the largest number");
        }

    }
}
