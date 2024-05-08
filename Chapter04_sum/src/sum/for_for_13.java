package sum;
//알파벳 10개 난수 => 버블 정렬(DESC)
// 중복없는 알파벳.. 
import java.util.*;
public class for_for_13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// => 알파벳 10개를 저장 공간을 만든다
		char[] alpha = new char [10];
		for(int i = 0; i<alpha.length; i++) {
			alpha[i]=(char)((Math.random()*26)+65);
			for(int j=0; j<i; j++) {
				if(alpha[i]==alpha[j]) {
					i--;
					break;
				}
			}
		}
		System.out.println(Arrays.toString(alpha));
		
		
		
		
		
					

	}

}
