package java_program_answers;

public class MixedArrayExample {

		    public static void main(String[] args) {
		        // Creating an array of Object to hold different data types
		        Object[] mixedArray = new Object[5];

		        // Assigning different types of values to the array
		        mixedArray[0] = 10;                // Integer
		        mixedArray[1] = 'A';               // Character
		        mixedArray[2] = "Hello";           // String
		        mixedArray[3] = 3.14;              // Double
		        mixedArray[4] = true;              // Boolean

		        // Accessing and printing the values in the array
		        for (int i = 0; i < mixedArray.length; i++) {
		            System.out.println("Element at index " + i + ": " + mixedArray[i]);
		        }
		    }
		


	}


