package MySimplePizza;

import javax.swing.JLabel;
import javax.swing.JPanel;

public class WelPanel extends JPanel{
	public JLabel welcomeLabel = new JLabel("Welcome Pizza World");
	public WelPanel() {
		this.add(welcomeLabel);
	}
}
