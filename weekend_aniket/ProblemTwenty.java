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
class UserMainCodeTwenty{
	static String getMaxKeyValue(HashMap<Integer, String> map){
		int max = -100000;
		for(Integer key: map.keySet()){
			if(key > max)
				max = key;
		}
		return map.get(max);
	}
}

public class ProblemTwenty {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		HashMap<Integer, String> map = new HashMap<>();
		int n = sc.nextInt();
		for(int i = 0; i < n; i++){
			int key = sc.nextInt();
			String value = sc.next();
			map.put(key, value);
		}
		System.out.println(UserMainCodeTwenty.getMaxKeyValue(map));
	}

}
