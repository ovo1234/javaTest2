package MyApp;
class Accounting {
	public  double valueOfSupply ;
	public  double vatRate ;
	public  double expenseRate;
	
	public  void print() {			
		System.out.println("Value of supply : "+valueOfSupply);		
		System.out.println("VAT : "+getVAT());
		System.out.println("Total : "+getTotal());
		System.out.println("Expense : "+getExpense());
		System.out.println("Income : "+getIncome());
		System.out.println("Dividend1 : "+getdividend1());
		System.out.println("Dividend2 : "+getdividend2());
		System.out.println("Dividend3 : "+getdividend3());
	}
	
public  double getdividend3() {
	return getIncome() * 0.2;
}
public  double getdividend2() {
	return getIncome() * 0.3;
}
public  double getdividend1() {
	return getIncome() * 0.5;
}
public  double getIncome() {
	return valueOfSupply - getExpense();
}
public  double getExpense() {
	return valueOfSupply * expenseRate;
}
public  double getVAT() {
	return valueOfSupply * vatRate;
}


public  double getTotal() {
	return valueOfSupply + getVAT();
}
}


public class AccountingClassApp {
	public static void main(String[] args) {
		
		Accounting a1 = new Accounting();
			
		a1.valueOfSupply = 10000.0;
		a1.vatRate = 0.1;
		a1.expenseRate = 0.3;	
		a1.print();
		
		
}
		
		
}
