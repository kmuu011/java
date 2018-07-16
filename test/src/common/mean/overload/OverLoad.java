package common.mean.overload;

public class OverLoad {
	
	public void powerOverLoad() {  
		System.out.println("");
	}
	public void powerOverLoad(int a) {  //powerOverLoad 메소드 명은 같으나 파라미터만을 바꾸어
		System.out.println(a);                //같은 이름의 메소드를 여러개 사용하는것이 오버로딩
	}
	public void powerOverLoad(String a) {
		System.out.println(a);
	}

}
