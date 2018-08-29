//	윈도우
import java.awt.CardLayout;

import javax.swing.*;
//	JDK 1.2 이전 (java), 이후 (javax)	=>	xml, sql...
//	윈도우 기능을 전체 사용하고 싶다	:	상속(extends)
/*
 * 		윈도우
 * 			JFrame   :     일반 윈도우
 * 			JPanel
 * 			=======
 * 			JDidalog	:  
 * 			JWindow
 * 
 * 			1)	윈도우
 * 			2)	메뉴
 * 			3)	로그인
 * 			==========
 * 			
 */
import java.awt.event.*;
public class MyWindow extends JFrame implements ActionListener{
	MainView mv=new MainView();
	WaitRoom wr=new WaitRoom();
	Catch_gameroom gr=new Catch_gameroom();
	CardLayout card=new CardLayout();
	//	윈도우설정
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
			
		}catch(Exception ex) {}	//예외처리
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
