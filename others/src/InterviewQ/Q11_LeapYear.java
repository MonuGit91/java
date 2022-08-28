package InterviewQ;

public class Q11_LeapYear {
	public static boolean leapYear(int year) {
		if(year % 100 == 0) {
			if(year % 400 == 0) {
				return true;
			}
		}
		else {
			if(year % 4 == 0) {
				return true;
			}
		}
		return false;
	}
	
	public static void main(String[] args) {
		for (int year = 0; year < 3000; year++) {
			if(leapYear(year)) {
				System.out.println(year);
			}
		}
		
	}
}
