import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextArea;

//Controller for the application
//There shouldn't be communication between the classes
public class MainFrame extends JFrame {
	
	
	private TextPanel textPanel;
	private JButton btn;
	private Toolbar toolbar;
	
	public MainFrame() {
		super("Hello World");
		
		setLayout( new BorderLayout()); //Our Chosen Layout Scheme
		
		toolbar = new Toolbar();
		textPanel = new TextPanel();
		
		toolbar.setStringListener(new StringListener() { //Anonymous class
			public void textEmitted(String text) {
				textPanel.appendText(text);
			}
			
		});
		
		add(toolbar, BorderLayout.NORTH);
		add(textPanel, BorderLayout.CENTER);
		
		
		
		setSize(600, 500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //Tells application to close when you exit window
		setVisible(true);
	}
}
