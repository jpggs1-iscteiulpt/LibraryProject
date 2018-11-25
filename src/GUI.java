import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.WindowEvent;
import java.io.FileNotFoundException;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
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
	private JFrame frameAIR = new JFrame();
	private JPanel topPanel = new JPanel();
	private JButton searchButton = new JButton("Search");
	private JPanel bottomPanel = new JPanel();
	private JTextArea results;
	private JTextField message = new JTextField();
	private JScrollPane scroll;
	private JComboBox comboBox;
	
	public GUI() {
		buildLogin();
	}
	
	
	private void buildLogin() {
		
		String[] comboOptions = { "Procurar", "Atualizar", "Inserir", "Remover" };
		JComboBox Options = new JComboBox(comboOptions);
		JTextField user = new JTextField("Username");
		JPasswordField pass = new JPasswordField("Password");
		JButton login = new JButton("Login");
		frameLogin.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		frameLogin.setLayout(new GridLayout(4,2));
		frameLogin.add(user);
		frameLogin.add(pass);
		frameLogin.add(Options);
		frameLogin.add(login);
		frameLogin.setPreferredSize(new Dimension(400,200));;
		frameLogin.setLocation(500, 330);
		frameLogin.pack();
		frameLogin.setVisible(true);
		
		login.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frameLogin.dispatchEvent(new WindowEvent(frameLogin, WindowEvent.WINDOW_CLOSING));
				String option = (String) Options.getSelectedItem();
				System.out.println(option);
				if(option.equals("Procurar")) 
					buildSearchFrame();
				else
					buildAIRFrame();
			}

		});
	}


	private void buildAIRFrame() {
		JTextField valueTitulo = new JTextField();
		JTextField valueAutor = new JTextField();
		JTextField valueEditora = new JTextField();
		JTextField valueEdicao = new JTextField();
		JTextField valueAno = new JTextField();
		JTextField valueTema = new JTextField();
		JButton enterButton = new JButton("Enter");
		JLabel tituloLabel = new JLabel (" Titulo	");
		JLabel autorLabel = new JLabel (" Autor	");
		JLabel editoraLabel = new JLabel(" Editora	");
		JLabel edicaoLabel = new JLabel(" Edição	");
		JLabel anoLabel = new JLabel(" Ano	");
		JLabel temaLabel = new JLabel(" Tema	");
		JPanel labelPanel = new JPanel(new GridLayout(7,1));
		JPanel valuePanel = new JPanel(new GridLayout(7,1));
		JPanel buttonPanel = new JPanel();
		
		frameAIR.setPreferredSize(new Dimension(400,300));;
		frameAIR.setLocation(500, 330);
		frameAIR.pack();
		frameAIR.setVisible(true);
		frameAIR.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		frameAIR.setLayout(new BorderLayout());
		
		labelPanel.add(tituloLabel);
		valuePanel.add(valueTitulo);
		labelPanel.add(autorLabel);
		valuePanel.add(valueAutor);
		labelPanel.add(editoraLabel);
		valuePanel.add(valueEditora);
		labelPanel.add(edicaoLabel);
		valuePanel.add(valueEdicao);
		labelPanel.add(anoLabel);
		valuePanel.add(valueAno);
		labelPanel.add(anoLabel);
		valuePanel.add(valueAno);
		labelPanel.add(temaLabel);
		valuePanel.add(valueTema);
		buttonPanel.add(enterButton);
		
		frameAIR.add(labelPanel, BorderLayout.WEST);
		frameAIR.add(valuePanel,BorderLayout.CENTER);
		frameAIR.add(buttonPanel,BorderLayout.SOUTH);
		
	}


	private void buildSearchFrame() {
		frame = new JFrame("Library");
		frame.setLocation(500, 330);
		frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		frame.setLayout(new BorderLayout());
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
		frame.pack();
		frame.setVisible(true);
		searchButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String value = message.getText();
				String option = (String) comboBox.getSelectedItem();
				List<Livro> resultadoLivros = Biblioteca.getInstance().procurarLivros(option, value);
				results.append(resultadoLivros.toString());
				
				
					
			}

		});
	}

}

