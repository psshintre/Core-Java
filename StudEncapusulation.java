package OOPs;

public class StudEncapusulation {
	public static void main(String[] args) {
		// using getter setter method
//Student s = new Student();
//s.setRno(12);
//s.setName("Pallavi");
//s.setCity("Badlapur");
//System.out.println("Student roll no:" +s.getRno());
//System.out.println("Student's name:" +s.getName());
//System.out.println("City:" +s.getCity());
//}
//}
// using parameterized constructor
		Student s = new Student(34, "Pallavi", "Gzp");
System.out.println("Student roll no:" +s.getRno());
System.out.println("Student's name:" +s.getName());
System.out.println("City:" +s.getCity());
s.setRno(67);
System.out.println("Student roll no:" +s.getRno());
	}
}
