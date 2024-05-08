package loop_;

public class loop_var {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i; //변수 사용시에는 반드시 for 밖에 설정 
		for(i = 1; i <=10; i++)
		{
			System.out.print(i+" ");
		}
		// i 변수는 메모리에서 삭제
		System.out.println("i="+i);

	}

}
