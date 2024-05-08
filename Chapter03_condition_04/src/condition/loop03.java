package condition;

// 1 ~ 100 까지의 합 ==> 반복 횟수 ==> 100
public class loop03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum = 0; // 합누적 => 초기값 0
		for(int i = 1; i <= 100; i += 1 ) //  i = 1 ++ i = 2 ++ i = 3 
		{
		   sum = sum +i; 
		   System.out.println("i="+i+",sum="+sum);
		}
		System.out.println("1~100까지 합:"+sum);

	}

}
