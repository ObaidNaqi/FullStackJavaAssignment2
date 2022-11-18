
public class DupplicatesFind {
	
	public static void main(String[] args)
	{
		int[] arr = {2,2,6,7,6,4,8,3};
		
		boolean flag = false;
		
		for(int i=0; i<arr.length; i++) {
			for(int j=i+1; j<arr.length; j++) {
				
				if(arr[i]==arr[j]) {
					
					flag = true;
					break;
				}
			}
			
			if(flag == true) {
				
				System.out.println(arr[i] + " is duplicate number");
				flag = false;
			}
		}
	}

}
