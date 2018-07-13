package test18;


public class Rabbit {
	
	public String rabbitName;
	public int rank;
	static int cycle;
	
	Rabbit(String rabbitName, int rank){
		this.rabbitName = rabbitName;
		this.rank = rank;
	}
	
	static void upSort(Rabbit[] r) {
		for(int i=0 ; i<cycle ; i++) {
			for(int j=i+1 ; j<cycle ; j++) {
				if(r[i].rank < r[j].rank) {
					Rabbit rb = r[i];
					r[i] = r[j];
					r[j] = rb;
					
				}
			}
		}		
	}
	
	static void downSort(Rabbit[] r) {
		for(int i=0 ; i<cycle ; i++) {
			for(int j=i+1 ; j<cycle ; j++) {
				if(r[i].rank > r[j].rank) {
					Rabbit rb = r[i];
					r[i] = r[j];
					r[j] = rb;
					
				}
			}
		}		
	}
	

	
	public String toString() {
		return rabbitName + rank +"살";
	}
	

	
	public static void main(String[] args) {
		Rabbit[] r = new Rabbit[10];
		cycle = r.length;
		
		for(int i=0 ; i<r.length ; i++) {
			int rank = (int) (Math.random()*10)+1;
			r[i] = new Rabbit(i+"번째토끼 ",rank);
		}
		
		upSort(r);
		
		for(int i=0 ; i<r.length ; i++) {
			System.out.println(r[i]);
		}
		
		System.out.println("");
		
		downSort(r);
		
		for(int i=0 ; i<r.length ; i++) {
			System.out.println(r[i]);
		}
	
	}


}
