package practice;

import java.util.Scanner;

public class Game01 {
	public static void main(String[] args) {
		long money = 1000000000l;
		Scanner scan = new Scanner(System.in);
		
		System.out.println("게임하나 해볼래? 할거면 1을 입력해.");
		
		int yes = Integer.parseInt(scan.nextLine());
		
		if(yes == 1) {

			System.out.println("자 여기 10억 갖고있어 이돈으로 배팅할거니까 잘 갖고있으라고");
			System.out.println("게임은 간단해. 1부터 10까지 숫자중 하나를 뽑을거니까 맞춰봐,");
			System.out.println("");

						
				for(int i=0 ; i<3 ; i++) {						
					double d = Math.random();
					int num = (int)(d*10 +1);
					System.out.println("현재 가진 돈 : " + money);
					System.out.println("돈을 얼마나 걸어볼래? 1을 입력하면 올인이야.ㅋㅋ");
					System.out.print("배팅금액 : ");
			
					long mon = Long.parseLong(scan.nextLine());				
					
					System.out.println("");
								
						if(mon <1) {
							System.out.println("현재 가진 돈 : " + money);
							System.out.println("뭐야 이번턴엔 돈안걸거야? 그래도 무슨번호가 나왔는진 알려줄게.");
							System.out.println("당첨 번호 : " + num);
							i--;
							System.out.println("");		
							
						} else	if(mon ==1){
							long tm = money;
							money = 0;
							mon = tm;
							System.out.println("현재 가진돈 : " + money);
							System.out.println("올ㅋ 올인 G A Z U A!!");
							System.out.println("배팅한 돈 : " + mon);
							System.out.println("자, 그럼 1부터 10까지 숫자 하나 골라봐 올인이니 신중하라고");
							System.out.print("배팅할 숫자 : ");
							System.out.println("");
							long gNum = Long.parseLong(scan.nextLine());
							
							if (gNum == num) {
								System.out.println("당첨 번호 : " + num);
								money = mon*100;
								System.out.println("축하해! 올인해서" +money+"원 땃어!");
								System.out.println("현재 가진돈 : " + money);
								i--;
								System.out.println("");								
							} else {
								System.out.println("당첨 번호 : " + num);
								System.out.println("이런... 돈 다꼴아박았는데 망했네ㅋㅋㅋㅋㅋㅋㅋㅋㅋ");
								i +=100;
							}
							
							
						} else {
							money -= mon;
							System.out.println("현재 가진 돈 : " + money);
							System.out.println("좋아 " + mon +"원 꼴아박았어!");
							System.out.println("자, 그럼 1부터 10까지 숫자 하나 골라봐");
							System.out.print("배팅할 숫자 : ");
							System.out.println("");

							
							int gNum = Integer.parseInt(scan.nextLine());
							
							if(gNum == num) {
								System.out.println("당첨 번호 : " +num);
								money = mon*10 +money;
								System.out.println("축하해! 번호를 맞춰서" + mon*5 + "만큼 땃어!");
								System.out.println("현재 가진 돈 : " + money);
								i--;
								System.out.println("");



							} else {
								
								System.out.println("음~ 그번호가 아니었어~");
								System.out.println("당첨 번호는 " + num + "였어..");
								System.out.println("");

								if(money>0) {
									i--;
								}else
								{
									i +=100;
								}

							}
							
						}
					
				}
				if(money <0) {
					System.out.println("내가 빌려준 돈도 다잃었네? 아까 신체포기각서 서명한거 기억하지? 따라와");
				} else {
				System.out.println("결국 다잃었구나 괜찮아 다음을 기약해 잘가렴");
				}
				
			

		
		}else {
			System.out.println("안할거면 말구..");
		}
			
	}

}
