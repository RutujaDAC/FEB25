class Swap
{
/*8. Swap Two Numbers 
Write a Java program to swap the values of two variables without using a third variable. 
Test Data: 
 Input first number: 10 
 Input second number: 20 
Expected Output: 
Before swapping:
First number: 10 
Second number: 20 
After swapping: 
First number: 20 
Second number: 10 
*/

public static void main(String args[])
{
int num1=10,num2=20, num3;

System.out.println("Befor swapping num1=" + num1 +"and num2=" +num2);

num1= num1+num2;
num2 = num1-num2;
num1= num1-num2;

System.out.println("After swapping num1=" + num1 +"and num2=" +num2);

} 

}
