package Calculation;

public class averageOfNumbers {

	public static void main(String[] args) {
	    int[] messwerte= new int[100];
//	    messwerte[0] = 1;
//	    messwerte[1] = 2;
//	    messwerte[2] = 3;
//	    messwerte[3] = 4;
//	    messwerte[4] = 5;
	     
	   
	   for (int i=0;i< messwerte.length; i++)
	   {   messwerte[i]=i;
	  
	   }
     for (int m :  messwerte) {
    	 System.out.println(m);
    }
    int summe =0;
    for( int val:messwerte) {
    	summe += val;
    }
    int durschnitt= summe/messwerte.length;
	   System.out.print("Der Durchschnitt beträgt "+  durschnitt); 
    }

}
