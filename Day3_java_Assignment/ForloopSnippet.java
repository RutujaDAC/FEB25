/*
public class ForloopSnippet 
{
 public static void main(String[] args) 
{
 for (int i = 1; i <= 10; i++) 
{

 System.out.println(i);

 }
 // Expected: 10 iterations with numbers 1 to 10
 // Actual: Prints numbers 1 to 10, but the task expected only 1 to 9
 }
}
Error to investigate: What is the issue with the loop boundaries? How should the loop be adjusted to meet the expected output? 
After running the code 1 to 10 numbers are printing on console.
If we want to print numbers from 1 to 9 we need to change condition i<=10 to i<10, so value from 1 to 9 will print.

*/

// Corrected code:

public class ForloopSnippet 
{
 public static void main(String[] args) 
{
 for (int i = 1; i < 10; i++) 
{

 System.out.println(i);

 }

 }
}