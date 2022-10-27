package MySimplePizza;

import java.awt.GridLayout;

import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

public class SizePanel extends JPanel implements MyPizzaCalc{
	String[] sizeList = {"Small", "Medium", "Large"};
	int[] sizeCost = { 10000 , 15000 , 20000 };
	public JRadioButton[] sizeRadioBtn = new JRadioButton[sizeList.length];
	ButtonGroup bg = new ButtonGroup();
	
	public SizePanel() {
		this.setLayout(new GridLayout(0,1));
		this.setBorder(BorderFactory.createTitledBorder("Á¾·ù"));
		
		for(int i = 0 ; i < sizeList.length ; i++) {
			sizeRadioBtn[i] = new JRadioButton(sizeList[i]);
			bg.add(sizeRadioBtn[i]);
			this.add(sizeRadioBtn[i]);
		}
		sizeRadioBtn[0].setSelected(true);
		
	}

	@Override
	public int calc() {
		// TODO Auto-generated method stub
		int calcResult = 0 ;
		for(int i = 0 ; i < sizeRadioBtn.length ; i++) {
			if(sizeRadioBtn[i].isSelected()) {
				calcResult += sizeCost[i];
			}
		}
		
		return calcResult;
	}

	@Override
	public void reset() {
		// TODO Auto-generated method stub
		sizeRadioBtn[0].setSelected(true);
	}
}
