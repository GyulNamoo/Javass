package crawling;

import java.util.*;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

import java.io.*;
class memusic {
	String rank;
	String title;
	String singer;
	String album;
	String poster;
	String key;
}
class meMusic{
	static Music[] musics = new Music[100];
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int k = 1;
		for(int i = 50; i<=100; i+=50)
		{
			Document doc = Jsoup.connect("https://www.melon.com/chart/index.htm" ).get();
			Elements title = doc.select("");

	}

}
