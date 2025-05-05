// simple array
// class array{
//     public static void main(String args[]){
//         int[] arr=new int[3];
//         arr[0]=10;
//         arr[1]=20;
//         arr[2]=30;
//         for(int i=0; i<arr.length;i++){
//             System.out.println(arr[i]);
//         }
//     }
// }

// find x number in array
// import java.util.*;
// class array{
//     public static void main(String args[]){
//         Scanner sc=new Scanner(System.in);
//         int size=sc.nextInt();
//         int number[]=new int[size];
//         for(int i=0;i<number.length;i++){
//             number[i]=sc.nextInt();
//         }
//         int x=10;
//         for(int i=0;i<number.length;i++){
//             if(number[i]==x){
//                 System.out.print("x found at index"+i);
//             }
//         }
//     }
// }

//Find the maximum & minimum number in an array of integers. 

// import java.util.*;
// public class array{
//     public static void main(String args[]){
//         Scanner sc=new Scanner(System.in);
//         int size=sc.nextInt();
//         int number[]=new int[size];

//         for(int i=0;i<number.length;i++){
//             number[i]=sc.nextInt();
//         }

//         int max=number[0];
//         int min=number[0];

//         for(int i=0;i<number.length;i++){
//             if(number[i]>max){
//                 max=number[i];
//             }
//             if(number[i]<min){
//                 min=number[i];
//             }
//         }
        
//         System.out.println("Maximum number is "+max);
//         System.out.println("Minimum number is "+min);
//     }
// }