package DBBLCard;
import Login.*;
public class ReceiveDBBL{
	String accNumber;
	int amount;
	public ReceiveDBBL(String accNumber, int amount){
		this.accNumber=accNumber;
		this.amount=amount;
	}
	public void completeReceiveDBBL(){
		Login l= new Login();
		l.balance+=amount;
   		System.out.println("\t\tReceive Successful\n");
   		System.out.println("\t\tBalance = "+l.balance+"\n");
	}
}