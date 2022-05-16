package ElectricCard;
import Login.*;
public class ElectricCard{
	String cardNumber;
	int amount;
	String pinNumber;
	Login l = new Login();
	public ElectricCard(String cardNumber,int amount,String pinNumber){
		this.cardNumber=cardNumber;
		this.amount=amount;
		this.pinNumber=pinNumber;
	}
	public void rechargeElectricCard(){
		
		l.balance-=amount;
		if(l.balance>amount){
   			l.balance-=amount;
   			System.out.println("\t\tRecharge Successful\n");
   			System.out.println("\t\tBalance = "+l.balance+"\n");}
   		else{System.out.println("\t\tInsufficiat balance\n");}

	}
}