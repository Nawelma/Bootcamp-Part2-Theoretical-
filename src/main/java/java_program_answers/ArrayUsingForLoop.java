package java_program_answers;

public class ArrayUsingForLoop {
	public static void main(String[] args) {
	
	int[][] a = {{5, 2, 9},
			          {4, 6, 8}};

	for(int i = 0; i < a.length; i++) {
	    for (int j = 0; j < a[i].length; j++) {
	        System.out.print(a[i][j] + " ");
	    
	  
	    }  
	}
	}
}