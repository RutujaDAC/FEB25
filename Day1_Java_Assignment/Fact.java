class Fact
{
/*
15. Find the Factorial of a Number 
Write a Java program to find the factorial of a number. 
Test Data: 
 Input a number: 5 
Expected Output: Factorial of 5 is 120. 

*/

public static void main(String args[])
{
  int num=5, fact=1;

for(int i=1;i<=5;i++)
{
  fact= fact*i;
}

System.out.println("Factorial of 5 is " + fact);

}


}