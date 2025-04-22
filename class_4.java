// SOLID RECTENGLE PATTERN
// * * * * * *
// * * * * * *
// * * * * * *
// * * * * * *
// * * * * * *
// class class_4{
//     public static void main(String args[]){
//         int n=5;
//         int m=6;
//         for (int i=0; i<n;i++){
//             System.out.println("* ".repeat(m));
//         }
//     }
// }

// hollow rectangle pattern
// * * * * * *
// *         *
// *         *
// *         *
// * * * * * *
// class class_4{
//     public static void main(String args[]){
//         int n=5;
//         int m=6;
//         for (int i=0; i<n;i++){
//             if(i==0 || i==n-1)
//                 System.out.println("* ".repeat(m));
//             else 
//                 System.out.println("* " + "  ".repeat(m - 2) + "* ");
//         }
//     }
// }

// half pyramid pattern
// *
// * *
// * * *
// * * * *
// * * * * *
// class class_4{
//     public static void main(String args[]){
//         int n=5;
//         for (int i=0; i<n; i++){
//             System.out.println("* ".repeat(i+1));
//         }
//     }
// }

// inverted half pyramid pattern
// * * * * *
// * * * *
// * * *
// * *
// *
// class class_4{
//     public static void main(String args[]){
//         int n=5;
//         for (int i=0; i<n; i++){
//             System.out.println("* ".repeat(n-i));
//         }
//     }
// }

// inverted half pyramid pattern
// * * * * *
// * * * *
// * * *
// * *
// *
// class class_4{
//     public static void main(String args[]){
//         int n=5;
//         for (int i=n; i>0; i--){
//             System.out.println("* ".repeat(i));
//         }
//     }
// }

// half piramid pattern at another side 
//         *
//       * *
//     * * *
//   * * * *
// * * * * *
// class class_4{
//     public static void main(String args[]){
//         int n=5;
//         for (int i=0; i<n; i++){
//             System.out.print(" ".repeat(n-i-1));
//             System.out.println("* ".repeat(i+1));
//         }
//     }
// }

// half pyramid pattern with number
// 1
// 1 2  
// 1 2 3
// 1 2 3 4
// 1 2 3 4 5
// class class_4{
//     public static void main(String args[]){
//         int n=5;
//         for (int i=0; i<n; i++){
//             for (int j=1; j<=i+1; j++){
//                 System.out.print(j + " ");
//             }
//             System.out.println();
//         }
//     }
// } 

// inverted half pyramid pattern with number 
// 1 2 3 4 5
// 1 2 3 4
// 1 2 3
// 1 2
// 1
// class class_4{
//     public static void main(String args[]){
//         int n=5;
//         for (int i=n; i>0; i--){
//             for (int j=1; j<=i; j++){
//                 System.out.print(j + " ");
//             }
//             System.out.println();
//         }
//     }
// }

// half pyramid pattern with number 
// 1
// 2 3
// 4 5 6
// 7 8 9 10
// 11 12 13 14 15
// class class_4{
//     public static void main(String args[]){
//         int n=5;
//         int count=1;
//         for (int i=0; i<n; i++){
//             for (int j=0; j<=i; j++){
//                 System.out.print(count + " ");
//                 count++;
//             }
//             System.out.println();
//         }
//     }    
// }

// inverted half pyramid pattern at another side
// * * * * *
//   * * * *
//     * * *
//       * *
//         *
// class class_4{
//     public static void main(String args[]){
//         int n=5;
//         for (int i=0; i<n; i++){
//             System.out.print(" ".repeat(i));
//             System.out.println("*".repeat(n-i));
//         }
//     }
// } 

// full pyramid pattern
//     *
//    ***
//   *****
//  *******
// *********
// class class_4{
//     public static void main(String args[]){
//         int n=5;
//         for (int i=0; i<n; i++){
//             System.out.print(" ".repeat(n-i));
//             System.out.println("*".repeat(i*2+1));
//         }
//     }
// }

// inverted full pyramid pattern
// *********
//  *******
//   *****
//    ***
//     *
// class class_4{
//     public static void main(String args[]){
//         int n=5;
//         for (int i=n; i>0 ; i--){
//             System.out.print(" ".repeat(n-i));
//             System.out.println("*".repeat(i*2-1));
//         }
//     }
// }

// diamond pattern
//         *
//       * * *
//     * * * * *
//   * * * * * * *  
// * * * * * * * * *
//   * * * * * * *
//     * * * * *
//       * * *
//         *  
// class class_4{
//     public static void main(String args[]){
//         int n=5;
//         for (int i=1; i<=n; i++){
//             System.out.print(" ".repeat(n-i));
//             System.out.println("*".repeat(i*2-1) );
//         }
//         for (int i=n-1; i>0 ; i--){
//             System.out.print(" ".repeat(n-i));
//             System.out.println("*".repeat(i*2-1));
//         }
// OPTIONAL LOGIC ⬇
//         for (int i=1; i<n; i++){
//             System.out.print(" ".repeat(i));
//             System.out.print("*".repeat(n-i));
//             System.out.println("*".repeat(n-i-1));
//         }
//     }
// }

// hollow diamond pattern
//         *
//       *   *
//     *       *
//   *           *
// *               *
//   *           *
//     *       *
//       *   *
//         *
// class class_4{
//     public static void main(String args[]){
//         int n=5;
//         for (int i=1; i<=n; i++){
//             System.out.print(" ".repeat(n-i));
//             if(i==1)
//                 System.out.println("*");
//             else 
//                 System.out.println("*" + " ".repeat(i*2-3) + "*");
//         }
//         for (int i=n-1; i>0 ; i--){
//             System.out.print(" ".repeat(n-i));
//             if(i==1)
//                 System.out.println("*");
//             else
//                 System.out.println("*" + " ".repeat(i*2-3) + "*");
//         }
//     }
// }

// pattern
// 1
// 0 1
// 1 0 1
// 0 1 0 1
// 1 0 1 0 1
// class class_4{
//     public static void main(String args[]){
//         int n=5;
//         for (int i=0; i<n; i++){
//             for (int j=0; j<=i; j++){
//                 if((i+j)%2==0)
//                     System.out.print("1 ");
//                 else
//                     System.out.print("0 ");
//             }
//             System.out.println();
//         }
//     }
// }

// print solid rohmbus pattern
//         * * * * *
//       * * * * * 
//     * * * * * 
//   * * * * * 
// * * * * * 
// class class_4{
//     public static void main(String args[]){
//         int n=5;
//         for (int i=0; i<n; i++){
//             System.out.print(" ".repeat(n-i-1));
//             System.out.println("*".repeat(n));
//         }
//     }
// }

// print holow rohmbus pattern
//         * * * * *
//       *       * 
//     *       * 
//   *       * 
// * * * * * 
// class class_4{
//     public static void main(String args[]){
//         int n=5;
//         for (int i=1; i<=n; i++){
//             System.out.print(" ".repeat(n-i));
//             if(i == 1 || i==n)
//                 System.out.println("*".repeat(n));
//             else
//                 System.out.println("*"+" ".repeat(n-2)+"*");
//         }
//     }
// }

// print pattern
//    1
//   2 2
//  3 3 3
// 4 4 4 4
//5 5 5 5 5
// class class_4{
//     public static void main(String args[]){
//         int n=5;
//         for(int i=1; i<=n; i++){
//             for(int j=0; j<n-i; j++){
//                 System.out.print(" ");
//             }
//             for(int j=1; j<=i; j++){
//                 System.out.print(i+" ");
//             }
//             System.out.println();
//         }
//     }
// }

//print pattern
//    1
//   212
//  32123
// 4321234
//543212345
// class class_4{
//     public static void main(String args[]){
//         int n=5;
//         for(int i=1;i<=n;i++){
//             for(int j=1;j<=n-i;j++){
//                 System.out.print(" ");
//             }
//             for(int j=i;j>=1;j--){
//                 System.out.print(j);
//             }
//             for(int j=2;j<=i;j++){
//                 System.out.print(j);
//             }
//             System.out.println();
//         }
//     }
// }

//draw pattern 
// *      *
// **    **
// ***  ***
// ********
// ********
// ***  ***
// **    **
// *      *
// class class_4{
//     public static void main(String args[]){
//         int n=4;
//         for (int i=1;i<=n;i++){
//             System.out.print("*".repeat(i));
//             System.out.print(" ".repeat((n-i)*2));
//             System.out.println("*".repeat(i));
//         }
//         for (int i=n;i>=1;i--){
//             System.out.print("*".repeat(i));
//             System.out.print(" ".repeat((n-i)*2));  
//             System.out.println("*".repeat(i));
//         }
//     }
// }

// print hollow butterfly
// class class_4{
//     public static void main(String args[]){
//         int n=4;
//         for(int i=1;i<=n;i++){
//             for(int j=1;j<=i;j++){
//                 if(j==1 || j==i)
//                     System.out.print("*");
//                 else
//                     System.out.print(" ");
//             }
//             System.out.print(" ".repeat((n-i)*2));
//             for(int j=1;j<=i;j++){
//                 if(j==1 || j==i)
//                     System.out.print("*");
//                 else
//                     System.out.print(" ");
//             }
//             System.out.println();
//         }
//         for(int i=n;i>=1;i--){
//             for(int j=1;j<=i;j++){
//                 if(j==1 || j==i)
//                     System.out.print("*");
//                 else
//                     System.out.print(" ");
//             }
//             System.out.print(" ".repeat((n-i)*2));
//             for(int j=1;j<=i;j++){
//                 if(j==1 || j==i)
//                     System.out.print("*");
//                 else
//                     System.out.print(" ");
//             }
//             System.out.println();
//         }
//     }
// }

// print parscal's triangle
//     1
//    1 1
//   1 2 1
//  1 3 3 1
// 1 4 6 4 1
// class class_4{
//     public static void main(String args[]){
//         int n=5;
//         for(int i=0; i<n; i++){
//             for(int j=0;j<n-i-1;j++){
//                 System.out.print(" ");
//             }
//             int num=1;
//             for(int j=0;j<=i;j++){ 
//                 System.out.print(num+" ");
//                 num = num*(i-j)/(j+1);
//             }
//             System.out.println();
//         }
//     }
// }