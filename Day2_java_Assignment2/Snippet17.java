/*
public class Snippet17
{ 
    public static void main(String[] args) 
    { 
        int a = 10; 
        int b = 5; 
        int result = a ** b; 
        System.out.println(result); 
    } 
} 
//What compilation error occurs? 
error: illegal start of expression

//Why is the ** operator not valid in Java?
-In Java, the ** operator is not recognized as a valid operator.
-Java does not support this operator.
=Insted of this operator we can use Math.pow() method.

*/

//Corrected code as below 

public class Snippet17
{ 
    public static void main(String[] args) 
    { 
        int a = 10; 
        int b = 5; 
        double result = Math.pow(a,b); 
        System.out.println(result); 
    } 
} 
