/*
public class Snippet12
{ 
    public static void main(String[] args) 
{ 
        while (true) 
       { 
            System.out.println("Infinite Loop"); 
       } 
 } 
}

What happens when you run this code? 
-The program enters an infinite loop

How can you avoid infinite loops? 
By putting condition that will eventually become false, or can use a counter to limit the number of iterations.
Also u can use break statement to exit the loop when certain condition is met
*/

//Corrected code as below

public class Snippet12
{ 
    public static void main(String[] args) 
{ 
     int num=5;
        while (num>=5) 
       { 
            System.out.println("Infinite Loop"); 
            break;
       } 
 } 
}