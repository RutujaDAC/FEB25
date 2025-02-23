public class Snippet10WL
{
 public static void main(String[] args) 
{
 int num = 10;
 while (num = 10) 
 {
 System.out.println(num);
 num--;
 }
 }
}
/* Error to investigate: Why does the loop execute indefinitely? What is wrong with the loop condition?
- error: incompatible types: int cannot be converted to boolean
Because here we are assigning 10 value to variable num, it is not producing boolean value true or false ,it produces an integer which is 10 so thats why this error occurs.
*/