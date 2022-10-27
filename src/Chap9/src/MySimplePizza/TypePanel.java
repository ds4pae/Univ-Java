package MySimplePizza;

import java.awt.GridLayout;

import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

public class TypePanel extends JPanel implements MyPizzaCalc{
	
	String[] typeList = {"고르곤졸라", "파인애플", "불고기"};
	int[] typeCost = { 10000 , 8000 , 6000 };
	public JRadioButton[] typeRadioBtn = new JRadioButton[typeList.length];
	ButtonGroup bg = new ButtonGroup();
	
	public TypePanel() {
		this.setLayout(new GridLayout(0,1));
		this.setBorder(BorderFactory.createTitledBorder("종류"));
		for(int i = 0 ; i < typeList.length ; i++) {
			typeRadioBtn[i] = new JRadioButton(typeList[i]);
			bg.add(typeRadioBtn[i]);
			this.add(typeRadioBtn[i]);
		}
		typeRadioBtn[0].setSelected(true);
		
	}

	@Override
	public int calc() {
		// TODO Auto-generated method stub
				int calcResult = 0 ;
				for(int i = 0 ; i < typeRadioBtn.length ; i++) {
					if(typeRadioBtn[i].isSelected()) {
						calcResult += typeCost[i];
					}
				}
				
				return calcResult;
	}

	@Override
	public void reset() {
		// TODO Auto-generated method stub
		typeRadioBtn[0].setSelected(true);
	}
}
