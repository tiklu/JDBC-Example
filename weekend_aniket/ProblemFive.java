/**
 * 
 */
package weekendassignment;

import java.util.HashMap;
import java.util.Scanner;

/**
 * 
 *
 */
class UserMainCodeFive{
	static int getAverageOfOdd(HashMap<Integer, Integer> hash){
		int result = 0, numberOddEle = 0;
		for(Integer i: hash.keySet()){
			System.out.println(i);
			if(i%2 == 1){
				numberOddEle++;
				result += hash.get(i);
			}
		}
		return numberOddEle == 0? 0 : result/numberOddEle;
	}
}
public class ProblemFive {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		HashMap<Integer, Integer> hash = new HashMap<>();
		int n;
		n = sc.nextInt();
		for(int i = 0; i < n; i++){
			int key = sc.nextInt();
			int value = sc.nextInt();
			hash.put(key, value);
		}
		System.out.println(UserMainCodeFive.getAverageOfOdd(hash));
	}

}
