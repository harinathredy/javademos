package methods;

public class Methodoverloading {
	

	void Sum(int x,int y) {
		System.out.println("ans:"+(x+y));
		}
	void Sum(int x,int y,int z) {
		System.out.println("ans:"+(x+y+z));
	}
	
	public static void main(String[] args) {
		Methodoverloading add= new Methodoverloading();
		add.Sum(2, 3);
		add.Sum(4,7,9);
		
		
	}

}
