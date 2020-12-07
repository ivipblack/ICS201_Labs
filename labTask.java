package lab2;

public class labTask {

	public static void main(String[] args) {
		MyPoint p1 = new MyPoint(0, 0);
		MyPoint p2 = new MyPoint(10, 30.5);
		
		System.out.printf("the distance between them is %.2f",MyPoint.distance(p1, p2));

	}

}
