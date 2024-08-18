import java.util.Scanner;

public class IT24100780Lab4Q2
{
	public static void main(String[] args)
	{
		Scanner abc = new Scanner(System.in);
		System.out.print("Please enter exam marks (out of 100): ");
		double exam = abc.nextDouble();
		
		if(exam>100 || exam<0)
		{
			System.out.println("Invalid input for exam marks. terminating program");
		System. exit(0);	
		}

		System.out.print("Please enter lab marks (out of 100): ");
		double lab = abc.nextDouble();
		
		if(lab>100 || lab<0)
		{
			System.out.println("Invalid input for exam marks. terminating program");
		System. exit(0);	
		}
	
		System.out.print("Please enter the percentage given for the exam: ");
		double exampr = abc.nextDouble();
		
		System.out.print("Please enter the percentage given for the lab submission: ");
		double labpr = abc.nextDouble();

		if((exampr+labpr==100))
		{
			double finalexam = exam*exampr/100;
			double finallab = lab*labpr/100;
			double result = finalexam+finallab;

			System.out.println("Final Exam Mark is : "+result);
		}
		else
		{
			System.out.println("The percentages must add up to 100. Terminating program.");
		System. exit(0);
		}
	}
}		
		