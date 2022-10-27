package SimpleCalc;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class SimpleCalcFrame extends JFrame implements ActionListener{
	
	//public JLabel label1 = new JLabel("원금을 입력하시오. ");
	//public JLabel label2 = new JLabel("이율을 입력하시오. ");
	String labelTextString[] = {"원금을 입력하시오. " , "이율을 입력하시오. "};
	int textFieldSize[] = {10,10,20};
	String buttonTextString[] = {"변환" , "리셋"};
	
	public JLabel labelText[] = new JLabel[labelTextString.length];
	public JTextField textField[] = new JTextField[textFieldSize.length];	
	public JButton btn[] = new JButton[buttonTextString.length];
	
	public JPanel panel[] = new JPanel[2];
	
	public SimpleCalcFrame() {
		
		this.setSize(500, 100);
		this.setTitle("Simple Calc");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		this.setLayout(new BorderLayout());
		// GUI design : JFrame에 여러 component를 추가 
		for ( int i = 0 ; i <labelText.length ; i++) {
			labelText[i] = new JLabel(labelTextString[i]);
			//this.add(labelText[i]);
		}
		for ( int i = 0 ; i < textField.length ;i++ ) {
			textField[i] = new JTextField(textFieldSize[i]);
			//this.add(textField[i]);
		}
		
		for ( int i = 0 ; i < btn.length ;i++ ) {
			btn[i] = new JButton(buttonTextString[i]);
			//this.add(btn[i]);
		}
		
		for ( int i = 0 ; i < panel.length ;i++ ) {
			panel[i] = new JPanel();
			//this.add(btn[i]);
		}
		
		
		panel[0].setLayout(new FlowLayout());
		panel[0].add(labelText[0]);
		panel[0].add(textField[0]);
		panel[0].add(labelText[1]);
		panel[0].add(textField[1]);
		panel[0].add(btn[0]);
		panel[0].add(textField[2]);
		panel[0].add(btn[1]);
		
		panel[1] = new ButtonPanel(this);
		
		
		this.add(panel[0], BorderLayout.NORTH);
		this.add(panel[1], BorderLayout.CENTER);
		this.pack();
		
		btn[0].addActionListener(this);
		btn[1].addActionListener(this);
		
		this.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource() == btn[0]) {
			float calcResult = Float.parseFloat(textField[0].getText()) * Float.parseFloat(textField[1].getText());
			textField[2].setText(""+(Float.parseFloat(textField[0].getText())+ calcResult));
		}
		if(e.getSource() == btn[1]) {
			
			for(int i = 0 ; i < textField.length ;i++)
				textField[i].setText("");
		}
	}
}
