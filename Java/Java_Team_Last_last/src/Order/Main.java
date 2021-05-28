package Order;

import Start.*;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;

import java.awt.CardLayout;
import java.awt.Color;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.awt.event.ActionEvent;
import javax.swing.JTextPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import Date.Month;
import message.MyMShow;

import javax.swing.JScrollPane;

public class Main extends JFrame {

	public static String[] menu = { "NBB시그니처세트", "NBB오리지널세트", "NBB어메이징세트", "미트마니아세트", "메가바이트세트", "산체스세트", "스모키살사세트",
			"데리마요세트", "그릴드불고기세트", "코울슬로세트", "NBB시그니처", "NBB오리지널", "NBB어메이징", "미트마니아", "메가바이트", "산체스", "스모키살사", "데리마요",
			"그릴드불고기", "코울슬로치킨", "노치킨너겟", "어니언 도넛", "NBB치킨너겟", "감자튀김M", "감자튀김L", "인절미치즈볼", "치킨시저샐러드", "그린샐러드",
			"상하이핑거포크L", "상하이핑거포크S", "펩시콜라M", "사이다M", "환타 (오렌지)M", "펩시맥스 (0)M", "오렌지주스M", "아메리카노Hot", "아메리카노Iced" };
	static int[] code = new int[menu.length];

	public static int[] price = { 5300, 4700, 6500, 6900, 5900, 5700, 5600, 4700, 3900, 5800, 3500, 2900, 4900, 5300,
			4300, 3800, 3700, 2900, 1900, 3900, 2900, 2500, 2500, 1500, 2000, 2900, 3800, 3300, 15000, 4200, 1500, 1500,
			1500, 1500, 3000, 2000, 2000 };
	static int[] mount = new int[menu.length];
	Update up = new Update();
	Save os = new Save();
	JTable table = new JTable();
	JButton backbtn = new JButton();

	public Main() {
		for (int i = 0; i < menu.length; i++) {
			code[i] = i;
		}
		getContentPane().setLayout(null);

		JButton burger = new JButton("버거 세트");
		burger.setBounds(750, 0, 134, 97);
		getContentPane().add(burger);

		JButton chicken = new JButton("버거");
		chicken.setBounds(750, 97, 134, 103);
		getContentPane().add(chicken);

		JButton side = new JButton("사이드");
		side.setBounds(750, 196, 134, 97);
		getContentPane().add(side);

		JButton beverage = new JButton("음료");
		beverage.setBounds(750, 293, 134, 97);
		getContentPane().add(beverage);

		JPanel panel = new JPanel();
		panel.setBackground(Color.LIGHT_GRAY);
		panel.setBounds(0, 0, 750, 390);
		getContentPane().add(panel);
		panel.setLayout(new CardLayout(0, 0));

		APanel a = new APanel();
		panel.add(a, "1");
		BPanel b = new BPanel();
		panel.add(b, "2");
		CPanel c = new CPanel();
		panel.add(c, "3");
		DPanel d = new DPanel();
		panel.add(d, "4");

		JButton check = new JButton("확인");
		check.setBounds(0, 388, 447, 58);
		getContentPane().add(check);

		JButton clear = new JButton("초기화");
		clear.setBounds(445, 388, 439, 58);
		getContentPane().add(clear);

		JButton order = new JButton("주문 확인");
		order.setEnabled(false);
		order.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				GetTableString gts = new GetTableString();
				String message = gts.getTableData(table);
				MyMShow.showMe(message);
				DefaultTableModel model = (DefaultTableModel) table.getModel();
				model.setNumRows(0);
				String str[] = new String[menu.length];
				for (int i = 0; i < menu.length; i++) {
					model = (DefaultTableModel) table.getModel();
					str[i] = null;
				}

				order.setEnabled(false);

				os.Order();
				SimpleDateFormat date = new SimpleDateFormat("yyyyMMdd");
				Calendar time = Calendar.getInstance();
				String name = date.format(time.getTime());
				for (int i = 0; i < menu.length; i++) {
					if (mount[i] != 0) {
						up.update(mount[i], code[i], name);
					}
				}
				a.Clear();
				b.Clear();
				c.Clear();
				d.Clear();
			}
		});
		order.setBounds(69, 816, 742, 45);
		getContentPane().add(order);
		table.setModel(new DefaultTableModel(new Object[][] { { null, null, null, null }, },
				new String[] { "상품명", "가격", "수량", "합계" }));

		JScrollPane scrollPane = new JScrollPane(table);
		scrollPane.setBounds(0, 441, 884, 376);
		getContentPane().add(scrollPane);
		table.setBounds(0, 0, 0, 0);

		// 뒤로가기
		JButton backbtn = new JButton("");
		backbtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new login();
				dispose();
			}
		});
		backbtn.setBounds(866, 847, 16, 14);
		getContentPane().add(backbtn);
		backbtn.setBorderPainted(false); // 버튼 테두리 설정
		backbtn.setContentAreaFilled(false); // 버튼 영역 배경 표시 설정
		backbtn.setFocusPainted(false); // 포커스 표시 설정

		JPanel panel_1 = new JPanel();
		panel_1.setBackground(Color.ORANGE);
		panel_1.setBounds(0, 816, 884, 45);
		getContentPane().add(panel_1);
		backbtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new login();
				dispose();
			}
		});

		burger.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				CardLayout cards = (CardLayout) panel.getLayout();
				cards.show(panel, "1");
			}
		});
		chicken.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				CardLayout cards = (CardLayout) panel.getLayout();
				cards.show(panel, "2");
			}
		});
		side.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				CardLayout cards = (CardLayout) panel.getLayout();
				cards.show(panel, "3");
			}
		});
		beverage.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				CardLayout cards = (CardLayout) panel.getLayout();
				cards.show(panel, "4");
			}
		});
		check.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				order.setEnabled(true);
				DefaultTableModel model = (DefaultTableModel) table.getModel();
				model.setNumRows(0);
				String str[] = new String[menu.length];
				for (int i = 0; i < menu.length; i++) {
					if (mount[i] != 0)
						model = (DefaultTableModel) table.getModel();
					str[0] = menu[i];
					str[1] = "" + price[i];
					str[2] = "" + mount[i];
					str[3] = "" + (price[i] * mount[i]);
					if (!(str[2].equals("0"))) {// null값이 아니면
						model.addRow(str);// 데이터출력
					}
				}
			}

		});

		clear.addActionListener(new ActionListener() {//초기화
			public void actionPerformed(ActionEvent e) {
				DefaultTableModel model = (DefaultTableModel) table.getModel();
				model.setNumRows(0);
				String str[] = new String[menu.length];
				for (int i = 0; i < menu.length; i++) {
					model = (DefaultTableModel) table.getModel();
					str[i] = null;
				}
				a.Clear();
				b.Clear();
				c.Clear();
				d.Clear();
				order.setEnabled(false);
			}
		});

		setVisible(true);
		setSize(900, 900);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

	public static void main(String[] args) {
		new Main();
	}
}
