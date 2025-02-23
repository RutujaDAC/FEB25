public class Snippet16
{ 
    public static void main(String[] args) 
     { 
        int num = 10; 
        double result = num / 4; 
        System.out.println(result); 
     }
}

/*
What is the result of this operation? 
-Result is 2.0

Is the output what you expected?
I was expecting 2.5 but after carefull observation saw, num and digit 4 both are integer values so after division result came 2.5 but as values are integer so .5 that is decimal part descarded and result becomes 2 now.
Bur result stored in double data type so it converted to 2.0 automatically. Here implicit typecasting takes place.

*/