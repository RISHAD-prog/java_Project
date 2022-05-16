import Login.*;
import Bkash.*;
import Manual.*;
import Accessories.*;
import Contributers.*;
import Admin.*;
import Billing.*;
import Cloths.*;
import DBBLCard.*;
//import ElectricCard.*;
import Food.*;
import Game.*;
import Medicine.*;
import java.util.Scanner;

public class Main{
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);

		MAIN:
		while(true){
			System.out.println("\n\t\t\t\"ECONOMETRY\"");
			System.out.println("\t\t\t     by CodeGrammer\n\n");
			System.out.println("\t\t1. Admin");
			System.out.println("\t\t2. General");
			System.out.print("Enter Choice = ");
			int mainInput = sc.nextInt();
			Register reg = new Register();
			Login log = new Login();

			switch(mainInput){
				case 1:
				
				System.out.println("");
				System.out.print("Enter User Name = ");
				String uName = sc.next();
				//if(uName.equals("admin")){
				System.out.print("Enter User Password = ");
				String uPass = sc.next();
				Admin admin = new Admin(uName,uPass);//}
				//else{System.out.println("Wrong User Name input");}
				ADMIN:
				while(true){
					System.out.println("\n\t\t1. Show User");
					System.out.println("\t\t2. Chnage Balance");
					System.out.println("\t\t3. Change Password");
					System.out.println("\t\t0. Exit");
					System.out.print("Enter Choice = ");
					int adminInput = sc.nextInt();
					switch(adminInput){
						case 1:
						admin.showUser(reg);
						break;
						case 2:
						System.out.println("\n1. Add balance");
						System.out.println("\n2. Reduce balance");
						System.out.print("Enter Choice = ");
						int adBalanceChoice = sc.nextInt();
						System.out.print("\nEnter amount to change = ");
						int chBaln = sc.nextInt();
						admin.changeBalance(reg,chBaln,adBalanceChoice);
						break;
						case 3:
						System.out.print("\nEnter New Password = ");
						String nwpass = sc.next();
						admin.changePassword(reg,nwpass);
						break;
						case 0:
						break ADMIN;
						}
					}
				break;

				case 2:
				LOGIN:
				while(true){
					System.out.println("\n\t\t1. Login");
					System.out.println("\t\t2. Register");
					System.out.println("\t\t0. Exit");
					System.out.println("\tA user must register first to login");
					System.out.print("Enter Choice = ");
					int logInput = sc.nextInt();
					switch(logInput){
						case 1:
						System.out.print("\nUser Phone Number = ");
						String upn = sc.next();
						System.out.print("User Bank Account Number = ");
						String uban = sc.next();
						System.out.print("User Password = ");
						String up = sc.next();
						log.setPhone(upn);
						log.setBankAcc(uban);
						log.setPass(up);
						log.checkDetails();
						if(log.getSecurity()==true){
							
							ECONOMETRY:
							while(true){
								System.out.println("\t\t\t\"ECONOMETRY\"");
								System.out.println("\t\t\t     by CodeGrammer\n\n");
								System.out.println("\n\t\t1. Credit Transfer");
								System.out.println("\n\t\t2. Online Shopping");
								System.out.println("\n\t\t3. Bill Payment");
								System.out.println("\n\t\t4. Manual");
								System.out.println("\n\t\t5. Contributers");
								System.out.println("\t\tconnection lost?");
								System.out.println("\t\t6. Offline game");
								System.out.println("\n\t\t0. Exit");
								System.out.print("\nEnter Choice = ");
								int econoInput = sc.nextInt();
								switch(econoInput){
									case 0:
									break ECONOMETRY;

									case 1:
									CREDITTRANSFER:
									while(true){
										System.out.println("\n\t\tCredit Transfer\n");
										System.out.println("\n\t\t1. Bkash");
										System.out.println("\n\t\t2. DBBLCard");
										System.out.println("\n\t\t0. Back");
										System.out.print("\nEnter Choice = ");
										int creTraInput = sc.nextInt();
										switch(creTraInput){
											case 0:
											break CREDITTRANSFER;// b1 can be here

											case 1:
											BKASH:
											while(true){
												System.out.println("\n\t\t1. Transfer");
												System.out.println("\n\t\t2. Receive");
												System.out.println("\n\t\t3. Mobile Recharge");
												System.out.println("\n\t\t0. Back");
												System.out.print("\nEnter Choice = ");
												int bkashInput = sc.nextInt();
												switch(bkashInput){
													case 0:
													break BKASH;
													case 1:
													System.out.println("\n\t\tTransfer");
													System.out.print("\nEnter your phone number = ");
													String bkpn = sc.next();
													System.out.print("\nEnter amount = ");
													int bka = sc.nextInt();
													System.out.print("\nEnter receiver number = ");
													String bkrpn = sc.next();
													System.out.print("\nEnter pin = ");
													String bkp = sc.next();
													Transfer tran = new Transfer(bkpn,bka,bkrpn,bkp);
													tran.completeTransfer();
													break;
													case 2:
													System.out.println("\n\t\tReceive");
													System.out.print("\nEnter your phone number = ");
													String bkrecpn = sc.next();
													System.out.print("\nEnter amount = ");
													int bkreca = sc.nextInt();
													Receive rec = new Receive(bkrecpn,bkreca);
													rec.completeReceive();
													System.out.println("\t\"You have to login again for receive.");
													break LOGIN;
													case 3:
													System.out.println("\n\t\tMobile Recharge");
													System.out.print("\nEnter receiver number = ");
													String bkmbrpn = sc.next();
													System.out.print("\nEnter amount = ");
													int bkmba = sc.nextInt();													
													System.out.print("\nEnter pin = ");
													String bkmbp = sc.next();
													MobileRecharge mr = new MobileRecharge(bkmbrpn,bkmba,bkmbp);
													mr.completeMobileRecharge();
													break;
												}
											}
											break;//credit transfer case 1

											case 2:
											DBBLCARD:
											while(true){
												System.out.println("\n\t\t1. Transfer");
												System.out.println("\n\t\t2. Receive");
												System.out.println("\n\t\t0. Back");
												System.out.print("\nEnter Choice = ");
												int dbblInput = sc.nextInt();
												switch(dbblInput){
													case 0:
													break DBBLCARD;

													case 1:
													System.out.println("\n\t\tTransfer from DBBLCard");
													System.out.print("\nEnter account number = ");
													String dbblphone = sc.next();
													System.out.print("\nEnter amount = ");
													int dbbltranamount = sc.nextInt();													
													System.out.print("\nEnter pin = ");
													String dbbltranPin = sc.next();
													TransferDBBL tranDB = new TransferDBBL(dbblphone,dbbltranamount,dbbltranPin);
													tranDB.completeTransferDBBL();
													break;//dbbl case 1

													case 2:
													System.out.println("\n\t\tReceive from DBBLCard");
													System.out.print("\nEnter your account number = ");
													String dbrecac = sc.next();
													System.out.print("\nEnter amount = ");
													int dbrecam = sc.nextInt();
													ReceiveDBBL recDb = new ReceiveDBBL(dbrecac,dbrecam);
													recDb.completeReceiveDBBL();
													System.out.println("\t\"You have to login again for receive.");
													break LOGIN;//dbbl case 2

												}
											}
											break;//credit transfer case 2
										}
									}
									break;//econometry case 1

									case 2:
									ONLINESHOPPING:
									while(true){
										System.out.println("\n\t\tOnline Shopping\n");
										System.out.println("\n\t\t1. Food");
										System.out.println("\n\t\t2. Medicine");
										System.out.println("\n\t\t3. Cloths");
										System.out.println("\n\t\t4. Accessories");
										System.out.println("\n\t\t0. Back");
										System.out.print("\nEnter choice = ");
										int osInput = sc.nextInt();
										switch(osInput){
											case 0:
											break ONLINESHOPPING;

											case 1:
											Food f = new Food();
											f.showFood();
											System.out.print("\nEnter Rice amount = ");
											int rice = sc.nextInt();
											System.out.print("\nEnter Fish amount = ");
											int fish = sc.nextInt();
											System.out.print("\nEnter Chicken amount = ");
											int chicken = sc.nextInt();
											Food fd = new Food(rice, fish, chicken);
											fd.foodCalculation();
											fd.foodList();
											break;//online shopping case 1

											case 2:
											Medicine m = new Medicine();
											m.showMedicine();
											System.out.print("\nEnter Ace amount = ");
											int ace = sc.nextInt();
											System.out.print("\nEnter Alatrol amount = ");
											int alatorl = sc.nextInt();
											System.out.print("\nEnter Antacid amount = ");
											int antacid = sc.nextInt();
											Medicine md = new Medicine(ace, alatorl, antacid);
											md.medicineCalculation();
											md.medicineList();
											break;//online shopping case 2

											case 3:
											Cloths c = new Cloths();
											c.showCloths();
											System.out.print("\nEnter Shirt amount = ");
											int shirt = sc.nextInt();
											System.out.print("\nEnter Pant amount = ");
											int pant = sc.nextInt();
											System.out.print("\nEnter T-shirt amount = ");
											int tshirt = sc.nextInt();
											Cloths clo = new Cloths(shirt, pant, tshirt);
											clo.clothsCalculation();
											clo.clothsList();
											break;//online shopping case 3

											case 4:
											Accessories ass = new Accessories();
											ass.showAccessories();
											System.out.print("\nEnter Bag amount = ");
											int bag = sc.nextInt();
											System.out.print("\nEnter Sun-Glass amount = ");
											int sunglass = sc.nextInt();
											System.out.print("\nEnter Watch amount = ");
											int watch = sc.nextInt();
											Accessories acces = new Accessories(bag, sunglass, watch);
											acces.accessoriesCalculation();
											acces.accessoriesList();
											break;//online shopping case 4
										}
									}
									break;//econometry case 2

									case 3:
									BILLPAYMENT:
									while(true){
										System.out.println("\n\t\tBill Payment");
										System.out.println("\n\t\t1. Electric Card recharge");
										System.out.println("\n\t\t2. Water Bill Payment");
										System.out.println("\n\t\t3. Gas Bill Payment");
										System.out.println("\n\t\t0. Back");
										System.out.print("\nEnter Choice = ");
										int billpayInput = sc.nextInt();
										switch(billpayInput){
											case 0:
											break BILLPAYMENT;

											case 1:
											System.out.println("\n\t\tElectric Card Recharge");
											System.out.print("\nEnter Card Number = ");
											String cardn = sc.next();
											System.out.print("\nEnter Amount = ");
											int carda = sc.nextInt();
											System.out.print("\nEnter Pin = ");
											String cardp = sc.next();
											ElectriccardRecharge ecr = new ElectriccardRecharge(cardn, carda, cardp);
											ecr.completeElectriccardRecharge();
											break;//bill payment case 1

											case 2:
											System.out.println("\n\t\tWater Bill Payment");
											System.out.print("\nEnter ID Number = ");
											String waterid = sc.next();
											System.out.print("\nEnter Amount = ");
											int watera = sc.nextInt();
											System.out.print("\nEnter Pin = ");
											String waterp = sc.next();
											WaterbillPayment wbp = new WaterbillPayment(waterid, watera, waterp);
											wbp.completeWaterbillPayment();
											break;//bill payment case 2

											case 3:
											System.out.println("\n\t\tGas Bill Payment");
											System.out.print("\nEnter ID Number = ");
											String gasid = sc.next();
											System.out.print("\nEnter Amount = ");
											int gasa = sc.nextInt();
											System.out.print("\nEnter Pin = ");
											String gasp = sc.next();
											GasbillPayment gbp = new GasbillPayment(gasid, gasa, gasp);
											gbp.completeGasbillPayment();
											break;//bill payment case 3
										}
									}
									break;//econometry case 3

									case 4:
									Manual manual = new Manual();
									break;//econometry case 4

									case 5:
									Contributers contributers = new Contributers();
									break;//econometry case 5

									case 6:
									Game gm = new Game();
									break;//econometry case 6
								}
							}
							break;//login case 1 break
						}
						if(log.getSecurity()==false){break LOGIN;}
						break;

						case 2:
						System.out.print("Enter Your Phone Number = ");
						String ypn = sc.next();
						System.out.print("Enter Your Bank Account Number = ");
						String yban = sc.next();
						System.out.print("Enter A Memorable Password = ");
						String yps = sc.next();
						reg.setPhoneNumber(ypn);
						reg.setBankAccountNumber(yban);
						reg.setPassword(yps);
						System.out.println("\t\t\"Input Successful. Login with your details now.\"");
						break;

						case 0:
						break LOGIN;
					}

				}
				break;
			}
		}
	}
}