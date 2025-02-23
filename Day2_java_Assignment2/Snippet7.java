/*
public class Snippet7 
{ 
    public static void main(String[] args) 
{ 
        int x = "Hello"; 
        System.out.println(x); 
    } 
} 

What compilation error do you see?
incompatible types: String cannot be converted to int

Why does Java enforce type safety?
-Java enforces type safety to prevent errors that could lead to undefined behavior or bugs at runtime.
-If Java did not enforce type safety, it would allow incorrect assignments, such as trying to store a string in an integer variable, leading to unpredictable behavior or errors during program execution.

*/

//Corrected code as below

public class Snippet7 
{ 
    public static void main(String[] args) 
{ 
        int x = 10; 
        System.out.println(x); 
    } 
} 