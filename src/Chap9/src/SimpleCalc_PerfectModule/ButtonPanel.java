package SimpleCalc_PerfectModule;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;

import javax.swing.JButton;
import javax.swing.JPanel;

public class ButtonPanel extends JPanel implements ActionListener{
	
		String[] keyPadBtnText = {"1","2","3","4","5","6","7","8","9","0","."};
		public JButton[] keyPadBtn = new JButton[keyPadBtnText.length];
		public SimpleCalcFrame scf;
		public TopPanel topPanel;
		public int focusOn = 0;
		
		public ButtonPanel(SimpleCalcFrame scf) {
			this.scf = scf;
			
			this.setLayout(new GridLayout(0,3));
			
			for(int i = 0 ; i < keyPadBtn.length;i++) {
				keyPadBtn[i] = new JButton(keyPadBtnText[i]);
				this.add(keyPadBtn[i]);
				keyPadBtn[i].addActionListener(this);
			}
			
		}

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			
			for(int i = 0 ; i<keyPadBtnText.length ; i++) {
				if(e.getSource() == keyPadBtn[i]) {
					scf.topPanel.textField[focusOn].setText(scf.topPanel.textField[focusOn].getText() + keyPadBtnText[i]);
				}
			}
		}

}