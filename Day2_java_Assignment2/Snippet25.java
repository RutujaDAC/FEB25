/*
public class Snippet25 { 
    public static void main(String[] args) { 
        double score = 85.0; 
        switch(score) { 
            case 100: 
                System.out.println("Perfect score!"); 
                break; 
            case 85: 
                System.out.println("Great job!"); 
                break; 
            default: 
                System.out.println("Keep trying!"); 
        } 
    } 
}
 */


/*
Error to Investigate: Why does this code not compile? What does the error tell you about the types allowed in switch expressions? How can you modify the code to make it work?

-error: incompatible types: possible lossy conversion from double to int 
-In Java in switch statement double type variable is not allowed.
The switch statement in Java only supports the following types of expressions:
byte
short
int
char
enum types
String

-we can do above code by two ways 1)use if else or 2)we can typecast double to int.
1)if else
*/


/*
public class Snippet25{ 
    public static void main(String[] args)
   { 
        double score = 85.0; 
        if (score == 100) 
        { 
            System.out.println("Perfect score!"); 
        } 
       else if (score == 85) 
        { 
            System.out.println("Great job!"); 
        } 
       else 
        { 
            System.out.println("Keep trying!"); 
        } 
    } 
}
*/

//2) By using typecasting

public class Snippet25 
{ 
     public static void main(String[] args) 
  { 
        double score = 85.0;  
        int sc = (int) score;
        switch(sc) 
      { 
            case 100: 
                System.out.println("Perfect score!"); 
                break; 
            case 85: 
                System.out.println("Great job!"); 
                break; 
            default: 
                System.out.println("Keep trying!"); 
        } 
    } 
}


