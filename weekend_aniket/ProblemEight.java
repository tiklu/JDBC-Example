/**
 * 
 */
package weekendassignment;

import java.util.Scanner;

/**
 * 
 *
 */
class UserMainCodeEigth{
	static int getKaprekarNumber(int number){
		int sqNum = number*number;
		int len = Integer.toString(sqNum).length();
		int leftHalf, rightHalf;
		if(len%2 == 1){
			leftHalf = sqNum/(int)(Math.pow(10, len/2)) ;
			rightHalf = sqNum%(int)(Math.pow(10, len/2+1));
		}
		else{
			leftHalf = sqNum/(int)(Math.pow(10, len/2)) ;
			rightHalf = sqNum%(int)(Math.pow(10, len/2));
		}
		return leftHalf+rightHalf == number ? 1 : -1;
	}
}
public class ProblemEight {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int result = UserMainCodeEigth.getKaprekarNumber(num);
		if(result == 1){
			System.out.println("Kaprekar number");
		}
		else{
			System.out.println("Not a Kaprekar number");
		}
	}

}
