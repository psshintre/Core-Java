package OOPs;

public class Car {
	
	class car{
		public car()
		{
			System.out.println("Class Car");
		}
		public void vehicleType() {
			System.out.println("Vehicle Type:Four Wheeler(car)");
		}
		
	}

	class Maruti extends car{
		public Maruti() {
			System.out.println("Class Maruti");
		}
		void brand()
		{
			System.out.println("Band:Maruti Suzuki");
		}
		void speed() {
			System.out.println("Max:90kmph");
		}
	}

	class Maruti800 extends Maruti{
		public Maruti800() {
			System.out.println("Maruti Model:800");
		}
		public void speed() {
			System.out.println("Max: 80kmph");
		}
	}

	public class Multilevel {

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			Maruti800 obj = new Maruti800();
	  	  obj.vehicleType();
	  	  obj.brand();
	  	  obj.speed();

		}

	}
}
