/**
 * 
 */
package weekendassignment;

import java.util.Scanner;

/**
 * 
 *
 */
class UserMainCodeEighteen{
	static int validatePAN(String pan){
		int len = pan.length();
		if(len != 8){
			return 2;
		}
		for(int i = 0; i < 3; i++){
			if(!Character.isLetter(pan.charAt(i)) || Character.isLowerCase(pan.charAt(i))){
				return 2;
			}
		}
		for(int i = 3; i < 7; i++){
			if(!Character.isDigit(pan.charAt(i))){
				return 2;
			}
		}
		if(!Character.isLetter(pan.charAt(7)) || Character.isLowerCase(pan.charAt(7))){
			return 2;
		}
		return 1;
	}
}
public class ProblemEighteen {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String pan = sc.nextLine();
		int res = UserMainCodeEighteen.validatePAN(pan);
		if(res == 1){
			System.out.println("Valid");
		}
		if(res == 2){
			System.out.println("Invalid");
		}
	}

}
