/**
 * 
 */
package weekendassignment;

import java.util.Scanner;

/**
 * 
 *
 */
class UserMainCodeThirteen{
	static String swapPairs(String word){
		int n = word.length();
		String result = ""; 
		for(int i = 0; i < n/2; i++){
			result = result + word.charAt(2*i+1);
			result = result + word.charAt(2*i);
		}
		if(n%2 == 1){
			result += word.charAt(n-1);
		}
		return result;
	}
}
public class ProblemThirteen {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String word = sc.nextLine();
		System.out.println(UserMainCodeThirteen.swapPairs(word));

	}

}
