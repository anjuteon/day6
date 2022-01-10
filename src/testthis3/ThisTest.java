package testthis3;

public class ThisTest {
	public ThisTest() {
		this(5);
		System.out.println("ThisTest() 생성자 호출됨");
	}
	
	public ThisTest(int n) {
		System.out.println("public ThisTest(int n) 생성자 호출됨"+n);
	}
	
	public static void main(String arg[]) {
		ThisTest tt=new ThisTest();
	}

}
