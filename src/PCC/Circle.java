package PCC;

public class Circle extends Point{

	/**
	 * @param x
	 * @param y
	 * @param radius
	 */
	public Circle() {
		// TODO Auto-generated constructor stub
		super(0.0,0.0);
		
	}
	
	public Circle(double x, double y, double radius) {
		super(x, y);
		this.radius = radius;
	}

	protected double radius;
	
	protected double getRadius() {
		return radius;
	}

	protected void setRadius(double radius) {
		this.radius = radius;
	}
	
	public double getArea() {	
		return getRadius() * getRadius() * Math.PI;
	}

	

	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.println("원의 중심 : (" + this.getX() + "," + this.getY() + ")");
		System.out.println("원의 반지름 : (" +  this.getRadius() + ")");
	}
	

}
