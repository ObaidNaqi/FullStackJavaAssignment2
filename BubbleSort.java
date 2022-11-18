public class BubbleSort {

	public static void main(String[] args) {
		
		
		int[] array = {1,9,3,9,5,4,7};
		
	    System.out.println("Before Sorting");
	    
	    for(int el:array)
	    {
	    	System.out.print(el + " ");
	    }
		
		bubbleSort(array);
		
		System.out.println();
		System.out.println("After Sorting");
		
		for(int el:array)
		{
			System.out.print(el + " ");
		}
		
		
	}
	
     private static void bubbleSort(int[] array) {
    	 
    	 
    	 for(int i=0; i<array.length; i++) {
    		 for(int j=0; j<array.length-i-1; j++) {
    			 
    			 if(array[j]>array[j+1]) {
    				 
    				 int temp = array[j+1];
    				 array[j+1] = array[j];
    				 array[j] = temp;
    						
    			 }
    		 }
    	 }

	}
     
     
}
