/*
public class Snippet15 
{ 
    public static void main(String[] args) 
   { 
        int num1 = 10; 
        double num2 = 5.5; 
        int result = num1 + num2; 
        System.out.println(result); 
    } 
} 
// What error occurs when compiling this code? 
error: incompatible types: possible lossy conversion from double to int

//How should you handle different data types in operations?
By using typecasting or we can declare another variable of int data type.

1)Implicit Typecasting (Widening)
-This happens automatically when a smaller data type is converted to a larger data type.

2)Explicit Typecasting (Narrowing)
-This requires you to manually convert a larger data type into a smaller data type.
-eg: 
double d = 10.5;
int i = (int) d;  // Explicit casting from double to int
System.out.println(i);  // Output: 10 (fraction part is discarded)

*/

//Corrected code as below

public class Snippet15 
{ 
    public static void main(String[] args) 
   { 
        int num1 = 10; 
        double num2 = 5.5; 
        int result = (int) (num1 + num2); 
        System.out.println(result); 
    } 
} 