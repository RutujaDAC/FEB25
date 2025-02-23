/*
public class Snippetdowhile
{
 public static void main(String[] args) 
{
 int num = 1;
 do 
{
 System.out.println(num);
 num--;
 } while (num > 0);

 }
}
// Error to investigate: Why does this loop print unexpected numbers? What adjustments are needed to print the numbers from 1 to 5?

There is no error in this code as we are using do while loop so loop will execute once.
Here value of num is 1 and it prints on console, after decreament num from 0 to 1 while conition becomes false and loop is terminating.
*/

//To print numbers from 1 to 5 corrected code as below:

public class Snippetdowhile
{
 public static void main(String[] args) 
{
 int num = 1;
 do 
{
 System.out.println(num);
 num++;
 } while (num <=5 );

 }
}
