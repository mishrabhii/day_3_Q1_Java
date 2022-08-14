package EmpPresentOrAbsent;

public class EmpPresent {
public static void main(String[] args) {
	int full_Time = 1;
double EmpCheck = Math.floor(Math.random()*10)%2;
if (EmpCheck == full_Time)
			System.out.println("Employee is Present");
else
	System.out.println("Employee is absent");
	
}

}
