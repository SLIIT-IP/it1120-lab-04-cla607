import java.util.Scanner;
public class IT24100780Lab4Q3{
	public static void main(String[] args){
		
		//define data type of variable
		int inputValue;

		//making scanner object
		Scanner scan = new Scanner(System.in);
		
		//request and get the user input
		System.out.println("Enter a number: ");
		inputValue = scan.nextInt();

		//check inputvalue using ternary operator
		String finalOut = (inputValue==0)?"Zero":(inputValue>0)?"Positive":"Negative";
		System.out.println("The number is: "+ finalOut);
	}
}