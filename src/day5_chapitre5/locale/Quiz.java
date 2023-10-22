package day5_chapitre5.locale;

import java.util.Locale;
import java.util.ResourceBundle;

public class Quiz {

	public static void main(String[] args) {
		
		Locale locale = new Locale("fr","FR");
		//Locale.setDefault(locale);
		
		System.out.println(Locale.getDefault()); 
		
		ResourceBundle rb = ResourceBundle.getBundle("Zoo", locale);
		 System.out.println(rb.getString("hello"));

	}

}
