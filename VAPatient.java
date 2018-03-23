package hw3.oop;

public class VAPatient extends Patient {

	private boolean vet; // check if patient is vet or not.

	public VAPatient(String name, boolean vet) {
		super(name);
		this.vet = vet;
	}

	public VAPatient(String name, int age, boolean vet) {
		super(name, age);
		this.vet = vet;
	}

	public VAPatient(String name, int age, char gdr, String address, boolean vet) {
		super(name, age, gdr);
		this.vet = vet;
	}

	public boolean isVet() {
		return vet;
	}
}
