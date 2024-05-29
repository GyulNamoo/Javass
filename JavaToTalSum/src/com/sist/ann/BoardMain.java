package com.sist.ann;
import java.lang.reflect.Method;
import java.util.*;
public class BoardMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("URL 주소 입력:");
		String url = scan.next();
		
		Class clsName = Class.forName("com.sist.ann.BoardSystem");
		Object obj = clsName.getDeclaredConstructor().newInstance();
		
		Method[] methods = clsName.getDeclaredMethods();
		for(Method m : methods)
		{
			RequestMapping rm = m.getAnnotation(RequestMapping.class);
			if(url.equals(rm.value()))
			{
				m.invoke(obj, null);
				break;				
			}
					
		}
		
	}

}
