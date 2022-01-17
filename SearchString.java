
public class SearchString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] strArray = { "AAAA", "BBBB", "CCCC", "DDDD", "EEEE" };
        boolean found = false;
        int index = 0;
       String s = "AAAA";
       for (int i = 0; i <strArray.length; i++) {
       if(s.equals(strArray[i])) {
            index = i; 
            found = true; 
            break;
    	             
        }
       }
	
       if(found)
          System.out.println(s+" found at the index "+index);
        else
          System.out.println(s +" not found in the array");
		
	}

}
