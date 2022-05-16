package Bkash;
import Login.*;
public class Receive{
	String mobileNumber;
	int amount;
	public Receive(String mobileNumber, int amount){
		this.mobileNumber=mobileNumber;
		this.amount=amount;
	}
	public void completeReceive(){
		Login l=new Login();
		l.balance+=amount;
   		System.out.println("\t\tReceive Successful\n");
   		System.out.println("\t\tBalance = "+l.balance+"\n");
	}
}