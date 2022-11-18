
public class MergeSort {

	public static void main(String[] args) {
		
		
		
		int[] array = {4,5,2,6,1,8,7,10,11,3,14,0,9,12,13};
		
		System.out.println("Array before sorting");
		printArray(array);
		
		mergeSort(array);
		
		System.out.println("Array after sorting");
		printArray(array);

	}
	
	
	public static void mergeSort(int[] array) {
		
		int lengthArray = array.length;
		
		if(lengthArray<2) {
			return;
		}
		
		int mid = lengthArray/2;
		
		int[] leftArray = new int[mid];
		int[] rightArray = new int[lengthArray - mid];
		
		for(int i =0; i<mid; i++) {
			leftArray[i] = array[i];
		}
		
		for(int j = mid; j<lengthArray; j++) {
			rightArray[j-mid] = array[j];
		}
		
		mergeSort(leftArray);
		mergeSort(rightArray);
		
		merge(array, leftArray, rightArray);
		
	}
	
	
	public static void merge(int[] array, int[] leftArray, int[] rightArray) {
		
		int lengthLeftArray = leftArray.length;
		int lengthRightArray = rightArray.length;
		
		
		int i=0, j=0, k=0;
		
		while(i<lengthLeftArray && j<lengthRightArray) {
	
			
			if(leftArray[i]<rightArray[j]) {
				array[k] = leftArray[i];
				i++;
			}else {
				array[k] = rightArray[j];
				j++;
				
			}
			
			k++;
			
		}
		
		while(i<lengthLeftArray) {
			array[k] = leftArray[i];
			i++;
			k++;
		}
		
		while(j<lengthRightArray) {
			array[k] = rightArray[j];
			j++;
			k++;
		}
		
	
		
	}
	
	
	public static void printArray(int[] array) {
		
		for(int el:array) {
			System.out.print(el + " ");
		}
		
		System.out.println();
	}

}
