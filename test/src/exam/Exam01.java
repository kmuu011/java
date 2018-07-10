package exam;

public class Exam01 {
	public static void main(String[] args) {
		int[] t = new int[10];
		int j=0;
		
		for(int i=0 ; i<=t.length*3 ; i++) {
			if(i%3==0 && i!=0) {
			t[j] =i;
			j++;
			}
			
		}
		
		for(int i=0 ; i <t.length ; i++) {
			System.out.println(t[i]);
		}
		
	}
}
