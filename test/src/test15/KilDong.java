package test15;

public class KilDong extends Person {
	
	public void checkMyLuckyNum(int luckyNum) {
		
		System.out.println("내 행운의 번호는 : " + luckyNum);
		
		if(this.luckyNum == luckyNum) {
			System.out.println("오예~ 운수 좋은날");
			
		}
	}

}
