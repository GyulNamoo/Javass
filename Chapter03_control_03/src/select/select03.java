package select;


import java.util.Scanner;

import java.io.*;
/*
 * C:\Windows\System32\notepad.exe
 * C:\Program Files\WindowsApps\Microsoft.Paint_11.2110.0.0_x64__8wekyb3d8bbwe\PaintApp\mspaint.exe
 * C:\Program Files\Google\Chrome\Application
 */


public class select03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		System.out.print("메모장, 그림판, 크롬 >>");
		// 결과 출력
		switch(scan.next())
		{
		  case "메모장":
			  Runtime.getRuntime().exec("C:\\Windows\\System32\\notepad.exe");
			  break;
		  case "그림판":
			  Runtime.getRuntime().exec("C:\\Program Files\\WindowsApps\\Microsoft.Paint_11.2110.0.0_x64__8wekyb3d8bbwe\\PaintApp\\mspaint.exe");
			  break;
		  case "크롬":
	      default : 
	    	  Runtime.getRuntime().exec("C:\\Program Files\\Google\\Chrome\\Application\\chrome.exe http:\\naver.com"
	    	  		+ "");
			  break;
	    	  System.out.println("잘못된 입력입니다!!");
	    	  
				  
			
		}
		

	}

}
