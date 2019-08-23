// SCANNER
// just asks the user for 3 inputs as integers and prits the sum

import java.util.Scanner;
public class UserInput{
 public static void main(String[] args){
   
   Scanner sc = new Scanner(System.in);
   
   System.out.println("first input");
   int first = sc.nextInt();
   
   System.out.println("second input");
   int second = sc.nextInt();
   
   System.out.println("third input);
   int third = sc.nextInt();
   
   sum = first + second + third;
   
   System.out.println("The sum is" + sum);
 }
}
