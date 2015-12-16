package br.com.lucasburg.view;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class Principal {

	
	
	public static void main(String[] args) {
		
		/**
		 * Janela
		 */
		JFrame frame = new JFrame();
		frame.setSize(500, 300);
		frame.setLocation(0, 0);
		frame.setTitle("Teste do JFrame");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		/**
		 * Panel
		 */
		JPanel panel = new JPanel();
		panel.setLayout(null);
		
		/**
		 * Campo usuário
		 */
		JLabel labelUsuario = new JLabel("Usuário:");
		labelUsuario.setBounds(10, 10, 50, 20);
		
		JTextField fieldUsuario = new JTextField();
		fieldUsuario.setBounds(65, 10, 150, 20);

		panel.add(labelUsuario);
		panel.add(fieldUsuario);

		/**
		 * Campo senha
		 */
		JLabel labelSenha = new JLabel("Senha: ");
		labelSenha.setBounds(10, 30, 50, 20);

		JPasswordField fieldSenha = new JPasswordField();
		fieldSenha.setBounds(65, 30, 150, 20);
		
		panel.add(labelSenha);
		panel.add(fieldSenha);
		
		/**
		 * Button
		 */
		JButton button = new JButton("Entrar");
		button.setBounds(10, 50, 150, 20);
		
		Eventos evento = new Eventos(fieldUsuario);
		button.addActionListener(evento);
		panel.add(button);
		
		
		/**
		 * Add panel
		 */
		frame.add(panel);
		frame.setVisible(true);
	}

}
