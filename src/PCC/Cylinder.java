package PCC;

public class Cylinder extends Circle{
	
	protected double height;
	
	public Cylinder(double x,double y, double radius,double height) {
		super(x,y,radius);
		this.height = height;
	}

	protected double getHeight() {
		return height;
	}

	protected void setHeight(double height) {
		this.height = height;
	}

	@Override
	public void print() {
		// TODO Auto-generated method stub
		super.print();
		System.out.println("≥Ù¿Ã : (" +  this.getHeight() + ")");
	}
	
	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		return super.getArea()*this.getHeight();
	}

}
