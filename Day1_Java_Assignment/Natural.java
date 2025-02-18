import java.util.Scanner;
class Natural
{
/*
Write a Java program to print the first N natural numbers, where N is provided by the user. 
Test Data: 
Input a number: 6 
Expected Output: 1 2 3 4 5 6 
*/

public static void main(String args[])
{
 int num;
Scanner sc = new Scanner(System.in);
System.out.println("Enter a number");
    num = sc.nextInt();

System.out.println("Natural number upto that number are:");
for (int i=1; i<=num; i++)
{
System.out.print(i + " ");
}


}

}