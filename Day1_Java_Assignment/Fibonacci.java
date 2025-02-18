class Fibonacci
{
/*
14. Print the Fibonacci Series 
Write a Java program to print the Fibonacci series up to the 10th number. 
Expected Output: 
0 1 1 2 3 5 8 13 21 34

*/
public static void main(String args[])
{
int num = 10, FT = 0, ST = 1;
    System.out.println("Fibonacci Series till 10th number:");

    for (int i = 1; i <= num; i++)
 {
      System.out.print(FT + " ");

 
      int nextTerm = FT+ST;
      FT = ST;
      ST = nextTerm;
  }
}
}