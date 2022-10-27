package MySimplePizza;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;

public class BtnPanel extends JPanel implements ActionListener{
	public MySimplePizza msp;
	
	public JButton order = new JButton("주문");
	public JButton reset = new JButton("취소");
	
	public BtnPanel(MySimplePizza msp) {
		this.msp = msp;
		this.add(order);
		this.add(reset);
		order.addActionListener(this);
		reset.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		int calcTotalResult = 0;
		if (e.getSource() == order) {
			calcTotalResult = msp.sizePanel.calc() + msp.typePanel.calc() + msp.toppingPanel.calc();
			msp.welPanel.welcomeLabel.setText("총 가격은 " + calcTotalResult +"원 입니다.");
		}
		
		if(e.getSource() == reset) {
			msp.welPanel.welcomeLabel.setText("Welcome Pizza World");
			msp.sizePanel.reset();
			msp.typePanel.reset(); 
			msp.toppingPanel.reset();
			
		}
	}
}
