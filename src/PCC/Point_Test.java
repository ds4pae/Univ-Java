package PCC;

public class Point_Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle cir = new Circle(3,4,5.6);
		cir.print();
		System.out.println(cir.getArea());
		
		Cylinder cyl = new Cylinder(3,4,5.6,7.0);
		cyl.print();
		System.out.println(cyl.getArea());
		
	}

}
