/**
 * 
 */
package weekendassignment;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.StringTokenizer;
import java.util.TreeMap;

/**
 * @author msirohi
 *
 */

class Employee1 {
	Integer id;
	String dob;
	Integer salary; 
	static TreeMap<Integer, Integer> calculateRevisedSalary(Map<Integer, String> hmDob, Map<Integer, Integer> hmSal) {
		TreeMap<Integer, Integer> tmSal = new TreeMap<Integer, Integer>();
		for(Integer s: hmDob.keySet()){
			StringTokenizer st = new StringTokenizer(hmDob.get(s), "-");
			int day = Integer.parseInt(st.nextToken());
			int month = Integer.parseInt(st.nextToken());
			int year = Integer.parseInt(st.nextToken());
			int age = month < 9 ? 2014 - year: 2014-year-1;
			if(hmSal.get(s) < 5000){
				tmSal.put(s, 100);
			}
			else if(age<25 || age > 60) tmSal.put(s, 200);
			else if (age >= 25 && age < 30)tmSal.put(s, (int) (hmSal.get(s)*1.2));
			else tmSal.put(s, (int) (hmSal.get(s)*1.3));
			
		}
		
		return tmSal;
		
	}
}

public class ProblemFifteen {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//store dob; sal
		Map<Integer, String> hmDob = new HashMap<Integer, String>();
		Map<Integer, Integer> hmSal = new HashMap<Integer, Integer>();
		Scanner sc = new Scanner(System.in);
		int numEmp, id, salary;
		String dob;
		numEmp =sc.nextInt();
		for(int i=0; i<numEmp; i++){
			id= sc.nextInt();
			dob = sc.next();
			salary= sc.nextInt();
			hmDob.put(id, dob);
			hmSal.put(id, salary);
		}
		TreeMap<Integer, Integer> tmSal = Employee1.calculateRevisedSalary(hmDob, hmSal);
		for(Integer i: tmSal.keySet()){
			System.out.println(i);
			System.out.println(tmSal.get(i));
		}
	}

}
