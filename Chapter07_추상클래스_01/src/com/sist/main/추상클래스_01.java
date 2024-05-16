package com.sist.main;
/*
 *    = 클래스의 종류 
 *      1) 추상클래스
 *         형식)
 *             public abstract class ClassName
 *                    -------- 추상적인 (공통적인)
 *             {
 *                
 *             }
 *             공통으로 사용되는 메소드를 선언 
 *             => 자신의 클래스를 메모리 할당을 할 수 없다 => new를 사용할 수 없다 
 *                           ------------------
 *                             미완성 클래스
 *             => 성속을 받아서 => 오버라이딩을 하고 사용한다 
 *             => 요구사항 (기능 설정) => 선언만 가능 
 *             => 기능은 같다 => 구현하는 내용이 틀린 경우
 *                예) 버튼을 클릭 => 클릭한다 기능 같다
 *               	  버튼 => 기능 (로그인 버튼, 로그아웃 버튼, 계산기 버튼, 회원가입...)
 *                    =>  프로그램에 맞게 구현해서 사용 ... 
 *                예) 데이터베이스 연결
 *                   ------------
 *                   DriverManager
 *                   Oracle / MsSQL / MySql / Sqlite / MariaDB / DB2 ....
 *                   ----------------------------------------------------
 *                    연결시에 따로 클래스를 만들면 => 한개로 통합
 *                                            --------
 *                => 같은 기능끼리의 클래스를 모아서 한개의 클래스 이름으로 관리할 때 주로 사용
 *                   ------------------------------------
 *                   데이터 => 배열
 *                   클래스 => 추상클래스 , 인터페이스
 *                   => 서로 다른 클래스를 연결할 때 주로 사용
 *                   => 클래스마다의 공통 기능을 추출 => 선언 => 필요시마다 상속을 받아서 구현
 *                      --------------------
 *                      
 *                => 이미 기능이 선언 => 요구사항(기능), 문제
 *                => 무조건 상속을 받는다 / 단일 상속 
 *                                    ------- 다중 상속 보완 => 인터페이스 
 *                => 멤버변수 , 생성자도 가지고 있다
 *                => 1. 구현이 된 메소드 => 일반 메소드
 *                   2. 구현이 안 된 메소드가 0개 이상이 있다 => 추상메소드
 *                   
 *                예)
 *                    일반 게시판
 *                    --------
 *                     목록 출력  => 게시물 출력
 *                     상세보기
 *                     글쓰기
 *                     수정하기 
 *                     삭제하기 
 *                     검색기능 
 *                    답변형 게시판
 *                    ---------
 *                     목록 출력  => 답변을 추가
 *                     상세보기
 *                     글쓰기
 *                     수정하기 
 *                     삭제하기   => 답변을 먼저 삭제하고 나중에 게시물 삭제
 *                     검색기능 
 *                     답변하기
 *                    갤러리 게시판
 *                    ---------
 *                     목록 출력  => 이미지 출력
 *                     상세보기
 *                     글쓰기    => 이미지 업로드
 *                     수정하기 
 *                     삭제하기 
 *                     검색기능 
 *                    자료실
 *                    --------
 *                     목록 출력
 *                     상세보기  => 다운로드
 *                     글쓰기   => 업로드
 *                     수정하기  => 파일 수정
 *                     삭제하기  => 파일 삭제
 *                     검색기능 
 *                     파일업로드
 *                     파일다운로드
 *                    댓글형 게시판 
 *                    ----------
 *                     목록 출력  => 댓글 갯수
 *                     상세보기   => 댓글 추가
 *                     글쓰기
 *                     수정하기 
 *                     삭제하기 
 *                     검색기능 
 *                     댓글기능
 *               => 마우스 / 키보드
 *                   ----------  업체가 많다
 *                               -------- 운영체제 => 추상클래스 
 *           => [접근지정어] abstract class ClassName
 *           {
 *               ----------------------------
 *                멤버변수
 *               ----------------------------
 *                생성자 => 생략 => 자동으로 디폴트 생성자가 추가
 *               ----------------------------
 *                메소드 => 구현이 된 메소드
 *                [접근지정어] 리턴형 메소드(매개변수...)
 *                {
 *                   return 값; => void인 경우에는 생략 ...
 *                }
 *               ----------------------------
 *                추상메소드 => 구현이 안된 메소드
 *                [접근지정어] abstract 리턴형 메소드명(매개변수...);
 *                => 데이터베이스
 *                   --------- 오라클 연동 / MySql 연동 => 같은 메소드를 구현
 *                   *** 웹 => 데이터베이스 연동  ************
 *                             J2EE => 웹 연결(브라우저)  ***
 *                             -------------------- 기본 뭄법이 지금 배우는 과정
 *               ----------------------------
 *           }
 *           => 유지 보수가 어려운 경우 => 기능 설정 => 필요시마다 구현
 *           => 경우의 수가 많은 경우
 *             ----- 기능은 같다 => 구현이 다른 경우
 *                
 *      2) 인터페이스
 *      3) 내부클래스 
 *          => Thread => 네트워크 (마지막) 
 *          => 클래스안에 클래스 설정 => 멤버변수 , 멤버메소드를 쉽게 사용 
 *          class A
 *          {
 *             변수 , 메소드
 *             class B  => 멤버클래스 
 *             {
 *                A가 가지고 있는 변수 , 메소드 사용이 가능 => A객체를 생성할 필요가 없다 
 *             }
 *          }
 *          
 *          class A
 *          {  => 익명의 클래스 => 상속없이 오버라이딩이 가능 => 윈도우프로그램 
 *             B b = new B(){
 *                public void display()
 *                {
 *                }
 *             }
 *          }
 *          class B
 *          {
 *             public void display(){}
 *          } 
 *          
 *          *** 상속이 있어야 오버라이딩이 가능 => 익명의 클래스 오버라이딩 
 *              스프링에서는 상속을 권장하지 않는다
 *                       --- 제약이 존재 (상위 클래스에 맞게..)
 *                       --- 메모리가 커진다 (상위 클래스 메모리 할당 => 하위 클래스 메모리 할당)
 *                       --- 처리속도가 늦다
 *                       --- 재사용을 한다 => 상위 클래스의 소스 코드를 모르는 상태에서 재정의 한다 (가독성)
 *      4) 종단클래스 => 사용빈도는 거의 없다 => 라이브러리에 존재 => 확장할 수 없다 (고정)
 *                    java.lang => String, System, Math, Wrapper ... => 상속을 받을 수 없다
 *                    => public final class String
 *                              ----- 상속을 할 수 없다(오버라이딩이 불가능) 
 */
abstract class 도형
{
	// 그리다 => 선, 원, 사각, 삼각...
	public abstract void draw(); // 메소드가 구현이 안되면 미완성된 클래스 => 메모리에 저장이 불가능
	// => 상속을 받아서 구현후 사용 
	// => 여러개의 관련된 클래스 모아서 관리
}
class 선 extends 도형 {
	//오버라이딩
	/*
	 *  오버라이딩 => 재정의
	 *  ------
	 *   1. 메소드명이 동일
	 *   2. 매개변수가 동일
	 *   3. 리턴형 동일
	 *   4. 접근지정어는 확자잉 가능
	 *      -------
	 *      private : 데이터 보호 목적 => 변수
	 *      public : 클래스, 메소드, 생성자 => 다른 클래스와 연결
	 *      => 접근 범위를 늘리는 경우 
	 *      private > default < protected < public 
	 *   5. 추상클래스는 반드시 상속을 내려서 => 선언된 메소드를 구현해서 사용이 가능
	 *      ------- 자신이 메모리 할당이 불가능
	 *      
	 *      동물  => 걸어다닌다, 먹는다, 말을한다 .... 추상클래스 
	 *       |
	 *     ---------
	 *     |   |   |
	 *     개  돼지  인간 ... 일반 클래스 
	 *      
	 */
}

class 사각형 extends 도형
{

	@Override
	public void draw() {
		// TODO Auto-generated method stub
		System.out.println("사각형을 그린다...");
	}
	
}
public class 추상클래스_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		선 a = new 선();
		a.draw();
		사각형 b=new 사각형();
		b.draw(); */
		도형 a = new 선();
		a.draw();
		
		a = new 사각형();
		a.draw();
		// 같은 종류의 클래스를 모아서 한개의 객체명으로 연결, 사용
		// 기능 설정 => 프로그램에 맞게 구현해서 사용
		

	}

}
