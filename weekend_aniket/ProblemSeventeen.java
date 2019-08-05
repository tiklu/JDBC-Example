/**
 * 
 */
package weekendassignment;

import java.util.Scanner;

/**
 *
 *
 */
class UserMainCodeSeventeen{
	private int distance(int num1, int num2){
		return num1 > num2? num1-num2: num2-num1;
	}
	static Integer findMaxDistance(int[] arr, int n){
		Integer idx = new Integer(0);
		int maxDist = 0;
		for(int i = 0; i < n-1; i++){
			int num1 = arr[i], num2 = arr[i+1];
			if(num1 > num2){
				if(num1-num2>maxDist){
					maxDist = num1-num2;
					idx = i;
				}
			}
			else{
				if(num2-num1> maxDist){
					maxDist = num2-num1;
					idx = i+1;
				}
			}
		}
		return idx;
	}
}
public class ProblemSeventeen {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n;
		n = sc.nextInt();
		int[] arr = new int[n];
		for(int i = 0; i < n; i++){
			arr[i] = sc.nextInt();
		}
		System.out.println(UserMainCodeSeventeen.findMaxDistance(arr, n));
	}

}
