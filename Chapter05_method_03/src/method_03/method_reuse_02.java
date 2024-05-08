package method_03;
//년도를 입력을 받아서 윤년인지 확인하는 프로그램을 작성
/*
 *    년도 입력 : 2024
 *    윤년입니다
 */
import java.util.*;
public class method_reuse_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int year = method_07.input("년도");
		boolean bCheck = method_07.isYear(year);
		if(bCheck)
			System.out.println("윤년입니다");
		else
			System.out.println("윤년이 아닙니다");
				

	}

}
