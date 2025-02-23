public class Snippet11WL
{
 public static void main(String[] args) 
{
 int i = 0;
 while (i < 5) 
{
 System.out.println(i);
 i += 2; // Error: This may cause unexpected results in output
 }
 }
}
// Error to investigate: What will be the output of this loop? How should the loop variable be updated to achieve the desired result? 
-Here no error in code, output of code is 0 2 4 because we are increamenting i by 2 and codition is 1<5 so loop will execute 3 time with 0 2 and 3 value.