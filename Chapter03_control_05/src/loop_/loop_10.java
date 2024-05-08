package loop_;

//1~100까지의 합을 구해서 출력

public class loop_10 {
	public static void main(String[] args) {
		int sum = 0;
		for(int i = 0; i <=100; i++)
		{
			
			sum += i;
			System.out.println("i=" + i+" ,sum=" + sum);
		}
		
	}

}

