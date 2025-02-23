/*
public class UninitializedWhileLoop 
{
 public static void main(String[] args) {
 int count;
 while (count < 10) {
 System.out.println(count);
 count++;
 }
 }
}

Error to investigate: Why does this code produce a compilation error? What needs to be done to initialize the loop variable properly? 
-Code producing compilation error because we havent initialized count variable.
-To resolve this error need to initialize count variable.
*/

//Corrected code

public class UninitializedWhileLoop 
{
 public static void main(String[] args) {
 int count=0;
 while (count < 10) {
 System.out.println(count);
 count++;
 }
 }
}
