package br.com.lucasburg.view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class Eventos implements ActionListener {

	private JTextField textField;
	
	public Eventos(JTextField textField) {
		this.textField = textField;
	}
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		JOptionPane.showMessageDialog(null, "O botão foi clicado " + textField.getText());
	}

}
