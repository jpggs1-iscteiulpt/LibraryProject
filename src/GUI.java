import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.WindowEvent;
import java.io.FileNotFoundException;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JScrollPane;
import javax.swing.JSplitPane;
import javax.swing.JTabbedPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.ScrollPaneConstants;
import javax.swing.WindowConstants;

public class GUI {
	
	private JFrame frame = new JFrame();
	private JFrame frameLogin = new JFrame();
	private JPanel topPanel = new JPanel();
	private JButton searchButton = new JButton("Search");
	private JPanel bottomPanel = new JPanel();
	private JTextArea results;
	private JTextField message = new JTextField();
	private JScrollPane scroll;
	private JComboBox comboBox;
	
	private JPanel panelTabs = new JPanel();
	
	public GUI() {
		buildLogin();
	}
	
	
	private void buildLogin() {
		JTextField user = new JTextField("Username");
		JPasswordField pass = new JPasswordField("Password");
		JButton login = new JButton("Login");
		frameLogin.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		frameLogin.setLayout(new BorderLayout());
		frameLogin.add(user, BorderLayout.NORTH);
		frameLogin.add(pass, BorderLayout.CENTER);
		frameLogin.add(login, BorderLayout.SOUTH);
		frameLogin.setSize(400,500);
		frameLogin.pack();
		frameLogin.setVisible(true);
		
		login.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frameLogin.dispatchEvent(new WindowEvent(frameLogin, WindowEvent.WINDOW_CLOSING));
				buildInterface();
			}
		});
	}


	private void addFrameContent() {
		String[] comboOptions = { "Titulo", "Autor", "Editora", "Ano", "Tema" };
		comboBox = new JComboBox(comboOptions);
		topPanel.add(comboBox);
		message.setPreferredSize(new Dimension(200,20));
		topPanel.add(message);
		topPanel.add(searchButton);
		frame.add(topPanel,BorderLayout.CENTER);
		frame.add(bottomPanel, BorderLayout.SOUTH);
		results = new JTextArea(15,30);
		scroll = new JScrollPane(results);
        results.setEditable(false); 
		scroll.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		bottomPanel.add(scroll);
	
	}

	private void buildInterface() {
		frame = new JFrame("Library");
		frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		frame.setLayout(new BorderLayout());
		addFrameContent();
		frame.pack();
		frame.setVisible(true);
	}

}

