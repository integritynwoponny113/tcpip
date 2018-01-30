package com.ui.views;

import java.awt.Color;
import java.awt.Component;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import java.util.ArrayList;

import javax.swing.ButtonGroup;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListCellRenderer;
import javax.swing.DefaultListModel;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.ListModel;
import javax.swing.UIManager;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;

import com.ui.common.Person;
import javax.swing.JTextArea;
import javax.swing.LayoutStyle.ComponentPlacement;

public class FirstWBGui extends JFrame {

	// Components
	private JPanel ctpMain;
	private final ButtonGroup btgEntree = new ButtonGroup();
	private final ButtonGroup btgMeat = new ButtonGroup();
	private JPanel pnlCountry;
	private JComboBox cbCountryTItle;
	private JLabel lblGame;
	private JScrollPane srcGame;

	// Components Model
	
	private JTextArea txtGame;
	private JLabel lblSchedule;
	private JScrollPane scrollPane;
	private JScrollPane srcSchedule;
	private JTextArea txtLocation;
	private JTextArea txtSchedule;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
		} catch (Throwable e) {
			e.printStackTrace();
		}
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FirstWBGui frame = new FirstWBGui();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public FirstWBGui() {
		initComponents();
		createEvents();
	}

	///////////////////////////////////////////////////////////////////////
	// This method contains all of the code for creating events
	// initializing components
	//////////////////////////////////////////////////////////////////////

	private void initComponents() {

		setTitle("PyeongChang Olympic GUI");
		setIconImage(Toolkit.getDefaultToolkit()
				.getImage(FirstWBGui.class.getResource("/com/ui/resources/Android_128.png")));
		setBackground(Color.BLACK);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1100, 1100);
		ctpMain = new JPanel();
		ctpMain.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(ctpMain);

		pnlCountry = new JPanel();
		pnlCountry.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Game Select",
				TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		
		scrollPane = new JScrollPane();

		GroupLayout gl_ctpMain = new GroupLayout(ctpMain);
		gl_ctpMain.setHorizontalGroup(
			gl_ctpMain.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_ctpMain.createSequentialGroup()
					.addContainerGap()
					.addComponent(pnlCountry, GroupLayout.PREFERRED_SIZE, 1054, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED, 197, Short.MAX_VALUE)
					.addComponent(scrollPane, GroupLayout.PREFERRED_SIZE, 697, GroupLayout.PREFERRED_SIZE)
					.addGap(133))
		);
		gl_ctpMain.setVerticalGroup(
			gl_ctpMain.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_ctpMain.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_ctpMain.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_ctpMain.createSequentialGroup()
							.addComponent(pnlCountry, GroupLayout.DEFAULT_SIZE, 539, Short.MAX_VALUE)
							.addContainerGap())
						.addGroup(gl_ctpMain.createSequentialGroup()
							.addComponent(scrollPane, GroupLayout.PREFERRED_SIZE, 110, GroupLayout.PREFERRED_SIZE)
							.addGap(395))))
		);

		cbCountryTItle = new JComboBox();

		cbCountryTItle.setFont(new Font("굴림", Font.PLAIN, 15));
		cbCountryTItle.setForeground(Color.BLUE);
		cbCountryTItle.setModel(new DefaultComboBoxModel(new String[] { "Korea", "USA", "China", "Japan", "Canada" }));
		cbCountryTItle.setSelectedIndex(-1);

		JLabel lblCountryTitle = new JLabel("Country Title");
		lblCountryTitle.setFont(new Font("굴림", Font.PLAIN, 15));
		lblCountryTitle.setForeground(new Color(0, 0, 0));

		lblGame = new JLabel("Game");
		lblGame.setFont(new Font("굴림", Font.PLAIN, 15));

		srcGame = new JScrollPane();
		
		JLabel lblLocation = new JLabel("Location");
		lblLocation.setFont(new Font("굴림", Font.PLAIN, 15));
		
		JScrollPane srcLocation = new JScrollPane();
		
		lblSchedule = new JLabel("Schedule");
		lblSchedule.setFont(new Font("굴림", Font.PLAIN, 15));
		
		srcSchedule = new JScrollPane();
		GroupLayout gl_pnlCountry = new GroupLayout(pnlCountry);
		gl_pnlCountry.setHorizontalGroup(
			gl_pnlCountry.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_pnlCountry.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblCountryTitle)
					.addGap(34)
					.addGroup(gl_pnlCountry.createParallelGroup(Alignment.LEADING)
						.addComponent(srcSchedule, GroupLayout.DEFAULT_SIZE, 902, Short.MAX_VALUE)
						.addComponent(lblSchedule)
						.addComponent(lblLocation)
						.addComponent(cbCountryTItle, GroupLayout.PREFERRED_SIZE, 144, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblGame)
						.addComponent(srcLocation, GroupLayout.DEFAULT_SIZE, 1825, Short.MAX_VALUE)
						.addComponent(srcGame, GroupLayout.DEFAULT_SIZE, 1825, Short.MAX_VALUE))
					.addContainerGap())
		);
		gl_pnlCountry.setVerticalGroup(
			gl_pnlCountry.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_pnlCountry.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_pnlCountry.createParallelGroup(Alignment.LEADING)
						.addComponent(lblCountryTitle)
						.addComponent(cbCountryTItle, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(22)
					.addComponent(lblGame)
					.addGap(18)
					.addComponent(srcGame, GroupLayout.PREFERRED_SIZE, 110, GroupLayout.PREFERRED_SIZE)
					.addGap(14)
					.addComponent(lblLocation, GroupLayout.PREFERRED_SIZE, 18, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(srcLocation, GroupLayout.PREFERRED_SIZE, 110, GroupLayout.PREFERRED_SIZE)
					.addGap(27)
					.addComponent(lblSchedule, GroupLayout.PREFERRED_SIZE, 18, GroupLayout.PREFERRED_SIZE)
					.addGap(26)
					.addComponent(srcSchedule, GroupLayout.PREFERRED_SIZE, 110, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(417, Short.MAX_VALUE))
		);
		
		txtSchedule = new JTextArea();
		srcSchedule.setViewportView(txtSchedule);
		
		txtLocation = new JTextArea();
		srcLocation.setViewportView(txtLocation);

		txtGame = new JTextArea();
		srcGame.setColumnHeaderView(txtGame);

		initCountryList();
		pnlCountry.setLayout(gl_pnlCountry);
		ctpMain.setLayout(gl_ctpMain);

	}

	private void initCountryList() {
		// Adding some "random" people and superheroes to the custoemrList

	}

	///////////////////////////////////////////////////////////////////////
	// This method contains all of the code for creating events
	// initializing components
	//////////////////////////////////////////////////////////////////////
	private void createEvents() {

		cbCountryTItle.addMouseListener(new MouseAdapter() {
			// @Override
			// public void mouseClicked(MouseEvent arg0) {
			// if(cbCountryTItle.getSelectedIndex() == 0) {
			// System.out.println("sdafas");
			// }
			//
			// }

			// @Override
			// public void mousePressed(MouseEvent e) {
			// if(cbCountryTItle.getSelectedIndex() == 0) {
			// System.out.println("sdafas");
			// System.out.println("sdfsf");
			// }
			// }

			// @Override
			// public void mouseEntered(MouseEvent e) {
			//
			// if(cbCountryTItle.getSelectedIndex() == 0) {
			// System.out.println("sdafas");
			// }
			//
			// }
		});

		cbCountryTItle.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				if (cbCountryTItle.getSelectedIndex() == 0) {
					
					txtGame.setText("");
					txtLocation.setText("");
					txtSchedule.setText("");
					txtGame.append("1.알파인스키  ");
					txtGame.append("2.피겨스케이팅  ");
					txtGame.append("3.아이스 하키  ");
					txtGame.append("4.쇼트트랙 스피드 스케이팅  ");
					txtGame.append("5.스키점프");
					
					txtLocation.append("1.평창 정선 알파인 경기장  ");
					txtLocation.append("2.강릉 아이스 아레나  ");
					txtLocation.append("3.강릉 관동 하키 센터  ");
					txtLocation.append("4.강릉 아이스 아레나  ");
					txtLocation.append("5.평창 알펜시아 스키점프 센터  ");
					
					txtSchedule.append("1.2/11 ~ 2/24  ");
					txtSchedule.append("2.2/9 ~ 2/25  ");
					txtSchedule.append("3.2/10 ~ 2/25  ");
					txtSchedule.append("4.2/10 ~ 2/22  ");
					txtSchedule.append("5.2/8 ~ 2/19  ");

					
				
					
				} else if (cbCountryTItle.getSelectedIndex() == 1) {
				
					txtGame.setText("");
					txtLocation.setText("");
					txtSchedule.setText("");
					txtGame.append("1.알파인스키  ");
					txtGame.append("2.피겨스케이팅  ");
					txtGame.append("3.아이스 하키  ");
					txtGame.append("4.스키점프");
					
					txtLocation.append("1.평창 정선 알파인 경기장  ");
					txtLocation.append("2.강릉 아이스 아레나  ");
					txtLocation.append("3.강릉 관동 하키 센터  ");
					txtLocation.append("4.평창 알펜시아 스키점프 센터  ");
					
					txtSchedule.append("1.2/11 ~ 2/24  ");
					txtSchedule.append("2.2/9 ~ 2/25  ");
					txtSchedule.append("3.2/10 ~ 2/25  ");
					txtSchedule.append("4.2/8 ~ 2/19  ");
					

				} else if (cbCountryTItle.getSelectedIndex() == 2) {
					txtGame.setText("");
					txtLocation.setText("");
					txtSchedule.setText("");
					txtGame.append("1.알파인스키  ");
					txtGame.append("2.피겨스케이팅  ");
					txtGame.append("3.쇼트트랙 스피드 스케이팅  ");
					txtGame.append("4.스키점프");
					
					txtLocation.append("1.평창 정선 알파인 경기장  ");
					txtLocation.append("2.강릉 아이스 아레나  ");
					txtLocation.append("3.강릉 아이스 아레나  ");
					txtLocation.append("4.평창 알펜시아 스키점프 센터  ");
					
					txtSchedule.append("1.2/11 ~ 2/24  ");
					txtSchedule.append("2.2/9 ~ 2/25  ");
					txtSchedule.append("3.2/10 ~ 2/22  ");
					txtSchedule.append("4.2/8 ~ 2/19  ");
					

				} else if (cbCountryTItle.getSelectedIndex() == 3) {
					txtGame.setText("");
					txtLocation.setText("");
					txtSchedule.setText("");

					txtGame.removeAll();
					txtLocation.removeAll();
					txtSchedule.removeAll();
					
					txtGame.append("1.알파인스키  ");
					txtGame.append("2.쇼트트랙 스피드 스케이팅  ");
					txtGame.append("3.피겨스케이팅  ");
		
					txtLocation.append("1.평창 정선 알파인 경기장  ");
					txtLocation.append("2.강릉 아이스 아레나  ");
					txtLocation.append("3.강릉 아이스 아레나  ");
				
					txtSchedule.append("1.2/11 ~ 2/24  ");
					txtSchedule.append("2.2/10 ~ 2/22  ");
					txtSchedule.append("3.2/9 ~ 2/25  ");
			
					
					
					

				} else if (cbCountryTItle.getSelectedIndex() == 4) {
					txtGame.setText("");
					txtLocation.setText("");
					txtSchedule.setText("");


					txtGame.removeAll();
					txtLocation.removeAll();
					txtSchedule.removeAll();
					
					txtGame.append("1.알파인스키  ");
					txtGame.append("2.아이스 하키  ");
					txtGame.append("3.스키점프");
					
					txtLocation.append("1.평창 정선 알파인 경기장  ");
					txtLocation.append("2.강릉 관동 하키 센터  ");
					txtLocation.append("3.평창 알펜시아 스키점프 센터  ");
					
					txtSchedule.append("1.2/11 ~ 2/24  ");
					txtSchedule.append("2.2/10 ~ 2/25  ");
					txtSchedule.append("3.2/8 ~ 2/19  ");
					

				}

			}
		});

	}
}
