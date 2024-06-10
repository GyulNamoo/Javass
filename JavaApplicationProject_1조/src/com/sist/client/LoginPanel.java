package com.sist.client;
import javax.swing.*;
import java.awt.*;
import java.util.jar.JarEntry;
public class LoginPanel extends JPanel{
	Image back;
	JLabel idLa,pwdLa;
	JTextField tf;
	JPasswordField pf;
	JButton loginBtn,joinBtn,cancleBtn;
	
	public LoginPanel()
	{
		back = Toolkit.getDefaultToolkit().getImage("c:\\Project_image\\back.png");
		
		idLa=new JLabel("아이디", JLabel.RIGHT);
		pwdLa = new JLabel("비밀번호", JLabel.RIGHT);
		
		tf = new JTextField();
		pf = new JPasswordField();
		
		loginBtn = new JButton("로그인");
		joinBtn = new JButton("회원가입");
		cancleBtn = new JButton("종료");
		
		//배치
		setLayout(null); //사용자정의
		idLa.setBounds(650, 545, 80, 30);
		tf.setBounds(735, 545, 180, 30);
		add(idLa); add(tf);
		
		pwdLa.setBounds(650, 590, 80, 30);
		pf.setBounds(735, 590, 180, 30);
		add(pwdLa); add(pf);
		
		JPanel p = new JPanel();
		p.add(loginBtn);
		p.add(joinBtn);
		p.add(cancleBtn);
		p.setOpaque(false);
				
		p.setBounds(650, 620,265,35);
		add(p);
	}
	
	//스킨 => 이미지 배경 => 
	@Override
	protected void paintComponent(Graphics g) {
		g.drawImage(back, 0, 0, getWidth(),getHeight(),this);
	
	}
	
}
