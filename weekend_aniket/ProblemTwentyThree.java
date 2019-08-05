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
class UserMainCodeTwentyThree{
	static String convertDateFormat(String date){
		String newDate = "";
		StringTokenizer st = new StringTokenizer(date, "/");
		String day = st.nextToken(), month = st.nextToken(), year = st.nextToken();
		newDate = day+"-"+month+"-" + year.charAt(2) + year.charAt(3);
		return newDate;
	}
}
public class ProblemTwentyThree {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String date = sc.nextLine();
		System.out.println(UserMainCodeTwentyThree.convertDateFormat(date));

	}

}
