public class LoopVariableScope 
{
 public static void main(String[] args) 
{
 for (int i = 0; i < 5; i++) 
{
 int x = i * 2;
 }
 System.out.println(x); // Error: 'x' is not accessible here
 }
}

/*

 Error to investigate: Why does the variable 'x' cause a compilation error? How does scope
- Error: 'x' is not accessible here
-Error occure because scope of variable x is upto for loop, its locally declared and initialized inside for loop.

*/