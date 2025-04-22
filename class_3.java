// FOR LOOP
// class class_3{
//     public static void main(String args[]){
//         for (int i=0; i<5; i++){
//             System.out.println("Hello World!");
//         }
//     }
// }

// class class_3{
//     public static void main(String args[]){
//         for (int i=0; i<11; i++){
//             System.out.println(i);
//         }
//     }
// }

// WHILE LOOP
// class class_3{
//     public static void main(String args[]){
//         int i=0;
//         while (i<11){
//             System.out.println(i);
//             i++;
//         }
//     }
// }

// DO WHILE LOOP
// class class_3{
//     public static void main(String args[]){
//         int i=0;
//         do {
//             System.out.println(i);
//             i++;
//         } while ( i<11 );
//     }
// }

// PRINT SUM OF N NATURAL NUMBERS
// class class_3{
//     public static void main(String args[]){
//         int n=10;
//         int sum=0;
//         for ( int i=1; i<=n; i++){
//             sum+=i;
//         }
//         System.out.print("Sum of first " + n + " natural numbers is: " + sum);
//     }
// }

// PRINT THE TABLE OF A NUMBER
// import java.util.*;
// class class_3{
//     public static void main(String args[]){
//         Scanner sc= new Scanner(System.in);
//         System.out.print("Enter a number: ");
//         int n= sc.nextInt();
//         for (int i=1; i<=10;i++){
//             System.out.println(n + " * " + i + " = " + n*i);
//         }
//     }
// }

// Q.1) PRINT ALL EVEN NUMBER TILL N.
// import java.util.*;
// class class_3{
//     public static void main(String args[]){
//         Scanner sc= new Scanner(System.in);
//         System.out.print("Enter a number : ");
//         int n= sc.nextInt();
//         for(int i=1; i<=n; i++){
//             if(i%2==0){
//                 System.out.println(i);
//             }
//         }
//     }
// }

// Q.2) ANALYSE THE CODE // INFINITE LOOP 
// class class_3{
//     public static void main(String args[]){
//         for(;;){
//             System.out.println("Hello World!");
//         }
//     }
// }

// Q.3)
// import java.util.*;
// class class_3{
//     public static void main (String args[]){
//         Scanner sc= new Scanner(System.in);
//         int input;
//         do {
//             System.out.print("Enter a marks : ");
//             int marks= sc.nextInt();
//             if (marks >= 90 && marks <= 100){
//                 System.out.println("This is Good !");
//             }
//             else if(marks <= 89 && marks >= 60){
//                 System.out.println("This is also Good !");
//             }
//             else if(marks <= 59 && marks >= 0){
//                 System.out.println("This is Good as well !");
//             }
//             else{
//                 System.out.println("INVALID !");
//             }
//             System.out.print("Do you want to continue (1/0) ? ");
//             input= sc.nextInt();
//         }while(input==1);
//     }
// }   

// Print if a number n is prime or not (Input n from the user). 
// import java.util.*;
// class class_3{
//     public static void main(String args[]){
//         Scanner sc=new Scanner(System.in);
//         System.out.print("Enter a number: ");
//         int num=sc.nextInt();
//         boolean isPrime=true;
//         for(int i=2; i<=num/2; i++){
//             if(num%i == 0){
//                 isPrime=false;
//                 break;
//             }
//         }
//         if(isPrime){
//             if(num==1){
//                 System.out.println(num + " is neither prime not composite.");
//             }else{
//             System.out.println(num + " is a prime number.");
//             }
//         }else{
//             System.out.println(num + " is not a prime number.");
//         }
//     }
// }