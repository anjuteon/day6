package teststatic1;

public class RunTV {

	public static void main(String[] args) {
		TV t1=new TV(32, "blue");
		TV t2=new TV(55, "red");
		TV t3=new TV(100, "green");
		
		t1.producer="LG전자"; //producer는 공유하는 변수니까 하나에만 넣어도 다 적용됨
		
		System.out.printf("t1이 참조하는 객체의 멤버필드 color : %s, size : %d, producer : %s\n",
				t1.getColor(), t1.getSize(), t1.producer);
		
		System.out.printf("t2가 참조하는 객체의 멤버필드 color : %s, size : %d, producer : %s\n",
				t2.getColor(), t2.getSize(), t2.producer);
		
		System.out.printf("t3가 참조하는 객체의 멤버필드 color : %s, size : %d, producer : %s\n",
				t3.getColor(), t3.getSize(), t3.producer);
		

	}

}
