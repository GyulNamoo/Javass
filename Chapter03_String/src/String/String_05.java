package String;
// 산삼:wild ginseng
public class String_05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String f = "산삼:wild ginseng";
		System.out.println("산삼의 영어는?");
		System.out.println("영어는 "+f.substring(f.indexOf(":")+1));
		
		/*
		 *    substring : 문자열을 자르는 경우에 사용
		 *    Hello Java
		 *    0123456789
		 *    substring (1) =>
		 *    substring (3,8) => lo Ja  
		 *    substring (int startIndex)
		 *    substring (int startIndex, int endIndex)
		 *                               => endIndex-1
		 */
		String msg = "Hello Java";
		System.out.println(msg.substring(0,7)+"...");
		// sun 
	}

}
