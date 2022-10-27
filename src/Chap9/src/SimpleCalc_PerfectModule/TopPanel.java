package SimpleCalc_PerfectModule;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class TopPanel extends JPanel implements FocusListener, ActionListener{
	
	String[] keyPadBtnText = {"1","2","3","4","5","6","7","8","9","0","."};
	public JButton[] keyPadBtn = new JButton[keyPadBtnText.length];
	public SimpleCalcFrame scf;
	public ButtonPanel buttonPanel;
	
	
	String labelTextString[] = {"원금을 입력하시오. " , "이율을 입력하시오. "};
	int textFieldSize[] = {10,10,20};
	String buttonTextString[] = {"변환" , "리셋"};
	public int focusOn = 0;
	JLabel labelText[] = new JLabel[labelTextString.length];
	JTextField textField[] = new JTextField[textFieldSize.length];	
	JButton btn[] = new JButton[buttonTextString.length];
	
	public TopPanel(SimpleCalcFrame simpleCalcFrame) {
		// TODO Auto-generated constructor stub
		this.scf = simpleCalcFrame; 
		
		for ( int i = 0 ; i <labelText.length ; i++) {
			labelText[i] = new JLabel(labelTextString[i]);
		}
		for ( int i = 0 ; i < textField.length ;i++ ) {
			textField[i] = new JTextField(textFieldSize[i]);
			textField[i].addFocusListener(this);
		}
		
		for ( int i = 0 ; i < btn.length ;i++ ) {
			btn[i] = new JButton(buttonTextString[i]);
		}
		
		for(int i = 0 ; i < keyPadBtn.length;i++) {
			keyPadBtn[i] = new JButton(keyPadBtnText[i]);
			this.add(keyPadBtn[i]);
			keyPadBtn[i].addActionListener(this);
		}
		
		this.setLayout(new FlowLayout());
		this.add(labelText[0]);
		this.add(textField[0]);
		this.add(labelText[1]);
		this.add(textField[1]);
		this.add(btn[0]);
		this.add(textField[2]);
		this.add(btn[1]);

	}

	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		for(int i = 0 ; i<keyPadBtnText.length ; i++) {
			if(e.getSource() == keyPadBtn[i]) {
				scf.topPanel.textField[focusOn].setText(scf.topPanel.textField[focusOn].getText() + keyPadBtnText[i]);
			}
		}
	}

	
	@Override
	public void focusGained(FocusEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource() == textField[0]) {
			buttonPanel.focusOn = 0;
		}
		if(e.getSource() == textField[1]) {
			buttonPanel.focusOn = 1;
		}
	}

	@Override
	public void focusLost(FocusEvent e) {
		// TODO Auto-generated method stub
		
	}

	

}
