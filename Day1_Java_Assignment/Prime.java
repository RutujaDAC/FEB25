class Prime
{
/*
Write a Java program to check whether a number is prime or not. 
Test Data: 
Input number: 17 
Expected Output: The number 17 is Prime. 
*/

public static void main(String args[])
{
int num=17,count=0;
for(int i=2; i<num; i++)
      {
         if(num%i == 0)
         {
            count++;
              break;
         }
      }
      
      if(count==0)
         System.out.println("The number 17 is Prime");
      else
         System.out.println("The number 17 is not Prime.");

}


}