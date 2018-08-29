import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.imageio.ImageIO;
import java.io.File;
import javax.swing.table.*;

public class WaitRoom extends JPanel implements ActionListener {
   Image back;
   JLabel la1, la2;
   JTable table1, table2;
   DefaultTableModel model1, model2;
   JTextArea ta;
   JTextField tf;
   JButton b1;
   ImageIcon mb;

   WaitRoom() {
      setLayout(null);
      back = Toolkit.getDefaultToolkit().getImage("C:\\javaDev\\waitingroom.png");

      la1 = new JLabel("�氳�� ����");
      la2 = new JLabel("������ ����");
      ta = new JTextArea();
      JScrollPane js3 = new JScrollPane(ta);
      tf = new JTextField();
      
      //�游��� ��ư
      mb=new ImageIcon("C:\\javaDev\\newroombtn.png");
      b1 = new JButton("",mb);      

      // table
      String[] col1 = { "���̸�", "����/�����", "���ο�" };
      String[][] row1 = new String[0][3];
      model1 = new DefaultTableModel(row1, col1);
      table1 = new JTable(model1);
      JScrollPane js1 = new JScrollPane(table1);

      String[] col2 = { "���̵�", "����ġ" };
      String[][] row2 = new String[0][2];
      model2 = new DefaultTableModel(row2, col2);
      table2 = new JTable(model2);
      JScrollPane js2 = new JScrollPane(table2);

      // ��ġ
      la1.setBounds(30, 70, 100, 30);
      js1.setBounds(30, 95, 700, 350);
      js1.setOpaque(false);
      js1.getViewport().setOpaque(false);
      //add(la1);
      add(js1);

      la2.setBounds(820, 70, 130, 30);
      js2.setBounds(820, 95, 340, 350);
      js2.setOpaque(false);
      js2.getViewport().setOpaque(false);
      //add(la2);
      add(js2);
      
      
      ta.setBounds(30, 470, 700, 205); // ä��â
      ta.setOpaque(true);
      add(ta);
      tf.setBounds(30, 685, 700, 20); // ä��ġ�°�
      tf.setOpaque(true);
      add(tf);
      
      b1.setBounds(930, 645, 120, 50); //�游��� ��ư
      b1.setOpaque(false);
      //�̹��� �ڿ� ��ư ���� �Ⱥ��̰� �ϴ°�
      b1.setBorderPainted(false); 
      b1.setFocusPainted(false); 
      b1.setContentAreaFilled(false);
      
      add(b1);

      setSize(1251, 750);
      setVisible(true);

      tf.addActionListener(this);
   }

   public static void main(String[] args) {
      WaitRoom wr = new WaitRoom();
      try {
         UIManager.setLookAndFeel("com.jtattoo.plaf.mint.MintLookAndFeel");
      } catch (Exception ex) {
      } // ����ó��
   }

   @Override
   public void actionPerformed(ActionEvent e) { // ä����ġ�� ä��â�� �ԷµȰ� �ö󰡴°�
      if (e.getSource() == tf) {
         String s = tf.getText();
         ta.append(s + "\n");
         tf.setText("");
      }
   }

   //��׶��� ���ȭ�� : Ŭ�������� ������ Ŭ�� -> Source->Override����� ->paincomponent
   @Override
   protected void paintComponent(Graphics g) {
      g.drawImage(back, 0, 0, getWidth(), getHeight(), this);

   }
}