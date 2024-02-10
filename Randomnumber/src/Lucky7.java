 import java.util.Random;
 import java.util.Scanner;
 
public class Lucky7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Random random = new Random();
		
	    Scanner in = new Scanner(System.in);
	    String playAgain;
		int randomNumber1;
		int randomNumber2;
		int randomNumber3;
		int money;
		String answ;
		
		System.out.println("paljon pistät rahaa?");
		 answ = in.nextLine();
		 money = Integer.parseInt(answ);
		 
		do
		{
		
		randomNumber1 = random.nextInt(10);
		System.out.println("Random number(1) : " + randomNumber1);
		
		randomNumber2 = random.nextInt(10);
		System.out.println("Random number(2) : " + randomNumber2);
		
		randomNumber3 = random.nextInt(10);
		System.out.println("Random number(3) : " + randomNumber3);
		
		
		if (randomNumber1 == 7 || randomNumber2 == 7 || randomNumber3 == 7)
		{
			System.out.println("voitit");
			money++;		
		}
		else
		{
			System.out.println("hävisit");
			money--;
		}
        
		System.out.println("Rahaa on " + money);
		if (money == 0)
		{
			System.out.println("Rahat loppu, et voi jatkaa pelaamista");
			break;
		}
		
		System.out.println("Pelaatko uudestaan (joo/ei)?");
		playAgain = in.nextLine();
		
		} while (playAgain.equals("joo"));
	}

}
