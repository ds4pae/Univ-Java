package MySimplePizza;

import java.awt.GridLayout;

import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.JCheckBox;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

public class ToppingPanel extends JPanel implements MyPizzaCalc{
	String[] toppingList = {"ġ��", "���۷δ�", "��������", "��������"};
	int[] toppingCost = { 2000 , 1500 , 1000 , 3000 };
	public JCheckBox[] toppingRadioBtn = new JCheckBox[toppingList.length];
	
	
	public ToppingPanel() {
		this.setLayout(new GridLayout(0,1));
		this.setBorder(BorderFactory.createTitledBorder("����"));
		for(int i = 0 ; i < toppingList.length ; i++) {
			toppingRadioBtn[i] = new JCheckBox(toppingList[i]);
			this.add(toppingRadioBtn[i]);
		}
		toppingRadioBtn[0].setSelected(true);
}


	@Override
	public int calc() {
		// TODO Auto-generated method stub
				int calcResult = 0 ;
				for(int i = 0 ; i < toppingRadioBtn.length ; i++) {
					if(toppingRadioBtn[i].isSelected()) {
						calcResult += toppingCost[i];
					}
				}
				
				return calcResult;
	}


	@Override
	public void reset() {
		// TODO Auto-generated method stub
		toppingRadioBtn[0].setSelected(true);
		for(int i = 1; i < toppingRadioBtn.length ; i++)
			toppingRadioBtn[i].setSelected(false);
	}
}
