
public class QuickSort {

	public static void main(String[] args) {
		
		
		int[] array = {4,5,2,6,1,8,7,10,11,3,14,0,9,12,13};
		
	    System.out.println("Before Sorting");
	    
	    for(int el:array)
	    {
	    	System.out.print(el + " ");
	    }
		
		quickSort(array, 0, array.length-1);
		
		System.out.println();
		System.out.println("After Sorting");
		
		for(int el:array)
		{
			System.out.print(el + " ");
		}
		
		
	}
	
     private static void quickSort(int[] array , int low, int high) {
    	 
    	if(low>=high)
    	{
    		return;
    	}
		
		int pivot = array[high];
		
		int leftPointer = 0;
		int rightPointer = high-1;
		
		while(leftPointer<rightPointer)
		{
			while(array[leftPointer] <= pivot && leftPointer <  rightPointer)
			{
				leftPointer++;
			}
		
			while(array[rightPointer]>= pivot && leftPointer < rightPointer)
			{
				rightPointer--;
			}
		    
			swap(array , leftPointer, rightPointer);
		}
		
		if(array[leftPointer] > array[high]){
			
		      swap(array, leftPointer, high);
		}
		else {
		      leftPointer = high;
		    }
		//swap(array, leftPointer, high);	
		
		quickSort(array, low, leftPointer-1);
		quickSort(array, leftPointer+1, high);
	}
     
     
     private static void swap(int[] array, int index1, int index2)
     {
    	 int temp = array[index1];
    	 array[index1] = array[index2];
    	 array[index2] = temp;
     }

}
