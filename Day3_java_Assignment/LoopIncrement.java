public class LoopIncrement 
{ 
    public static void main(String[] args) 
      { 
        int count = 0; 
        int i;
        for (i = 0; i < 4; i++) 
        { 
            count += i++ - ++i; 
        } 
        System.out.println(count); 
       
    } 
 
 
} 
// Guess the output of this code snippet. 
//-4