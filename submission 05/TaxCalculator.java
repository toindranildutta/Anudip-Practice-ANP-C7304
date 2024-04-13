package submission05;

public class CountryNotValidException extends Exception{
		public CountryNotValidException(String str) {
			super(str);
		}
	
}

// ******************************************

package submission05;

public class EmployeeNameInvalidException extends Exception{
	public EmployeeNameInvalidException(String str) {
		super(str);
	}
}

// *******************************************

package submission05;

public class TaxNotEligibleException extends Exception{
	public TaxNotEligibleException(String str) {
		super(str);
	}
}

// *******************************************

package submission05;


public class TaxCalculator {
	double taxAmount;
	
	public double calculateTax(String empName,boolean isIndian, double empSal) throws Exception{
			if(!isIndian) {
				throw new CountryNotValidException("The employee should be an indian citizen for calculatin tax"); }
			if(empName.length()==0) {
				throw new EmployeeNameInvalidException("The employee name can not be empty");}
			if(empSal>100000 && isIndian) {
				taxAmount  = empSal * 8/100;
			} else if (empSal>50000 && isIndian) {
				taxAmount  = empSal * 6/100;
			} else if (empSal>30000 && isIndian) {
				taxAmount  = empSal * 5/100;
			} else if (empSal>10000 && isIndian) {
				taxAmount  = empSal * 4/100;
			} else {
				throw new TaxNotEligibleException("The employee does not need to pay tax");
			}
			return taxAmount;
		
		
	}

	public static void main(String[] args) {
		TaxCalculator obj = new TaxCalculator();
		try {
			double amount = obj.calculateTax("Indranil Dutta", true, 20001);
			System.out.println("Tax amount is " + amount);
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
		

	}

}

