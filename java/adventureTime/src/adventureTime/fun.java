package adventureTime;

import java.util.Scanner;

public class fun {

	public static void main(String[] args) {
		
		String playerName;
		String yesNo;
		String lightDark;
		Integer life;
		Integer doggy = 0;
		Integer king = 0;
		
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		System.out.println("Hello adventurer, what is your name?");
		playerName = scan.nextLine();
		System.out.println("Welcome " + playerName + "! Are you ready for an adventure?");
		yesNo = scan.nextLine();
		yesNo = yesNo.toLowerCase();
		life = 1;
				
		do{
			if(yesNo.matches("yes|hell yeah|fa sho")){
				System.out.println("Then lets hit the trail! Shall we go down the light or dark trail " + playerName + "?");
				lightDark = scan.nextLine();
				lightDark = lightDark.toLowerCase();
				if(lightDark.equals("light")){
					System.out.println("Great Choice "+playerName+"! This adventure will prove to be something to remember.\n"
							+ "So you begin down the trail and immediatly run into a stranger. He introduces himself as the\n"
							+ "king of Milwaukee. You reply and say...\n"
							+ "1 - There's no KING of Milwaukee you fool! \n"
							+ "2 - A king you say? What is a king doing out on these trails? \n"
							+ "3 - You run from the man because you are terrified of confrontation.\n");
					 king = scan.nextInt();
					if(king == 1){
						System.out.println("King Says: I resent that!..and sends his soldiers your way...and...");
						life = 0;
					}else if(king == 2){
						System.out.println("I am scouting new land for my kingdom! Now I ask! what are YOU doing on MY land?! \n"
								+ "He's kicks you out of the forest. Sorry, your quest is over...go eat a burger or something.");
					}else if(king == 3){
						System.out.println("Well " + playerName + ", you're weak and you should have never entered the forest in the first place");
					}else System.out.println("Really? You can't count to three " + playerName + "?");						
				}else if(lightDark.equals("dark")){
					System.out.println("Choosing the Dark path was a less than desirable choice...but so be it. SO....You begin walking down\n"
							+ " the dark path...you get no more than five feet when you notice a viscious looking dog running towards you...You"
							+ " MUST ACT FAST! \n1 - RUN! \n2 - STAY AND FIGHT! \n3 - Wait to see if he's actually just a nice lil' pup.");
					doggy = scan.nextInt();
					if(doggy == 1){
						System.out.println("Well " + playerName + ", you're a wimp and you've run from the forest..so you're done.");
					}else if(doggy == 2){
						life = 0;
					}else if(doggy == 3){
						System.out.println("Turns out, that the dog is super nice and you have become instant best friends.\n   *" + playerName +
								"* has acquired a new pup! So you're going to go home with it...you're done on the trail!");
					}else System.out.println("Really? You can't count to three " + playerName + "?");
				}else{System.out.println("You're a terrible speller.");}
			}
			else if(yesNo.equals("no")){
				System.out.println("Well then why are you here?...go home you filthy animal!");
				}	
			else{
				System.out.println("Check your spelling and try again.");
						}life=2;
		}while(life == 1);
			
			if(life==0){
				System.out.println(playerName + ", you are dead. Bummer dude.");
			}else{System.out.println("Try pushing the correct buttons.");}
	}
			}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	


