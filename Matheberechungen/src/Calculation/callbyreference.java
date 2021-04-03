package Calculation;

public class callbyreference {
   
	

	public static void main(String[] args) {
		
		
		IntWrapper a = new IntWrapper(30);
		IntWrapper b = new IntWrapper(45);
      System.out.println("a before swapping"+ a.a + "and b before swapping"+ " = "+ b.a);
      Statfunction(a,b);
      System.out.println("a after swapping"+ a.a +"and b after swapping"+ "="+b.a);
		
		
	}
		
		static void Statfunction(IntWrapper a, IntWrapper b) {
			System.out.println("a before(inside) "+ a.a +"and b before swapping"+ " = "+ b.a);
			IntWrapper c = new IntWrapper(a.a);
	        a.a= b.a;
			b.a =c.a;
			System.out.println("a after(inside) "+ a.a +"and b after swapping"+ " = "+ b.a);
		}
		}
		class IntWrapper{
			public int a;
		public IntWrapper(int a ) {   this.a =a;}
		
	}


