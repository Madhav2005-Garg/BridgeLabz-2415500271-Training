import java.util.Scanner;
// public class func {
//     public static float avg(int a,int b,int c){
//         float x=(float)(a+b+c)/3;
//         return x;
//     }
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         System.out.print("Enter the First Number:");
//         int a=sc.nextInt();
//         System.out.print("Enter the Second Number:");
//         int b=sc.nextInt();
//         System.out.print("Enter the Third Number:");
//         int c=sc.nextInt();
//         System.out.println(avg(a,b,c));
//     }
// }

// public class func{
//     public static int sum_odd(int n){
//         int s=0;
//         for(int i=1;i<=n;i++){
//             if(i%2!=0){
//                 s=s+i;
//             }
//         }
//         return s;
//     }
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         System.out.print("Enter any Number:");
//         int n=sc.nextInt();
//         System.out.println(sum_odd(n));
//     }
// }

// public class func{
//     public static int greater_two(int a,int b){
//         return a>b?a:b;
//     }
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         System.out.print("Enter first number");
//         int a=sc.nextInt();
//         System.out.print("Enter second number");
//         int b=sc.nextInt();
//         System.out.println(greater_two(a, b));
//     }
// }

// public class func{
//     public static float circum_circle(float r){
//         float cir= (float)(2*3.14*r);
//         return cir;
//     }
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         System.out.print("Enter the Radius of the Circle:");
//         float r=sc.nextFloat();
//         System.out.println(circum_circle(r));
//     }
// }

// public class func{
//     public static void eligible_vote(int age){
//         System.out.println(age>=18?"Eligible to Vote":"Not Eligible to Vote");
//     }
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         System.out.print("Enter the Age");
//         int age=sc.nextInt();
//         eligible_vote(age);
//     }
// }

// public class func{
//     public static void cnt_po_ne_ze(){
//         Scanner sc=new Scanner(System.in);
//         int p=0;
//         int n=0;
//         int z=0;
//         while(true){
//             System.out.print("Enter any Number");
//             int num=sc.nextInt();
//             if(num>0){
//                 p++;
//             }else if(num<0){
//                 n++;
//             }else{
//                 z++;
//             }
//             System.out.println("Want to check any other number (y/n)");
//             char c=sc.next().charAt(0);
//             if(c!='y' && c!='Y'){
//                 break;
//             }
//         }
//         System.out.println("Number of positive numbers is "+p);
//         System.out.println("Number of negative numbers is "+n);
//         System.out.println("Number of zeroes is "+z);
//     }
//     public static void main(String[] args) {
//         cnt_po_ne_ze();
//     }
// }

// public class func{
//     public static int exponent(int b,int p){
//         int num=1;
//         for(int i=1;i<=p;i++){
//             num=num*b;
//         }
//         return num;
//     }
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         System.out.print("Enter the Base:");
//         int b=sc.nextInt();
//         System.out.print("Enter the Power:");
//         int p=sc.nextInt();
//         System.out.println(exponent(b, p));
//     }
// }

// public class func{
//     public static int hcf(int a,int b){
//         int hcf=0;
//         for(int i=1;i<=a;i++){
//             if(a%i==0 && b%i==0){
//                 hcf=i;
//             }
//         }
//         return hcf;
//     }
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         System.out.print("Enter the First Number:");
//         int a=sc.nextInt();
//         System.out.print("Enter the First Number:");
//         int b=sc.nextInt();
//         System.out.println(hcf(a, b));
//     }
// }

public class func{
    public static void fibo(int n){
        int a=0;
        int b=1;
        int c=0;
        for(int i=0;i<n;i++){
            if(i<2){
                System.out.print(c+" ");
                c++;
            }else{
                c=a+b;
                a=b;
                b=c;
                System.out.print(c+" ");
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter any Number:");
        int n=sc.nextInt();
        fibo(n);
    }
}