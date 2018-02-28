package practice10;

public class Car {
	int serialNo;
	String color;
	int gasoline;

	public int run() {
		this.gasoline--;

		int index = new java.util.Random().nextInt(15)+1;

		if(this.gasoline<0) {
			return -1;
		}
		return index;


	}



}
