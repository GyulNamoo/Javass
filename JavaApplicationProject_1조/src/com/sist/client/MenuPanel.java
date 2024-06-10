package com.sist.client;
import java.awt.*;
import javax.swing.*;
public class MenuPanel extends JPanel{
	JButton homeBtn, findBtn, boardBtn, chatBtn, newsBtn, exitBtn;
	public MenuPanel()
	{
		setLayout(new GridLayout(1,6,5,5));
		//setLayout(new GridLayOut(1,6,5,5));
		homeBtn = new JButton("홈");
		findBtn = new JButton("맛집검색");
		boardBtn = new JButton("커뮤니티");
		chatBtn = new JButton("실시간 채팅");
		newsBtn = new JButton("뉴스 검색");
		exitBtn = new JButton("나가기");
		
		add(homeBtn);
		add(findBtn);
		add(boardBtn);
		add(chatBtn);
		add(newsBtn);
		add(exitBtn);
	}
}
