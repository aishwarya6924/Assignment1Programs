import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExpression {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Pattern pattern = Pattern.compile("Hi", Pattern.CASE_INSENSITIVE);
		 
	       
        Matcher m = pattern.matcher("Hi How are hi you");
 
        
        while (m.find())
 
            
            System.out.println("Pattern found from " + m.start() + " to " + (m.end() - 1));
		
	}

}
