/**
 * 
 */
package weekendassignment;

import java.util.Scanner;

/**
 * 
 *
 */
class UserMainCodeFourteen{
	static boolean validatePassword(String password){
		int len = password.length();
		if(len < 8)
			return false;
		boolean number = false, specialChar = false, alphabet = false;
		for(int i = 0; i < len; i++){
			boolean isNum = Character.isDigit(password.charAt(i)), isAlph = Character.isLetter(password.charAt(i));
			if(!number && isNum){
				number = true;
			}
			if(!alphabet && isAlph){
				alphabet = true;
			}
			if(!isAlph && !isNum){
				specialChar = true;
			}
		}
		return number && alphabet && specialChar;
		
	}
}
public class ProblemFourteen {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String password = sc.nextLine();
		boolean validity = UserMainCodeFourteen.validatePassword(password);
		if(validity){
			System.out.println("Valid");
		}
		else{
			System.out.println("Invalid");
		}
		
		
	}

}
