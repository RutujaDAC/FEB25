/*
public class Snippet21 
{ 
    public static void main(String[] args) 
   { 
        System.out.println("Hello, World!"); 
    // Missing closing brace here 
} 

//What does the compiler say about mismatched braces?

Error:reached end of file while parsing 
-The compiler has reached the end of the file and has not found the necessary closing br } to complete the main method or the Main class. 
It expects a closing brace to match the opening one at the beginning of the main method.

*/

//Corrected code as below

public class Snippet21 
{ 
    public static void main(String[] args) 
   { 
        System.out.println("Hello, World!"); 
    }
} 
