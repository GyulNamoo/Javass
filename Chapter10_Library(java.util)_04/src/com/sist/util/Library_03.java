package com.sist.util;
/*
 *     데이터를 묶어서 한번에 처리
 *       = iterator() => 위 => 아래
 *          = hasNext()
 *          = next()
 *          = remove()
 *          = hasProvious() => 아래 => 위 
 */
// => Set / Map => 크롤링시에 사용 
import java.util.*;
public class Library_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> list = new ArrayList<String>();
		list.add("홍길동");
		list.add("심청이");
		list.add("박문수");
		list.add("이순신");
		list.add("강감찬");
		
		System.out.println("===== 일반 형식 =====");
		for(String name : list)
		{
			System.out.println(name);
		}
		System.out.println("===== 재출력 =====");
		for(String name : list)
		{
			System.out.println(name);
		}
		System.out.println("===== Iterator =====");
		Iterator<String> it = list.iterator();
		while(it.hasNext())
		{
			// next() => 데이터를 가지고 온다
			System.out.println(it.next());
		}
		System.out.println("===== 재출력 =====");
		while(it.hasNext())
		{
			// next() => 데이터를 가지고 온다
			System.out.println(it.next());
		}
		// 단방향 => 소진이 되면 더 출력을 할 수 없다 
		System.out.println("============ 다시 출력 =============");
		Iterator<String> it2 = list.iterator();
		while(it2.hasNext())
		{
			System.out.println(it2.next());
		}/*
		System.out.println("======== ListIerator ========");
		ListIterator<String> it3 = list. listIterator();
		while(it3.hasNext())
		{
			System.out.println(it3.next());
		}*/
		System.out.println("======== ListIerator ========");
		ListIterator<String> it4 = list. listIterator();
		while(it4.hasPrevious())
		{
			System.out.println(it4.previous());
		}
	}

}
