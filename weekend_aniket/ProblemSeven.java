/**
 * 
 */
package weekendassignment;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;
import java.util.StringTokenizer;

/**
 * 
 *
 */
class UserMainCodeSeven{
	private static boolean isElligible(String dob){
		StringTokenizer strtok = new StringTokenizer(dob, "/");
		String date = strtok.nextToken();
		String month = strtok.nextToken();
		String year = strtok.nextToken();
		int numdate = Integer.parseInt(date);
		int nummonth = Integer.parseInt(month);
		int numyear = Integer.parseInt(year);
		if(2014 - numyear > 60)
			return true;
		else if(2014 - numyear == 60){
			if(nummonth == 1 && numdate ==1)
				return true;
		}
		return false;
	}
	
	static ArrayList<String> retirementEmployeeList(HashMap<String, String> employeeMap){
		ArrayList<String> retirementList = new ArrayList<String>();
		for(String empId: employeeMap.keySet()){
			//System.out.println(empId);
			if(isElligible(employeeMap.get(empId))){
				retirementList.add(empId);
			}
		}
		String[] rList = new String[retirementList.size()];//(String[])retirementList.toArray();
		for(int i = 0; i < retirementList.size(); i++){
			rList[i] = retirementList.get(i);
		}
		Arrays.sort(rList);
		ArrayList<String> result = new ArrayList<String>(Arrays.asList(rList));
		return result;
	}
}
public class ProblemSeven {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String, String> employeeMap = new HashMap<>();
		Scanner sc = new Scanner(System.in);
		int n;
		n = sc.nextInt();
		String [][] arr = new String[n][2];
		for(int i = 0; i < n; i++){
			arr[i][0] = sc.next();
			arr[i][1] = sc.next();
		}
		for(int i = 0; i < n; i++){
			//System.out.println(arr[i][0]);
			//System.out.println(arr[i][1]);
			employeeMap.put(arr[i][0], arr[i][1]);
		}
		
		ArrayList<String> result = UserMainCodeSeven.retirementEmployeeList(employeeMap);
		for(String s: result)
			System.out.println(s);
		

	}

}
