/*
public class Snippet3 { 
    public static int main(String[] args) { 
        System.out.println("Hello, World!"); 
        return 0; 
    }
}

Error:  Main method must return a value of type void in class Snippet3
Explanation of Error:This error occured because the main method must have a return type of void. The main method is the entry point of a Java program, and the standard signature for the main method is: public static void main(String[] args)

*/

//Corrected code as below.

public class Snippet3 { 
    public static void main(String[] args) { 
        System.out.println("Hello, World!"); 
         
    }
}