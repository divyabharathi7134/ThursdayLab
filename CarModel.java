package array;

public class CarModel {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		enum car{benz(2018),tesla(2020),audi(2022);
		private int value;  
		private car(int value){  
		this.value=value;  
		}  
		}
		System.out.println("    Car Name\tModel Year");
		for(car c : car.values())
			System.out.println("    "+c+"\t"+c.value);
	}

}


