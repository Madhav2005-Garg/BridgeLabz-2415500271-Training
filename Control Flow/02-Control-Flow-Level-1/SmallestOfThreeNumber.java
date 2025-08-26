import java.util.*;
public class SmallestOfThreeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the First Number:");
        int a = sc.nextInt();
        System.out.println("Enter the Second Number:");
        int b = sc.nextInt();
        System.out.println("Enter the Third Number:");
        int c = sc.nextInt();
        if (a<b && a<c){
            System.out.println("Smallest Number among the three");
        }else{
            System.out.println("Not the Smallest among the three");
        }
    }
}
