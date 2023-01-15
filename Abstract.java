package OOPs;

public class Abstract {
	abstract class Bike {
		abstract void speed();

		void display() {
			System.out.println("Bike class");
		}
	}

	class MotorBike extends Bike {

		@Override
		void speed() {
			// TODO Auto-generated method stub
			System.out.println("Motorbike speed=60kmph");

		}

	}

	public class abstractmethod extends Bike {

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			abstractmethod a = new abstractmethod();
			a.display();
			a.speed();
			MotorBike m = new MotorBike();
			m.speed();

		}

		@Override
		void speed() {
			// we cannot create object of abstract class
			System.out.println("Speed=140kmph");

		}

	}
}

public abstract class Bird {
	abstract void makeSound();
}

class Duck extends Bird {
	public void makeSound() {
		System.out.println("The sound that the Duck makes:  Quack Quack ");
	}
}

class Owl extends Bird {
	public void makeSound() {
		System.out.println("The sound that the Owl makes:  Hoot Hoot ");
	}
}

public class Hello_World {
	public static void main(String[] args) {
		Duck d = new Duck();
		d.makeSound();

		Owl c = new Owl();
		c.makeSound();
	}

}
