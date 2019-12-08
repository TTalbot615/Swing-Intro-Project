import javax.swing.JFrame;
import javax.swing.SwingUtilities;

public class App {

	public static void main(String[] args) {
		
		SwingUtilities.invokeLater(new Runnable() { //Added this new class to make it more robust, helps prevent crashing
			public void run() {
				JFrame frame = new JFrame("Hello World"); //New Frame with Name Hello World
				frame.setSize(600, 500);
				frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //Tells application to close when you exit window
				frame.setVisible(true); 
			}
		});
		
	}

}
