package hw3.oop;
/**
 * Write an java application using all the OOP features. 
 * Include few static and non-static variables and methods in the design as well.
 * ***** A patient billing and record system is going to programmed.
 */
public class TestBilling {

	public static void main(String[] args) {
		double billing =0; 
		
		VAPatient pat1 = new VAPatient ("Tom Hanks", 43, true);
		VAPatient pat2 = new VAPatient ("Tom Cruise", 42, true);
		VAPatient pat3 = new VAPatient ("Joey Ryan", 23, false);
		VAPatient pat4 = new VAPatient ("Ari Monk", 35, false);

//		System.out.println("The first patient is "+ pat1.getName() + " with patient ID :::"+ pat1.getPatientID());
//		System.out.println("The second patient is "+ pat2.getName() + " with patient ID :::"+ pat2.getPatientID());
//		System.out.println("The third patient is "+ pat3.getName() + " with patient ID :::"+ pat3.getPatientID());
//		System.out.println("The fourth patient is "+ pat4.getName() + " with patient ID :::"+ pat4.getPatientID());
		
		System.out.println("Current patient number is ::" + VAPatient.getCurrentPatientNum()); //static method should be called by class
//		System.out.println("Current patient number is ::" + pat1.getCurrentPatientNum());  // static method can be called by instance
		
		pat1.discharge();  //decrement currentPatients, report the number
		
		VAPatient pat5 = new VAPatient ("Monica Lewiski", 35, true);
		System.out.println("The new patient is "+ pat5.getName() + " with patient ID :::"+ pat5.getPatientID());
		System.out.println("Current patient number is ::" + VAPatient.getCurrentPatientNum()); //static method should be called by class
		
		//test the bill methods
		VABill bill1 = new VABill(pat1.getPatientID()); //synchronize bill with patient by id#
		
		if (pat1.isVet()) {
			billing = bill1.discountedTotalExpense(30, 50, 320);
		}
		else {
			billing = bill1.totalExpense(30, 50, 320);
		}
		System.out.printf("The patient, %s, final bill is:: %f. \n", pat1.getName(), billing);
		
		//another example, pat3, not a vet, call a method to do the calculation
		pat3.discharge(); //decrement currentPatients, report the number
		TestBilling tb1 = new TestBilling();
		billing = tb1.generateBill(pat3, 30, 50, 320);
		System.out.printf("The patient, %s, final bill is:: %f. \n", pat3.getName(), billing);
		
	}
	
	public double generateBill(VAPatient pat, double checkIn, double exam, double meds) {
		int id = pat.getPatientID();
		VABill bill = new VABill(checkIn, exam, meds, id);
		if (pat.isVet()) {
			return bill.discountedTotalExpense(checkIn, exam, meds);
		}
		else
			return bill.totalExpense(checkIn, exam, meds);
	}

}
