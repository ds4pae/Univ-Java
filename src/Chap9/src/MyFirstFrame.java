import java.awt.FlowLayout;
import java.awt.Image;

import javax.swing.JButton;
import javax.swing.JFrame;

public class MyFirstFrame {
	//private Image background=new ImageIcon(Main.class.getResource("경로")).getImage();//배경이미지
    public static void main(String[] args) {
    	JFrame fr = new JFrame();
    	JButton[] btn = new JButton[5];
    	
    	
    	
    	fr.setSize(300,200);
    	fr.setTitle("KAZOOPARK");
    	fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    	fr.setLayout(new FlowLayout());
    	
    	for(int i = 0 ; i < btn.length ; i++){
    		btn[i] = new JButton("버튼"+ (i+1) );
    		btn[i].setSize(50, 50);
    		//btn[0].setText("눌러방");
        	fr.add(btn[i]);
    	}
    	
    
    	
    	fr.setVisible(true);
    }
}

