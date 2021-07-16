import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.ScrollPane;
import java.awt.TextArea;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;

public class Tela implements ActionListener {
	
	JTextArea textArea;
	JTextField textField;
	
	public Tela() {

		JFrame frame = new JFrame("Título");
		frame.setSize(350, 250);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		
		JPanel panel1 = new JPanel(new FlowLayout(FlowLayout.CENTER));
		
		textField = new JTextField(20);
		panel1.add(textField);
		
		
		JButton button = new JButton("Inserir");
		button.addActionListener(this);
		panel1.add(button);
		
		frame.add(panel1, BorderLayout.NORTH);
		
		textArea = new JTextArea();
		
		//Criando a barra de rolagem com JScrollPane
		JScrollPane scrollPane = new JScrollPane(textArea);
		frame.add(scrollPane, BorderLayout.CENTER);
		

	}
	
	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			
			@Override
			public void run() {

				new Tela();
				
			}
		});
	}

	@Override
	public void actionPerformed(ActionEvent e) {

		textArea.setText(textArea.getText() + textField.getText() + "\n" );
		textField.setText("");
	}

}
