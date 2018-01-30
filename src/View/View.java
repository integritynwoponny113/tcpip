package View;

import java.awt.BorderLayout;
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

import com.frame.Biz;
import com.product.ProductBiz;
import com.user.UserBiz;
import com.vo.ProductVO;
import com.vo.UserVO;

public class View implements ActionListener {
	Frame frame;
	Panel p1, p2, p3, p4, p5, p6, p7, p8;
	Button b1, b2, b3, b4, b5, b6;
	TextField txf1, txf2, txf3;
	Label label1, label2;
	Font font;
	List alist;
	Biz<UserVO,String> biz1;
	Biz<ProductVO,Integer> biz2;
	ArrayList<UserVO> userList;
	ArrayList<ProductVO> productList;
	boolean user_fact;

	public View() {
		frame = new Frame();
		p1 = new Panel();
		p2 = new Panel();
		p3 = new Panel();
		p4 = new Panel();
		p5 = new Panel();
		p6 = new Panel();
		p7 = new Panel();
		p8 = new Panel();
		b1 = new Button("User");
		b2 = new Button("Product");
		b3 = new Button("생성");
		b4 = new Button("수정");
		b5 = new Button("제거");
		b6 = new Button("탐색");
		txf1 = new TextField(8);
		txf2 = new TextField(8);
		txf3 = new TextField(8);
		label1 = new Label("                                " + "                        ");
		label2 = new Label();
		alist = new List();
		font = new Font(label1.getText(), 1, 20);
		biz1 = new UserBiz();
		biz2 = new ProductBiz();

	}

	public void makeUi() {

		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);
		b5.addActionListener(this);
		b6.addActionListener(this);

		frame.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				frame.dispose();
			}
		});
		alist.addItemListener(new ItemListener() {

			@Override
			public void itemStateChanged(ItemEvent s) {
				
				if (user_fact) {
				int position = (int) s.getItem();
				UserVO user = userList.get(position);
				
				txf1.setText(user.getId());
				txf2.setText(user.getPwd());
				txf3.setText(user.getName());
				
				
				}else {
					int position = (int) s.getItem();
					ProductVO product =productList.get(position);
					
					txf1.setText(String.valueOf(product.getId()));
					txf2.setText(product.getName());
					txf3.setText(String.valueOf(product.getPrice()));
					
				}
			}
		});

		frame.setSize(800, 600);
		frame.setBackground(Color.DARK_GRAY);
		frame.setLayout(new GridLayout(1, 2, 10, 10));

		/////////// color///////////
		p1.setBackground(Color.DARK_GRAY);
		p3.setBackground(Color.GRAY);
		
		p5.setBackground(Color.LIGHT_GRAY);
		p6.setBackground(Color.LIGHT_GRAY);

		///////// color///////////
		////// p1//////////////////
		frame.add(p1);
		p1.setLayout(new GridLayout(2, 1, 10, 10));
		p1.add(p3);
		p3.setLayout(new GridLayout(4, 1));
		p3.add(p5);
		p3.add(p6);
		p3.add(p7);
		label1.setFont(font);

		p6.add(label1);
		p7.add(txf1);
		p7.add(txf2);
		p7.add(txf3);
		p6.setLocation(100, 100);

		p5.add(b1);
		p5.add(b2);
		p5.add(b3);
		p5.add(b4);
		p5.add(b5);
		p5.add(b6);
		
		

		p1.add(p4);

		////// p1//////////////////

		////// p2//////////////////
		frame.add(p2);
		p2.setLayout(new BorderLayout());
		p2.add(alist);
		// frame.add(p2);
		// frame.add(p4);

		////// p2//////////////////

		frame.setVisible(true);
		frame.setLocation(200, 200);
		frame.setTitle("수정 프로그램");
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == b1) {
			label1.setText("유저 id           pwd       name ");
			user_fact =true;getData();
			
		} else if (e.getSource() == b2) {
			label1.setText("물건 id          name      price ");
			user_fact =false;getData();
		}
		if (e.getSource() == b3) {
			String str1 = txf1.getText();
			String str2 = txf2.getText();
			String str3 = txf3.getText();

			if (user_fact) {
				System.out.println("userbiz");

				UserVO user = new UserVO(str1, str2, str3);
				try {
					biz1.register(user);
				} catch (Exception e1) {
					p4.setBackground(Color.RED);
					e1.printStackTrace();
				}

			} else {
				System.out.println("productbiz");

				ProductVO product = new ProductVO(Integer.parseInt(str1), str2, Double.parseDouble(str3));

				try {
					biz2.register(product);
				} catch (Exception e1) {
					p4.setBackground(Color.RED);
					e1.printStackTrace();
				}
			}
			getData();
			txfClear();
		}
		if (e.getSource() == b4) {
			String str1 = txf1.getText();
			String str2 = txf2.getText();
			String str3 = txf3.getText();

			if (user_fact) {

				UserVO user = new UserVO(str1, str2, str3);
				try {
					biz1.modify(user);
				} catch (Exception e1) {
					p4.setBackground(Color.RED);
					e1.printStackTrace();
				}

			} else {
				ProductVO product = new ProductVO(Integer.parseInt(str1), str2, Double.parseDouble(str3));

				try {
					biz2.modify(product);
				} catch (Exception e1) {
					p4.setBackground(Color.RED);
					e1.printStackTrace();
				}
			}
			getData();
			txfClear();
		}
		if (e.getSource() == b5) {
			String str1 = txf1.getText();
			if (user_fact) {

				try {
					biz1.remove(str1);
				} catch (Exception e1) {
					p4.setBackground(Color.RED);
					e1.printStackTrace();
				}

			} else {
				try {
					biz2.remove(Integer.parseInt(str1));
				} catch (Exception e1) {
					p4.setBackground(Color.RED);
					e1.printStackTrace();
				}
			}
			getData();
			txfClear();
		}
		if (e.getSource() == b6) {
			String str1 = txf1.getText();
			if (user_fact) {

				try {
					biz1.get(str1);
				} catch (Exception e1) {
					p4.setBackground(Color.RED);
					e1.printStackTrace();
				}

			} else {
				try {
					biz2.get(Integer.parseInt(str1));
				} catch (Exception e1) {
					p4.setBackground(Color.RED);
					e1.printStackTrace();
				}
			}
			getData();
			txfClear();
		}

	}

	public void txfClear() {
		txf1.setText("");
		txf2.setText("");
		txf3.setText("");
	}
	public void getData() {
		alist.removeAll();
		if (user_fact) {
			try {
				userList=biz1.get();
			} catch (Exception e) {
				p4.setBackground(Color.RED);
				e.printStackTrace();
			}
		for (UserVO x : userList) {
			alist.add(x.getId() + " " + x.getPwd() + " " + x.getName());
		}}
		else {try {
			productList = biz2.get();
		} catch (Exception e) {
			p4.setBackground(Color.RED);
			e.printStackTrace();
		}
			for (ProductVO x : productList) {
				alist.add(x.getId() + " " + x.getName() + " " + x.getPrice());
			}
			
		}
	}
}
