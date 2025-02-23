/*
public class Snippet6
{ 
    public static void main(String[] args) 
    { 
        int x = y + 10; 
        System.out.println(x); 
    }
}

error: cannot find symbol
        int x = y + 10;
                ^
  symbol:   variable y
  location: class Snippet6

Cause of Error: The variable y is not declared and not initialized.

Why must variables be declared? 
-Memory Allocation:The declaration of a variable allows Java to allocate memory for that variable so that the program knows where to store the value.
-Code Readability: Declaring variables clearly indicates what type of data you are working with, which makes the code more readable and maintainable.

*/

//Corrected code as below

public class Snippet6
{ 
    public static void main(String[] args) 
    { 
        int y=1;
        int x = y + 10; 
        System.out.println(x); 
    }
}

