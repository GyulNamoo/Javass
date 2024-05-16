package com.sist.main2;
// 추상클래스의 비교
// => 상속을 내리는 클래스 => 상속을 받을 수 없다
abstract class A
{
	int a;
	public abstract void aaa();
	public void bbb();
	{
		
	}
class BBB extends AAA
{ // => a.
   int b;
   public void ccc() {
	   
   }
   public void aaa() {
	   
   }
}
class CCC
{
	int a , b;
	public void ddd() {
		
	}
	class DDD extends CCC
	{
		//a,b , 
	}
	//a,b , ddd()
	int c;
	public void eee() {}
}
/*
 *    상속을 내린 클래스는 => 자신의 변수, 메소드
 *    상속을 받은 클래스는 => 자신의 변수, 메소드 => 상속받은 변수, 메소드 사용이 가능
 *    CCC 선언 => a,b,ddd()
 *    DDD 선언 => a,b,ddd(),c,eee()
 */
	public class MainClass_02 {
		public static void main(String[] args) {
			BBB aa = new BBB();
		}
			// => a.aaa(), bbb()
		    // => a.aaa(), bbb(), b, ccc()
		    // 추가한 변수, 메소드가 있는 경우에는 상속을 받은 클래스로로 전이
		}
	}

