
public class ArrayConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {10,20,30,40,50};
		for(int i=0;i<5;i++) {
		System.out.println("Elements of array a: "+a[i]);
		}


		//multidimensional array
		int[][] b = {
		            {2, 4, 6, 8}, 
		            {3, 6, 9} };
		for( int i=0;i<2;i++)
			for(int j=0;j<3;j++)
				
				System.out.println("b["+i+"]["+j+"] = "+b[i][j]);
		      
		      System.out.println("\nLength of row 1: " + b[0].length);

	}

}
