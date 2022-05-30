package chap4;

public class Professor extends Researcher{
	String dept; // 소속 학부명

	public void action() {
		super.action();
		System.out.println("가르침!!!");
	}
	
}
