package UItest;

import java.awt.Button;
import java.awt.Color;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.Panel;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Test4 implements ActionListener{

	Frame frame;
	Panel p1,p2;
	Button b1,b2,b3,b4,b5;
	TextField txf,txf2;
	Label label1,label2;
	public Test4() {
		frame = new Frame();
		b1 = new  Button("Button1");
		b2 = new Button("Button2");
		p1 =new Panel();
		p2 = new Panel();
		txf = new TextField();
		txf2 = new TextField();
		label1 = new Label("result1 :");
		label2 = new Label("result2 :");
		

	}
	public void makeUi() {
		//this.actionPerformed(e);
		frame.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				frame.dispose();
			}
		});
		
		b1.addActionListener(this);
		b2.addActionListener(this);
		frame.setSize(300,200);
		frame.setBackground(Color.DARK_GRAY);
		frame.setVisible(true);
		frame.setLocation(200, 500);
		frame.setTitle("NW");
		//frame.setName("ADSFA");//??
		p1.setBackground(Color.GREEN);
		p1.add(txf);
		p1.add(b1);
		p1.add(txf2);
		p1.add(b2);
		frame.add(p1, "South");
		
		p2.setBackground(Color.white);
		p2.add(label1);
		p2.add(label2);
		frame.add(p2, "North");
		
		frame.setLayout(new GridLayout(2, 1));
		p1.setLayout(new GridLayout(2, 2));
		p2.setLayout(new GridLayout(2, 1));
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==b1) {
			/*label1 = new Label(txf.getText());
			txf.setText("");
			p2.setBackground(Color.white);
			p2.add(label1);
			frame.add(p2, "North");
			frame.setVisible(true);*/
			label1.setText("result1 :"+txf.getText());
			txf.setText("");
		}else if(e.getSource()==b2) {
			/*label1 = new Label(txf.getText());
			txf.setText("");
			p2.setBackground(Color.white);
			p2.add(label1);
			frame.add(p2, "North");
			frame.setVisible(true);*/
			label2.setText("result2 :"+txf2.getText());
			txf2.setText("");
		}
		
	}

}

