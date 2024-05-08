package class01;
/*
 *    클래스
 *      = 사용자 정의 데이터형 : 데이터만 모아서 관리
 *                          ------ 다른 데이터를 모아서 관리 
 *      = 액션 클래스 : 메소드를 여러개 모아서 관리
 *      
 *      ** 클래스 는 한개에 대한 정보 
 *      class 사원
 *      {
 *         이름
 *         부서
 *         근무지
 *         입사일
 *         직위
 *         연봉
 *         성과급
 *         .....
 *      }
 *      
 *      class 학생
 *      {
 *         이름
 *         학년 int
 *         학점 char
 *         주소 String...
 *         전화
 *         나이
 *      }
 */
// 데이터형 => 형변환
// 개발자마다 틀리다 (프로그램에 맞게)

class Student
{
	String name;
	int age;
	// 인스턴스변수 : 메모리 공간을 따로 생성 => 객체변수
	static String school_name;
	// 공유 변수 : 한개 공간에서 사용
}
// => 저장
public class class_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student hong=new Student();
		//      ---- 객체(사용자 정의 데이터형에 대한 변수명)
		// name, age, school_name
		hong.name="홍길동";
		hong.age=25;
		hong.school_name="쌍용";
		Student shim=new Student();
		// name, age, school_name
		shim.name = "심청이";
		shim.age = 20;
		shim.school_name = "SIST";
		Student park=new Student();
		// name, age, school_name
		park.name = "박문수";
		park.age = 30;
		park.school_name = "SIST강북";
		
		System.out.println("===== hong 영역 =====");
		System.out.println("이름:" + hong.name);
		System.out.println("나이:"+hong.age);
		System.out.println("학교명:" + hong.school_name); 
		// static => 하나의 공간   
		System.out.println("===== shim 영역 =====");
		System.out.println("이름:" + shim.name);
		System.out.println("나이:" + shim.age);
		System.out.println("===== park 영역 =====");
		System.out.println("이름:" + park.name);
		System.out.println("나이:" + park.age);
	}

}
