import java.util.Scanner;
import java.io.*;
public class Simple_Calculator {
	public static void main(String[] args) throws IOException {
	 PrintWriter outputfile = new PrintWriter("output6.txt");
	 Scanner key = new Scanner(System.in);
	
	 //Variables for do while loop
	 boolean notDone = true;
		 char choice = ' ';
		
		 System.out.println("Christian Casimir");
		 //Call to printheader method to print the chart
		 printheader();
		
		 //Do while loop that runs through the Switch Cases
		 do {
		
		 choice = key.next().charAt(0);
		 switch(choice) {
		 case 'Q':
		 case 'q':
		 notDone = false;
		 break;
		 case '+':
		 addition(key,outputfile);
		 break;
		 case '-':
		 subtraction(key,outputfile);
		 break;
		 case '*':
		 multiplication(key,outputfile);
		 break;
		 case '/':
		 division(key,outputfile);
		 break;
		 case '%':
		 modulus(key,outputfile);
		 break;
		 case 'A':
		 case 'a':
		 average(key,outputfile);
		 break;
		 case 'X':
		 case 'x':
		 maximum(key,outputfile);
		 break;
		 case 'M':
		 case 'm':
		 minimum(key,outputfile);
		 break;
		 case 'S':
		 case 's':
		 square(key,outputfile);
		 break;
		 default:



		 outputfile.println("ERROR: Entered an Invalid Value");
		 break;
		 }
		 }while(notDone);//End Do While Loop
		
		 //Close keyboard Input
		 key.close();
		 //Flush Output
		 outputfile.flush();
		 //Final Termination
		 System.out.print("All Calculations Complete");
		 //Close OutputFile
		 outputfile.close();
		
		 }//End of Main
		
		 //ARITHMATIC METHODS***********************************
		
		 //ADDITION METHOD
		 //Prompts for Two Values
		 //Adds the Two Values
		 //Outputs Two Values and Sum
		 public static void addition(Scanner key,PrintWriter out) throws IOException {
		 System.out.println("Enter Addend");
		 int a = key.nextInt();
		 System.out.println("Enter Augend");
		 int b = key.nextInt();
		 int sum = a + b;
		 out.println("Operation: Addition");
		 out.println("Addend: " + a);
		 out.println("Augend: " + b);
		 out.println("Sum: " + sum);
		 out.println();
		 }
		 //SUBTRACTION METHOD
		 //Prompts for Two Values
		 //Subtracts the Two Values
		 //Outputs Two Values and Quotient
		 public static void subtraction(Scanner key,PrintWriter out) throws IOException{
		 System.out.println("Enter Minuend");
		 int a = key.nextInt();
		 System.out.println("Enter Subtrahend");
		 int b = key.nextInt();
		 int quotient = a - b;
		 out.println("Operation: Subtraction");
		 out.println("Minuend: " + a);
		 out.println("Subtrahend: " + b);
		 out.println("Quotient: " + quotient);
		 out.println();
		 }
		 //MULTIPLICATION METHOD
		 //Prompts for Two Values
		 //Multiplies the Two Values
		 //Outputs Two Values and Product
		 public static void multiplication(Scanner key,PrintWriter out) throws IOException{
		 System.out.println("Enter Multiplicand");
		 int a = key.nextInt();


		 System.out.println("Enter Multiplier");
		 int b = key.nextInt();
		 int product = a * b;
		 out.println("Operation: Multiplication");
		 out.println("Multiplicand: " + a);
		 out.println("Multiplier: " + b);
		 out.println("Product: " + product);
		 out.println();
		 }
		 //DIVISION METHOD
		 //Prompts for Two Values
		 //Divides the Two Values
		 //Outputs Two Values and Quotients
		 public static void division(Scanner key,PrintWriter out) throws IOException{
		 System.out.println("Enter Dividend");
		 int a = key.nextInt();
		 System.out.println("Enter Divisor");
		 int b = key.nextInt();
		 int quotients = a / b;
		 out.println("Operation: Division");
		 out.println("Dividend: " + a);
		 out.println("Divisor: " + b);
		 out.println("Quotients: " + quotients);
		 out.println();
		 }
		 //MODULUS METHOD
		 //Prompts for Two Values
		 //Finds the Remainder of the Two Values
		 //Outputs Two Values and Remainder
		 public static void modulus(Scanner key,PrintWriter out) throws IOException{
		 System.out.println("Enter Value1");
		 int a = key.nextInt();
		 System.out.println("Enter Value2");
		 int b = key.nextInt();
		 int result = a % b;
		 out.println("Operation: Modulus");
		 out.println("Value1: " + a);
		 out.println("Value2: " + b);
		 out.println("Result: " + result);
		 out.println();
		 }
		 //****************************************************
		
		 //AVERAGE METHOD
		 //Prompts for Two Values
		 //Adds two Values then Divides by 2
		 //Outputs two Values and Average
		 public static void average(Scanner key,PrintWriter out) throws IOException{
		 System.out.println("Enter Value1");
		 int a = key.nextInt();
		 System.out.println("Enter Value2");
		 int b = key.nextInt();
		 int result = (a+b) / 2;
		 out.println("Operation: Average");
		 out.println("Value 1: " + a);
		 out.println("Value 2: " + b);
		 out.println("Average: " + result);
	

		 out.println();
		 }
		
		 //MAXIMUM METHOD
		 //Prompts for Two Values
		 //Ouputs two Values and Maximum
		 public static void maximum(Scanner key,PrintWriter out) throws IOException{
		System.out.println("Enter Value1");
		 int a = key.nextInt();
		 System.out.println("Enter Value2");
		 int b = key.nextInt();
		 out.println("Operation: Maximum");
		 out.println("Value 1: " + a);
		 out.println("Value 2: " + b);
		 if(a > b)
		 out.println("Max is: " + a);
		 else
		 out.println("Max is: " + b);
		
		 out.println();
		
		 }
		
		 //MINIMUM METHOD
		 //Prompts for two Values
		 //Outputs two Values and Minimum
		
		 public static void minimum(Scanner key,PrintWriter out) throws IOException{
		 System.out.println("Enter Value1");
		 int a = key.nextInt();
		 System.out.println("Enter Value2");
		 int b = key.nextInt();
		 out.println("Operation: Minimum");
		 out.println("Value 1: " + a);
		 out.println("Value 2: " + b);
		 if(a < b)
		 out.println("Min is: " + a);
		 else
		 out.println("Min is: " + b);
		
		 out.println();
		 }
		
		 //SQUARE METHOD
		 //Prompts for two Values
		 //Squares Value 1 to the Power of Value 2
		 //Outputs two Values and Square
		 public static void square(Scanner key,PrintWriter out) throws IOException{
		 System.out.println("Enter Value");
		 int a = key.nextInt();
		 double square = a * a;
		 out.println("Operation: Square");
		 out.println("Value : " + a);
		 out.println("Square: " + square);
		 out.println();
		 }
		

		 //PRINT HEADER METHOD
		 //Prints out the Chart
		 public static void printheader(){
		 System.out.println("Enter the value for the Operation");
		 System.out.printf("\n%c,%c,%c,%c,%c \t%35s", '+','-','*','/','%',
		 "Addition,Subtraction,Multiplication,Division,Modulus");
		 System.out.printf("\n%c %21s \n%c %21s \n%c %21s \n%c %20s \n%c %18s",
		 'A',"Average",'X',"Maximum",'M',"Minimum",'S',"Square",'Q',"Quit");
		 }
}
