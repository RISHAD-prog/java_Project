 package Billing;
import Login.*;

public class ElectriccardRecharge {
	public String cardNumber;
	public int amount;
	public String pinNumber;
	public ElectriccardRecharge(){}
	public ElectriccardRecharge(String cardNumber,int amount, String pinNumber){
		this.cardNumber=cardNumber;
		this.amount=amount;
		this.pinNumber=pinNumber;
	}
	public void completeElectriccardRecharge(){
		Login l=new Login();
   		if(l.balance>amount){
   			l.balance-=amount;
   			System.out.println("\t\tTransfer Successful\n");
   			System.out.println("\t\tBalance = "+l.balance+"\n");}
   		else{System.out.println("\t\tInsufficiat balance\n");}
	}
}
