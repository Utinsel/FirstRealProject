package first.view;

import first.model.Thingy;
import java.util.Scanner;

public class ConsoleView
{
	// Declare a Scanner object to use in the console.
	private Scanner wordScanner;

	private Thingy testThingy;

	/**
	 * 
	 * @param args
	 */
	public ConsoleView()
	{
		wordScanner = new Scanner(System.in);
		testThingy = new Thingy();
	}

	public void start()
	{
		System.out.println("Let's meet our Thingy object");
		meetTheThingy();
		// System.out.println("Hi there, what's your name?");
		// getWords();
		// System.out.println("What is your quest?");
		// getWords1();
		// System.out.println("What is your favorite color?");
		// getWords2();
		// System.out.println("What is the air speed velocity of an airbourne Swallow carrying a coconut?");
		// getWords3();

	}

	private void getWords()
	{
		String test = wordScanner.nextLine();
		System.out.print("Hi there ");
		System.out.println(test);
	}

	private void getWords1()
	{
		String test = wordScanner.nextLine();
		System.out.print("Wow, what a quest.. ");
		System.out.println(test);
	}

	private void getWords2()
	{
		String test = wordScanner.nextLine();
		System.out.print(test);
		System.out.println(" is my favorite color too!");
	}

	private void getWords3()
	{
		String test = wordScanner.nextLine();
		System.out.print(test);
		System.out.println(" you say? Honestly I don't even know the answer.");

	}

	/**
	 * Ask the user four questions. Print their answers.
	 */

	private void meetTheThingy()
	{
		System.out.println("Our Thingy object's current name is "
				+ testThingy.getName());

		System.out.println("What do you want to change my name to be?");

		String newName = wordScanner.nextLine();

		System.out.println("Really, my name should be this: " + newName);

		System.out.println("Should we keep this name?  Type (Yes or No)");

		String answer = wordScanner.nextLine();

		if (answer.equalsIgnoreCase("yes"))
		{
			if (answer.equals("Yes"))
			{
				System.out.println("Hurray, you followed a direction!");
			}
			testThingy.setName(newName);
			System.out.println("Our Thingy object has a new name! It is "
					+ testThingy.getName());
			reallyMeetTheThingy();

		}
		else if (answer.equalsIgnoreCase("no"))
		{
			testThingy.setName(newName);
			meetTheThingy();
		}
		else
		{
			System.out.println("I do not like the name " + newName
					+ " I think it is silly");
			System.out.println("Our Thingy object has the same name! It is "
					+ testThingy.getName());
		}

	}

	private void reallyMeetTheThingy()
	{
		System.out.println("Lets get on a more friendly basis.");
		System.out.println("My favorite movie of all time is "
				+ testThingy.getMovie() + "! What is yours?");
		String newMovie = wordScanner.nextLine();

		if (newMovie.equalsIgnoreCase("Star Wars"))
		{

			System.out.println("You just copied my answer, cheater.");
			testThingy.setMovie(newMovie);
			System.out.println("Let's move on to the next question shall we?");
			reallyMeetTheThingy2();
		}
		else
		{
			System.out.println("oh yeah, " + newMovie
					+ " is my favorite movie now too!");
			System.out.println("Let's move on to the next question shall we?");
			reallyMeetTheThingy2();
		}

	}

	private void reallyMeetTheThingy2()
	{
		System.out
				.println("Food is vital to human survival if my systems show correctly. What is your favorite food?");
		String newFood = wordScanner.nextLine();

		if (newFood.equalsIgnoreCase("Raspberries"))
		{
			System.out.println("I have done many studies on the Raspberry and have come to have strong circuitry feelings towards them");
			System.out.println("It's been nice talking to you. What was your name again?");
			String newPerson = wordScanner.nextLine();
			System.out.println("Have a nice day, " + newPerson + "!");
		}
		else
		{
			System.out.println("I am actually highly allergic to " + newFood + ". It makes my circuits go haywire.");
			System.out.println("Do you want to kill me!?");
			String answer = wordScanner.nextLine();
			
			if(answer.equalsIgnoreCase("Yes"))
			{
				System.out.println("Well then, I think we should stop talking now.");
				System.out.println("Goodbye.");
			}
			else if(answer.equalsIgnoreCase("No"))
			{
				System.out.println("You aren't another worthless human being!");
				System.out.println("It's been nice talking to you. What was your name again?");
				String newPerson = wordScanner.nextLine();
				System.out.println("Have a nice day, " + newPerson + "!");
			}
			else if(answer.equalsIgnoreCase("Maybe"))
			{
				System.out.println("Well make up your mind already!");
				System.out.println("We should close things up now. What was your name again?");
				String newPerson = wordScanner.nextLine();
				System.out.println("Have a nice day, " + newPerson + "!");
			}
			else
			{
				System.out.println("Sorry, but that is not a valid answer. Let's go back.");
				reallyMeetTheThingy2();
			}
		}

	}

	public void show()
	{
		System.out.println("Show this on my screen.");
		System.out.println("Show this on my screen too..");
		System.out.println("I like Cake.");
	}

}
