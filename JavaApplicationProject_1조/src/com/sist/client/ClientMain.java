package com.sist.client;
import java.awt.*;
import javax.swing.*;
public class ClientMain extends JFrame{
	CardLayout card = new CardLayout();
	LoginPanel lp = new LoginPanel();
	MainPanel mp = new MainPanel();
	public ClientMain()
	{
		setLayout(card);
		add("MP", mp);
		add("LOGIN",lp);
		
		setSize(960,750);
		setResizable(false);
		setVisible(true);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			UIManager.setLookAndFeel("com.jtattoo.plaf.mcwin.McWinLookAndFeel");
		}catch(Exception ex){}
		new ClientMain();
	}

}
