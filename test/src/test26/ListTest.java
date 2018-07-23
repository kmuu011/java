package test26;

public class ListTest {
	private String[] strArr;

	public ListTest() {
		this.strArr = new String[0];
	}

	public boolean add(String str) {
		String[] tmpArr = this.strArr;
		this.strArr = new String[this.strArr.length + 1];
		for (int i = 0; i < tmpArr.length; i++) {
			this.strArr[i] = tmpArr[i];
		}
		this.strArr[this.strArr.length - 1] = str;
		return true;
	}

	public int size() {
		return this.strArr.length;
	}
	
	public boolean remove(String str) {
		String[] tmpArr = this.strArr;
		int idx=0;
		this.strArr = new String[this.strArr.length-1];
		
		for (int i = 0; i < tmpArr.length; i++) {
			if(str.equals(tmpArr[i])) {
				idx = i;
			}
		}
		
		for(int i=idx ; i<tmpArr.length-1 ;i++) {
				String t = tmpArr[i];
				tmpArr[i] = tmpArr[i+1];
				tmpArr[i+1] = t;
		}
		
		for(int i=0 ; i<this.strArr.length ; i++) {
				strArr[i] = tmpArr[i];
		}
		return true;
	}
	
	

	public String toString() {
		String str = "[";
		for (String s : this.strArr) {
			str += s + ",";
		}
		str = str.substring(0, str.length() - 1);
		str += "]";
		return str;
	}

	public String get(int idx) {
		if (this.strArr.length <= idx) {
			System.out.println(idx + "번 방같은건 없어요");
		}
		return this.strArr[idx];
	}
	
	public int indexOf(String str) {
		for(int i=0 ; i<this.strArr.length ; i++) {
			if(str.equals(this.strArr[i])) {
				return i;
			}
		}
		return -1;
	}
	

	public static void main(String[] args) {
		ListTest lt = new ListTest();
		System.out.println(lt.size());
		lt.add("aa");
		lt.add("bb");
		lt.add("cc");
		lt.add("dd");
		lt.add("ee");
		
		System.out.println(lt.size());
		
		lt.remove("bb");
		System.out.println(lt);
//		System.out.println(lt.size());
//		
//		System.out.println(lt);
//		
//		System.out.println(lt.indexOf("cc"));
//		
//		
//		
//		String stra = "abcde,";
//		
//		stra = stra.substring(0, stra.length()-1);
//
//		System.out.println(stra);
		
	}

}
