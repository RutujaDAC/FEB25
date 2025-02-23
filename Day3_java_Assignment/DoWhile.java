/*
public class DoWhile
{
 public static void main(String[] args) 
{
 int num = 0;
 do 
 {
 System.out.println(num);
 num++;
 } while (num > 0);

 }
}

 Error to investigate: Why does the loop only execute once? What is wrong with the loop condition in the `dowhile` loop? 

- The loop run infinitly because after printing statement num is incrementing and then we are checking the conditon so condition num>0 will always be true and loop run continuously.
-By changing condition we can solve this issue.

*/

// Corrected code: 

public class DoWhile
{
 public static void main(String[] args) 
{
 int num = 0;
 do 
 {
 System.out.println(num);
 num++;
 } while (num < 10);

 }
}
