// printName function
// import java.util.*;
// class class_5{
//     public static void printName(String name){
//         System.out.println("hello "+name+"!");
//         return;
//     }
//     public static void main(String args[]){
//         Scanner sc=new Scanner(System.in);
//         String name= sc.nextLine();
//         printName(name);
//     }
// }

// ADD TWO NUMBER AND RETURN SUM
// class class_5{
//     public static int sum(int num1,int num2){
//         return num1+num2;
//     }
//     public static int mul(int num1,int num2){
//         return num1*num2;
//     }
//     public static void main(String args[]){
//         int num1=10;
//         int num2=32;
//         System.out.println(sum(num1,num2));
//         System.out.println(mul(num1,num2));
//     }
// }

// FCTORIAL FUNCTION
// import java.util.*;
// class class_5{
//     public static void factorial(int num){
//         if(num<=0){
//             System.out.print("invalid input");
//             return;
//         }
//         int factorial=1;
//         for(int i=num;i>=1;i--){
//             factorial*=i;
//         }
//         System.out.print(factorial);
//         return;
//     }
//     public static void main(String args[]){
//         Scanner sc=new Scanner(System.in);
//         int num=sc.nextInt();
//         factorial(num);
//     }
// }

// FUNCTION IS PRIME OR NOT
// import java.util.*;
// class class_5{
//     public static boolean prime(int num){
//         if(num<=1){
//             return false;
//         }
//         for(int i=2; i<num/2; i++){
//             if(num%i==0){
//                 return false;
//             }
//         }
//         return true;
//     }
//     public static void main(String args[]){
//         Scanner sc=new Scanner(System.in);
//         int num= sc.nextInt();
//         if (prime(num)) {
//             System.out.println(num + " is a prime number.");
//         } else {
//             System.out.println(num + " is not a prime number.");
//         }
//     }
// }

// Q.1) Gratest Common Divisor
// class class_5 {
//     public static int findGCD(int a, int b) {
//         while (b != 0) {
//             int temp = b;
//             b = a % b;
//             a = temp;
//         }
//         return a;
//     }
//     public static void main(String[] args) {
//         int num1 = 56;
//         int num2 = 98;
//         int gcd = findGCD(num1, num2);
//         System.out.println("GCD of " + num1 + " and " + num2 + " is: " + gcd);
//     }
// }

// Q.2) Fibonacci series 
// import java.util.*;
// class class_5{
//     public static void fibonacci(int num){
//         int first=0;
//         int second=1;
//         for (int i=1;i <= num;i++){
//             System.out.print(first+" ");
//             int next=first+second;
//             first=second;
//             second=next;
//         }
//     } 
//     public static void main(String args[]){
//         Scanner sc=new Scanner(System.in);
//         int num=sc.nextInt();
//         fibonacci(num);
//     }
// }