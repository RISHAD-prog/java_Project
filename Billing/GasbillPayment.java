package Billing;
import Login.*; 
public class GasbillPayment {
	public String idNumber;
	//int bill;
	public int amount;
	public String pinNumber;
	public GasbillPayment(){}
	public GasbillPayment(String idNumber,/*int bill,*/int amount, String pinNumber){
		this.idNumber=idNumber;
		//this.bill=bill;
		this.amount=amount;
		this.pinNumber=pinNumber;
	}
	public void completeGasbillPayment(){
		Login l=new Login();
   		if(l.balance>amount){
   			l.balance-=amount;
   			System.out.println("\t\tTransfer Successful\n");
   			System.out.println("\t\tBalance = "+l.balance+"\n");}
   		else{System.out.println("\t\tInsufficiat balance\n");}
	}
}