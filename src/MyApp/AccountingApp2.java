package MyApp;
public class AccountingApp2 {
	public static void main(String[] args) {
		
		// 한번에 숫자 바꾸고 선언하는 법 : 숫자 선택 후 우클릭 -> refactor -> extract local variable 
		
				double valueOfSupply = 12345.0;
				double vatRate = 0.1;
				double vat = valueOfSupply * vatRate;
				double expenseRate = 0.3;
				double expense = valueOfSupply * expenseRate;
				double total = valueOfSupply + vat;
				double income = valueOfSupply - expense;
				double dividend1 = income * 0.5;
				double dividend2 = income * 0.3;
				double dividend3 = income * 0.2;
				
				
				
				System.out.println("Value of supply : "+valueOfSupply);		
				System.out.println("VAT : "+vat);
				System.out.println("Total : "+total);
				System.out.println("Expense : "+expense);
				System.out.println("Income : "+income);
				System.out.println("Dividend1 : "+dividend1);
				System.out.println("Dividend2 : "+dividend2);
				System.out.println("Dividend3 : "+dividend3);
				
				// edit -> find/replace 하면 모든 값을 한번에 바꿀 수 있음
		
	}
}
