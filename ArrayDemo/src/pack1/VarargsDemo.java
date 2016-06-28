package pack1;

public class VarargsDemo {

	public static void main(String[] args) {
		
	}
	
	public static void display (int...arr){
		System.out.println("var args called");
		for (int val : arr){
			System.out.println(val);
		}
		System.out.println("------------------------");
	}
	

}
