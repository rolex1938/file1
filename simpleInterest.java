package sathya;

public class simpleInterest {
	
	
	public static void main(String[] args) {
		int principleAmount=80000;
		int timePeriod=3;
		double rateOfInterest=3.5;
		double simpleInterest=(principleAmount*timePeriod*rateOfInterest)/100;
		double totalAmount=principleAmount+simpleInterest;
		System.out.println("the simple interest is:"+simpleInterest);
		System.out.println("the total amount is:"+totalAmount);

	}

}
