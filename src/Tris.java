import java.awt.*;
import javax.swing.*;

//Prova1

public class Tris extends JFrame {
	private JButton[] b;
	
	
	private JLabel[] lab;
	private JButton[] pan;
	
	public Tris(String name) {
	
		super(name);
		
		Container  con = getContentPane();
		JPanel p=new JPanel();
		JPanel p1=new JPanel();
		JLabel l1=new JLabel();
		JPanel p2=new JPanel();
		JPanel p3=new JPanel();
		JRadioButton b1=new JRadioButton("X");
		JRadioButton b2=new JRadioButton("O");
		ButtonGroup bg=new ButtonGroup();
		bg.add(b1);
		bg.add(b2);
		JPanel p4=new JPanel();
		JLabel l2=new JLabel();
		p.setLayout(new GridLayout(3,3,10,10));
		p.setBackground(Color.black);
		
			
		b=new JButton[9];
		for(int i=0; i<9; i++) {
			b[i]=new JButton();
			p.add(b[i]); 
		}
		con.add(p);
		
		p1.setBackground(Color.red);
		con.add(p1,"South");
		
		l1=new JLabel("Seleziona un simbolo");
		p1.add(l1);
		
		p2.setBackground(Color.GRAY);
		con.add(p2,"East");
		
		p3.setBackground(Color.GRAY);
		con.add(p3,"West");
		
		p2.add(b1);
		
		p3.add(b2);
		
		p4.setBackground(Color.GREEN);
		con.add(p4,"North");
		
		l2=new JLabel("hgfytftyyty");
		p4.add(l2);

		
		setVisible(true);
		setSize(400,400);
		setLocation(0, 500);
		setResizable(false);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
	}
}
