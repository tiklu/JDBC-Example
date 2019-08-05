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
class UserMainCodeSixteen{
	private static String formattedDate(String date){
		StringTokenizer strtok = new StringTokenizer(date, "-");
		String day = strtok.nextToken();
		String month = strtok.nextToken();
		String year = strtok.nextToken();
		return month+"/"+day+"/"+year;
	}
	static String findOldDate(String date1, String date2){
		String date = "";
		int old = 1;
		StringTokenizer strtok1 = new StringTokenizer(date1, "-"), strtok2 = new StringTokenizer(date2, "-");
		int day1 = Integer.parseInt(strtok1.nextToken()), day2 = Integer.parseInt(strtok2.nextToken());
		int month1 = Integer.parseInt(strtok1.nextToken()), month2 = Integer.parseInt(strtok2.nextToken());
		int year1 = Integer.parseInt(strtok1.nextToken()), year2 = Integer.parseInt(strtok2.nextToken());
		if(year1 > year2){
			old = 2;
		}
		else if (year1 == year2){
			if(month1 > month2){
				old = 2;
			}
			else if(month1 == month2){
				if(day1 > day2){
					old = 2;
				}
				else if(day1 == day2){
					old = 0;
				}
			}
		}
		if(old == 0 || old == 1){
			return formattedDate(date1);
		}
		else{
			return formattedDate(date2);
		}
	}
}
public class ProblemSixteen {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String date1, date2;
		date1 = sc.nextLine();
		date2 = sc.nextLine();
		System.out.println(UserMainCodeSixteen.findOldDate(date1, date2));

	}

}
