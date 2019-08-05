/**
 * 
 */
package weekendassignment;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 *
 */

class UserMainCodeFour {
	static ArrayList<Integer> generateOddEvenList(ArrayList<Integer> arr1, ArrayList<Integer> arr2){
		int n = arr1.size();
		ArrayList<Integer> result = new ArrayList<Integer>();
		for(int i = 0; i < n; i++){
			if(i%2 == 0){
				//result.set(i, arr2.get(i));
				result.add(arr2.get(i));
			}
			else{
				//result.set(i, arr2.get(i));
				result.add(arr1.get(i));
			}
		}
		return result;
	}
}

public class ProblemFour {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		ArrayList<Integer> arr1 = new ArrayList<Integer>(), arr2 = new ArrayList<Integer>();
		for(int i = 0; i < n; i++){
			//arr1.set(i, sc.nextInt());
			arr1.add(sc.nextInt());
		}
		for(int i = 0; i < n; i++){
			//arr2.set(i, sc.nextInt());
			arr2.add(sc.nextInt());
		}
		ArrayList<Integer> arrfin = UserMainCodeFour.generateOddEvenList(arr1, arr2);
		for(Integer i: arrfin){
			System.out.println(i);
		}
		

	}

}
