package game_class_separate;

import java.util.Scanner;

public class bev {

	public static void main(String[] args) {
		/* 1. 스캐너로 음료의 이름을 받는다.
		 * 2. if문의 equals를 사용하여 배열안에 음료가 있는지 찾는다.
		 * 2-1. 배열안의 음료가 있다면 indexOf를 사용하여 음료의 인덱스값을 찾는다.
		 * 2-2. 인덱스값을 반환한다.
		 * 2-3. 반환한 값을 변수에 저장하고, 음료가격의 배열의 인덱스 값과 맞추어 비교한다.
		 * 3. 음료가격의 배열의 인덱스값인 가격의 값을 반환한다.
		 * 3-1. 반환된 값을 result에 더한다. 
		 * 4. if조건문으로 계속할것인지 아닌지 물어본 후 Y를 선택하면 2. 번으로 돌아간다
		 * 4-1. if조건문으로 계속할것인지 아닌지 물어본 후 N을 선택하면 result의 값을 표시한다.  
		 * */
		Scanner sc = new Scanner(System.in);
		
		String []Bev = {"아메리카노", "카푸치노", "카페라떼"};
		int []Bev_Price = {1000, 2000, 3000};
		int Bev_choice;
		int result = 0; 
		boolean run = true;
		String y_n;
		
		while(run) {
			System.out.println("음료를 추가하시겠습니까 Y N");
			y_n = sc.next();
			
			switch (y_n) {
			case "y" :
				System.out.println("아메리카노는 1, 카푸치노는 2, 카페라떼는 3 을선택하여주십시오");
				Bev_choice = sc.nextInt();
				if(Bev_choice == 1) {
					int j = Bev_Price[0];
					result += j;
				}
				else if(Bev_choice == 2) {
					int j = Bev_Price[1];
					result += j;	
				}
				else if(Bev_choice == 3) {
					int j = Bev_Price[2];
					result += j;
				}
				
				break;
			case "n" :
				run = false;
				System.out.println("합계는 " + result + "입니다");
				break;
			}
		}
		
	}
		
}
	

