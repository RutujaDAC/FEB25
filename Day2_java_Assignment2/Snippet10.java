/*
public class Snippet10 
{ 
    public void display() 
   { 
        System.out.println("No parameters"); 
    } 
    public void display(int num) 
    { 
        System.out.println("With parameter: " + num); 
    } 
    public static void main(String[] args) 
    { 
        display(); 
        display(5); 
    } 
}

What happens when you compile and run this code? 
 error: non-static method display() cannot be referenced from a static context
        display();
 error: non-static method display(int) cannot be referenced from a static context
        display(5);


Is method overloading allowed? 
method overloading is allowed, meaning you can have multiple methods with the same name but with different parameters.
Here in this code problem is in main method, main method is static and we are calling non static method like display() from it without creating an instance of the class.

*/

//Corrected code as below

 public class Snippet10 
{ 
       static void display() 
   { 
        System.out.println("No parameters"); 
    } 
        static void display(int num) 
    { 
        System.out.println("With parameter: " + num); 
    } 
    public static void main(String[] args) 
    { 
        display(); 
        display(5); 
    } 
}