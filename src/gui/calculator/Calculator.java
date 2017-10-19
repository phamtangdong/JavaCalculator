package gui.calculator;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JLabel;
import java.awt.Toolkit;

public class Calculator {

	private JFrame frame;
	private JTextField textScreen;
	private JLabel lbOperation;
	private JButton btnDot;

	private String action = ""; // for calculating button
	private boolean equalFlag = false; // for all things after press "=", eqlEvent = false when not press "=" yet
	private double num1 = 0;
	private double num2 = 0;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculator window = new Calculator();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Calculator() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {

		frame = new JFrame();
		frame.setResizable(false);
		frame.getContentPane().setBackground(new Color(255, 255, 255));
		frame.setBounds(20, -39, 336, 476);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.setLocationRelativeTo(null);

		textScreen = new JTextField();
		textScreen.setBackground(new Color(97, 212, 194));
		textScreen.setEditable(false);
		textScreen.setBorder(null);
		textScreen.setFont(new Font("Century Gothic", Font.PLAIN, 40));
		textScreen.setHorizontalAlignment(SwingConstants.RIGHT);
		textScreen.setBounds(20, 37, 289, 70);
		frame.getContentPane().add(textScreen);
		textScreen.setColumns(10);
//-----------------------------------Button 0----------------------------------------
		JButton btn0 = new JButton("0");
		btn0.setForeground(Color.WHITE);
		btn0.setBorderPainted(false);
		btn0.setBackground(new Color(97, 212, 194));
		btn0.setFont(new Font("Century Gothic", Font.PLAIN, 40));
		btn0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				enterNumber(0); //call enterNumber method to show number 0 into textScreen
			}
		});
		btn0.setBounds(20, 370, 70, 60);
		frame.getContentPane().add(btn0);
//-----------------------------------Button 1----------------------------------------
		JButton btn1 = new JButton("1");
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				enterNumber(1);		//call enterNumber method to show number 1 into textScreen
			}
		});
		btn1.setForeground(Color.WHITE);
		btn1.setFont(new Font("Century Gothic", Font.PLAIN, 40));
		btn1.setBorderPainted(false);
		btn1.setBackground(new Color(97, 212, 194));
		btn1.setBounds(20, 307, 70, 60);
		frame.getContentPane().add(btn1);
//-----------------------------------Button 2----------------------------------------		
		JButton btn2 = new JButton("2");
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				enterNumber(2);
			}
		});
		btn2.setForeground(Color.WHITE);
		btn2.setFont(new Font("Century Gothic", Font.PLAIN, 40));
		btn2.setBorderPainted(false);
		btn2.setBackground(new Color(97, 212, 194));
		btn2.setBounds(93, 307, 70, 60);
		frame.getContentPane().add(btn2);
//-----------------------------------Button 3----------------------------------------
		JButton btn3 = new JButton("3");
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				enterNumber(3);
			}
		});
		btn3.setForeground(Color.WHITE);
		btn3.setFont(new Font("Century Gothic", Font.PLAIN, 40));
		btn3.setBorderPainted(false);
		btn3.setBackground(new Color(97, 212, 194));
		btn3.setBounds(166, 307, 70, 60);
		frame.getContentPane().add(btn3);
//-----------------------------------Button4----------------------------------------
		JButton btn4 = new JButton("4");
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				enterNumber(4);
			}
		});
		btn4.setForeground(Color.WHITE);
		btn4.setFont(new Font("Century Gothic", Font.PLAIN, 40));
		btn4.setBorderPainted(false);
		btn4.setBackground(new Color(97, 212, 194));
		btn4.setBounds(20, 244, 70, 60);
		frame.getContentPane().add(btn4);
//-----------------------------------Button 5----------------------------------------
		JButton btn5 = new JButton("5");
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				enterNumber(5);
			}
		});
		btn5.setForeground(Color.WHITE);
		btn5.setFont(new Font("Century Gothic", Font.PLAIN, 40));
		btn5.setBorderPainted(false);
		btn5.setBackground(new Color(97, 212, 194));
		btn5.setBounds(93, 244, 70, 60);
		frame.getContentPane().add(btn5);
//-----------------------------------Button 6----------------------------------------
		JButton btn6 = new JButton("6");
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				enterNumber(6);
			}
		});
		btn6.setForeground(Color.WHITE);
		btn6.setFont(new Font("Century Gothic", Font.PLAIN, 40));
		btn6.setBorderPainted(false);
		btn6.setBackground(new Color(97, 212, 194));
		btn6.setBounds(166, 244, 70, 60);
		frame.getContentPane().add(btn6);
//-----------------------------------Button 7----------------------------------------
		JButton btn7 = new JButton("7");
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				enterNumber(7);
			}
		});
		btn7.setForeground(Color.WHITE);
		btn7.setFont(new Font("Century Gothic", Font.PLAIN, 40));
		btn7.setBorderPainted(false);
		btn7.setBackground(new Color(97, 212, 194));
		btn7.setBounds(20, 181, 70, 60);
		frame.getContentPane().add(btn7);
//-----------------------------------Button 8----------------------------------------
		JButton btn8 = new JButton("8");
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				enterNumber(8);
			}
		});
		btn8.setForeground(Color.WHITE);
		btn8.setFont(new Font("Century Gothic", Font.PLAIN, 40));
		btn8.setBorderPainted(false);
		btn8.setBackground(new Color(97, 212, 194));
		btn8.setBounds(93, 181, 70, 60);
		frame.getContentPane().add(btn8);
//-----------------------------------Button 6----------------------------------------
		JButton btn9 = new JButton("9");
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				enterNumber(9);
			}
		});
		btn9.setForeground(Color.WHITE);
		btn9.setFont(new Font("Century Gothic", Font.PLAIN, 40));
		btn9.setBorderPainted(false);
		btn9.setBackground(new Color(97, 212, 194));
		btn9.setBounds(166, 181, 70, 60);
		frame.getContentPane().add(btn9);
//-----------------------------------Button Backspace----------------------------------------
		JButton btnBack = new JButton("<");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				StringBuilder back = new StringBuilder(textScreen.getText());
				int length = textScreen.getText().length();
				if (length != 0) {
					Double temp = Double.parseDouble((textScreen.getText()));
					int lenTemp = String.valueOf((int) (temp / 1)).length();	//Length of number before the "DOT"
					if (equalFlag) {
						textScreen.setText("");
						equalFlag = false;
					} else if (length - lenTemp != 2) {
							textScreen.setText(back.delete(length - 1, length).toString());
						} else {
							textScreen.setText(back.delete(length - 2, length).toString());
							btnDot.setEnabled(true);
						}
				}
			}
		});
		btnBack.setForeground(Color.WHITE);
		btnBack.setFont(new Font("Century Gothic", Font.PLAIN, 40));
		btnBack.setBorderPainted(false);
		btnBack.setBackground(new Color(97, 212, 194));
		btnBack.setBounds(20, 118, 70, 60);
		frame.getContentPane().add(btnBack);
//-----------------------------------Button Reset----------------------------------------
		JButton btnReset = new JButton("C");
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textScreen.setText("");
				lbOperation.setText("");
				num1 = 0;
				num2 = 0;
				equalFlag = false;
				btnDot.setEnabled(true);
			}
		});
		btnReset.setForeground(Color.WHITE);
		btnReset.setFont(new Font("Century Gothic", Font.PLAIN, 40));
		btnReset.setBackground(new Color(97, 212, 194));
		btnReset.setBounds(93, 118, 70, 60);
		frame.getContentPane().add(btnReset);
//-----------------------------------Button Dot----------------------------------------
		btnDot = new JButton(".");
		btnDot.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(textScreen.getText().length() == 0 || equalFlag) {
					textScreen.setText("0.");
					equalFlag = false;
				}else {
					textScreen.setText(textScreen.getText() + ".");
				}
				btnDot.setEnabled(false);
			}
		});
		btnDot.setForeground(Color.WHITE);
		btnDot.setFont(new Font("Century Gothic", Font.PLAIN, 40));
		btnDot.setBorderPainted(false);
		btnDot.setBackground(new Color(97, 212, 194));
		btnDot.setBounds(93, 370, 70, 60);
		frame.getContentPane().add(btnDot);
//-----------------------------------Button Negative----------------------------------------
		JButton btnNegative = new JButton("+/-");
		btnNegative.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (textScreen.getText().length() != 0) { // just do when have input
					double temp = Double.parseDouble(textScreen.getText());
					temp = temp * (-1);
					textScreen.setText(String.valueOf(temp));
				}
			}
		});
		btnNegative.setForeground(Color.WHITE);
		btnNegative.setFont(new Font("Century Gothic", Font.BOLD, 20));
		btnNegative.setBorderPainted(false);
		btnNegative.setBackground(new Color(97, 212, 194));
		btnNegative.setBounds(166, 118, 70, 60);
		frame.getContentPane().add(btnNegative);
//-----------------------------------Button /----------------------------------------
		JButton btnDiv = new JButton("/");
		btnDiv.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				selectOperation("/");
			}
		});
		btnDiv.setForeground(Color.WHITE);
		btnDiv.setFont(new Font("Century Gothic", Font.PLAIN, 40));
		btnDiv.setBorderPainted(false);
		btnDiv.setBackground(new Color(97, 212, 194));
		btnDiv.setBounds(239, 118, 70, 60);
		frame.getContentPane().add(btnDiv);
//-----------------------------------Button *----------------------------------------
		JButton btnMul = new JButton("*");
		btnMul.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				selectOperation("*");
			}

		});
		btnMul.setForeground(Color.WHITE);
		btnMul.setFont(new Font("Century Gothic", Font.PLAIN, 40));
		btnMul.setBorderPainted(false);
		btnMul.setBackground(new Color(97, 212, 194));
		btnMul.setBounds(239, 181, 70, 60);
		frame.getContentPane().add(btnMul);
//-----------------------------------Button '-' ----------------------------------------
		JButton btnSub = new JButton("-");
		btnSub.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				selectOperation("-");
			}
		});
		btnSub.setForeground(Color.WHITE);
		btnSub.setFont(new Font("Century Gothic", Font.PLAIN, 40));
		btnSub.setBorderPainted(false);
		btnSub.setBackground(new Color(97, 212, 194));
		btnSub.setBounds(239, 244, 70, 60);
		frame.getContentPane().add(btnSub);
//-----------------------------------Button + ----------------------------------------
		JButton btnPlus = new JButton("+");
		btnPlus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				selectOperation("+");

			}
		});
		btnPlus.setForeground(Color.WHITE);
		btnPlus.setFont(new Font("Century Gothic", Font.PLAIN, 40));
		btnPlus.setBorderPainted(false);
		btnPlus.setBackground(new Color(97, 212, 194));
		btnPlus.setBounds(239, 307, 70, 60);
		frame.getContentPane().add(btnPlus);
//-----------------------------------Button '=' ----------------------------------------
		JButton btnEqual = new JButton("=");
		btnEqual.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (textScreen.getText().length() != 0) { // just do when having input
					num2 = Double.parseDouble(textScreen.getText());
					calculate();
					System.out.println(textScreen.getText());
					equalFlag = true;
					btnDot.setEnabled(true);
					action = "";
				}
			}
		});
		btnEqual.setForeground(Color.WHITE);
		btnEqual.setFont(new Font("Century Gothic", Font.PLAIN, 40));
		btnEqual.setBorderPainted(false);
		btnEqual.setBackground(new Color(97, 212, 194));
		btnEqual.setBounds(166, 370, 143, 60);
		frame.getContentPane().add(btnEqual);
//-----------------------------------Label to show the operation----------------------------------------
		lbOperation = new JLabel("");
		lbOperation.setForeground(Color.RED);
		lbOperation.setFont(new Font("Century Gothic", Font.PLAIN, 18));
		lbOperation.setHorizontalAlignment(SwingConstants.RIGHT);
		lbOperation.setBounds(20, 11, 288, 21);
		frame.getContentPane().add(lbOperation);
	}
	
//----------------------------------- Calculate method----------------------------------------
	public void calculate() {
		switch (action) {
		case "+":
			textScreen.setText(String.valueOf(Math.round((num1 + num2) * 10000f) / 10000f));  //The result will be rounded 4 characters after the Dot. 
			lbOperation.setText(num1 + " + " + num2);
			break;
		case "-":
			textScreen.setText(String.valueOf(Math.round((num1 - num2) * 10000f) / 10000f));
			lbOperation.setText(num1 + " - " + num2);
			break;
		case "*":
			textScreen.setText(String.valueOf(Math.round((num1 * num2) * 10000f) / 10000f));
			lbOperation.setText(num1 + " x " + num2);
			break;
		case "/":
			textScreen.setText(String.valueOf(Math.round((num1 / num2) * 10000f) / 10000f));
			lbOperation.setText(num1 + " / " + num2);
			break;
		}
	}

//-----------------------------------Method to enter a number----------------------------------------
	public void enterNumber(int number) { // method enter a number into a text field
		if (equalFlag) { // if "=" was pressed, all number entered after that was set as initial value
			textScreen.setText(String.valueOf(number));
			equalFlag = false; // when any number button was pressed, set equalFlag = false to get more input
		} else {
			textScreen.setText(textScreen.getText() + String.valueOf(number));
		}
	}

//-----------------------------------Method to select operation----------------------------------------------------------
	public void selectOperation(String operation) {
		if (textScreen.getText().length() != 0) { // just do when have input
			action = operation;		
			num1 = Double.parseDouble(textScreen.getText());		//after press any operation button, the previous value has been set to num1 variable 
			lbOperation.setText(textScreen.getText() + " " + action);
			textScreen.setText("");			//clear screen
			btnDot.setEnabled(true);		//enable dot button when press any operation button
			equalFlag = false;
		}	
	}

}
