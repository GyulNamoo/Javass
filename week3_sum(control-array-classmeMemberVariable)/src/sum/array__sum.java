package sum;

import java.awt.List;
import java.util.ArrayList;

/*
 *    배열 : 같은 데이터형의 데이터를 여러개 모아서 관리
 *          ---------
 *            | 연속적으로 같은 크기의 메모리를 만들어 
 *            | 고정적이다
 *            | 한개의 이름으로 여러개의 변수를 제어 할 수 있다
 *                          ----------  구분하기 위해서 인덱스
 *                          
 *            => 배열의 단점을 보완 => Collection(가변) => 웹에서 전송
 *                                                    --------
 *            => 검색 => 전송
 *               ----------
 *               => 3, 5, 10 ....
 *                  ------------- 배열로 고정하기 어렵다 
 *            => 선언 
 *               데이터형 [] 배열명;
 *               데이터형 배열명 []; // C=>Java
 *            => 초기화
 *            데이터형[] 배열명 = {값...}
 *            데이터형[] 배열명 = new 데이터형[갯수] => 자동 초기화 
 *            => 인덱스
 *               int[] arr={1,2,3,4,5}
 *                 arr[0] arr[1] arr[2] arr[3] arr[4]
 *               -----------------------------------
 *                   1      2     3     4      5
 *               -----------------------------------
 *               => 인덱스는 무조건 순차적으로 ... 0번 시작
 *               => 인덱스 범위를 벗어나면 ArrayIndexOutOfBoundsException 에러 발생
 *            => for-each ==> 많이 사용되는 for
 *                        ==> 데이터 수정(X) , 출력용
 *               for(배열에 저장된 데이터를 받는 변수 : 배열)
 *                   -------------------------
 *                    반드시 배열 데이터형과 일치
 *                    => 실제 배열에 저장된 값을 읽어온다
 *                    => front => HTML
 *            => 향상된 for => JSP / Spring 주로 사용
 *            ------------------------------------------- 4장
 *            메소드를 통해서 => 다른 클래스와 연결...
 *            --------------------------------------------
 */
public class array__sum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = new int[5];
		// 검색 => 10
		List list = new ArrayList<>();
		list.add(1);
		list.add(1);
		list.add(1);
		list.add(1);
		list.add(1);
		list.add(1);
		list.add(1);
		list.add(1);
		list.add(1);
		list.add(1);
		list.add(1);

	}

}
