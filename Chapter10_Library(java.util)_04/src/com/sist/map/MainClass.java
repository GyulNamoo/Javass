package com.sist.map;
import java.util.*;
public class MainClass {
/*
 *    주요 메소드
 *    clear() : 등록된 데이터 전체를 삭제 
 *    ***get() : 저장된 데이터를 찾아서 출력
 *    ***put() : 데이터를 저장 => put(Object, Object)
 *                             key     value
 *    isEmpty() : 데이터 존재 여부 => 자동 로그인
 *    size() : 저장갯수
 *    ***values() : 실제 값만 읽기
 *    ***keySet() : key만 읽어 온다
 *    
 *    ===> 관련된 클래스가 여러개 있는 경우 
 *         한개로 모아서 클래스를 관리해야 된다 => 인터페이스
 *         데이터를 모아서 관리 => 배열 / ArrayList
 *      
 *    ===> 묶음 => 객체지향 프로그램
 *         --- 코더 
 *         1. 데이터 => 배열 / 클래스
 *         2. 명령문 => 메소드
 *         3. 클래스 => 인터페이스 
 *         ---------------------- 소스 간결하고 가독성, 관리 편리 
 *         
 *         
 *    
 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("1.로그인(login) 2.게시판(board) 3.공지사항(notice) 4. 회원가입(join) 5.맛집(food):");
		String menu = scan.next();
		Container c = new Container();
		Model model = c.getBean(menu);
		model.execute();

	}

}
