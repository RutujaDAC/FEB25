public class Snippet5
 { 
    public static void main(String[] args) 
   { 
        System.out.println("Main method with String[] args"); 
    } 
    public static void main(int[] args) 
    { 
        System.out.println("Overloaded main method with int[] args"); 
    } 
}

/*
Error: No error 
Output of Program: Main method with String[] args
-We can have multiple main methods in java,java allows method overload.
-Methos overloading is we can have multiple methods with same name in our program but number of parameters, parameter type should be different.

My Observation:
-The main methos with String args[] will execute when we run the program as it is entry point of java program.
-The method with int args[] is is overloaded main method and we need to call it explicitly.

*/

