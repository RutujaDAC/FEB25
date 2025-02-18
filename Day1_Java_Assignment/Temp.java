import java.util.Scanner;
class Temp
{

/*
Write a Java program to convert a temperature from Celsius to Fahrenheit. 
Test Data: 
Input temperature in Celsius: 25 
Formula: Fahrenheit = (Celsius * 9/5) + 32 
Expected Output: 25°C is equal to 77.0°F
*/

public static void main(String args[])
{
int temp_celsius;
double Fahrenheit ;
Scanner sc = new Scanner(System.in);
System.out.println("Enter temperature in celsius");
    temp_celsius = sc.nextInt();

Fahrenheit= (temp_celsius * 9/5) + 32; 

System.out.println(temp_celsius +"°C is equal to " + Fahrenheit + "°F");



}

}