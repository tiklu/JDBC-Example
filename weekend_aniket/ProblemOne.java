/**
 * 
 */
package weekendassignment;
import java.lang.Character;
import java.util.Scanner;
/**
 * 
 *
 */

class UserMainCode{
	static String replacePlus(String firstString, String secondString){
		int len1 = firstString.length(), len2 = secondString.length();
		String result = "" ;
		for(int i = 0; i<len1; i++){
			boolean isPresent = false;
			for(int j = 0; j < len2; j++){
				if(Character.toLowerCase(firstString.charAt(i)) == Character.toLowerCase(secondString.charAt(j))){
					isPresent = true;
				}
			}
			if(isPresent == false){
				result += "+";
			}
			else{
				result += firstString.charAt(i);
			}
		}
		return result;
	}
}
public class ProblemOne {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Give first string");
		String firstString = sc.nextLine();
		System.out.println("Give second string");
		String secondString = sc.nextLine();
		UserMainCode obj = new UserMainCode();
		System.out.println(UserMainCode.replacePlus(firstString, secondString));
	}

}
