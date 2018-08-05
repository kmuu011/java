package test28;

public class t {
	public static void main(String[] args) {
		int ranNum = 100;
		int cnt = 0;
		
		for(int i=1;i<=ranNum;i++) {
			int m = i/10;
			int n = i%10;
			
			if(m!=0 && m%3==0) {
				cnt++;
				System.out.print("짝");
			}
			
			if(n!=0 &&n%3==0) {
				cnt++;
				System.out.print("짝");
			}
			
			System.out.println(i);
		}
		System.out.println("짝 갯수 " + cnt);
	}

}
