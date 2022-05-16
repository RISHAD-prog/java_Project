package Game;
import java.util.Random;

import java.util.Scanner;

public class Game{
	public Game(){
		Scanner sc = new Scanner(System.in);
		Random ran = new Random();
		String enemyName[] = new String[4];
		enemyName[0] = "Charizard";
		enemyName[1] = "Letho";
		enemyName[2] = "Witch";
		enemyName[3] = "Dark Ganon";
		int maxEnemyHealth = 80;
		int maxEnemyAttack = 35;

		int playerHealth = 100;
		int playerAttack = 50;
		int numHealthPoison = 3;
		int poisonHeal = 30;
		int poisonDropChance = 60;

		boolean play = true;
		System.out.println("\t   ###################################");
		System.out.println("\t\t\"WELCOME TO CODEWAR GROUND\"");
		STARTING:
		while(play){
			System.out.println("\t   ###################################\n\n");
			
			int enemyHealth= ran.nextInt(maxEnemyHealth);
			String enemy = enemyName[ran.nextInt(enemyName.length)];
			System.out.println("\t\t\""+enemy+" has appeared!\"\n");
			
			while(enemyHealth>0){
				System.out.println("\t\tYour Health : "+playerHealth);
				System.out.println("\t\t"+enemy+"'s HP : "+enemyHealth+"\n");
				System.out.println("\t\tMajor, there is an enemy. What do you like to do?");
				System.out.println("\t\t1. Attack");
				System.out.println("\t\t2. Dirnk Health Poison");
				System.out.println("\t\t3. Run");

				System.out.print("Enter choice : ");
				String answer = sc.nextLine();
				if(answer.equals("1")){
					int damageGiven = ran.nextInt(playerAttack);
					int damageTaken = ran.nextInt(maxEnemyAttack);
					playerHealth = playerHealth-damageTaken;
					enemyHealth = enemyHealth-damageGiven;
					
					System.out.println("\t\tMajor, you strike "+enemy+" for "+damageGiven+" damage");
					System.out.println("\t\t"+enemy+" has given you "+damageTaken+" damage");
					
					if(playerHealth<=0){
						System.out.println("\t\tOh no! "+enemy+" has defeated you!");
						break;
					}
				}
				else if(answer.equals("2")){
					
					if(numHealthPoison>0){
						playerHealth = playerHealth+poisonHeal;
						if(playerHealth>100){
							playerHealth=100;
						}
						numHealthPoison--;
						System.out.println("\t\tHealed yourself for "+poisonHeal+" amount");
						System.out.println("\t\tHealth after healing : "+playerHealth);
						System.out.println("\t\tPoison Left : "+numHealthPoison);
					}
					else{
						System.out.println("\t\tNo health posion remaining major.");
						System.out.println("\t\tDefeat enemy for a chance to find a health posion");
					}
				}
				else if(answer.equals("3")){
					System.out.println("\t\tMajor, you ran away!");
					continue STARTING;
				}
				else{
					System.out.println("\t\tInvalid command");
				}
			}

			if(playerHealth<1){
				System.out.println("\t\t\"Oh no! you have been defeated!\"");
				break;
			}

			System.out.println("\n\t   ###################################");
			System.out.println("\t\t\""+enemy+" was defeated!\"");
			System.out.println("\t\t\"MAJOR WINS!\"");
			System.out.println("\t\tYou have "+playerHealth+" HP left");
			if(ran.nextInt(100)<poisonDropChance){
				numHealthPoison++;
				System.out.println("\t\t"+enemy+" dropped a healing poison");
				System.out.println("\t\t Poison remaining : "+numHealthPoison);
			}

			System.out.println("\t   ###################################\n");
			System.out.println("\t\tMajor, what do you like to do now?");
			System.out.println("\t\t1. Continue fighting");
			System.out.println("\t\t2. Exit ground");

			System.out.print("Enter choice : ");
			String input = sc.nextLine();
			while(!input.equals("1") && !input.equals("2")){
				System.out.println("\t\tInvalid command");
				input = sc.nextLine();
			}
			if(input.equals("1")){
				System.out.println("\t\tLet's have another fight major!");
			}
			else if(input.equals("2")){
				System.out.println("\t\tYou have left the ground. Take some rest major");
				break;
			}
		}

		System.out.println("\t   ###################################");
		System.out.println("\t\tThanks for playing\n");
		System.out.println("\t\tCODEWAR GROUND");
		System.out.println("\t\tCreated by CodeGrammar");
	}
}