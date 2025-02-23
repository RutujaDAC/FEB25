/*
public class WrongInitializationForLoop 
{
 public static void main(String[] args) 
{
 for (int i = 10; i >= 0; i++) 
{
 System.out.println(i);
 }
 }
}
 Error to investigate: Why does this loop not print numbers in the expected order? What is the problem with the initialization and update statements in the `for` loop? 
Here the loop run infinitely because we initialized i to 10 and gave wrong condition as i>=10 so after each iteration value of i will increase and condition will always satisfy,so loop will run continuously.

*/

//Corrected code

public class WrongInitializationForLoop 
{
 public static void main(String[] args) 
{
 for (int i = 1; i <= 10; i++) 
{
 System.out.println(i);
 }
 }
}
