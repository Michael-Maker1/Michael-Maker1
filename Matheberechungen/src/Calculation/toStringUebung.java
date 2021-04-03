package Calculation;
import java.lang.StringBuilder;
import java.lang.String;
public class toStringUebung {
	    static String replaceAll( String string, String replaceMe, String replaceWith) {
			int startIndex = 0;
		StringBuilder erg = new StringBuilder();
		   for(; ;) {
	    	int pos = string.indexOf(replaceMe,startIndex);
	    	 
			if( pos == -1 ) {
				erg.append(string.substring(startIndex));
				break;
	    	}
			erg.append(string.substring(startIndex, pos));
			erg.append(replaceWith);
		  startIndex = replaceMe.length() + pos ;}
	    return erg.toString();}
	    public static void main(String[] args) {
		System.out.print(replaceAll("My name is Michael and i love Michael!","Michael", "Ekene"));
	

	}

}
