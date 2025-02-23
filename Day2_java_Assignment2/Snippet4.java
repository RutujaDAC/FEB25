/*
public class Snippet4
{ 
    public static void main() 
   { 
        System.out.println("Hello, World!"); 
    } 
} 

Error:  Main method not found in class Snippet4
Why is String[] args needed?
-The String[] args is used to pass command-line arguments to the program.
-If we run our java program from command line or terminal, any argument we pass can be accessed via this array thats why we need String[] a          args.
-Even if we dont use command-line arguments, the String[] args is required by the Java runtime, as it's part of the standard entry point for a Java program.

*/

//Corrected code as below

public class Snippet4
{ 
    public static void main(String args[]) 
   { 
        System.out.println("Hello, World!"); 
    } 
} 

