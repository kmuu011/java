package test18;

public class SortTest {
	
	public void upSort(int[] arr) {
		for(int i=0 ; i<arr.length ; i++) {
			for(int j=i+1 ; j<arr.length ; j++) {
				if(arr[i] < arr[j]) {
					int tmp = arr[i];
					arr[i] = arr[j];
					arr[j] = tmp;
				}
			}
		}
		
	}

	public static void main(String[] args) {
		SortTest st = new SortTest();
		int[] arr = new int[] {8,5,6,1,5,9};		
		
		st.upSort(arr);
		
		for(int i=0 ; i<arr.length ; i++) {
			System.out.println(arr[i]);
		}
		
		
	}
}
