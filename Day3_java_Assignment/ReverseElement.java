// Write a program to reverse the digits of the number 1234. The output should be 4321. 

public class ReverseElement {
    public static void main(String[] args) {
       
        int num = 1234, revnum = 0,digit;
        
         while (num != 0) 
             {
       
               digit = num % 10;
            
               revnum = revnum * 10 + digit;
         
               num = num / 10;
              }
        
        System.out.println(revnum);
    }
}