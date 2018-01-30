package uitest;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.Frame;
import java.awt.Label;
import java.awt.Panel;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Test3 implements ActionListener{
	Frame frame;
	Panel p1,p2;
	Button b1,b2;
	TextField tf1;
	Label label;
	public Test3() {
		frame = new Frame();
		p1 = new Panel();
		p2 = new Panel();
		b1 = new Button("Button1");
		b2 = new Button("Button2");
		tf1 = new TextField(10);
		label = new Label("Result : ");

	}
	
	public void makeUi() {///어나미머스 매서드~
		b1.addActionListener(this);
		frame.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				frame.dispose();
				
			}
			
		});
		frame.setSize(600, 400);
		frame.setBackground(Color.PINK);
		frame.setTitle("new window");
		
		p1.setBackground(Color.cyan);
		p1.add(tf1);
		p1.add(b1);//패널은 가운데 정렬을 기본값으로 한다

		
		p2.setBackground(Color.gray);
		
		label.setSize(1000, 10);
		p2.add(label);
		
		frame.setLayout(new BorderLayout());
		frame.add(p1,"North");
		frame.add(p2,"South");
		
		frame.setLocation(500, 400);
		frame.setVisible(true);
		}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == b1) {
			label.setText("Result : "+tf1.getText());
			tf1.setText("");
		}
		
	}
	
	
	
	
}
