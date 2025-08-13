import java.util.Scanner;
public class array {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the Length of the Array:");
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.print("Enter the Number to find in the array:");
        int num=sc.nextInt();
        int i=0;
        for(i=0;i<n;i++){
            if(num==arr[i]){
                System.out.println(i);
                break;
            }
        }
        if(i==n){
            System.out.println("Element not found in the array");
        }
    }
}
