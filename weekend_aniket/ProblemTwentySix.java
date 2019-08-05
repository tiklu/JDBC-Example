/**
 * 
 */
package weekendassignment;

import java.util.Scanner;

/**
 * 
 *
 */
class Product{
	private long id;
	private String productName;
	private String supplierName;
	Product(){}
	Product(long id, String productName){
		this.id = id;
		this.productName = productName;
		this.supplierName = "Nivas";
	}
	Product(long id, String productName, String supplierName){
		this.id = id;
		this.productName = productName;
		this.supplierName = supplierName;
	}
	public void setId(long id){
		this.id = id;
	}
	public void setProductName(String productName){
		this.productName = productName;
	}
	public void setSupplierName(String supplierName){
		this.supplierName = supplierName;
	}
	public long getId(){
		return this.id;
	}
	public String getProductName(){
		return this.productName;
	}
	public String getSupplierName(){
		return this.supplierName;
	}
	void display(){
		System.out.println("Product id is " + this.id);
		System.out.println("Product name is " + this.productName);
		System.out.println("Supplier name is " + this.supplierName);
	}
}
public class ProblemTwentySix {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Product pr;
		long id = sc.nextLong();
		String productName = sc.next();
		String comp = sc.next();
		if(comp.equals("Yes") || comp.equals("yes")){
			pr = new Product(id, productName);
		}
		else{
			String supplierName = sc.next();
			pr = new Product(id, productName, supplierName);
		}
		pr.display();

	}

}
