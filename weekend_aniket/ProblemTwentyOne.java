/**
 * 
 */
package weekendassignment;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

/**
 * 
 *
 */
class UserMainCodeTwentyOne{
	static String getDay(String date){
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM-dd-yyyy");
		return LocalDate.parse(date, formatter).getDayOfWeek().toString();
	}
}
public class ProblemTwentyOne {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String date = sc.next();
		System.out.println(UserMainCodeTwentyOne.getDay(date));

	}

}
