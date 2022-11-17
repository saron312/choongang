package window;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class ButtonEx1 {
	public static void main(String[] args) {
		JFrame f = new JFrame();
		JButton b = new JButton("click");
		JLabel la = new JLabel("안녕"); ///
		JTextField tf = new JTextField();
		la.setLocation(30,30); ///
		la.setSize(50,20);
		f.add(la); ///
		tf.setBounds(100,150,80,30);
		f.add(tf);
		b.setBounds(100,100,80,30);
		f.addMouseListener(new MouseListener() {

			@Override
			public void mouseClicked(MouseEvent e) {
				
			}

			@Override
			public void mousePressed(MouseEvent e) {
				int x = e.getX();
				int y = e.getY();
				la.setLocation(x, y);
			}

			@Override
			public void mouseReleased(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mouseEntered(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mouseExited(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
		});
		b.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
//				System.out.println("클릭!");
				tf.setText("나완다!");
			}
			
		});
		f.add(b);
		f.setSize(300,400);
		f.setLayout(null);
		f.setVisible(true);
	}
}
