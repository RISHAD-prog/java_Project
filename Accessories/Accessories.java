package Accessories;
import Login.*;
public class Accessories{
	int bagAmount;
	int sunglassAmount;
	int watchAmount;	
	int delivaryCharge=150;
	Login l = new Login();
	public Accessories(){}
	public Accessories(int bagAmount,int sunglassAmount,int watchAmount){
		this.bagAmount=bagAmount;
		this.sunglassAmount=sunglassAmount;
		this.watchAmount=watchAmount;
	}
	public void showAccessories(){
		System.out.println("\t\tBag            : "+450+" taka/piece");
		System.out.println("\t\tSun glass      : "+350+" taka/piece");
		System.out.println("\t\tWatch          : "+500+" taka/piece");
		System.out.println("\t\tDelivary Charge: "+150+" taka");
	}
	public void accessoriesCalculation(){
		if(bagAmount==0){l.balance+=0;}
		else{l.balance-=(bagAmount*450);}
		
		if(sunglassAmount==0){l.balance+=0;}
		else{l.balance-=(sunglassAmount*350);}

		if(watchAmount==0){l.balance+=0;}
		else{l.balance-=(watchAmount*500);}
		l.balance+=delivaryCharge;
	}
	public void accessoriesList(){
		if(l.balance<0){System.out.println("\t\tInsufficient Balance.\n\t\tYou do not have enough balance to buy.");}
		else{
			System.out.println("\t\tBag             : "+(bagAmount*450)+" taka");
			System.out.println("\t\tSun Glass       : "+(sunglassAmount*350)+" taka");
			System.out.println("\t\tWatch           : "+(watchAmount*500)+" taka");
			System.out.println("\t\tDelivary Charge : "+delivaryCharge+" taka");
			System.out.println("\t\t______________________________________");
			System.out.println("\t\tTotal           : "+(bagAmount*450+sunglassAmount*350+watchAmount*500+delivaryCharge)+" taka");
			System.out.println("\n\t\tBalance         : "+l.balance+" taka");
		}
	}
}