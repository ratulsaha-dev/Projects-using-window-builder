import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class CalculatorJFrame extends JFrame {

	private JPanel contentPane;
	private JTextField textA;
	private JTextField textB;
	private JTextField textRes;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CalculatorJFrame frame = new CalculatorJFrame();
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
	public CalculatorJFrame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(64, 128, 128));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel heading = new JLabel("Calculator");
		heading.setBackground(new Color(64, 128, 128));
		heading.setForeground(new Color(0, 0, 0));
		heading.setFont(new Font("Wide Latin", Font.BOLD, 23));
		heading.setBounds(108, 10, 213, 24);
		contentPane.add(heading);
		
		JLabel labelA = new JLabel("A");
		labelA.setForeground(new Color(255, 255, 255));
		labelA.setFont(new Font("Times New Roman", Font.BOLD, 24));
		labelA.setBounds(39, 56, 17, 29);
		contentPane.add(labelA);
		
		JLabel labelB = new JLabel("B");
		labelB.setForeground(Color.WHITE);
		labelB.setFont(new Font("Times New Roman", Font.BOLD, 24));
		labelB.setBounds(244, 56, 17, 29);
		contentPane.add(labelB);
		
		JLabel labelRes = new JLabel("RES");
		labelRes.setForeground(Color.WHITE);
		labelRes.setFont(new Font("Times New Roman", Font.BOLD, 24));
		labelRes.setBounds(92, 117, 47, 29);
		contentPane.add(labelRes);
		
		textA = new JTextField();
		textA.setBounds(66, 56, 139, 29);
		contentPane.add(textA);
		textA.setColumns(10);
		
		textB = new JTextField();
		textB.setColumns(10);
		textB.setBounds(276, 56, 139, 29);
		contentPane.add(textB);
		
		textRes = new JTextField();
		textRes.setColumns(10);
		textRes.setBounds(150, 117, 139, 29);
		contentPane.add(textRes);
		
		JButton add = new JButton("ADD");
		add.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//code for add
				String aVal = textA.getText();
				String bVal = textB.getText();
				int varA = Integer.valueOf(aVal);
				int varB = Integer.valueOf(bVal);
				int result = varA+varB;
				String res = String.valueOf(result);
				textRes.setText(res);
			}
		});
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 10, 10);
		contentPane.add(panel);
		add.setBackground(new Color(64, 128, 128));
		add.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 16));
		add.setForeground(new Color(128, 0, 128));
		add.setBounds(22, 192, 65, 29);
		contentPane.add(add);
		
		JButton sub = new JButton("SUB");
		sub.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//code for sub
				String aVal = textA.getText();
				String bVal = textB.getText();
				int varA = Integer.valueOf(aVal);
				int varB = Integer.valueOf(bVal);
				int result = varA-varB;
				String res = String.valueOf(result);
				textRes.setText(res);
			}
		});
		sub.setForeground(new Color(128, 0, 128));
		sub.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 16));
		sub.setBackground(new Color(64, 128, 128));
		sub.setBounds(121, 192, 63, 29);
		contentPane.add(sub);
		
		JButton mul = new JButton("MUL");
		mul.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// code for multiply
				String aVal = textA.getText();
				String bVal = textB.getText();
				int varA = Integer.valueOf(aVal);
				int varB = Integer.valueOf(bVal);
				int result = varA*varB;
				String res = String.valueOf(result);
				textRes.setText(res);
			}
		});
		mul.setForeground(new Color(128, 0, 128));
		mul.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 16));
		mul.setBackground(new Color(64, 128, 128));
		mul.setBounds(194, 192, 67, 29);
		contentPane.add(mul);
		
		JButton div = new JButton("DIV");
		div.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//code for division
				String aVal = textA.getText();
				String bVal = textB.getText();
				Float varA = Float.valueOf(aVal);
				Float varB = Float.valueOf(bVal);
				Float result = varA/varB;
				String res = String.valueOf(result);
				textRes.setText(res);
			
			}
		});
		div.setForeground(new Color(128, 0, 128));
		div.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 16));
		div.setBackground(new Color(64, 128, 128));
		div.setBounds(273, 192, 65, 29);
		contentPane.add(div);
		
		JButton rem = new JButton("REM");
		rem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//code for remainder
				int varA = Integer.valueOf(textA.getText());
				int varB = Integer.valueOf(textB.getText());
				int result = varA%varB;
				String res = String.valueOf(result);
				textRes.setText(res);
				
				
			}
		});
		rem.setForeground(new Color(128, 0, 128));
		rem.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 16));
		rem.setBackground(new Color(64, 128, 128));
		rem.setBounds(348, 192, 67, 29);
		contentPane.add(rem);
	}
}
