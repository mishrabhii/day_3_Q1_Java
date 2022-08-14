package CalculatingWageForAMonth;

public class CalculatingWageForAMonth {

	public static final int IS_PART_TIME = 1;
	public static final int IS_FULL_TIME = 2;
	public static final int EMP_RATE_PER_HOUR = 20;
	public static final int NUM_OF_WORKING_DAYS = 2;

public static void main(String[] args) {
		
	 int empHrs= 0, empwage = 0, totalEmpwage = 0;
for 
	   (int day = 0; day < NUM_OF_WORKING_DAYS; day++) {
	int empCheck = (int) Math.floor(Math.random() * 10) % 3;
	switch (empCheck)	{
	case IS_PART_TIME:
	empHrs = 4;
	break;
	case IS_FULL_TIME:
	empHrs = 8;
	break;
	default:
	empHrs = 0;
	
	empwage = empHrs * EMP_RATE_PER_HOUR;
	totalEmpwage += empwage;
	
	System.out.println( "Emp Wage: "+ empwage);
	System.out.println("Total Emp Wage: "+ totalEmpwage);
	}
	}
}
}