public class SnippetFL
 {
 public static void main(String[] args)
 {
 for (int i = 0; i < 5; i += 2) 
 {
 System.out.println(i);
 }
 }
}
// Error to investigate: Why does the loop print unexpected results or run infinitely? How should the loop update expression be corrected? 

//- Here no error in code, output of code is 0,2,4 which is expected because condition is i<5 and we are increamenting i in each iteration by 2.