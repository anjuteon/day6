package testthis2;

public class PrintCircle {
	public static void print(Circle c) {
		System.out.printf("반지름 %d인 원의 둘레 : %.2f\n", c.getR(), c.getCircum());
		System.out.printf("반지름 %d인 원의 면적 : %.2f\n", c.getR(), c.getArea());
	}
	

	public static void main(String[] args) {
		Circle c=new Circle(7);
		c.showInfo();
		
		Circle c2=new Circle(13);
		c2.showInfo();

	}

}
