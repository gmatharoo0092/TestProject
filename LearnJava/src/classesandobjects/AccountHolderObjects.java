package classesandobjects;

public class AccountHolderObjects {
	public static void main (String[] args) {
		AccountHolder tom = new AccountHolder();
		AccountHolder henry = new AccountHolder();
		AccountHolder sara = new AccountHolder();
		
		tom.firstName="Tom";
		tom.lastName="Smith";
		tom.age=21;
		tom.accountBalance=10000;
		tom.testEligibilityForCreditCard();
		System.out.println("Is Tom eligible for Credit card = "+tom.eligibleForCreditCard);
		
		henry.firstName="Henry";
		henry.lastName="Smith";
		henry.age=25;
		henry.accountBalance=20000;
		henry.testEligibilityForCreditCard();
		System.out.println("Is Henry eligible for Credit card = "+henry.eligibleForCreditCard);
		
		sara.firstName="Sara";
		sara.lastName="Smith";
		sara.age=30;
		sara.accountBalance=30000;
		sara.testEligibilityForCreditCard();
		System.out.println("Is Sara eligible for Credit card = "+sara.eligibleForCreditCard);
		
		
		
		
	}

}
