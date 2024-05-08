package condition;

public class loop06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1. A ~ Z 까지 출력
		for(char c = 'A'; c <= 'Z'; c++) // c += 2, c += 3 ....
		{
			System.out.print(c + " ");
			
		}
		
		System.out.println(); // 다음 줄에 출력
		for(char c = 'a'; c<= 'z'; c++ )
		{
			System.out.print(c + " ");
		}
		// 정수 / 문자 
		System.out.println();
		
		for(char c ='z'; c >='a'; c -- )
			System.out.print(c + " ");
			

	}

}
