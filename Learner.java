package basicprogram;

public class Learner {
	String Iname;
	String Fname;

	public String getFname() {
		return Fname;
	}

	public void setFname(String Fname) {
		this.Fname = Fname;
	}

	public String getIname() {
		return Iname;
	}

	public void setIname(String Iname) {
		this.Iname = Iname;
	}
}
	class LearnerNameException extends Exception {
		public LearnerNameException(String s) {
			super(s);
		}
	}

	public class LearnerUserDefinedException() {

		void checkName(String fname, String Iname) throws LearnerNameException {
			if (fname.isEmpty() && Iname.isEmpty()) {
				throw new LearnerNameException("Fname & Iname is empty");
			}

			else if (Fname.isEmpty()) {
				throw new LearnerNameException("Fname is empty");
			} else if (Iname.isEmpty()) {
				throw new LearnerNameException("Iname is empty");
			}
		} 
	
		public static void main(String[] args) throws LearnerNameException {
			Learner I = new Learner();
			I.setFname("a");
			I.setIname("");
			LearnerUserDefinedException Iu = new LearnerUserDefinedException();
		}
	}

