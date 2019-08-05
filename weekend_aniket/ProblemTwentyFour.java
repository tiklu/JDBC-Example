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
class UserMainCodeTwentyFour{
	static int getLastDayOfMonth(String date){
		StringTokenizer st = new StringTokenizer(date, "-");
		int day = Integer.parseInt(st.nextToken());
		int month = Integer.parseInt(st.nextToken());
		int year = Integer.parseInt(st.nextToken());
		if(month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12){
			return 31;
		}
		else if (month == 2){
			return year%4 == 0? 29 : 28;
		}
		else{
			return 30;
		}
	}
}
public class ProblemTwentyFour {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String date = sc.nextLine();
		System.out.println(UserMainCodeTwentyFour.getLastDayOfMonth(date));
		
	}

}
