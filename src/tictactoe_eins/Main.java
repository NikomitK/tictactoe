package tictactoe_eins;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Main implements ActionListener{
	
	private static JLabel gewonnen;
	private static JLabel tied;
	private static JPanel panel;
	private static JFrame frame;
	private static JButton eins;
	private static JButton zwei;
	private static JButton drei;
	private static JButton vier;
	private static JButton fuenf;
	private static JButton sechs;
	private static JButton sieben;
	private static JButton acht;
	private static JButton neun;
	private static JLabel won;
	private static double lol;
	private static boolean fertig;
	private static String c;
	private static String a;
	private static String b;
	private static String l;
	private static String d;
	private static String j;
	private static String f;
	private static String g;
	private static String h;
	private static String i;
	private static String s;
	
	
	public static void GUI() {
		panel = new JPanel();
		frame = new JFrame();
		frame.setTitle("TICTACTOE");
		frame.setSize(300, 300);
		panel.setBackground(Color.gray);
		panel.setLayout(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		frame.add(panel);
		
		tied = new JLabel("GLEICHSTAND");
		tied.setBounds(35, 190, 500, 50);
		tied.setForeground(Color.red);
		tied.setFont (new Font("Arial", Font.BOLD, 30));
		tied.setVisible(false);
		panel.add(tied);
		
		won = new JLabel("GEWONNEN");
		won.setBounds(53, 205, 500, 50);
		won.setForeground(Color.green);
		won.setFont (new Font("Arial", Font.BOLD, 30));
		won.setVisible(false);
		panel.add(won);
		
		gewonnen = new JLabel("GEWONNEN!");
		gewonnen.setBounds(95, 170, 500, 50);
		gewonnen.setForeground(Color.green);
		gewonnen.setFont (new Font("Arial", Font.BOLD, 30));
		gewonnen.setVisible(false);
		panel.add(gewonnen);
		
		
		sieben = new JButton(" ");
		sieben.setBounds(60, 10, 55, 55);
		sieben.addActionListener(new Main());
		sieben.setBackground(Color.DARK_GRAY);
		sieben.setFont (new Font("Arial", Font.PLAIN, 25));
		panel.add(sieben);
		
		acht = new JButton(" ");
		acht.setBounds(115, 10, 55, 55);
		acht.addActionListener(new Main());
		acht.setBackground(Color.DARK_GRAY);
		acht.setFont (new Font("Arial", Font.PLAIN, 25));
		panel.add(acht);
		
		neun = new JButton(" ");
		neun.setBounds(170, 10, 55, 55);
		neun.addActionListener(new Main());
		neun.setBackground(Color.DARK_GRAY);
		neun.setFont (new Font("Arial", Font.PLAIN, 25));
		panel.add(neun);
		
		sechs= new JButton(" ");
		sechs.setBounds(170, 65, 55, 55);
		sechs.addActionListener(new Main());
		sechs.setBackground(Color.DARK_GRAY);
		sechs.setFont (new Font("Arial", Font.PLAIN, 25));
		panel.add(sechs);
		
		fuenf= new JButton(" ");
		fuenf.setBounds(115, 65, 55, 55);
		fuenf.addActionListener(new Main());
		fuenf.setBackground(Color.DARK_GRAY);
		fuenf.setFont (new Font("Arial", Font.PLAIN, 25));
		panel.add(fuenf);
		
		vier= new JButton(" ");
		vier.setBounds(60, 65, 55, 55);
		vier.addActionListener(new Main());
		vier.setBackground(Color.DARK_GRAY);
		vier.setFont (new Font("Arial", Font.PLAIN, 25));
		panel.add(vier);
		
		drei= new JButton(" ");
		drei.setBounds(170, 120, 55, 55);
		drei.addActionListener(new Main());
		drei.setBackground(Color.DARK_GRAY);
		drei.setFont (new Font("Arial", Font.PLAIN, 25));
		panel.add(drei);
		
		zwei= new JButton(" ");
		zwei.setBounds(115, 120, 55, 55);
		zwei.addActionListener(new Main());
		zwei.setBackground(Color.DARK_GRAY);
		zwei.setFont (new Font("Arial", Font.PLAIN, 25));
		panel.add(zwei);
		
		eins= new JButton(" ");
		eins.setBounds(60, 120, 55, 55);
		eins.addActionListener(new Main());
		eins.setBackground(Color.DARK_GRAY);
		eins.setFont (new Font("Arial", Font.PLAIN, 25));
		panel.add(eins);
	}
	
	public static void main(String[] args) {
		
		
		char lmao = 'j';
		//while(int i = 0; i<2; i++) {
			GUI();
		//}
		
		
		/*panel = new JPanel();
		frame = new JFrame();
		frame.setSize(500, 500);
		panel.setBackground(Color.gray);
		panel.setLayout(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		frame.add(panel);
		
		
		gewonnen = new JLabel("GEWONNEN!");
		gewonnen.setBounds(10, 20, 500, 50);
		gewonnen.setForeground(Color.green);
		gewonnen.setFont (new Font("Arial", Font.BOLD, 52));
		gewonnen.setVisible(false);
		panel.add(gewonnen);
		
		
		sieben = new JButton(" ");
		sieben.setBounds(10, 10, 55, 55);
		sieben.addActionListener(new Main());
		sieben.setBackground(Color.DARK_GRAY);
		sieben.setFont (new Font("Arial", Font.PLAIN, 25));
		panel.add(sieben);
		
		acht = new JButton(" ");
		acht.setBounds(65, 10, 55, 55);
		acht.addActionListener(new Main());
		acht.setBackground(Color.DARK_GRAY);
		acht.setFont (new Font("Arial", Font.PLAIN, 25));
		panel.add(acht);
		
		neun = new JButton(" ");
		neun.setBounds(120, 10, 55, 55);
		neun.addActionListener(new Main());
		neun.setBackground(Color.DARK_GRAY);
		neun.setFont (new Font("Arial", Font.PLAIN, 25));
		panel.add(neun);
		
		sechs= new JButton(" ");
		sechs.setBounds(120, 65, 55, 55);
		sechs.addActionListener(new Main());
		sechs.setBackground(Color.DARK_GRAY);
		sechs.setFont (new Font("Arial", Font.PLAIN, 25));
		panel.add(sechs);
		
		fuenf= new JButton(" ");
		fuenf.setBounds(65, 65, 55, 55);
		fuenf.addActionListener(new Main());
		fuenf.setBackground(Color.DARK_GRAY);
		fuenf.setFont (new Font("Arial", Font.PLAIN, 25));
		panel.add(fuenf);
		
		vier= new JButton(" ");
		vier.setBounds(10, 65, 55, 55);
		vier.addActionListener(new Main());
		vier.setBackground(Color.DARK_GRAY);
		vier.setFont (new Font("Arial", Font.PLAIN, 25));
		panel.add(vier);
		
		drei= new JButton(" ");
		drei.setBounds(120, 120, 55, 55);
		drei.addActionListener(new Main());
		drei.setBackground(Color.DARK_GRAY);
		drei.setFont (new Font("Arial", Font.PLAIN, 25));
		panel.add(drei);
		
		zwei= new JButton(" ");
		zwei.setBounds(65, 120, 55, 55);
		zwei.addActionListener(new Main());
		zwei.setBackground(Color.DARK_GRAY);
		zwei.setFont (new Font("Arial", Font.PLAIN, 25));
		panel.add(zwei);
		
		eins= new JButton(" ");
		eins.setBounds(10, 120, 55, 55);
		eins.addActionListener(new Main());
		eins.setBackground(Color.DARK_GRAY);
		eins.setFont (new Font("Arial", Font.PLAIN, 25));
		panel.add(eins);*/
		
		
	}







	@Override
	public void actionPerformed(ActionEvent e) {
		lol++;
		double k = lol % 2;
		Object obj = e.getSource();
		if(k==0) {
			c = "O";
			gewonnen.setText("O HAT");
		}
		else {
			c = "X";
			gewonnen.setText("X HAT");
		}
		
		
		
		//eintragen
		
		//if(lol<10&&won==false) {
		if(obj==eins) {
			s = eins.getText();
			a=s;
			if(s!="X"&&s!="O") {
				eins.setText(c);
				a=c;
				
			}
			else lol--;
		}
		
		if(obj==zwei) {
			s = zwei.getText();
			b=s;
			if(s!="X"&&s!="O") {
				zwei.setText(c);
				b=c;
			}
			else lol--;
		}
		
		if(obj==drei) {
			s = drei.getText();
			l=s;
			if(s!="X"&&s!="O") {
				drei.setText(c);
				l=c;
			}
			else lol--;
		}
		
		if(obj==vier) {
			s = vier.getText();
			d=s;
			if(s!="X"&&s!="O") {
				vier.setText(c);
				d=c;
			}
			else lol--;
		}
		
		if(obj==fuenf) {
			s = fuenf.getText();
			j=s;
			if(s!="X"&&s!="O") {
				fuenf.setText(c);
				j=c;
			}
			else lol--;
		}
		
		if(obj==sechs) {
			s = sechs.getText();
			f=s;
			if(s!="X"&&s!="O") {
				sechs.setText(c);
				f=c;
			}
			else lol--;
		}
		
		if(obj==sieben) {
			s = sieben.getText();
			g=s;
			if(s!="X"&&s!="O") {
				sieben.setText(c);
				g=c;
			}
			else lol--;
		}
		
		if(obj==acht) {
			s = acht.getText();
			h=s;
			if(s!="X"&&s!="O") {
				acht.setText(c);
				h=c;
			}
			else lol--;
		}
		
		if(obj==neun) {
			s = neun.getText();
			i=s;
			if(s!="X"&&s!="O") {
				neun.setText(c);
				i=c;
			}
			else lol--;
		}
		//}
		
		//auswertungneu
		
		if((a=="X"||a=="O")&&(a==b&&a==l)) {
			gewonnen.setVisible(true);
			won.setVisible(true);
			eins.setBackground(Color.green);
			zwei.setBackground(Color.green);
			drei.setBackground(Color.green);
			fertig = true;
		}
		if((a=="X"||a=="O")&&(a==d&&a==g)) {
			gewonnen.setVisible(true);
			won.setVisible(true);
			eins.setBackground(Color.green);
			vier.setBackground(Color.green);
			sieben.setBackground(Color.green);
			fertig = true;
		}
		if((a=="X"||a=="O")&&(a==j&&a==i)){
			gewonnen.setVisible(true);
			won.setVisible(true);
			eins.setBackground(Color.green);
			fuenf.setBackground(Color.green);
			sieben.setBackground(Color.green);
			fertig = true;
		}
		if((d=="X"||d=="O")&&(d==f&&d==j)) {
			gewonnen.setVisible(true);
			won.setVisible(true);
			vier.setBackground(Color.green);
			fuenf.setBackground(Color.green);
			sechs.setBackground(Color.green);
			fertig = true;
		}
		if((g=="X"||g=="O")&&(g==h&&g==i)) {
			gewonnen.setVisible(true);
			won.setVisible(true);
			sieben.setBackground(Color.green);
			acht.setBackground(Color.green);
			neun.setBackground(Color.green);
			fertig = true;
		}
		if((g=="X"||g=="O")&&(g==j&&g==l)) {
			gewonnen.setVisible(true);
			won.setVisible(true);
			drei.setBackground(Color.green);
			fuenf.setBackground(Color.green);
			sieben.setBackground(Color.green);
			fertig = true;
		}
		if((h=="X"||h=="O")&&(h==j&&h==b)) {
			gewonnen.setVisible(true);
			won.setVisible(true);
			zwei.setBackground(Color.green);
			fuenf.setBackground(Color.green);
			acht.setBackground(Color.green);
			fertig = true;
		}
		if((i=="X"||i=="O")&&(i==f&&i==l)) {
			gewonnen.setVisible(true);
			won.setVisible(true);
			drei.setBackground(Color.green);
			sechs.setBackground(Color.green);
			neun.setBackground(Color.green);
			fertig = true;
		}
		if(fertig==false&&lol==9) {
			tied.setVisible(true);
		}
		
		
		//auswertung
				/*if(s=="X"||s=="O") {
					if((a==b&&a==l)&&(a=="X"||a=="O")) {
						gewonnen.setVisible(true);
						eins.setVisible(false);
						zwei.setVisible(false);
						drei.setVisible(false);
						vier.setVisible(false);
						fuenf.setVisible(false);
						sechs.setVisible(false);
						sieben.setVisible(false);
						acht.setVisible(false);
						neun.setVisible(false);
					}
					else if((a==d&&a==g)&&(a=="X"||a=="O")) {
						gewonnen.setVisible(true);
						eins.setVisible(false);
						zwei.setVisible(false);
						drei.setVisible(false);
						vier.setVisible(false);
						fuenf.setVisible(false);
						sechs.setVisible(false);
						sieben.setVisible(false);
						acht.setVisible(false);
						neun.setVisible(false);
					}
					else if(a==j&&a==i&&a=="X"||a=="O") {
						gewonnen.setVisible(true);
						eins.setVisible(false);
						zwei.setVisible(false);
						drei.setVisible(false);
						vier.setVisible(false);
						fuenf.setVisible(false);
						sechs.setVisible(false);
						sieben.setVisible(false);
						acht.setVisible(false);
						neun.setVisible(false);
					}
					else if(d==j&&d==f&&f=="X"||f=="O") {
						gewonnen.setVisible(true);
						eins.setVisible(false);
						zwei.setVisible(false);
						drei.setVisible(false);
						vier.setVisible(false);
						fuenf.setVisible(false);
						sechs.setVisible(false);
						sieben.setVisible(false);
						acht.setVisible(false);
						neun.setVisible(false);
					}
					else if(g==h&&g==i&&g=="X"||g=="O") {
						gewonnen.setVisible(true);
						eins.setVisible(false);
						zwei.setVisible(false);
						drei.setVisible(false);
						vier.setVisible(false);
						fuenf.setVisible(false);
						sechs.setVisible(false);
						sieben.setVisible(false);
						acht.setVisible(false);
						neun.setVisible(false);
					}
					else if(g==j&&g==l&&g=="X"||g=="O") {
						gewonnen.setVisible(true);
						eins.setVisible(false);
						zwei.setVisible(false);
						drei.setVisible(false);
						vier.setVisible(false);
						fuenf.setVisible(false);
						sechs.setVisible(false);
						sieben.setVisible(false);
						acht.setVisible(false);
						neun.setVisible(false);
					}
					else if(h==j&&h==b&&b=="X"||b=="O") {
						gewonnen.setVisible(true);
						eins.setVisible(false);
						zwei.setVisible(false);
						drei.setVisible(false);
						vier.setVisible(false);
						fuenf.setVisible(false);
						sechs.setVisible(false);
						sieben.setVisible(false);
						acht.setVisible(false);
						neun.setVisible(false);
					}
					else if(i==f&&i==l&&f=="X"||f=="O") {
						gewonnen.setVisible(true);
						eins.setVisible(false);
						zwei.setVisible(false);
						drei.setVisible(false);
						vier.setVisible(false);
						fuenf.setVisible(false);
						sechs.setVisible(false);
						sieben.setVisible(false);
						acht.setVisible(false);
						neun.setVisible(false);
					}
					//alternative
					
					if(a==b&&a==l) {
						gewonnen.setVisible(true);
						eins.setVisible(false);
						zwei.setVisible(false);
						drei.setVisible(false);
						vier.setVisible(false);
						fuenf.setVisible(false);
						sechs.setVisible(false);
						sieben.setVisible(false);
						acht.setVisible(false);
						neun.setVisible(false);
					}
					else if(a==d&&a==g) {
						gewonnen.setVisible(true);
						eins.setVisible(false);
						zwei.setVisible(false);
						drei.setVisible(false);
						vier.setVisible(false);
						fuenf.setVisible(false);
						sechs.setVisible(false);
						sieben.setVisible(false);
						acht.setVisible(false);
						neun.setVisible(false);
					}
					else if(a==j&&a==i) {
						gewonnen.setVisible(true);
						eins.setVisible(false);
						zwei.setVisible(false);
						drei.setVisible(false);
						vier.setVisible(false);
						fuenf.setVisible(false);
						sechs.setVisible(false);
						sieben.setVisible(false);
						acht.setVisible(false);
						neun.setVisible(false);
					}
					else if(d==j&&d==f) {
						gewonnen.setVisible(true);
						eins.setVisible(false);
						zwei.setVisible(false);
						drei.setVisible(false);
						vier.setVisible(false);
						fuenf.setVisible(false);
						sechs.setVisible(false);
						sieben.setVisible(false);
						acht.setVisible(false);
						neun.setVisible(false);
					}
					else if(g==h&&g==i) {
						gewonnen.setVisible(true);
						eins.setVisible(false);
						zwei.setVisible(false);
						drei.setVisible(false);
						vier.setVisible(false);
						fuenf.setVisible(false);
						sechs.setVisible(false);
						sieben.setVisible(false);
						acht.setVisible(false);
						neun.setVisible(false);
					}
					else if(g==j&&g==l) {
						gewonnen.setVisible(true);
						eins.setVisible(false);
						zwei.setVisible(false);
						drei.setVisible(false);
						vier.setVisible(false);
						fuenf.setVisible(false);
						sechs.setVisible(false);
						sieben.setVisible(false);
						acht.setVisible(false);
						neun.setVisible(false);
					}
					else if(h==j&&h==b) {
						gewonnen.setVisible(true);
						eins.setVisible(false);
						zwei.setVisible(false);
						drei.setVisible(false);
						vier.setVisible(false);
						fuenf.setVisible(false);
						sechs.setVisible(false);
						sieben.setVisible(false);
						acht.setVisible(false);
						neun.setVisible(false);
					}
					else if(i==f&&i==l) {
						gewonnen.setVisible(true);
						eins.setVisible(false);
						zwei.setVisible(false);
						drei.setVisible(false);
						vier.setVisible(false);
						fuenf.setVisible(false);
						sechs.setVisible(false);
						sieben.setVisible(false);
						acht.setVisible(false);
						neun.setVisible(false);
					}*/
				//,}
		
	}

}
