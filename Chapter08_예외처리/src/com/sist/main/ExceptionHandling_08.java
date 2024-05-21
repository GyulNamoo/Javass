package com.sist.main;
// finally
/*
 *   예외처리
 *    try
 *    {
 *    		정상수행 코드
 *    		=> 에러 발생 
 *    } catch(에외처리클래스)
 *    {
 *         => 에러에 대한 대비 => 사전에 에러 방지 ==> 에러 복구
 *    } catch(에외처리클래스)
 *    {
 *    }
 *    finally => 생략이 가능 (필요시에만 사용) ==> 에러 복구  => 다시 입력 (continue)
 *    {
 *       파일 닫기 / 서버 닫기 / 오라클 닫기 ==> DDOS
 *       => try 수행 , catch 수행 => 무조건 수행이 된다 
 *    }
 *    
 *    흐름
 *    ==> 에러가 없는 상태 
 *    문장 1
 *    문장 2
 *    try
 *    {
 *      문장 3
 *      문장 4
 *      문장 5
 *    } catch (예외처리 클래스)
 *    {
 *      문장 6
 *    } finally 
 *    {
 *      문장 7
 *    }
 *    
 *    1=>2=>3=>4=>5=>7
 *    
 *    ==> 에러가 있는 상태
 *    문장 1
 *    문장 2 ==> 에러 발생 => 종료 
 *    try
 *    {
 *      문장 3
 *      문장 4
 *      문장 5
 *    } catch (예외처리 클래스)
 *    {
 *      문장 6
 *    } finally 
 *    {
 *      문장 7
 *    }
 *    
 *     ==> 에러가 있는 상태
 *    문장 1
 *    문장 2
 *    try
 *    {
 *      문장 3
 *      문장 4 ==> 에러 발생
 *      문장 5
 *    } catch (예외처리 클래스)
 *    {
 *      문장 6
 *    } finally => 필요시에만 사용 
 *    {
 *      문장 7 => 에러(O,X) 상관없이 무조건 수행
 *    }
 *    1=>2=>3=>6=>7
 */
public class ExceptionHandling_08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 에러가 없는 상태 
		System.out.println("1");
		System.out.println("2");
		try {
			System.out.println("3");
			System.out.println("4");
			System.out.println("5");
			// 수행문장
		} catch(Exception e) // 에러발생시에만 수행
		{
			System.out.println("에러 처리 =>6"); // 에러 확인 => printStackTrace(), getMessage()
		}
		finally
		{
			System.out.println("7"); // 파일닫기 , 오라클닫기 => 서버 부하가 심하다 => 닫기
		}
	}

}
