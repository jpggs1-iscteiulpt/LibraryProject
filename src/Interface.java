import java.awt.BorderLayout;
import java.awt.Dimension;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JSplitPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.ScrollPaneConstants;
import javax.swing.WindowConstants;

public class Interface {
	private JFrame frame = new JFrame();
	private JPanel topPanel = new JPanel();
	private JButton searchButton = new JButton("Search");
	private JPanel bottomPanel = new JPanel();
	private JTextArea results;
	private JTextField message = new JTextField();
//	private JSplitPane bottom = new JSplitPane();
	private JScrollPane scroll;
	
	public Interface() {
		buildInterface();
	}
	
	
	
	private void addFrameContent() {
		message.setPreferredSize(new Dimension(200,20));
		topPanel.add(message);
		topPanel.add(searchButton);
		frame.add(topPanel,BorderLayout.NORTH);
		frame.add(bottomPanel, BorderLayout.SOUTH);
		results = new JTextArea(15,30);
		scroll = new JScrollPane(results);
        results.setEditable(false); 
		scroll.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		bottomPanel.add(scroll);


		
		//topPanel.setLayout(mgr);
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

