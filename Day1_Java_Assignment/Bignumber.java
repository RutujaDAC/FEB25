class Bignumber
{
/*
11. Find the Largest of Three Numbers 
Write a Java program that takes three numbers as input and finds the largest of the three. 
Test Data: 
 Input first number: 12 
 Input second number: 45 
 Input third number: 22 
Expected Output: 
The largest number is 45. 

*/

public static void main(String args[])
{
int num1=12,num2=45,num3=22;
if(num1>num2 && num1>num3)
{
System.out.println("The largest number is "+num1);
}
if(num2>num1 && num2>num3)
{
System.out.println("The largest number is "+num2);
}
else
{
System.out.println("The largest number is "+num3);
}


}
}