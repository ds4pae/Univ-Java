package RadioButtonGallery;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

public class RadioButtonGallery extends JFrame implements ItemListener, ActionListener {
	public JPanel rbPanel = new JPanel();
	public JPanel ctPanel = new JPanel();
	public JPanel btnPanel = new JPanel();
	
	String rbText[] = {"사과", "배" , "체리", "포도","레몬"};
	public JRadioButton rb[] = new JRadioButton[rbText.length];
	
	String btnText[] = {"Previous" , "Next","Reset"};
	public JButton btn[] = new JButton[btnText.length];
	
	ImageIcon image[] = {	new ImageIcon("image/apple.png"),
							new ImageIcon("image/pear.jpg"),
							new ImageIcon("image/cherry.png"),
							new ImageIcon("image/grape.jpg"),
							new ImageIcon("image/lemon.jpg")};

	public static int imageNum = 0;
	public JLabel label = new JLabel(image[imageNum]);
	ButtonGroup bg = new ButtonGroup();
	
			public RadioButtonGallery() {
		// TODO Auto-generated constructor stub
		this.setTitle("Gallery");
		this.setSize(300, 450);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		this.setLayout(new BorderLayout());
		
		rbPanel.setBackground(Color.gray);
		btnPanel.setBackground(Color.GREEN);
		rbPanel.setOpaque(true);
		
		for(int i = 0 ; i <rb.length ; i ++) {
			rb[i] = new JRadioButton(rbText[i]);
			bg.add(rb[i]);
			rbPanel.add(rb[i]);
			rb[i].addItemListener(this);
		}
		
		for(int i = 0 ; i < btn.length ; i++) {
			btn[i] = new JButton(btnText[i]);
			btnPanel.add(btn[i]);
			btn[i].addActionListener(this);
		}
			
		ctPanel.add(label);
		rb[0].setSelected(true);
		this.add(rbPanel, BorderLayout.NORTH);
		this.add(ctPanel, BorderLayout.CENTER);
		this.add(btnPanel, BorderLayout.SOUTH);
		
		this.setVisible(true);
	}

				@Override
				public void itemStateChanged(ItemEvent e) {
					// TODO Auto-generated method stub
					for(int i = 0 ; i < rb.length ; i++)
						//if(e.getSource() == rb[i]) 
						if(rb[i].isSelected()){
							label.setIcon(image[i]);
							//imageNum = i;
				}
		}

				@Override
				public void actionPerformed(ActionEvent e) {
					// TODO Auto-generated method stub
					
					if(e.getSource() == btn[0]) {
						if(imageNum > 0)
						imageNum--;
						label.setIcon(image[imageNum]);
						rb[imageNum].setSelected(true);
					}
					if(e.getSource() == btn[1]) {
						if(imageNum < (image.length - 1))
						imageNum++;
						label.setIcon(image[imageNum]);
						rb[imageNum].setSelected(true);
					}
					if(e.getSource() == btn[2]) {
						imageNum = 0;
						label.setIcon(image[imageNum]);	
						rb[imageNum].setSelected(true);
					}
				}				
}
