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

class Box{
	double width, height, length;
	Box(double length, double width, double height){
		this.length = length;
		this.height = height;
		this.width = width;
	}
	public double Volume(){
		return width*height*length;
	}
	@Override
	public boolean equals(Object other){
		Box otherBox = (Box) other;
		if(this.Volume() == otherBox.Volume()){
			return true;
		}
		return false;
	}
	@Override
	public int hashCode(){
		int hash = 5;
		hash = 24*hash + (int)this.Volume()*1000000;
		return hash;
	}
}
public class ProblemThirty {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int numBoxes = sc.nextInt();
		Set<Box> set = new HashSet<Box>();
		for(int i = 0; i < numBoxes; i++){
			double length = sc.nextDouble();
			double width = sc.nextDouble();
			double height = sc.nextDouble();
			Box box = new Box(length, width, height);
			
			set.add(box);
		}
		
		System.out.println("Unique Boxes in the Set are");
		for(Box b: set){
			System.out.println("Length = "+b.length+", Width = "+b.width+", Height = "+b.height);
		}
	}

}
