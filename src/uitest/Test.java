package uitest;

import java.awt.Button;
import java.awt.Color;
import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Test {
	Frame frame;
	Button b1,b2;
	public Test() {
		frame = new Frame();
		b1 = new Button("Button1");
		b2 = new Button("Button2");

	}
	
	public void makeUi() {///어나미머스 매서드~
		frame.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				frame.dispose();
				
			}
			
		});
		frame.setSize(600, 400);
		frame.setBackground(Color.PINK);
		frame.setTitle("new window");
		frame.add(b1);
		frame.add(b2);
		
		frame.setLocation(500, 400);
		frame.setVisible(true);
		}
	
	
	
	
}
