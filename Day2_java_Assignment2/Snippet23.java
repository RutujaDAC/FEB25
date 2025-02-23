/*
public class Snippet23
 { 
    public static void main(String[] args) 
     { 
        int value = 2; 
        switch(value) { 
            case 1: 
                System.out.println("Value is 1"); 
            case 2: 
                System.out.println("Value is 2"); 
            case 3: 
                System.out.println("Value is 3"); 
            default: 
                System.out.println("Default case"); 
        } 
    } 
} 

Error to Investigate: Why does the default case print after "Value is 2"? 
Here value pf variable value is 2 so second case print statemetnt that is value is 2 will print on console.
ALso value is 3 and default case statement will print becase in program break statement not used after cae2 and case3.
So output is:  
Value is 2
Value is 3
Default case


How can you prevent the program from executing the default case? 
By using break statement after each case we can fix this problem.

*/

//Corrected code as below 

public class Snippet23
 { 
    public static void main(String[] args) 
     { 
        int value = 2; 
        switch(value) 
       { 
            case 1: 
                System.out.println("Value is 1"); 
                break;
            case 2: 
                System.out.println("Value is 2"); 
                break;
            case 3: 
                System.out.println("Value is 3"); 
                break;
            default: 
                System.out.println("Default case"); 
                break;
        } 
    } 
} 
