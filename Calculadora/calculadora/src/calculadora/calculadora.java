package calculadora;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.SystemColor;

public class calculadora extends JFrame {

	private JPanel contentPane;
	private JTextField display;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					calculadora frame = new calculadora();
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
	public calculadora() {
		Numero numeroUsar=new Numero();
		
		// Definindo o tamando da janela
		
		setFont(new Font("Arial Black", Font.PLAIN, 12));
		setResizable(false);
		setBackground(Color.BLUE);
		setForeground(Color.BLACK);
		setTitle("Calculadora");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 340, 433);
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.textHighlight);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		display = new JTextField();
		display.setEditable(false);
		display.setFont(new Font("Tahoma", Font.PLAIN, 40));
		display.setHorizontalAlignment(SwingConstants.RIGHT);
		display.setText("");
		display.setBounds(10, 11, 314, 60);
		contentPane.add(display);
		display.setColumns(10);
		
		JButton btn_ac = new JButton("AC");
		btn_ac.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				display.setText("");
			}
		});
		btn_ac.setBackground(Color.WHITE);
		btn_ac.setFont(new Font("Arial Black", Font.PLAIN, 15));
		btn_ac.setBounds(20, 98, 58, 41);
		contentPane.add(btn_ac);
		
		JButton btn_porcentagem = new JButton("%");
		btn_porcentagem.setFont(new Font("Arial Black", Font.PLAIN, 15));
		btn_porcentagem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btn_porcentagem.setBounds(98, 98, 58, 41);
		contentPane.add(btn_porcentagem);
		
		JButton btn_divisao = new JButton("/");
		btn_divisao.setFont(new Font("Arial Black", Font.BOLD, 15));
		btn_divisao.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btn_divisao.setBounds(176, 98, 58, 41);
		contentPane.add(btn_divisao);
		
		JButton btn_multiplicacao = new JButton("X");
		btn_multiplicacao.setFont(new Font("Arial Black", Font.PLAIN, 15));
		btn_multiplicacao.setBounds(254, 98, 58, 41);
		contentPane.add(btn_multiplicacao);
		
		JButton btn_7 = new JButton("7");
		btn_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				display.setText(display.getText()+"7");
			}
		});
		btn_7.setFont(new Font("Arial Black", Font.PLAIN, 15));
		btn_7.setBounds(20, 158, 58, 41);
		contentPane.add(btn_7);
		
		JButton btn_8 = new JButton("8");
		btn_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				display.setText(display.getText()+"8");
			}
		});
		btn_8.setFont(new Font("Arial Black", Font.PLAIN, 15));
		btn_8.setBounds(98, 158, 58, 41);
		contentPane.add(btn_8);
		
		JButton btn_9 = new JButton("9");
		btn_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				display.setText(display.getText()+"9");
			}
		});
		btn_9.setFont(new Font("Arial Black", Font.PLAIN, 15));
		btn_9.setBounds(176, 158, 58, 41);
		contentPane.add(btn_9);
		
		JButton btn_subtracao = new JButton("-");
		btn_subtracao.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btn_subtracao.setFont(new Font("Arial Black", Font.BOLD, 20));
		btn_subtracao.setBounds(254, 158, 58, 41);
		contentPane.add(btn_subtracao);
		
		JButton btn_4 = new JButton("4");
		btn_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				display.setText(display.getText()+"4");
			}
		});
		btn_4.setFont(new Font("Arial Black", Font.PLAIN, 15));
		btn_4.setBounds(20, 218, 58, 41);
		contentPane.add(btn_4);
		
		JButton btn_5 = new JButton("5");
		btn_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				display.setText(display.getText()+"5");
			}
		});
		btn_5.setFont(new Font("Arial Black", Font.PLAIN, 15));
		btn_5.setBounds(98, 218, 58, 41);
		contentPane.add(btn_5);
		
		JButton btn_6 = new JButton("6");
		btn_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				display.setText(display.getText()+"6");
			}
		});
		btn_6.setFont(new Font("Arial Black", Font.PLAIN, 15));
		btn_6.setBounds(176, 218, 58, 41);
		contentPane.add(btn_6);
		
		JButton btn_soma = new JButton("+");
		btn_soma.setFont(new Font("Arial Black", Font.BOLD, 20));
		btn_soma.setBounds(254, 216, 58, 41);
		contentPane.add(btn_soma);
		btn_soma.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				String numero1Soma=display.getText();
				double numero1=Double.parseDouble(numero1Soma);
				numeroUsar.setNumero1(numero1);
				numeroUsar.setOperacao("+");
				display.setText("0");
			}
		});
		
		JButton btn_1 = new JButton("1");
		btn_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				display.setText(display.getText()+"1");
			}
		});
		btn_1.setFont(new Font("Arial Black", Font.PLAIN, 15));
		btn_1.setBounds(20, 278, 58, 41);
		contentPane.add(btn_1);
		
		JButton btn_2 = new JButton("2");
		btn_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				display.setText(display.getText()+"2");
			}
		});
		btn_2.setFont(new Font("Arial Black", Font.PLAIN, 15));
		btn_2.setBounds(98, 278, 58, 41);
		contentPane.add(btn_2);
		
		JButton btn_3 = new JButton("3");
		btn_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				display.setText(display.getText()+"3");
			}
		});
		btn_3.setFont(new Font("Arial Black", Font.PLAIN, 15));
		btn_3.setBounds(176, 278, 58, 41);
		contentPane.add(btn_3);
		
		JButton btn_resultado = new JButton("=");
		btn_resultado.setFont(new Font("Arial Black", Font.PLAIN, 15));
		btn_resultado.setBounds(254, 278, 58, 101);
		contentPane.add(btn_resultado);
		btn_resultado.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				double numero2=Double.parseDouble( display.getText());
				numeroUsar.setNumero2(numero2);
				numeroUsar.executandoOperacao();
				String resultado=Double.toString(numeroUsar.getResultado());
				display.setText(resultado);

			}
		});
		
		JButton btn_0 = new JButton("0");
		btn_0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				display.setText(display.getText()+"0");
				
			}
		});
		btn_0.setFont(new Font("Arial Black", Font.PLAIN, 15));
		btn_0.setBounds(18, 338, 144, 41);
		contentPane.add(btn_0);
		
		JButton btn_ponto = new JButton(".");
		btn_ponto.setFont(new Font("Arial Black", Font.PLAIN, 15));
		btn_ponto.setBounds(180, 338, 58, 41);
		contentPane.add(btn_ponto);
		btn_ponto.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				display.setText(display.getText()+".");
				
			}
		});
		
	}
}
