package Login;
public class Login {
	Register reg;
	public static String phone = "";
	public static String bankAcc = "";
	public static String pass = "";
	public static boolean security=false;
	public static int balance=10000;
	public Login(){}
	public Login(String phone,String bankAcc,String pass){
		this.phone=phone;
		this.bankAcc=bankAcc;
		this.pass=pass;
	}
	public void setPhone(String phone){this.phone=phone;}
	public void setBankAcc(String bankAcc){this.bankAcc=bankAcc;}
	public void setPass(String pass){this.pass=pass;}
	public boolean getSecurity(){return security;}
	public int getBalance(){return balance;}
	public void checkDetails(){
		//String p = reg.getPhoneNumber();
		//String b = reg.getBankAccountNumber();
		//String pa = reg.getPassword();
		if( phone.equals(reg.phoneNumber)){
			if( bankAcc.equals(reg.bankAccountNumber )){
				if( pass.equals(reg.password )){
					System.out.println("\t\tLogin Successful\n");
					security=true;
				}
				else{System.out.println("\t\tWrong password input\n");}
			}
			else{System.out.println("\t\tWrong Bank Account Number input\n");}
		}
		else{System.out.println("\t\tWrong Number input\n");}
	}
	/*public static void main(String[]args){
		Register r=new Register();
		r = new Register("01776670525","42961","Ihateyou");
		Login l=new Login("01776670525","42961","Iloveyou");
		l.checkDetails();
	}
}
class Register{
	static String phoneNumber;
	static String bankAccountNumber;
	static String password;
	public Register(){
		System.out.println("\t\tREGISTRATION\n");
	}
	public Register(String phoneNumber,String bankAccountNumber,String password){
		this.phoneNumber=phoneNumber;
		this.bankAccountNumber=bankAccountNumber;
		this.password=password;
	}
	public String getPhoneNumber(){return phoneNumber;}
	public String getBankAccountNumber(){return bankAccountNumber;}
	public String getPassword(){return password;}
	public static void main(String[]args){
		Register r = new Register("01776670525","42961","Iloveyou");
		System.out.println(r.getphoneNumber()+" "+r.getBankAccountNumber()+" "+r.getPassword());
	}*/
}