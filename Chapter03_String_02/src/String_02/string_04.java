package String_02;

import javax.swing.*;
public class string_04  extends JFrame{
	JTextField tf=new JTextField();
	public string_04()
	{
		add("North",tf);
		tf.setText(String.valueOf(1000)); //"true"
		setSize(350, 300);
		setVisible(true);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new string_04();

	}

}
