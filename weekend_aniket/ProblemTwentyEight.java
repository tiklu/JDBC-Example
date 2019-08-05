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
class Employee{
	String firstName;
	String lastName;
	long mobile;
	String email;
	String addr;
	
	Employee(String first, String last, long mob, String email, String addr){
		this.firstName = first;
		this.lastName=last;
		this.mobile= mob;
		this.email= email;
		this.addr = addr;
	}
}

public class ProblemTwentyEight {

	/**
	 * @param args
	 */
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the number of employees");
		Scanner sc= new Scanner(System.in);
		int n=sc.nextInt();
		ArrayList<Employee> employees= new ArrayList<Employee>();
		for(int i=0; i< n; i++) {
			System.out.println("Enter Employee " + i + " Details:");
			employees.add(new Employee(sc.next(), sc.next(), sc.nextLong(), sc.next(), sc.next()));
		}
		
	}

}
