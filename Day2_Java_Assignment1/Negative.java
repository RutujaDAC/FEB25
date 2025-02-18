import java.util.Scanner;
class Negative
{
  /* Write a Java program that checks if a predefined number is negative using an 
if-else statement and displays the result. 
*/
public static void main(String args[])
{
 int num;
 Scanner sc = new Scanner(System.in);
 System.out.println("Enter a number");
 num = sc.nextInt();

if(num<0)
{
  System.out.println("Number is negative");
}
else
{
 System.out.println("Number is not negative.");
}
}

}