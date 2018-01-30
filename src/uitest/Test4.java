package uitest;

import java.awt.Button;
import java.awt.Color;
import java.awt.Font;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.List;
import java.awt.Panel;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.ArrayList;



public class Test4 implements ActionListener {
	Frame frame;
	Panel p1, p2, p3, p4,p5;
	Button b1, b2;
	TextField tf1, tf2;
	Label label;
	List alist;
	ArrayList<UserVO> list;
	Biz biz;

	public Test4() {
		frame = new Frame();
		p1 = new Panel();
		p2 = new Panel();
		p3 = new Panel();
		p4 = new Panel();
		p5 = new Panel();
		b1 = new Button("Button1");
		b2 = new Button("delete");
		tf1 = new TextField(10);
		tf2 = new TextField(10);
		label = new Label("Result : ");
		alist = new List();
		list = new ArrayList<>();
	}

	public void makeUi() {/// 어나미머스 매서드~
		
		Biz<UserVO, String> biz = new UserBiz();

		UserVO user = null;
		alist.addItemListener(new ItemListener() {

			@Override
			public void itemStateChanged(ItemEvent s) {
				int position = (int) s.getItem();
				UserVO user = list.get(position);
				String result = user.getId() + " " + user.getPwd() + " " + user.getName();
				label.setText(result);

			}
		});
		b1.addActionListener(this);
		b2.addActionListener(this);
		frame.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				frame.dispose();

			}

		});
		frame.setSize(1000, 800);
		frame.setBackground(Color.PINK);
		frame.setTitle("new window");

		p1.setBackground(Color.cyan);
		p1.setLayout(new GridLayout(2, 1));
		p4.setBackground(Color.BLUE);
		p1.add(p3);
		p3.add(tf1);
		p3.add(b1);
		p3.add(b2);
		p1.add(p4);

		// 패널은 가운데 정렬을 기본값으로 한다

		p2.setBackground(Color.gray);
		label.setSize(200, 200);
		Font font = new Font(label.getText(), 1, 30);
		label.setFont(font);

		p2.add(label);
		///////////////////////////

		/////////////////////////////
		label.setLocation(500, 500);
		frame.setLayout(new GridLayout(3, 1));
		frame.add(p1, "North");

		frame.add(alist, "Center");
		frame.add(p2, "South");

		frame.setLocation(100, 100);
		frame.setVisible(true);
	}

	private void getData() {
		list.add(new UserVO("100", "123", "su1"));
		list.add(new UserVO("101", "123", "su2"));
		list.add(new UserVO("102", "123", "su3"));
		list.add(new UserVO("103", "123", "su4"));
		list.add(new UserVO("104", "123", "su5"));
		list.add(new UserVO("105", "123", "su6"));
		list.add(new UserVO("106", "123", "su7"));

		for (UserVO x : list) {
			alist.add(x.getId() + " " + x.getPwd() + " " + x.getName());
		}

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == b1) {
			label.setText("Result : " + tf1.getText());
			tf1.setText("");
		} else if (e.getSource() == b2) {
			int index = alist.getSelectedIndex();
			System.out.println(index);
		}

	}

}
