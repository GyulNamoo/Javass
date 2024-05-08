//초를 받아서 => 시간 / 분  / 초 출력
// 63      1분 3초 ==> 라이브러리 (시간 => 초단위) 60*60*24

import java.util.Scanner; // ( / , % ) 
public class javaCtr_condition_02 {
	//구글 온라인 시험

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("초 입력:");
		int num = scan.nextInt();
		
		int hour=num/3600;
		System.out.println(hour+"시");
		int minute = (num%3600) / 60;
		System.out.println(minute+"분");
		int second=	(num%3600) %60;
		System.out.println(second+"초");
		
		// 숫자 분리 ==> / , % 
	

	}

}
