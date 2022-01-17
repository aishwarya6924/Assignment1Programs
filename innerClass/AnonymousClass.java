package innerClass;

abstract class AnoonymousInnerClass {
	   public abstract void display();
	}


public class AnonymousClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		AnoonymousInnerClass i = new AnoonymousInnerClass() {

	         public void display() {
	            System.out.println("Anonymous Inner Class");
	         }
	      };
	      i.display();

	}

}
