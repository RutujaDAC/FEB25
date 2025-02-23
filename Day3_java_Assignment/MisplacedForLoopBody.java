
/*
public class MisplacedForLoopBody 
{
 public static void main(String[] args)
 {
 for (int i = 0; i < 5; i++)
 System.out.println(i);
 System.out.println("Done");
 }
}

 Error to investigate: Why does "Done" print only once, outside the loop? How should the loop body be enclosed to include all statements within the loop? 

-"Done" printed only once because, if we not giving opening and closing curly braces after for loop then it is considering only one next statement as part of it, so another SOP statement considered as outside of for loop. 
-To avoid this problem,  opening and closing curly braces ensures that the loop body is properly enclosed ,and each statement that is part of the loop is inside the braces.

*/

//Corrected code

public class MisplacedForLoopBody 
{
 public static void main(String[] args)
 {
 for (int i = 0; i < 5; i++)
{
 System.out.println(i);
 System.out.println("Done");
}
 }
}
