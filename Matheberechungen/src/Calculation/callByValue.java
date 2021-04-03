package Calculation;

public class callByValue {
	
	
	public static void main(String[] args) {
		int a = 30;
		int b = 45;


		System.out.println("a before swapping"+ " = "+ a+"."  + " and b before swapping"+ " = "+ b+"." );	
		Swapfunction(a,b);
		System.out.println("a after swapping"+ " = "+ a +"." + " and b after swapping"+ " = "+ b+"." );	
	
		}
	
	
	
	
	static void Swapfunction(int a, int b) {
		
		System.out.println("a before(inside) swapping"+ " = "+ a+"." + " and b before swapping"+ " = "+ b+"." );	
		int c = a;
		a = b;
		b =c;
		
		System.out.println("a after(inside) swapping"+ " = "+ a +"." + " and b after(inside) swapping" + " = "+ b+"." );
	}

	
}
