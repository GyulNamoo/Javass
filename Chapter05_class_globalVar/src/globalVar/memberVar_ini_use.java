package globalVar;
/*
 *   class ClassName
 *   {
 *    ------------------------------
 *    
 *    ------------------------------
 *    
 *    ------------------------------
 *    int a;
 *    void display()
 *      {  
 *         ---------
 *          변수 선언 => 지역변수 => 메소드가 종료하면 사라진다 => 사용하려면 리턴형 
 *          int a = 100;        
 *          --------
 *          
 *          return a;
 *       }
 *     void print(int a)
 *       {
 *            
 *       }
 *    ------------------------------
 *   }
 */
import java.util.*;
class Sawon{
	String name;
	String dept;
	String loc;
	String job;
	int pay;
}
public class memberVar_ini_use {
	// 사원 등록
	static Sawon sawonInsert()
	{
		Sawon s = new Sawon(); // 지역변수
		s.name = "홍길동";
		s.dept = "개발부";
		s.loc = "서울";
		s.job = "대리";
		s.pay = 3600;
		
		return s;
	}
	// 사원 목록
	static void sawonList(Sawon s) {
		Sawon s = new Sawon();
		 System.out.println("이름 : ");
	}
	// 사원 상세 보기
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sawon s = sawonInsert(); // Sawon => s는 사라진다
		sawonList(); 
	}

}
