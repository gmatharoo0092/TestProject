package classesandobjects;

public class AccountHolder {
	String firstName;
	String lastName;
	int age;
	float accountBalance;
	boolean eligibleForCreditCard;
	
	//creating function below for CC elibility
	
	public void testEligibilityForCreditCard() {
		if(age>25  && accountBalance>=20000) {
			eligibleForCreditCard=true;
			
		}
			
		
	}
	
}
