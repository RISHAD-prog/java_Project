package Bkash;
import Login.*;
public class MobileRecharge{
	String receiverNumber;
	int amount;
	String pinNumber;
	public MobileRecharge(){}
	public MobileRecharge(String receiverNumber,int amount, String pinNumber){
		this.receiverNumber=receiverNumber;
		this.amount=amount;
		this.pinNumber=pinNumber;
	}
	public void completeMobileRecharge(){
		Login l=new Login();
   		if(l.balance>amount){
   			l.balance-=amount;
   			System.out.println("\t\tTransfer Successful\n");
   			System.out.println("\t\tBalance = "+l.balance+"\n");}
   		else{System.out.println("\t\tInsufficiat balance\n");}
	}
}