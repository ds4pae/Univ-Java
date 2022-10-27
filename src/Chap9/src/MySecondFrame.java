import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class MySecondFrame extends JFrame{
	
	JButton[] btn = new JButton[5];
	
	MySecondFrame() {
		this.setSize(500,100);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(new FlowLayout());
		
		

		for(int i = 0 ; i < btn.length ; i++){
    		btn[i] = new JButton("��ư"+ (i+1) );
    		btn[i].setSize(50, 50);
        	this.add(btn[i]);
    	}
		this.setVisible(true);
	}
}
