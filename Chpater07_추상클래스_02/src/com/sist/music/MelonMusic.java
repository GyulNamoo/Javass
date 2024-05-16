package com.sist.music;

import java.io.FileReader;

public class MelonMusic extends MusicSystem{
	
	public void init() {
		
			try {
				FileReader fr = new FileReader("c:\\javaDev\\genie.txt");
				StringBuffer sb = new StringBuffer();
				int i = 0;
				while((i=fr.read())!= -1){// 파일의끝
					sb.append((char)i);
				}
				fr.close();
				
			//buffer => 임시 기억장소 => 누적
				String data = sb.toString();
				//String은 문서의 제한이 없다
				String[] mdata=data.split("\n");
				i = 0;
				for(String s:mdata)
				{
					//System.out.println(s);
					if(i>50) break;
					
					musics[i] = new Music();
					String[] temp = s.split("\\|"); // 정규식 => ^, $, ., ?, |, +, *
					/*
					 * 2|
					 * SPOT! (Feat. JENNIE)|
					 * 지코 (ZICO)|
					 * SPOT!|
					 * //image.genie.co.kr/Y/IMAGE/IMG_ALBUM/085/072/667/85072667_1714091257020_1_140x140.JPG/dims/resize/Q_80,0|
					 */
					musics[i].setMno(temp[0]);
					musics[i].setTitle(temp[1]);
					musics[i].setSinger(temp[2]);
					musics[i].setAlbum(temp[3]);
					musics[i].setPoster(temp[4]);
					
					i++;
				}
			}catch(Exception ex) {}
	}
}
 
