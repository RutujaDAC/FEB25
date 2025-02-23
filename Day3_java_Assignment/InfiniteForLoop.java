/*
public class InfiniteForLoop 
{
 public static void main(String[] args) 
{
 for (int i = 0; i < 10; i--) 
 {
 System.out.println(i);
 }
}
}

// Error to investigate: 

Why does this loop run infinitely? 
- Because here value of i initialized to 0 and we gave condition 1<10 and value of i is decrementing in each rotation. i will be 0,-1,-2 and so on.
so condition will always be true for each rotation, so loop run infinitely.

How should the loop control variable be adjusted? 
-Instead of decrementing i value we can increment it.

*/

// Corrected code: 

public class InfiniteForLoop 
{
 public static void main(String[] args) 
{
 for (int i = 0; i < 10; i++) 
 {
 System.out.println(i);
 }
}
}
