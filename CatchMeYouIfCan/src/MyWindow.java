//	������
import java.awt.CardLayout;

import javax.swing.*;
//	JDK 1.2 ���� (java), ���� (javax)	=>	xml, sql...
//	������ ����� ��ü ����ϰ� �ʹ�	:	���(extends)
/*
 * 		������
 * 			JFrame   :     �Ϲ� ������
 * 			JPanel
 * 			=======
 * 			JDidalog	:  
 * 			JWindow
 * 
 * 			1)	������
 * 			2)	�޴�
 * 			3)	�α���
 * 			==========
 * 			
 */
import java.awt.event.*;
public class MyWindow extends JFrame implements ActionListener{
	MainView mv=new MainView();
	WaitRoom wr=new WaitRoom();
	Catch_gameroom gr=new Catch_gameroom();
	CardLayout card=new CardLayout();
	//	�����켳��
	MyWindow() {
		setLayout(card);
		add("MV",mv);
		add("WR",wr);
		add("GR",gr);
		
		
		setSize(1251, 750);
		setVisible(true);
		setResizable(false);
		
		mv.b1.addActionListener(this);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try 
		{
			UIManager.setLookAndFeel("com.jtattoo.plaf.acryl.AcrylLookAndFeel");
			
		}catch(Exception ex) {}	//����ó��
		MyWindow m=new MyWindow();
		m.setLocationRelativeTo(null);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==mv.b1)
		{
			card.show(getContentPane(), "WR");
		}
	}

}
