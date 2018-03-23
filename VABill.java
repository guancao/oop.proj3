package hw3.oop;

public class VABill extends Bill {

	private double vetDiscountPct = .25;

	public VABill(int id) {
		setBillId(id);
	}
	
	public VABill(double checkIn, double exam, double meds, int billId) {
		super(checkIn, exam, meds, billId); 
	}

	// implement abstract method from the super class
	public double discountedTotalExpense(double checkIn, double exam, double meds) {
		total = checkIn + exam + meds;
		return (total * (1 - vetDiscountPct));
	}
}
