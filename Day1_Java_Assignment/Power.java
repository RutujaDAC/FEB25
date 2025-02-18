import java.util.Scanner;
class Power
{
/*
Write a Java program that calculates the power of a number. Take two numbers as input: the 
base and the exponent, and compute the result of base raised to the power of exponent. 
Test Data: 
Input base number: 3 
Input exponent number: 4 
Expected Output: 3 raised to the power 4 is 81*/

public static void main(String args[])
{
 int base = 3;  
        int exponent = 4;  
        int result = 1;  
        for (int i = 0; i < exponent; i++) 
{  
            result *= base;  
}
System.out.println(base+ "raised to the power" + exponent + "is" + result);


}

}