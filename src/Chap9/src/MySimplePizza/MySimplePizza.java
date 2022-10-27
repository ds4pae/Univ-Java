package MySimplePizza;

import java.awt.BorderLayout;

import javax.swing.JFrame;

public class MySimplePizza extends JFrame{
	
	public WelPanel welPanel = new WelPanel();
	public TypePanel typePanel = new TypePanel();
	public ToppingPanel toppingPanel = new ToppingPanel();
	public SizePanel sizePanel = new SizePanel();
	public BtnPanel btnPanel = new BtnPanel(this);
	
	public MySimplePizza() {
		this.setTitle("MySimplePizza");
		this.setSize(300,300);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		this.add(welPanel, BorderLayout.NORTH);
		this.add(typePanel , BorderLayout.WEST);
		this.add(toppingPanel , BorderLayout.CENTER);
		this.add(sizePanel , BorderLayout.EAST);
		this.add(btnPanel , BorderLayout.SOUTH);
		this.setVisible(true);
	}
}
