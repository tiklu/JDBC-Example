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
class UserMainCodeNineteen{
	static String getLastLetter(String sentence){
		String result = "";
		StringTokenizer sc = new StringTokenizer(sentence);
		while(sc.hasMoreTokens()){
			String word = sc.nextToken();
			result += Character.toUpperCase(word.charAt(word.length()-1));
			if(sc.hasMoreTokens()){
				result += "$";
			}
		}
		return result;
	}
}
public class ProblemNineteen {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String sentence = sc.nextLine();
		System.out.println(UserMainCodeNineteen.getLastLetter(sentence));

	}

}
