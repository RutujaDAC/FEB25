import java.util.Scanner;
class Positive
{
  /* Write a Java program that checks if a predefined number is positive using an 
if-else statement and prints the appropriate message.
*/
public static void main(String args[])
{
 int num;
 Scanner sc = new Scanner(System.in);
 System.out.println("Enter a number");
 num = sc.nextInt();

if(num>=0)
{
  System.out.println("Number is positive.");
}
else
{
 System.out.println("Number is not positive.");
}
}

}