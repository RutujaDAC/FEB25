/*
public class Snippet11 
{ 
    public static void main(String[] args)
   { 
        int[] arr = {1, 2, 3}; 
        System.out.println(arr[5]); 
    } 
} 
What runtime exception do you encounter? 
Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 5 out of bounds for length 3 at Snippet11

Why does it occur?
he exception occurs because the code is trying to access an element at index 5 in the array arr ,and we defined array of only three elements.

*/

//Corrected code as below

public class Snippet11 
{ 
    public static void main(String[] args)
   { 
        int[] arr = {1, 2, 3}; 
        System.out.println(arr[2]); 
    } 
} 