/**
 * 
 */
package weekendassignment;

import java.util.Arrays;
import java.util.Scanner;

/**
 * 
 */
class UserMainCodeSix{
	static String getAnagram(String firstString, String secondString){
		char[] arr1 = firstString.toCharArray(), arr2 = secondString.toCharArray();
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		String first = new String(arr1), second = new String(arr2);
		return first.equals(second) ? "Anagrams" : "Not Anagrams";
	}
}

public class ProblemSix {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String firstString, secondString;
		firstString = sc.nextLine();
		secondString = sc.nextLine();
		System.out.println(UserMainCodeSix.getAnagram(firstString, secondString));
	}

}
