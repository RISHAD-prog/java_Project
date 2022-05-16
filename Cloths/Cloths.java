package Cloths;
import Login.*;
public class Cloths{
	int shirtAmount;
	int pantAmount;
	int tShirtAmount;	
	int delivaryCharge=80;
	Login l = new Login();
	public Cloths(){}
	public Cloths(int shirtAmount,int pantAmount,int tShirtAmount){
		this.shirtAmount=shirtAmount;
		this.pantAmount=pantAmount;
		this.tShirtAmount=tShirtAmount;
	}
	public void showCloths(){
		System.out.println("\t\tShirt          : "+400+" taka/piece");
		System.out.println("\t\tPant           : "+550+" taka/piece");
		System.out.println("\t\tT-shirt        : "+300+" taka/piece");
		System.out.println("\t\tDelivary Charge: "+80+" taka");
	}
	public void clothsCalculation(){
		if(shirtAmount==0){l.balance+=0;}
		else{l.balance-=(shirtAmount*400);}
		
		if(pantAmount==0){l.balance+=0;}
		else{l.balance-=(pantAmount*550);}

		if(tShirtAmount==0){l.balance+=0;}
		else{l.balance-=(tShirtAmount*300);}
		l.balance+=delivaryCharge;
	}
	public void clothsList(){
		if(l.balance<0){System.out.println("\t\tInsufficient Balance.\n\t\tYou do not have enough balance to buy.");}
		else{
			System.out.println("\t\tShirt           : "+(shirtAmount*400)+" taka");
			System.out.println("\t\tPant            : "+(pantAmount*550)+" taka");
			System.out.println("\t\tT-shirt         : "+(tShirtAmount*300)+" taka");
			System.out.println("\t\tDelivary Charge : "+delivaryCharge+" taka");
			System.out.println("\t\t______________________________________");
			System.out.println("\t\tTotal           : "+(shirtAmount*400+pantAmount*550+tShirtAmount*300+delivaryCharge)+" taka");
			System.out.println("\n\t\tBalance         : "+l.balance+" taka");
		}
	}
}