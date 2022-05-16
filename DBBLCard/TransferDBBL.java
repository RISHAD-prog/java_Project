package DBBLCard;
import Login.*;
public class TransferDBBL{
	String accNumber;
	int amount;
	String pinNumber;
	public TransferDBBL(String accNumber, int amount, String pinNumber){
		this.accNumber=accNumber;
		this.amount=amount;
		this.pinNumber=pinNumber;
	}
	public void completeTransferDBBL(){
		Login l=new Login();
   		if(l.balance>amount){
   			l.balance-=amount;
   			System.out.println("\t\tTransfer Successful\n");
   			System.out.println("\t\tBalance = "+l.balance+"\n");}
   		else{System.out.println("\t\tInsufficiat balance\n");}
	}
}