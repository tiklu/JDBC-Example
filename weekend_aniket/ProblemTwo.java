/**
 * 
 */
package weekendassignment;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 *
 *
 */
class UserMainCodeTwo {
	static int addUniqueEven(int[] arr) {
		Set set = new HashSet();
		int sum = 0;
		for (int x : arr) {
			if (!set.contains(x) && x % 2 == 0) {
				sum += x;
				set.add(x);
			}
		}
		return sum == 0 ? -1 : sum;
	}
}

public class ProblemTwo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		int arr[] = new int[n];
		for(int i = 0; i < n; i++){
			arr[i] = sc.nextInt();
		}
		System.out.println(UserMainCodeTwo.addUniqueEven(arr));

	}

}