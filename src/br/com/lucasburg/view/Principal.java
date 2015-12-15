package br.com.lucasburg.view;

import java.awt.Component;
import java.awt.Graphics;
import java.awt.Insets;

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
		 * Campo usu�rio
		 */
		JLabel labelUsuario = new JLabel("Usu�rio:");
		labelUsuario.setBounds(10, 10, 50, 20);
		
		JTextField fieldUsuario = new JTextField();
		fieldUsuario.setBounds(65, 10, 150, 20);

		panel.add(labelUsuario);
		panel.add(fieldUsuario);

		/**
		 * Campo senha
		 */
		JLabel labelSenha = new JLabel("Senha: ");
		labelSenha.setBounds(220, 10, 50, 20);

		JPasswordField fieldSenha = new JPasswordField();
		fieldSenha.setBounds(275, 10, 150, 20);
		
		panel.add(labelSenha);
		panel.add(fieldSenha);
		
		/**
		 * Button
		 */
		JButton button = new JButton("Entrar");
		button.setBounds(450, 10, 150, 20);
		
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
