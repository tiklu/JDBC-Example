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

class UserMainCodeThree{
	static int countNoOfWords(String firstString, String secondString){
		int result = 0;
		StringTokenizer strtok1 = new StringTokenizer(secondString), strtok2 = new StringTokenizer(firstString);
		String word = strtok1.nextToken();
		while(strtok2.hasMoreTokens()){
			if(word.equals(strtok2.nextToken()))
				result++;
		}
		return result;
	}
}
public class ProblemThree {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String firstString, secondString;
		Scanner sc = new Scanner(System.in);
		firstString = sc.nextLine();
		secondString = sc.nextLine();
		System.out.println(UserMainCodeThree.countNoOfWords(firstString, secondString));

	}

}
