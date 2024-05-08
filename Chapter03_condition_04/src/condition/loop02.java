package condition;

/*
 * 단을 입력을 받는다 
 *   => 구구단 출력
 *   
 *   단 >> 2
 *   2*1 = 2
 *   ..
 *   2*9 = 18  => 1 ~ 9 증가 => 9바퀴 수행 
 *   1) 반복 횟수 
 *   2) 어디부터 어디까지 출력
 *      ------ -----
 *       초기값  조건식  => int i = 1; i<=9; i++
 */

import java.util.Scanner;

public class loop02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		System.out.println("단 입력:");
		int dan = scan.nextInt();
		
		for( int i = 1; i <= 9; i ++) // 한개씩 증가 => 1부터 9까지만 수행 => 종료 
		{
			// 시작점 종료점 증가 => 출력 횟수
			System.out.printf("%d * %d = %d\n", dan,i, dan*i );
		}

	}

}
