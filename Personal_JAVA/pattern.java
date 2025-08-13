import java.util.Scanner;

//         int a = sc.nextInt();
//         System.out.print("Enter width of rectangle: ");
//         int b = sc.nextInt();
//         for(int count = 1; count < 1+b; count++){
//             if((count == 1) || (count == b)){
//                 for(int count1 = 1; count1 < a+1; count1++){
//                     System.out.print("* ");
//                 }
//             } else {
//                 for (int count2 = 1; count2 < a+1; count2++){
//                     if (count2 == 1 || count2 == a){
//                         System.out.print("* ");
//                     } else {
//                         System.out.print("  ");
//                     }
//                 }
//             }
//             System.out.println();
//         }
//     }
// }
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter any Number:");
//         int n=sc.nextInt();
//         for(int i=n;i>0;i--){
//             for(int j=1;j<i;j++){
//                 System.out.print(" ");
//             }
//             for(int j=0;j<n-i+1;j++){
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//     }
// }
//     public static void main(String[] args) {
//         Scanner s=new Scanner(System.in);
//         System.out.print("Enter any Number:");
//         int n=s.nextInt();
//         int a=1;
//         for (int i=0;i<n;i++){
//             for(int j=0;j<i+1;j++){
//                 System.out.print(a+" ");
//                 a++;
//             }
//             System.out.println();
//         }
//     }
// }

// class first{
//     public static void main(String[] args) {
//         Scanner s=new Scanner(System.in);
//         System.out.print("Enter any Number:");
//         int n=s.nextInt();
//         int a=1;
//         for (int i=0;i<n;i++){
//             for(int j=0;j<i+1;j++){
//                 if((i%2==0 && j%2==0) || (i%2!=0 && j%2!=0)){
//                     a=1;
//                 }else{
//                     a=0;
//                 }
//                 System.out.print(a+" ");
//             }
//             System.out.println();
//         }
//     }
// }

// class first{
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         System.out.print("Enter any Number");
//         int n=sc.nextInt();
//         for (int i=0;i<n;i++){
//             for(int j=0;j<i+1;j++){
//                 System.out.print("*");
//             }
//             for(int j=0;j<2*n-2*i-2;j++){
//                 System.out.print(" ");
//             }
//             for(int j=0;j<i+1;j++){
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//         for(int i=n;i>0;i--){
//             for(int j=i;j>0;j--){
//                 System.out.print("*");
//             }
//             for(int j=0;j<2*(n-i);j++){
//                 System.out.print(" ");
//             }
//             for(int j=i;j>0;j--){
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//     }
// }

// class first{
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         System.out.print("Enter any Number:");
//         int n=sc.nextInt();
//         for(int i=0;i<n;i++){
//             for(int j=0;j<n-1-i;j++){
//                 System.out.print(" ");
//             }
//             for(int j=0;j<n;j++){
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//     }
// }

// class first{
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         System.out.print("Enter any Number:");
//         int n=sc.nextInt();
//         for(int i=1;i<n+1;i++){
//             for(int j=i;j<n;j++){
//                 System.out.print(" ");
//             }
//             for(int j=1;j<i+1;j++){
//                 System.out.print(i+" ");
//             }
//             System.out.println();
//         }
//     }
// }
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         System.out.print("Enter any Number:");
//         int n=sc.nextInt();
//         for(int i=1;i<n+1;i++){
//             for(int j=0;j<2*n-2*i;j++){
//                 System.out.print(" ");
//             }
//             for(int j=i;j>=1;j--){
//                 System.out.print(j+" ");
//             }
//             for(int j=2;j<=i;j++){
//                 System.out.print(j+" ");
//             }
//             System.out.println();
//         }
//     }
// }

class first{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter any Number:");
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            for(int j=0;j<n-i-1;j++){
                System.out.print("  ");
            }
            for(int j=0;j<2*i+1;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        for(int i=n;i>1;i--){
            for(int j=0;j<n-i+1;j++){
                System.out.print("  ");
            }
            for(int j=0;j<2*i-3;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
