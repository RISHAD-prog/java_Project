package Admin;
import Login.*;
public class Admin{
	Register reg;
	Login log;
	private  String userName = "admin";
	private  String password = "admin";
	private boolean security = false;
	public Admin(){}
	public Admin(String userName, String password){
		if((!this.userName.equals(userName)) && (!this.password.equals(password)))
		{
			security=false;
			System.out.println("\t\tWRONG PASSWPRD!");
		}
		else{security=true;}
	}
	
	public void showUser(Register reg){
		if(security==true){
			if(reg.userCount==0){System.out.println("\t\tNo user found.\n\t\t A user have to register first for this option.");}
			else{
				System.out.println("\t\tUser phone number        = "+reg.phoneNumber);
				System.out.println("\t\tUser bank account number = "+reg.bankAccountNumber);
				System.out.println("\t\tUser password            = "+reg.password);
				System.out.println("\t\tUser balance             = "+reg.balance);
				System.out.println("\t\tUser balance             = "+reg.totalmoney);
			}
		}
	}
	
	public void changeBalance(Register reg,int amount,int posOrneg){
		if(security==true){
			if(reg.userCount==0){System.out.println("\t\tNo user found.\n\t\t A user have to register first for this option.");}
			else if(posOrneg==1){
				System.out.println("\t\tSuccessfully changed");
				reg.balance+=amount;
				System.out.println("\t\tUser balance after change = "+reg.balance);
			}
			else if(posOrneg==2){
				System.out.println("\t\tSuccessfully changed");
				reg.balance-=amount;
				System.out.println("\t\tUser balance after change = "+reg.balance);
			}
			else{System.out.println("\t\tWorng Input!");}
		}
		else{System.out.println("\t\tOnly valid admin can change balance of an user.");}
	}

	public void changePassword(Register reg, String changedPass){
		if(security==true){
			reg.password = changedPass;
			System.out.println("\t\tSuccessfully changed");
			System.out.println("\t\tUser password after change = "+reg.password);

		}
		else{System.out.println("\t\tOnly valid admin can change balance of an user.");}
	}
}
	
