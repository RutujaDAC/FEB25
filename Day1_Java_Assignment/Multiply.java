import java.util.Scanner;
class Multiply
{
/*
Write a Java program that takes two numbers as input and displays the product of the two numbers. 
Test Data: 
 Input first number: 25 
 Input second number: 5 
Expected Output: 25 x 5 = 125

*/

public static void main(String args[])
{
  int num1,num2;
  System.out.println("Enter two number");
  Scanner sc = new Scanner(System.in);
  num1= sc.nextInt();
  num2 = sc.nextInt();
  System.out.println("num1*num2=" + num1*num2);

}
}