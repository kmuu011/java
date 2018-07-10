package test01;

public class RanTest {
	public static void main(String[] args) {
		int[] arrNum = new int[6];
		
		for (int i=0 ; i<arrNum.length ; i++) {
			double d = Math.random();
			arrNum[i] = (int)(d *6) + 1;
			
			for(int j=0 ; j<i ; j++) {
				if(arrNum[j] == arrNum[i]) {
					i--;
				}
			}		
		}
		
		for(int i=0 ; i<arrNum.length ; i++) {
			System.out.println(arrNum[i]);
		}
		
		
	}
}
