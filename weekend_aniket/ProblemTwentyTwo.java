/**
 * 
 */
package weekendassignment;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

/**
 * 
 *
 */
class UserMainCodeTwentyTwo{
	static ArrayList<String> getName(HashMap<Integer, String> map){
		ArrayList<String> result = new ArrayList<>();
		for(String s: map.values()){
			int len = s.length();
			if(Character.isLowerCase(s.charAt(0)) && Character.isUpperCase(s.charAt(len-1))){
				for(int i = 1; i < len-1; i++){
					if(Character.isDigit(s.charAt(i))){
						result.add(s);
						break;
					}
				}
			}
			
		}
		return result;
	}
}

public class ProblemTwentyTwo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		HashMap<Integer, String> map = new HashMap<>();
		for(int i = 0; i < n; i++){
			int key = sc.nextInt();
			String value = sc.next();
			map.put(key, value);
		}
		ArrayList<String> res = UserMainCodeTwentyTwo.getName(map);
		for(String s: res){
			System.out.println(s);
		}
	}

}
