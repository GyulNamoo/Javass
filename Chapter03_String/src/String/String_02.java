package String;
// 문자열 ==> 알파벳을 입력받아서 => A, ㅁ의 갯수가 몇개인지 확인
import javax.swing.*;
//웹, 윈도우 => String
public class String_02 {
	public static void main(String[] args) {
		String alpha =JOptionPane.showInputDialog("알파벳입력:");
		//문자열 입력값을 받는 경우
		int count = 0;
		for(int i = 0; i<alpha.length(); i++) // lenght() : 문자 갯수 
		{
			char c= alpha.charAt(i); // 문자 1개씩 추출
			if ( c=='A' || c== 'a') {
				count++;			
			}
		}
		//System.out.println(alpha+"에서 A,a는 총" + count + "개");
		JOptionPane.showMessageDialog(null, alpha+"에서 A,a는 총"+count+"개");
		// 결과값 출력 
	}

}
