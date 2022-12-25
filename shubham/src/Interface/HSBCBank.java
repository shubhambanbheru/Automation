package Interface;

public class HSBCBank implements RBIBank,USBank,BrazilBank {

	

	@Override
	public void Credit() {
		System.out.println(minBalance);

		System.out.println("HSBCBank--Credit");
		
	}

	@Override
	public void Debit() {
		System.out.println("HSBCBank--Debit");

	}

	@Override
	public void TransferMoney() {
		System.out.println("HSBCBank--Transfermoney");

		
	}

	@Override
	public void BikeLoan() {
		System.out.println("HSBCBank--BikeLoan");

		
	}

	@Override
	public void PersonalLoan() {
		System.out.println("HSBCBank--Personalloan");

		
	}

	@Override
	public void MutualFunds() {
		System.out.println("HSBCBank--MutualFunds");

		
	}

	@Override
	public void CarLoan() {
		System.out.println("HSBCBank--Carloan");

		
	}
	public void Cards() {
		System.out.println("HSBCBank--Cards");

		
	}
}
