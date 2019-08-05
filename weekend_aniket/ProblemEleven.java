/**
 * 
 */
package weekendassignment;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;

class UserMainCodeEleven{
	static String highestScorer(ArrayList<String> input){
		String topName = "";
		int n = input.size();
		int highestMarks = 0;
		for(int i = 0; i < n; i++){
			StringTokenizer st = new StringTokenizer(input.get(i), "-");
			String name = st.nextToken();
			int marks = Integer.parseInt(st.nextToken())+Integer.parseInt(st.nextToken()) + Integer.parseInt(st.nextToken());
			if(marks > highestMarks){
				highestMarks = marks;
				topName = name;
			}
		}
		return topName;
	}
}
/**
 *
 *
 */
public class ProblemEleven {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n;
		n = sc.nextInt();
		ArrayList<String> input = new ArrayList<>();
		for(int i = 0; i < n; i++){
			input.add(sc.next());
		}
		System.out.println(UserMainCodeEleven.highestScorer(input));

	}

}
