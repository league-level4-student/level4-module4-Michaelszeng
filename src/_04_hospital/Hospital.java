package _04_hospital;

import java.util.ArrayList;
import java.util.List;

public class Hospital {
	private ArrayList<Doctor> docs = new ArrayList<Doctor>();
	private ArrayList<Patient> pats = new ArrayList<Patient>();

	public void addDoctor(Doctor doc) {
		docs.add(doc);
	}
	
	public void addPatient(Patient patient) {
		pats.add(patient);
	}

	public List<Doctor> getDoctors() {
		return docs;
	}

	public List<Patient> getPatients() {
		return pats;
	}

	public void assignPatientsToDoctors() throws Exception {
		int numPats = pats.size();
		for (int i=0; i<docs.size(); i++) {
			if (pats.size() > i*3) {
				docs.get(i).assignPatient(pats.get(i*3));
			}
			if (pats.size() > i*3+1) {
			docs.get(i).assignPatient(pats.get(i*3+1));
			}
			if (pats.size() > i*3+2) {
			docs.get(i).assignPatient(pats.get(i*3+2));
			}
		}
	}

}
