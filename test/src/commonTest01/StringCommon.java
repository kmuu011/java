package commonTest01;

public class StringCommon {
	
	void replace() {
		String s = "aabbccddee";
		
		s = s.replace("a", "기모");
		// 문자열의 a를 전부 기모 라고 바꿈
		
		System.out.println(s);
	}
	
	void length() {
		String s = "12345";
		
		int i = s.length();
		//문자열 s의 길이를 캐치
		
		System.out.println(i);
	}

	void indexOf() {
		String s = "12345";
		
		int i = s.indexOf("3"); 
		//s 문자열중 3이라는 글자가 있는 위치의 값을 캐치
		
		System.out.println(i);
	}
	
	
	public static void main(String[] args) {
		StringCommon sc = new StringCommon();
		
		sc.replace();
		sc.length();
		sc.indexOf();
		
		
		
	}

}
