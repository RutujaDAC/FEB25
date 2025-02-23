public class Snippet19
 { 
    public static void main(String[] args) 
  { 
        int a = 10; 
        int b = 0; 
        int result = a / b; 
        System.out.println(result); 
    } 
} 

/*
 What runtime exception is thrown? 
ArithmeticException: / by zer0

Why does division by zero cause an issue in Java?
-In Java, dividing a number by zero is not allowed because it leads to an undefined result.
-Mathematically, division by zero is not a valid operation, and the Java language explicitly handles it by throwing an exception to prevent unpredictable behavior in programs.

*/



