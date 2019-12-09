import javax.swing.JFrame;
import javax.swing.SwingUtilities;

public class App {

	public static void main(String[] args) {
		
		SwingUtilities.invokeLater(new Runnable() { //Added this new class to make it more robust, helps prevent crashing
			public void run() {
				new MainFrame(); //New class of the main frame type
			}
		});
		
	}

}
