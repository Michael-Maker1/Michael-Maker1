package Calculation;
import java.util.Scanner;
public class Dreiecksberechnung{
	public void pythagoras(){
		   Scanner eingabe = new Scanner (System.in);
		   System.out.print ("Geben Sie die Länge der ersten Seite ein: ");
		   int a = eingabe.nextInt();
		   System.out.print ("Geben Sie die Länge der zweiten Seite ein: ");
		   int b = eingabe.nextInt();
		   if(a<0|| b<0) {System.out.println("Negative Eingabe nicht möglich! ");}
		  
		   else {System.out.println("Die Länge der dritten Seite beträgt "+Math.sqrt(Math.pow(a,2)+Math.pow(b,2)));}
		   double c = Math.sqrt(Math.pow(a,2)+Math.pow(b,2));
		System.out.print("Ihr Ergebnis lautet "+ " "+ c);
	}
	public static void main(String[] args) {
		Dreiecksberechnung result = new Dreiecksberechnung();
		result.pythagoras();
		
	}
		
	}