package test12;

public class LoopTest {

	public static void main(String[] args) {
		int[] num = new int[10];
		int[] arr = new int[10];
		
		int j=0;
				
		for(int i=0 ; i<=num.length*3 ; i++) {
			if(i%3==0 && i!=0) {
				num[j] = i;
				j++;
				
			}
		}
		
		for(int i=0 ; i<num.length ; i++) {
			System.out.println(num[i]);
		}
		
		System.out.println("-----------------------------------------------------");
		
		for(int i=0 ; i<num.length ; i++) {
			arr[i] = (i+1)*3;
		}
		
		
		for(int i=0 ; i<num.length ; i++) {
			System.out.println(arr[i]);
		}
		
		
		
		
		
	}
}
