package EmpWageSwitch;

public class EmpWageSwitch
{
	
	public static final int IS_PART_TIME = 1;
	public static final int IS_FULL_TIME = 2;
	public static final int EMP_RATE_PER_HOUR = 20;
	
	
	
	public static void main(String[] args) {
		
	
	  int empCheck ;
	  int empWagePart ;
	  int empWageFull;
	  int empHrsPart;
	  int empHrsFull;
		
		
		empCheck = (int) Math.floor(Math.random()*10) % 3;
		switch (empCheck) {
		case IS_PART_TIME :
		empHrsPart = 4;
		empWagePart = (empHrsPart*EMP_RATE_PER_HOUR);
		System.out.println("Part Time EmpWage: " + empWagePart);
		break;
		
		
		case IS_FULL_TIME :
		empHrsFull = 8;
		empWageFull = (empHrsFull*EMP_RATE_PER_HOUR);
		System.out.println("Full Time EmpWage: " + empWageFull);
		break;
	
		
	}
	}
}