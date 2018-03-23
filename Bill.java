package hw3.oop;

public abstract class Bill {

	private int billId;
	private double checkIn = 0;
	private double exam = 0;
	private double meds = 0;

	double total = 0;

	public Bill() {

	}

	public Bill(int billId) {
		setBillId(billId);
	}

	public Bill(double checkIn, double exam, int billId) {
		this.checkIn =checkIn;
		this.exam = exam;
		setBillId(billId);
	}
	public Bill(double checkIn, double exam, double meds, int billId) {
		this.checkIn =checkIn;
		this.exam = exam;
		this.meds = meds;
		setBillId(billId);
	}
	
	public void setBillId(int id) {
		this.billId = id;
	}
	
	public int getBillId() {
		return billId;
	}
	
	// method overloading
	public double totalExpense(double checkIn, double exam) {
		this.checkIn = checkIn;
		this.exam = exam;
		total = checkIn + exam;
		return total;
	}

	public double totalExpense(double checkIn, double exam, double meds) {
		this.checkIn = checkIn;
		this.exam = exam;
		this.meds = meds;
		total = checkIn + exam + meds;
		return total;
	}

	// abstract method
	public abstract double discountedTotalExpense(double checkIn, double exam, double meds);

}
