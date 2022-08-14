package DailyEmployeeWage;

public class DailyEmployeeWage {
	public static void main(String[] args) {
		int full_Time = 1;
		double WagePerHour = 20;
		double FullDayHours = 8;
		double DailyEmployeeWage = WagePerHour*FullDayHours;
		double EmpCheck = Math.floor(Math.random()*10)%2;
		if (EmpCheck == full_Time)
					System.out.println(" Employee is Present and Daily Employee Wage = " +DailyEmployeeWage);
		else
			System.out.println("Employee is absent");
	}

}
