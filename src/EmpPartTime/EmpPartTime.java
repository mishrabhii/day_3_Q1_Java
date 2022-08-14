package EmpPartTime;

public class EmpPartTime {
	public static void main(String[] args) {
		int full_Time = 1;
		double WagePerHour = 20;
		double FullTimeHours = 12;
		double PartTimeHours = 8;
		double EmpCheck = Math.floor(Math.random()*10)%2;
		double DailyEmployeeWage = WagePerHour*FullTimeHours;
		double PartTimeWork = PartTimeHours*WagePerHour;
		if (EmpCheck == full_Time)
					System.out.println("Daily Employee Wage = " +DailyEmployeeWage);
		else
			System.out.println("Employee Worked Part Time and Wage is = " +PartTimeWork);
	}

}

	

