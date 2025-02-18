class Evenodd
{
/*
10. Check If a Number Is Even or Odd 
Write a Java program that checks if a number is even or odd. 
Test Data: 
 Input a number: 15 
Expected Output: 
The number 15 is Odd.
*/

public static void main(String args[])
{
int num =15;
if(num%2==0)
{
 System.out.println("The number " + num + " is even");
}
else
{
 System.out.println("The number " + num + " is odd");
}


}
}