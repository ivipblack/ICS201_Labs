package lab2;

public class MyPoint {
	private double x;
	private double y;
	
	public MyPoint() {
	}
	
	public MyPoint(double x, double y) {
		this.x = x;
		this.y = y;
	}
	public double getX() {
		return x;
	}
	public double getY() {
		return y;
	}
	public double distance(MyPoint p) {
		return distance(p, this);
		
	}
	public double distance(double x, double y) {
		MyPoint p = new MyPoint(x, y);
		return distance(this, p);
	}
	public static double distance(MyPoint p1, MyPoint p2) {
		double x1 = p1.getX();
		double y1 = p1.getY();
		
		double x2 = p2.getX();
		double y2 = p2.getY();
		
		return Math.hypot(x2 - x1, y2 - y1);
			
		}
}
