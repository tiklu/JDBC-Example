/**
 * 
 */
package weekendassignment;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 * 
 *
 */

class UserMainCodeTen{
	static ArrayList<Integer> performSetOperations(ArrayList<Integer> list1, ArrayList<Integer> list2, String operator){
		ArrayList<Integer> result = new ArrayList<Integer>();
		Set<Integer> set = new HashSet<>();
		if(operator.equals("+")){
			for(int i = 0; i < list1.size(); i++){
				set.add(list1.get(i));
			}
			for(int i = 0; i < list2.size(); i++){
				set.add(list2.get(i));
			}
			for(Integer i: set){
				result.add(i);
			}
			return result;
		}
		else if(operator.equals("-")){
			for(int i = 0; i < list2.size(); i++){
				set.add(list2.get(i));
			}
			for(int i = 0; i < list1.size(); i++){
				if(!set.contains(list1.get(i))){
					result.add(list1.get(i));
				}
			}
			return result;
		}
		else if(operator.equals("*")){
			for(int i = 0; i < list1.size(); i++){
				set.add(list1.get(i));
			}
			for(int i = 0; i < list2.size(); i++){
				if(set.contains(list2.get(i))){
					result.add(list2.get(i));
				}
			}
			return result;
			
		}
		return result;

		
	}
}
public class ProblemTen {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> list1= new ArrayList<>(), list2 = new ArrayList<>();
		String operator;
		int n;
		n = sc.nextInt();
		for(int i = 0; i < n; i++){
			list1.add(sc.nextInt());
		}
		for(int i = 0; i < n; i++){
			list2.add(sc.nextInt());
		}
		operator = sc.next();
		ArrayList<Integer> result = UserMainCodeTen.performSetOperations(list1, list2, operator);
		for(Integer i: result){
			System.out.println(i);
		}
		
	}

}
