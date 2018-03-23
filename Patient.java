package hw3.oop;

public class Patient implements Person {
	private String name;
	private int age;
	private char gdr; // F or M or N
	private String address; // not in the interface

	private int patientID = 100; // initialize the patient ID to 100
	private static int patientCounter = 0;
	private static int currentPatients = 0;

	// implement interface methods
	public void name() {
		System.out.println("The patient's name is :: " + name);
	}

	public void age() {
		System.out.println("The patient's age is ::: " + age);
	}

	public void gender() {
		System.out.println("The patient's gender is :: " + gdr);
	}

	// constructors
	public Patient(String name) {
		this.name = name;
		patientCounter++;
		currentPatients++;
		setPatientID(); // a new object generate a new ID
	}

	public Patient(String name, int age) {
		this.name = name;
		this.age = age;
		patientCounter++;
		currentPatients++;
		setPatientID(); // a new object generate a new ID
	}

	public Patient(String name, int age, char gdr) {
		this.name = name;
		this.age = age;
		this.gdr = gdr;
		patientCounter++;
		currentPatients++;
		setPatientID(); // a new object generate a new ID
	}

	public Patient(String name, int age, char gdr, String address) {
		this.name = name;
		this.age = age;
		this.gdr = gdr;
		this.address = address;
		patientCounter++;
		currentPatients++;
		setPatientID(); // a new object generate a new ID
	}

	// pass a static value to non-static variable that binds with object created
	public void setPatientID() {
		this.patientID = patientCounter + 100;
	}

	public int getPatientID() {
		return patientID;
	}

	public void discharge() {
		currentPatients--;
		System.out.printf("Patient: %s with ID: %d is now discharged.\n The current patient number is %d.\n", name,
				getPatientID(), currentPatients);
	}

	// static method to return values belong to the class instead of instance
	public static int getCurrentPatientNum() {
		return currentPatients;
	}

	// setters to set values
	public void setName(String name) {
		this.name = name;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public void setGender(char gdr) {
		this.gdr = gdr;
	}

	// getters to get values
	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public String getAddress() {
		return address;
	}

	public char getGender() {
		return gdr;
	}

	// method not from interface, but similar
	public void address() {
		System.out.println("The patient's address is :: " + address);
	}

}
