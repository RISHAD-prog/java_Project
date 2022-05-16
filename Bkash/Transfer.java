package Bkash;
import Login.*;
public class Transfer{
	String phoneNumber;
   	int amount;
   	String receiverNumber;
   	String pinNumber;
   	public Transfer(String phoneNumber, int amount, String receiverNumber, String pinNumber){
   		this.phoneNumber=phoneNumber;
   		this.amount=amount;
   		this.receiverNumber=receiverNumber;
   		this.pinNumber=pinNumber;
   	}
   	public void completeTransfer(){
   		Login l=new Login();
   		if(l.balance>amount){
   			l.balance-=amount;
   			System.out.println("\t\tTransfer Successful\n");
   			System.out.println("\t\tBalance = "+l.balance+"\n");}
   		else{System.out.println("\t\tInsufficiat balance\n");}
   	}
}