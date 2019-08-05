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
class UserMainCodeNine{
	
	static private int numVowels(String word){
		int numVows = 0;
		int len = word.length();
		for(int i = 0; i < len; i++){
			char ch = word.charAt(i);
			if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
				numVows++;
			}
		}
		return numVows;
	}
	static String storeMaxVowelWord(String sentence){
		StringTokenizer strtok = new StringTokenizer(sentence);
		int maxVows = 0;
		String result = "";
		while(strtok.hasMoreTokens()){
			String word = strtok.nextToken();
			int numVows = numVowels(word);
			if(numVows > maxVows){
				result = word;
				maxVows = numVows;
			}
		}
		return result;
	}
}

public class ProblemNine {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String sentence = sc.nextLine();
		System.out.println(UserMainCodeNine.storeMaxVowelWord(sentence));
	}

}
