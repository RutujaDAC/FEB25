import java.util.Scanner;
class Multiop
{
/*
Write a Java program to print the sum, multiplication, subtraction, division, and remainder of 
two numbers. 
Test Data: 
 Input first number: 125 
 Input second number: 24 
Expected Output: 
125 + 24 = 149 
125 - 24 = 101 
125 x 24 = 3000
125 / 24 = 5 
125 mod 24 = 5 
*/

public static void main(String args[])
{
  int num1,num2;
  System.out.println("Enter two numbers and perform addition, Subtraction ,Multiplication, division and Modulo operation on them");
  Scanner sc = new Scanner(System.in);
  num1 = sc.nextInt();
  num2 = sc.nextInt();

  System.out.println("Addition of num1 and num2="+ (num1+num2));
  System.out.println("Subtraction of num1 and num2="+ (num1-num2));
  System.out.println("Multiplication of num1 and num2=" + num1*num2);
  System.out.println("Division of num1 and num2=" + num1/num2);
  System.out.println("Modulo of num1 and num2=" + num1%num2);
}

}