package javapractice;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExpressions {

	public static void main(String[] args) {
 
		String str = "Kalluri@Veeru9000#9211";
		
		Pattern p = Pattern.compile("[^a-z A-Z 0-9]");
		Pattern p1 = Pattern.compile("[0-9]");
		
		Matcher m = p.matcher(str);
		Matcher m1 = p1.matcher(str);
		

		
		
	while (m1.find()) {
		System.out.print(m1.group());
		}
		
		
//		String str = "Kalluri@Veeru9000#9211";
//		Pattern p = Pattern.compile("[A-Z]");
//		Matcher m = p.matcher(str);
//		while (m.find()) {
//			System.out.println(m.group());
//		}
//		
		
	}

}
