package Medicine;
import Login.*;
public class Medicine{
	int aceAmount;
	int alatrolAmount;
	int antacidAmount;	
	int delivaryCharge=50;
	Login l = new Login();
	public Medicine(){}
	public Medicine(int aceAmount,int alatrolAmount,int antacidAmount){
		this.aceAmount=aceAmount;
		this.alatrolAmount=alatrolAmount;
		this.antacidAmount=antacidAmount;
	}
	public void showMedicine(){
		System.out.println("\t\tAce            : "+12+" taka/package");
		System.out.println("\t\tAlatrol        : "+35+" taka/package");
		System.out.println("\t\tAntacid        : "+15+" taka/package");
		System.out.println("\t\tDelivary Charge: "+50+" taka");
	}
	public void medicineCalculation(){
		if(aceAmount==0){l.balance+=0;}
		else{l.balance-=(aceAmount*12);}
		
		if(alatrolAmount==0){l.balance+=0;}
		else{l.balance-=(alatrolAmount*35);}

		if(antacidAmount==0){l.balance+=0;}
		else{l.balance-=(antacidAmount*15);}
		l.balance+=delivaryCharge;
	}
	public void medicineList(){
		if(l.balance<0){System.out.println("\t\tInsufficient Balance.\n\t\tYou do not have enough balance to buy.");}
		else{
			System.out.println("\t\tAce             : "+(aceAmount*12)+" taka");
			System.out.println("\t\tAlatrol         : "+(alatrolAmount*35)+" taka");
			System.out.println("\t\tAntacid         : "+(antacidAmount*15)+" taka");
			System.out.println("\t\tDelivary Charge : "+delivaryCharge+" taka");
			System.out.println("\t\t______________________________________");
			System.out.println("\t\tTotal           : "+(aceAmount*12+alatrolAmount*35+antacidAmount*15+delivaryCharge)+" taka");
			System.out.println("\n\t\tBalance         : "+l.balance+" taka");
		}
	}
}