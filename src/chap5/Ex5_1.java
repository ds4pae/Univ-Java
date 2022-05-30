package chap5;

class Point{
	protected int x;
	protected int y;

	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public Point() {

	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	protected void set(int x,int y) {
		setX(x);
		setY(y);
	}

	protected void show() {
		System.out.println("("+getX()+","+getY()+")");
	}

}

class ColorPoint extends Point{
	protected String color;

	public ColorPoint() {
		super();

	}

	public ColorPoint(int x , int y , String color) {
		super(x,y);
		//this.color = color;
		setColor(color);
	}

	public ColorPoint(int x,int y) {
		super(x,y);

	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	protected void set(int x,int y, String color) {
		super.set(x, y);
		setColor(color);
	}

	protected void show(int x , int y , String color) {
		// TODO Auto-generated method stub
		super.set(x,y);
		setColor(color);
	}

	@Override
	protected void show() {
		System.out.println("["+getX()+","+getY()+":"+color+"]");
	}

}

class ThreeDPoint extends ColorPoint{
	protected int z;


	public ThreeDPoint() {
		super();
	}

	public ThreeDPoint(int x, int y) {
		super(x,y);
	}
	
	public ThreeDPoint(int x, int y, int z, String color) {
		super();
	}
	
	
	//생성자 여러개
	public int getZ() {
		return z;
	}
	//게터 세터
	public void setZ(int z) {
		this.z = z;
	}
	protected void set(int x,int y,int z, String color) {
		super.set(x, y,color);
		setZ(z);
	}	
	
	public void show() {
		System.out.println("["+getX()+","+getY()+","+getZ()+":"+color+"]");
	}

	//기존 메소드 재정의


}

public class Ex5_1 {

	public static void main(String[] args) {
		Point p = new Point();
		p.set(1, 2);
		p.show();

		ColorPoint cp = new ColorPoint(3,4,"Blue");
		cp.show();

		ThreeDPoint tdp = new ThreeDPoint(1,2,3,"Red");
		tdp.set(4,5,6,"yellow");
		tdp.show();
	}	
}
