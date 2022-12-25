package Interface;

public interface RBIBank {
	int minBalance = 1000;   //Final + Static 
	
	public void Credit();  //Non Static method + abstract and public
	
	public void Debit();
	
	public void TransferMoney();
	
	

}
