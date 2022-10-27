package RadioButtonGalleryLogin;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class LoginPanel extends JPanel implements ActionListener {
		
	public Login login;
	JLabel login_ID_Label = new JLabel("Login ID:", JLabel.CENTER);
	JLabel pw_Label = new JLabel("Password:", JLabel.CENTER);
	public JTextField login_ID_TF = new JTextField(10);
	//public JTextField pw_TF = new JTextField(10);
	public JPasswordField pw_TF = new JPasswordField(10);
	public JButton login_BT = new JButton("Login");
	public JButton searchID_BT = new JButton("ID찾기");
	public JButton searchPW_BT = new JButton("PW찾기");
	int loginCount = 0;
	
	private String[][] login_ID_PW = { 
										{"Brother", "1234", "01012345678"},
										{"Sister", "5678", "01056781234"},
										{"Mom", "1357", "01034567890"},
										{"Dad", "2468", "01011112222"},
										{"Dog", "9999", "01033334444"}
									 };
	
	public LoginPanel() {
		// TODO Auto-generated constructor stub
	}

	public LoginPanel(Login login) {
		// TODO Auto-generated constructor stub
		this.login = login;
		this.setLayout(new GridLayout(0, 2));
		this.add(login_ID_Label);
		this.add(login_ID_TF);
		this.add(pw_Label);
		this.add(pw_TF);
		this.add(new JLabel(""));
		this.add(login_BT);
		this.add(searchID_BT);
		this.add(searchPW_BT);
		login_BT.addActionListener(this);
		searchID_BT.addActionListener(this);
		searchPW_BT.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		String phoneNum = " ";
		String password = new String(pw_TF.getPassword());
		int IDNum = 0;
		int IDcheck = 0;
		int PWcheck = 0;
		int searchID = 0;
		int searchPW = 0;
		
		if (e.getSource() == login_BT) {
			for(int i = 0 ; i < login_ID_PW.length; i++) {
				if (login_ID_TF.getText().equals(login_ID_PW[i][0])) {
					if(IDNum == 1) {
						break;
					}
					IDcheck++;
					IDNum = i;
				}
			}
			if(IDcheck == 1){
				if (pw_TF.getText().equals(login_ID_PW[IDNum][1])) {
					PWcheck++;
					}
				if(PWcheck == 1) {
					System.out.println("Correct ID && PW");
					RadioButtonGallery rbg = new RadioButtonGallery();
				}
				else {
					loginCount++;
					JOptionPane.showMessageDialog(null,"IncorrectPW , 실패 횟수 : "+ loginCount);
				}
			}
				else {
					loginCount++;
					JOptionPane.showMessageDialog(null,"IncorrectID, 실패 횟수 : "+ loginCount);
		}
			if(loginCount == 3) {
				JOptionPane.showMessageDialog(null,"3회 이상 틀려 종료합니다.");
				System.exit(0);
			}
		}
	
	
		
		
		if (e.getSource() == searchID_BT) {
			phoneNum = JOptionPane.showInputDialog(null, "전화번호를 입력해주세요 ('-' 제외)");
			for(int i = 0 ; i <login_ID_PW.length ; i++) {
			if(phoneNum.equals(login_ID_PW[i][2])){
				searchID = i;
				JOptionPane.showMessageDialog(null, "ID는 "+login_ID_PW[searchID][0]+"입니다");
			}
			}
			
		}
		
		
		if (e.getSource() == searchPW_BT) {
			phoneNum = JOptionPane.showInputDialog(null, "전화번호를 입력해주세요 ('-' 제외)");
			for(int i = 0 ; i <login_ID_PW.length ; i++) {
			if(phoneNum.equals(login_ID_PW[i][2])){
				searchPW = i;
				JOptionPane.showMessageDialog(null, "PW는 "+login_ID_PW[searchPW][1]+"입니다");
			}
			}
			
		}
	}
}