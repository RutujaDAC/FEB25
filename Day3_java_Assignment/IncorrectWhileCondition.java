/*
public class IncorrectWhileCondition 
{
 public static void main(String[] args) 
{
 int count = 5;
 while (count=5) 
 {
 System.out.println(count);
 count--;
 }
 
}
}

Error to investigate:
-error: incompatible types: int cannot be converted to boolean


Why does the loop not execute as expected? What is the issue with the condition in the while loop? 
The expression count = 5 will assign the value 5 to the variable count, but it doesn't produce a boolean value, it produces an integer (5), which causes the error.
*/

// Corrected code: 

public class IncorrectWhileCondition 
{
 public static void main(String[] args) 
{
 int count = 5;
 while (count==5) 
 {
 System.out.println(count);
 count--;
 }
 
}
}