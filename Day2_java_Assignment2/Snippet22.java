/*  
public class Snippet22 
{ 
    public static void main(String[] args) 
    { 
        static void displayMessage() 
        { 
            System.out.println("Message"); 
        } 
    } 
} 

What syntax error occurs? 
error: illegal start of expression

Can a method be declared inside another method?
-Methods cannot be declared inside other methods in Java.
-In Java, methods must be declared  inside the class, but outside of other methods.

*/

//Corrected code as below  

public class Snippet22 
{ 
   static void displayMessage() 
        { 
            System.out.println("Message"); 
        } 
    public static void main(String[] args) 
    { 
       displayMessage(); 
    } 
} 