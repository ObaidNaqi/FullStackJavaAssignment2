
public class SelectionSort {

	public static void main(String[] args) {
		
		int[] array = {4,5,2,6,1,8,7,10};
		
		System.out.println("Array before sorting");
		printArray(array);
		
		selectionSort(array);
		
		System.out.println("Array after sorting");
		printArray(array);

	}
	
	
	public static void selectionSort(int[] array) {
		
		
		
		for(int i=0; i<array.length; i++) {
			
			int minValueIndex = i;
			
			for(int j = i+1; j<array.length; j++) {
				
				if(array[minValueIndex]>array[j])
					minValueIndex = j;
			}
			
			swap(array, i, minValueIndex);
			
		}
	}
	
	
	public static void swap(int[] array, int index1, int index2) {
		
		int temp = array[index1];
		array[index1] = array[index2];
		array[index2] = temp;
		
	}
	
	
	public static void printArray(int[] array) {
		
		for(int el:array) {
			System.out.print(el + " ");
		}
		
		System.out.println();
	}

}
