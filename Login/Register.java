package Login;
public class Register{
	static Login log;
	public static String phoneNumber = "";
	public static String bankAccountNumber = "";
	//public static String userName;
	public static String password = "";
	public static int userCount = 0;
	public static int balance = log.balance;

	public Register(){
		//System.out.println("\t\tREGISTRATION\n");
		userCount++;
	}
	public Register(String phoneNumber,String bankAccountNumber,String password){
		this.phoneNumber=phoneNumber;
		this.bankAccountNumber=bankAccountNumber;
		this.password=password;
		
		userCount++;
	}
	public void setPhoneNumber(String phoneNumber){this.phoneNumber=phoneNumber;
		userCount++;}
	public String getPhoneNumber(){return phoneNumber;}
	public void setBankAccountNumber(String bankAccountNumber){this.bankAccountNumber=bankAccountNumber;}
	public String getBankAccountNumber(){return bankAccountNumber;}
	public void setPassword(String password){this.password=password;}
	public String getPassword(){return password;}
	/*public static void main(String[]args){
		Register r = new Register("01776670525","42961","Iloveyou");
		System.out.println(r.getphoneNumber()+" "+r.getBankAccountNumber()+" "+r.getPassword());
	}*/
}