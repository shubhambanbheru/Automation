package Interface;

public class TestClass {

	public static void main(String[] args) {

		//Calculator C1= new Calculator();
		//Casio C2= new Casio();
		
		AdvanceCalculator AC= new AdvanceCalculator();
		
		AC.Add();
		AC.Sub();
		AC.Mul();
		AC.log();
		AC.Tan();
		
		System.out.println("----------------------------------------");
		
		Calculator C1=new AdvanceCalculator();
		
		C1.Add();
		C1.Sub();
		C1.Mul();
		
		System.out.println("----------------------------------------");
		
		Casio C2=new AdvanceCalculator();
		 
		C2.Tan();
		C2.log();
		
		System.out.println("---------------------------------------------");
		
		HSBCBank  HB=new HSBCBank();
		
		HB.Credit();
		HB.BikeLoan();
		HB.CarLoan();
		HB.Cards();
		HB.Debit();
		HB.TransferMoney();
		HB.MutualFunds();
		HB.PersonalLoan();
		
		System.out.println("---------------------------------------------------");
		
		RBIBank RB =new HSBCBank();
		 
		 RB.Credit();
		RB.Debit();
		RB.TransferMoney();
		
		System.out.println("----------------------------------------");
	
		USBank US=new HSBCBank();
		
		US.BikeLoan();
		US.PersonalLoan();
		
		System.out.println("----------------------------------------");

		BrazilBank BR=new HSBCBank();
		
		BR.CarLoan();
		BR.MutualFunds();
	}

}
