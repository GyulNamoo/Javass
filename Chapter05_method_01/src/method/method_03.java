package method;

public class method_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 새로운 사이트 제작 => 로그인
		// 재사용
		boolean bCheck = method_02.isLogin("admin","1234");
		if(bCheck) {
			System.out.println("로그인 되었습니다");}
			else {
				System.out.println("아이디나 비밀번호가 틀립니다");
			}
	}
		

}

