package MyApp;
public class AccountingApp3 {
	public static void main(String[] args) {
		
		// 아규먼트를 받는 프로그램으로 수정하기
				// run -> con~-> argument-> 값 지정 후 apply 
				// 이클립스 없이 하는 법 : 경로 복사 후 cmd 킨 후 경로 이동 실행
				
				double valueOfSupply = Double.parseDouble(args[0]);
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
		
	}
}
