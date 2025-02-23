
/*
public class Main 
{ 
    public void main(String[] args)
 { 
        System.out.println("Hello, World!"); 
    } 
}

-Error: Main method is not static in class Main
-Explanation of Error: Main method is entry point of program and it should declared as static because java runtime calls main method withoud creating an instance of the class. Here our main method is not static hence cannot be called from static contecxt where java program starts execution.
*/

//Corrected code as below.
public class Main 
{ 
    public static void main(String[] args)
 { 
        System.out.println("Hello, World!"); 
    } 
}