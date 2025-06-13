package day1;
import java.util.Scanner;
public class FarmerProblem {
	public static float tomatoesYieldCalculation(float areaPerSegment)
	{
		float thirtyPerCent = areaPerSegment * 0.3f;
		float totalYield = thirtyPerCent * 10;
		totalYield += ((areaPerSegment - thirtyPerCent) * 12);
		return totalYield;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		int totalAcres = scanner.nextInt();
		float areaPerSegment =  totalAcres / 5;
		float moneyEarnedwithTomatoes = (tomatoesYieldCalculation(areaPerSegment) * 1000 )* 7;
		float moneyEarnedwithPotatoes = ((areaPerSegment * 10) * 1000) * 20;
		float moneyEarnedwithCabbages = ((areaPerSegment * 14) * 1000) * 24;
		float moneyEarnedwithSunFlowers = ((areaPerSegment * 0.7f) * 1000) * 200;
		float moneyEarnedwithSugarcanes = ((areaPerSegment * 45) * 1000) * 4000;
		
		float totalSales = moneyEarnedwithTomatoes + moneyEarnedwithPotatoes + moneyEarnedwithCabbages + moneyEarnedwithSunFlowers + moneyEarnedwithSugarcanes ;
		
		
		System.out.println("Total Sales obtained by the farmer is:" + totalSales);

	}

}
