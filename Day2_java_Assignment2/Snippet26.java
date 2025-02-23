/*
public class Snippet26
{ 
    public static void main(String[] args) 
  { 
        int number = 5; 
        switch(number) 
       { 
            case 5: 
                System.out.println("Number is 5"); 
                break; 
            case 5: 
                System.out.println("This is another case 5"); 
                break; 
            default: 
                System.out.println("This is the default case"); 
        } 
    } 
} 

Error to Investigate: Why does the compiler complain about duplicate case labels? What happens when you have two identical case labels in the same switch block? 

-error: duplicate case label: 5
-When two case labels have the same value, the compiler doesn't know which block to run when that value is matched.
-It will create ambiguity.
-To avoid this issue each switch case label must be unique.

*/

//Corrected code as below 

public class Snippet26
{ 
    public static void main(String[] args) 
  { 
        int number = 5; 
        switch(number) 
       { 
            case 5: 
                System.out.println("Number is 5"); 
                break; 
            case 6: 
                System.out.println("This is another case 5"); 
                break; 
            default: 
                System.out.println("This is the default case"); 
        } 
    } 
} 
