package _04_hospital;

public class Patient {
	private boolean feels = false;

	public Object feelsCaredFor() {
		return feels;
	}

	public void checkPulse() {
		feels = true;
	}
	
	public void setFeels(boolean b) {
		feels = b;
	}

}
