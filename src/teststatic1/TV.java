package teststatic1;

public class TV {
	public static String producer; //공유영역에 한번만 할당됨
	private int size;
	private String color;
	
	public TV(int size, String color) {
		this.size=size;
		this.color=color;
	}

	public int getSize() {
		return size;
	}

	public String getColor() {
		return color;
	}
	
	

}
