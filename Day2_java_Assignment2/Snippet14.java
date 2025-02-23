/*
public class Snippet14 
{ 
    public static void main(String[] args) 
   { 
        double num = "Hello"; 
        System.out.println(num); 
    } 
} 

What compilation error occurs? 
-Compilation error cause because we are trying to assign a String ("Hello") to a double variable.

Why does Java enforce data type constraints? 
-Java enforces data type constraints to ensure that the data is used correctly and consistently, and to avoid type mismatch errors that could lead to incorrect or unpredictable behavior during execution.

*/

//Corrected code as below 

public class Snippet14 
{ 
    public static void main(String[] args) 
   { 
        String str = "Hello"; 
        System.out.println(str); 
    } 
} 
