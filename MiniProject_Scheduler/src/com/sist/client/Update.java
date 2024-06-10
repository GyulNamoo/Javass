package com.sist.client;

import java.awt.Font;
import javax.swing.*;

public class Update extends JPanel{
	JLabel titleLa,nameLa,idLa,emailLa,pwdLa,noLa;
	JTextField nameTf, idTf;
	JPasswordField pwdPf;
	JTextArea ta;
	JButton b1, b2;
	
	public Update()
	{	
		// 표시 : 아이디, 이름, 생년월일은 수정이 불가능합니다 ^^
		
		titleLa = new JLabel("등록정보 수정",JLabel.CENTER);
		titleLa.setFont(new Font("맑은 고딕", Font.BOLD,30));
		setLayout(null);
		titleLa.setBounds(10,15,620,50);
		add (titleLa);
		
		noLa = new JLabel();
		noLa.setBounds(150,70,20,30);
		add(noLa);
		noLa.setVisible(false);
		
		nameLa = new JLabel("이름", JLabel.CENTER);
		nameTf = new JTextField();
		nameLa.setBounds(10,70,80,30);
		nameTf.setBounds(95,70,150,30);
	    nameTf.setEditable(false);
		add(nameLa); add(nameTf);
		
		idLa = new JLabel("아이디", JLabel.CENTER);
		idTf=new JTextField();
		idLa.setBounds(10,105,80,30);
		idTf.setBounds(95,105,150,30);
		idTf.setEditable(false);
		add(idLa); add(idTf);
		
		pwdLa=new JLabel("비밀번호",JLabel.CENTER);
    	pwdPf=new JPasswordField();
    	//             Top  Right Bottom Left ==> CSS
    	pwdLa.setBounds(10, 140, 80, 30);
    	//             x  y width heigth
    	pwdPf.setBounds(95, 140, 150, 30);
    	add(pwdLa);add(pwdPf);
    	//   비밀번호 일치 여부 확인 + 이전 비밀번호 입력(일치) 
		
    	
    	
    	
    	
    	emailLa=new JLabel("이메일",JLabel.CENTER);
    	ta=new JTextArea();
    	JScrollPane js=new JScrollPane(ta);
    	emailLa.setBounds(10, 395, 80, 30);
    	js.setBounds(95, 140, 300, 30);
    	add(emailLa);add(js);
    	
    	//전화번호 우편번호 상세주소
  	
    	b1=new JButton("수정");
    	b2=new JButton("취소");
    	
    	JPanel p=new JPanel();
    	p.add(b1);p.add(b2);
    	p.setBounds(10, 435, 535, 35);
    	add(p);
	}
  
	
	
	
			//출력 확인용 main
    	  public static void main(String[] args) {
    	        JFrame frame = new JFrame("Update Test");
    	        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    	        frame.setSize(650, 550);
    	        frame.add(new Update());
    	        frame.setVisible(true);
    	
    }
}