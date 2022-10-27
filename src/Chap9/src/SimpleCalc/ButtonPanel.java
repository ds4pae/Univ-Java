package SimpleCalc;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;

import javax.swing.JButton;
import javax.swing.JPanel;

public class ButtonPanel extends JPanel implements ActionListener, FocusListener {
	
		String[] keyPadBtnText = {"1","2","3","4","5","6","7","8","9","0","."};
		public JButton[] keyPadBtn = new JButton[keyPadBtnText.length];
		public SimpleCalcFrame scf;
		public int focusOn = 0;
		public ButtonPanel(SimpleCalcFrame scf) {
			this.scf = scf;
			this.setLayout(new GridLayout(0,3));
			
			for(int i = 0 ; i < keyPadBtn.length;i++) {
				keyPadBtn[i] = new JButton(keyPadBtnText[i]);
				this.add(keyPadBtn[i]);
				keyPadBtn[i].addActionListener(this);
			}
			for(int i = 0 ; i < scf.textField.length;i++) {
				scf.textField[i].addFocusListener(this);
			}
		}

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			
			for(int i = 0 ; i<keyPadBtnText.length ; i++) {
				if(e.getSource() == keyPadBtn[i]) {
					scf.textField[focusOn].setText(scf.textField[focusOn].getText() + keyPadBtnText[i]);
				}
			}
		}

		@Override
		public void focusGained(FocusEvent e) {
			// TODO Auto-generated method stub
			if(e.getSource() == scf.textField[0]) {
				focusOn = 0;
			}
			if(e.getSource() == scf.textField[1]) {
				focusOn = 1;
			}
			
		}

		@Override
		public void focusLost(FocusEvent e) {
			// TODO Auto-generated method stub

		}
	}

