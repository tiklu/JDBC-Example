/**
 * 
 */
package weekendassignment;

import java.util.Scanner;
import java.util.StringTokenizer;

/**
 * 
 *
 */
class UserMainCodeTwentyFive{
	static String getAge(String dob){
		StringTokenizer st = new StringTokenizer(dob, "/");
		int date = Integer.parseInt(st.nextToken());
		int month = Integer.parseInt(st.nextToken());
		int year = Integer.parseInt(st.nextToken());
		if(2015-year > 18){
			return "eligible";
		}
		else if (2015 - year == 18){
			if(month == 1 && date == 1){
				return "eligible";
			}
		}
		return "ineligible";
	}
}
public class ProblemTwentyFive {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String dob = sc.nextLine();
		System.out.println(UserMainCodeTwentyFive.getAge(dob));
	}

}
