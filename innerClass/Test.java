package innerClass;


public class Test {
	
	private String str="Welcome to"; 
	 
	 class Inner{  
	  void hello()
	  {
		  System.out.println(str+", Shimogga");
	  }  
	 }  

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test obj=new Test();
		Test.Inner in=obj.new Inner();  
		in.hello();  

	}

}
