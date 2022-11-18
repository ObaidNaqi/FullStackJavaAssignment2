
public class SubSetOfArray {

	public static void main(String[] args) {
		
		int[] firstArray = {2,13,0};
		int[] secondArray = {2,10,5,19,22,7,8,13,16,15};
		int found = 0;
		
		for(int i = 0; i<secondArray.length; i++) {
			for(int j=0; j<firstArray.length; j++) {
				
				if(secondArray[i]==firstArray[j])
					found++;
			}
		}
		
		if(found==secondArray.length)
			System.out.println("Second array is a subset of first array");
		else if(found == firstArray.length)
			System.out.println("First array is a subset of second array");
		else
			System.out.println("Not a subset");
	}

}
