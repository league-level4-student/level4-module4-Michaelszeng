package _04_hospital;

import java.util.ArrayList;
import java.util.List;

public class Doctor {
	private ArrayList<Patient> pats = new ArrayList<Patient>();

	public boolean performsSurgery() {
		return false;
	}

	public boolean makesHouseCalls() {
		return false;
	}

	public void assignPatient(Patient patient) throws Exception{
		if (pats.size() < 3) {
			pats.add(patient);
		}
		else {
			throw new DoctorFullException();
		}
		
	}

	public List<Patient> getPatients() {
		return pats;
	}

	public void doMedicine() {
		for (Patient p : pats) {
			p.setFeels(true);
		}
	}

}
