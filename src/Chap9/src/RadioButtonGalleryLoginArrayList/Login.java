package RadioButtonGalleryLoginArrayList;

import javax.swing.JFrame;

public class Login extends JFrame {
	
	public LoginPanel loginPanel = new LoginPanel(this);
	
	public Login() {
		// TODO Auto-generated constructor stub
		this.setTitle("Login Frame");
		this.setSize(300, 125);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.add(loginPanel);
		this.setVisible(true);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Login();
	}

}
