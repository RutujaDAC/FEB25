/*
public class Snippet13 
{ 
    public static void main(String[] args) 
    { 
        String str = null; 
        System.out.println(str.length()); 
    } 
}

What exception is thrown
-Exception in thread "main" java.lang.NullPointerException

Why does it occur? 
we assigned null value to str variable which is of string data type, 
so str is not pointing to any memory location (it's null), so Java cannot invoke the length() method on it, leading to the exception.

*/

//Corrected code as below without exception

public class Snippet13 
{ 
    public static void main(String[] args) 
  { 
        String str = null; 

       if(str!=null)
          {
            System.out.println(str.length()); 
          }
       else
       {
         System.out.println("String is null"); 
        }

    } 
} 
