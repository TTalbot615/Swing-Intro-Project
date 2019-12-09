import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;

public class Toolbar extends JPanel implements ActionListener {
	//constructor
	private JButton helloButton;
	private JButton goodbyeButton;
	private StringListener textListener;
	
	
	public Toolbar() {
		helloButton = new JButton("Hello");
		goodbyeButton = new JButton("Goodbye");
		
		helloButton.addActionListener(this);
		goodbyeButton.addActionListener(this);
		
		//Flow Layout adds components horizontally, can't do vertically
		setLayout(new FlowLayout(FlowLayout.LEFT));
		
		add(helloButton);
		add(goodbyeButton);
	}
	
	//Method
	public void setStringListener(StringListener listener) {
		this.textListener = listener;
	}
	
	public void actionPerformed(ActionEvent e) {
		JButton clicked = (JButton)e.getSource();
		
		if(clicked == helloButton) {
			if(textListener != null) {
				textListener.textEmitted("Hello\n");
			}
		}
		else if(clicked == goodbyeButton) {
			if(textListener != null) {
				textListener.textEmitted("Goodbye\n");
			}
		}
	}
}