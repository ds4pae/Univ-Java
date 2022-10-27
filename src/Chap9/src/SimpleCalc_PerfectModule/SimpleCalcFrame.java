package SimpleCalc_PerfectModule;

import java.awt.BorderLayout;

import javax.swing.JFrame;


public class SimpleCalcFrame extends JFrame{
	
	public TopPanel topPanel;
	public ButtonPanel buttonPanel;
	
	public SimpleCalcFrame() {
		
		this.setSize(500, 100);
		this.setTitle("Simple Calc");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		this.setLayout(new BorderLayout());
		buttonPanel = new ButtonPanel(this);
		topPanel = new TopPanel(this);
		
		this.add(topPanel, BorderLayout.NORTH);
		this.add(buttonPanel, BorderLayout.CENTER);
		this.pack();
		
		this.setVisible(true);
	}

	
}