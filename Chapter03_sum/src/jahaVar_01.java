/*
 *    돈까스 : 8000
 *    칼국수 : 6000
 *    왕만두 : 5000
 *    ------------
 *    주문 돈까스 => 16인분
 *        칼국수 => 8인분
 *        왕만두 => 1인분
 *    --------------------- 총계산서 출력하는 프로그램을 작성
 */
public class jahaVar_01 {
	public static void main(String[] args) {
		//초기값
		final int 돈까스 = 8000;  //고정
		final int 칼국수 = 6000;
		final int 왕만두 = 5000;
		
		int a = 16;
		int b = 8;
		int c = 1;
		
		int t =( 돈까스 * a + 칼국수 * b + 왕만두 * c);
		
		System.out.println(t);
		
	}

}
