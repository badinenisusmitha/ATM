package in.careerit.atm;

public interface AtmInterface  {
	public void checkBalance();
	public void withdrawAmount(double withdrawAmount);
	public void depositAmount(double depositAmount);
	public void viewStatement();
}
