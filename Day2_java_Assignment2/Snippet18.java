 
public class Snippet18 
{ 
    public static void main(String[] args) 
    { 
        int a = 10; 
        int b = 5; 
        int result = a + b * 2; 
        System.out.println(result); 
    } 
} 

What is the output of this code?
Output is 20

How does operator precedence affect the result?
-Multiplication takes precedence over addition so first b*2 will evaluate and then a is added to multiplication result.
