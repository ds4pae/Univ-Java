package chap4;

public class Researcher extends Person{
	String title; //직급
	
	public void action() {
		super.action();
		System.out.println("연구!!");
	}
}
