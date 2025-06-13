package day1;
import java.util.Scanner;
public class GradingStudent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter number of Subjects");
		int noOfSubjects = scanner.nextInt();
		int totalSumOfMarks = 0;
		for(int i = 1 ; i <= noOfSubjects ; i++)
		{
			int subjectMark = scanner.nextInt();
			totalSumOfMarks += subjectMark;
		}
		int averageMarks = (int)(totalSumOfMarks/noOfSubjects);
		if( averageMarks <= 59 )
		{
			System.out.println("Better Luck next time");
		}
		else if (( averageMarks >= 60 ) && ( averageMarks <= 80 ))
		{
			System.out.println("Awarded Second Class!!!!");
		}
		else if (( averageMarks >= 81 ) && ( averageMarks <= 95 ))
		{
			System.out.println("Awarded First Class!!!!");
		}
		else if(( averageMarks >= 96 ) && ( averageMarks <= 100 ))
		{
			System.out.println("Awarded Distinction!!!!");
		}
		else
		{
			System.out.println("Invalid Marks Entered");
		}
		scanner.close();
		
	}

}
