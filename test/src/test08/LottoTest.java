package test08;

public class LottoTest {
	public static void main(String[] args) {
		int[] num = new int[6];
		
		
		
		for(int i=0 ; i<num.length ; i++) {
		num[i] = (int)(Math.random()*6);
		
			for(int j=0 ; j<i ; j++) {
				if(num[i] == num[j]) {
					i--;
				}
			}
		}
		
		for(int i=0 ; i<num.length ; i++) {
			System.out.println(num[i]+1);
		}
		
	}
}
