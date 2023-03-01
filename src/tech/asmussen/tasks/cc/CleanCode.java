package tech.asmussen.tasks.cc;

public class CleanCode {
	
	public static void main(String[] args) {
		
		// Check if a user is old enough to drink.
		final int validAge = 21;
		final int invalidAge = 18;
		
		System.out.println("isLegalDrinkingAge Checks For People Of Age:");
		System.out.printf("Dirty: %b\n", isLegalDrinkingAgeDirty(validAge));
		System.out.printf("Clean: %b\n", isLegalDrinkingAgeClean(validAge));
		
		System.out.println("isLegalDrinkingAge Checks For People Under Age:");
		System.out.printf("Dirty: %b\n", isLegalDrinkingAgeDirty(invalidAge));
		System.out.printf("Clean: %b\n", isLegalDrinkingAgeClean(invalidAge));
		
		// Check if a user is logged in.
		final boolean isNotLoggedIn = false;
		
		System.out.println("isLoggedIn Checks For Logged In User:");
		System.out.printf("Dirty: %b\n", isLoggedInDirty(isNotLoggedIn));
		System.out.printf("Clean: %b\n", isLoggedInClean(isNotLoggedIn));
		
		System.out.println("isLoggedIn Checks For Not Logged In User:");
		System.out.printf("Dirty: %b\n", isLoggedInDirty(!isNotLoggedIn));
		System.out.printf("Clean: %b\n", isLoggedInClean(!isNotLoggedIn));
		
		// Check if an employee is eligible for retirement benefits.
		Employee eligibleEmployee = new Employee(56, 11, true);
		Employee ineligibleEmployee = new Employee(54, 9, false);
		
		System.out.println("isEligible Checks For Eligible tech.asmussen.tasks.cleancode.Employee:");
		System.out.printf("Dirty: %b\n", isEligibleDirty(eligibleEmployee));
		System.out.printf("Clean: %b\n", isEligibleClean(eligibleEmployee));
		
		System.out.println("isEligible Checks For Ineligible tech.asmussen.tasks.cleancode.Employee:");
		System.out.printf("Dirty: %b\n", isEligibleDirty(ineligibleEmployee));
		System.out.printf("Clean: %b\n", isEligibleClean(ineligibleEmployee));
		
		// Check the order was a preorder.
		final boolean isPreorder = true;
		
		System.out.println("getPrice Checks For Preorder:");
		System.out.printf("Dirty: $%.2f\n", getPriceDirty(isPreorder));
		System.out.printf("Clean: $%.2f\n", getPriceClean(isPreorder));
		
		// Check the order was not a preorder.
		System.out.println("getPrice Checks For Normal Order:");
		System.out.printf("Dirty: $%.2f\n", getPriceDirty(!isPreorder));
		System.out.printf("Clean: $%.2f\n", getPriceClean(!isPreorder));
	}
	
	public static boolean isLegalDrinkingAgeDirty(int age) {
		
		if (age >= 21) {
			
			return true;
			
		} else {
			
			return false;
		}
	}
	
	public static boolean isLegalDrinkingAgeClean(int age) {
		
		final int legalDrinkingAge = 21;
		
		return age >= legalDrinkingAge;
	}
	
	public static boolean isLoggedInDirty(boolean isNotLoggedIn) {
		
		if (!isNotLoggedIn == true) {
			
			return true;
			
		} else {
			
			return false;
		}
	}
	
	public static boolean isLoggedInClean(boolean isNotLoggedIn) {
		
		return !isNotLoggedIn;
	}
	
	public static boolean isEligibleDirty(Employee employee) {
		
		if (employee.getAge() > 55
				&& employee.getYearsEmployed() > 10
				&& employee.isRetired() == true) {
			
			return true;
			
		} else {
			
			return false;
		}
	}
	
	public static boolean isEligibleClean(Employee employee) {
		
		final int minAge = 55;
		final int minYearsEmployed = 10;
		
		return employee.getAge() > minAge
				&& employee.getYearsEmployed() > minYearsEmployed
				&& employee.isRetired();
	}
	
	public static double getPriceDirty(boolean isPreorder) {
		
		if (isPreorder == true) {
			
			return 200.00;
			
		} else {
			
			return 350.00;
		}
	}
	
	public static double getPriceClean(boolean isPreorder) {
		
		final double preorderPrice = 200;
		final double normalPrice = 350;
		
		return isPreorder ? preorderPrice : normalPrice;
	}
}
