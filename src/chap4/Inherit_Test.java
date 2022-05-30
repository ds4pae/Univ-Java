package chap4;

public class Inherit_Test {

	public static void main(String[] args) {
	Student s = new Student();
	Student sw = new StudentWorker();
	Professor p = new Professor();
	
	
	sw.action();
	p.action();
	}
}
