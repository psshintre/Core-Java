package OOPs;

public class Final {
	int speed = 100;

	void run() {
		System.out.println("Running");
	}
}

class Honda extends Final {
	void run() {
		System.out.println("Running safely with 100kmph:" + speed);
	}
}

public class FinalMethod{
	public static void main(String[] args) {
		Honda honda = new Honda();
		honda.run();
		honda.speed = 200;
		honda.run();
	}
}
