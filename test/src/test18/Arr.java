package test18;

public class Arr {
	public static void main(String[] args) {
		int[][] arr = new int[2][2];
		arr[0] = new int[2];
		arr[1] = new int[3];
		System.out.println(arr[0].length);
		System.out.println(arr[1].length);
		
		for(int i=0; i<arr.length ; i++) {
			System.out.println(i +"번째 층의 방갯수 : "+ arr[i].length);
		}
		
		for(int i=0; i<arr.length ; i++) {
			for(int j=0 ; j<arr[i].length ; j++) {
				arr[i][j] = (int)(Math.random()*10)+1;
			}
		}
		

		for(int i=0; i<arr.length ; i++) {
			System.out.println(i+"번방");
			for(int j=0 ; j<arr[i].length ; j++) {
				System.out.println(arr[i][j]);
				
			}
		}
		
		
		
		
		
	}
}
