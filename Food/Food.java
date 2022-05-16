package Food;
import Login.*;
public class Food{
	int riceAmount;
	int fishAmount;
	int chickenAmount;	
	int delivaryCharge=100;
	Login l = new Login();
	public Food(){}
	public Food(int riceAmount,int fishAmount,int chickenAmount){
		this.riceAmount=riceAmount;
		this.fishAmount=fishAmount;
		this.chickenAmount=chickenAmount;
	}
	public void showFood(){
		System.out.println("\t\tRice           : "+60+" taka/kg");
		System.out.println("\t\tHilsha Fish    : "+1000+" taka/piece");
		System.out.println("\t\tChicken        : "+450+" taka/piece");
		System.out.println("\t\tDelivary Charge: "+50+" taka");
	}
	public void foodCalculation(){
		if(riceAmount==0){l.balance+=0;}
		else{l.balance-=(riceAmount*60);}
		
		if(fishAmount==0){l.balance+=0;}
		else{l.balance-=(fishAmount*1000);}

		if(chickenAmount==0){l.balance+=0;}
		else{l.balance-=(chickenAmount*450);}
		l.balance+=delivaryCharge;
	}
	public void foodList(){
		if(l.balance<0){System.out.println("\t\tInsufficient Balance.\n\t\tYou do not have enough balance to buy.");}
		else{
			System.out.println("\t\tRice            : "+(riceAmount*60)+" taka");
			System.out.println("\t\tFish            : "+(fishAmount*1000)+" taka");
			System.out.println("\t\tChicken         : "+(chickenAmount*450)+" taka");
			System.out.println("\t\tDelivary Charge : "+delivaryCharge+" taka");
			System.out.println("\t\t______________________________________");
			System.out.println("\t\tTotal           : "+(riceAmount*60+fishAmount*1000+chickenAmount*450+delivaryCharge)+" taka");
			System.out.println("\n\t\tBalance         : "+l.balance+" taka");
		}
	}
}