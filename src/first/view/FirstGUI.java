package first.view;

import javax.swing.JOptionPane;
import first.model.PMFriend;
import first.model.Thingy;

public class FirstGUI
{
	// Declaration Section!
	private Thingy myGUIThingy;
	private PMFriend samFriend;
	private PMFriend jakeFriend;
	private PMFriend nathanFriend;
	private PMFriend devvinFriend;

	public FirstGUI()
	{
		// Initializes the data member for the class
		myGUIThingy = new Thingy();
		samFriend = new PMFriend();
		jakeFriend = new PMFriend();
		nathanFriend = new PMFriend();
		devvinFriend = new PMFriend();
		
	}

	public void start()
	{
		findOutAboutFriends();
		// checkWrapper();
		// JOptionPane.showMessageDialog(null, "silly");
		// interact();

	}

	private void findOutAboutFriends()
	{
		String answer;
		int age;
		boolean isImaginary;
		double weight;
		
		answer = JOptionPane.showInputDialog("Hello there Organism! What is your name?");
		if(answer.equalsIgnoreCase("sam"))
		{
			samFriend.setName(answer);
			JOptionPane.showMessageDialog(null, "Fantastic! " + samFriend.getName() + " is quite the name!");
			answer = JOptionPane.showInputDialog("How old are you, " + samFriend.getName() + "?");
			age = Integer.parseInt(answer);
			samFriend.setAge(age);
			JOptionPane.showMessageDialog(null, "Wow! " + age + " years old! That means the last year you were " + (age + -1) + " and next year you will be " + (age + 1) + "!");
			answer = JOptionPane.showInputDialog("Mind me asking, but how much do you weigh in pounds? (numbers only in answer)");
			weight = Double.parseDouble(answer);
			samFriend.setWeight(weight);
			JOptionPane.showMessageDialog(null, "That isn't that much. I have a rabbit the weighs " + (weight + 50) + "pounds");
			answer = JOptionPane.showInputDialog("What is your favorite hobby?");
			samFriend.setHobby(answer);
			JOptionPane.showMessageDialog(null, samFriend.getHobby() + "? My mom likes to do that in her spare time as well.");
			answer = JOptionPane.showInputDialog("What kind of personality do you have?");
			samFriend.setPersonality(answer);
			JOptionPane.showMessageDialog(null, samFriend.getPersonality() + "? That's very interesting.");
			answer = JOptionPane.showInputDialog("Final Question. Are you imaginary? (yes or no)");
			if(answer.equalsIgnoreCase("yes"))
			{
				isImaginary = true;
				samFriend.setisImaginary(isImaginary);
				JOptionPane.showMessageDialog(null, "Awesome, I will add you to my Imaginary Friend list.");
				answer = JOptionPane.showInputDialog("Are there more people in your cubicle that have yet to answer? (yes or no)");
				if(answer.equalsIgnoreCase("yes"))
				{
					JOptionPane.showMessageDialog(null, "Alright, lets continue.");
					findOutAboutFriends();
				}
				else if(answer.equalsIgnoreCase("no"))
				{
					JOptionPane.showMessageDialog(null, "Time to meet my friends.");
					showAndTell();
				}
				else
				{
					JOptionPane.showMessageDialog(null, "That is an invalid answer, now we must restart.");
					findOutAboutFriends();
				}
			}
			else if(answer.equalsIgnoreCase("no"))
			{
				isImaginary = false;
				samFriend.setisImaginary(isImaginary);
				JOptionPane.showMessageDialog(null, "You better not be lying to me " + samFriend.getName() + ".");
				answer = JOptionPane.showInputDialog("Are there more people in your cubicle that have yet to answer? (yes or no)");
				if(answer.equalsIgnoreCase("yes"))
				{
					JOptionPane.showMessageDialog(null, "Alright, lets continue.");
					findOutAboutFriends();
				}
				else if(answer.equalsIgnoreCase("no"))
				{
					JOptionPane.showMessageDialog(null, "Time to meet my friends.");
					showAndTell();
				}
				else
				{
					JOptionPane.showMessageDialog(null, "That is an invalid answer, now we must restart.");
					findOutAboutFriends();
				}
			}
			else
			{
				JOptionPane.showMessageDialog(null, "That is an invalid answer. Lets start from the beginning.");
				findOutAboutFriends();
			}	
		}
		else if(answer.equalsIgnoreCase("jake"))
		{
			jakeFriend.setName(answer);
			JOptionPane.showMessageDialog(null, "Fantastic! " + jakeFriend.getName() + " is quite the name!");
			answer = JOptionPane.showInputDialog("How old are you, " + jakeFriend.getName() + "?");
			age = Integer.parseInt(answer);
			jakeFriend.setAge(age);
			JOptionPane.showMessageDialog(null, "Wow! " + age + " years old! That means the last year you were " + (age + -1) + " and next year you will be " + (age + 1) + "!");
			answer = JOptionPane.showInputDialog("Mind me asking, but how much do you weigh in pounds? (numbers only in answer)");
			weight = Double.parseDouble(answer);
			jakeFriend.setWeight(weight);
			JOptionPane.showMessageDialog(null, "That isn't that much. I have a rabbit the weighs " + (weight + 50) + "pounds");
			answer = JOptionPane.showInputDialog("What is your favorite hobby?");
			jakeFriend.setHobby(answer);
			JOptionPane.showMessageDialog(null, jakeFriend.getHobby() + "? My mom likes to do that in her spare time as well.");
			answer = JOptionPane.showInputDialog("What kind of personality do you have?");
			jakeFriend.setPersonality(answer);
			JOptionPane.showMessageDialog(null, jakeFriend.getPersonality() + "? That's very interesting.");
			answer = JOptionPane.showInputDialog("Final Question. Are you imaginary? (yes or no)");
			if(answer.equalsIgnoreCase("yes"))
			{
				isImaginary = true;
				jakeFriend.setisImaginary(isImaginary);
				JOptionPane.showMessageDialog(null, "Awesome, I will add you to my Imaginary Friend list.");
				answer = JOptionPane.showInputDialog("Are there more people in your cubicle that have yet to answer? (yes or no)");
				if(answer.equalsIgnoreCase("yes"))
				{
					JOptionPane.showMessageDialog(null, "Alright, lets continue.");
					findOutAboutFriends();
				}
				else if(answer.equalsIgnoreCase("no"))
				{
					JOptionPane.showMessageDialog(null, "Time to meet my friends.");
					showAndTell();
				}
				else
				{
					JOptionPane.showMessageDialog(null, "That is an invalid answer, now we must restart.");
					findOutAboutFriends();
				}
			}
			else if(answer.equalsIgnoreCase("no"))
			{
				isImaginary = false;
				jakeFriend.setisImaginary(isImaginary);
				JOptionPane.showMessageDialog(null, "You better not be lying to me " + jakeFriend.getName() + ".");
				answer = JOptionPane.showInputDialog("Are there more people in your cubicle that have yet to answer? (yes or no)");
				if(answer.equalsIgnoreCase("yes"))
				{
					JOptionPane.showMessageDialog(null, "Alright, lets continue.");
					findOutAboutFriends();
				}
				else if(answer.equalsIgnoreCase("no"))
				{
					JOptionPane.showMessageDialog(null, "Time to meet my friends.");
					showAndTell();
				}
				else
				{
					JOptionPane.showMessageDialog(null, "That is an invalid answer, now we must restart.");
					findOutAboutFriends();
				}
			}
			else
			{
				JOptionPane.showMessageDialog(null, "That is an invalid answer. Lets start from the beginning.");
				findOutAboutFriends();
			}	
		}
		else if(answer.equalsIgnoreCase("nathan"))
		{
			nathanFriend.setName(answer);
			JOptionPane.showMessageDialog(null, "Fantastic! " + nathanFriend.getName() + " is quite the name!");
			answer = JOptionPane.showInputDialog("How old are you, " + nathanFriend.getName() + "?");
			age = Integer.parseInt(answer);
			nathanFriend.setAge(age);
			JOptionPane.showMessageDialog(null, "Wow! " + age + " years old! That means the last year you were " + (age + -1) + " and next year you will be " + (age + 1) + "!");
			answer = JOptionPane.showInputDialog("Mind me asking, but how much do you weigh in pounds? (numbers only in answer)");
			weight = Double.parseDouble(answer);
			nathanFriend.setWeight(weight);
			JOptionPane.showMessageDialog(null, "That isn't that much. I have a rabbit the weighs " + (weight + 50) + "pounds");
			answer = JOptionPane.showInputDialog("What is your favorite hobby?");
			nathanFriend.setHobby(answer);
			JOptionPane.showMessageDialog(null, nathanFriend.getHobby() + "? My mom likes to do that in her spare time as well.");
			answer = JOptionPane.showInputDialog("What kind of personality do you have?");
			nathanFriend.setPersonality(answer);
			JOptionPane.showMessageDialog(null, nathanFriend.getPersonality() + "? That's very interesting.");
			answer = JOptionPane.showInputDialog("Final Question. Are you imaginary? (yes or no)");
			if(answer.equalsIgnoreCase("yes"))
			{
				isImaginary = true;
				nathanFriend.setisImaginary(isImaginary);
				JOptionPane.showMessageDialog(null, "Awesome, I will add you to my Imaginary Friend list.");
				answer = JOptionPane.showInputDialog("Are there more people in your cubicle that have yet to answer? (yes or no)");
				if(answer.equalsIgnoreCase("yes"))
				{
					JOptionPane.showMessageDialog(null, "Alright, lets continue.");
					findOutAboutFriends();
				}
				else if(answer.equalsIgnoreCase("no"))
				{
					JOptionPane.showMessageDialog(null, "Time to meet my friends.");
					showAndTell();
				}
				else
				{
					JOptionPane.showMessageDialog(null, "That is an invalid answer, now we must restart.");
					findOutAboutFriends();
				}
			}
			else if(answer.equalsIgnoreCase("no"))
			{
				isImaginary = false;
				nathanFriend.setisImaginary(isImaginary);
				JOptionPane.showMessageDialog(null, "You better not be lying to me " + nathanFriend.getName() + ".");
				answer = JOptionPane.showInputDialog("Are there more people in your cubicle that have yet to answer? (yes or no)");
				if(answer.equalsIgnoreCase("yes"))
				{
					JOptionPane.showMessageDialog(null, "Alright, lets continue.");
					findOutAboutFriends();
				}
				else if(answer.equalsIgnoreCase("no"))
				{
					JOptionPane.showMessageDialog(null, "Time to meet my friends.");
					showAndTell();
				}
				else
				{
					JOptionPane.showMessageDialog(null, "That is an invalid answer, now we must restart.");
					findOutAboutFriends();
				}
			}
			else
			{
				JOptionPane.showMessageDialog(null, "That is an invalid answer. Lets start from the beginning.");
				findOutAboutFriends();
			}	
		}
		else if(answer.equalsIgnoreCase("devvin"))
		{
			devvinFriend.setName(answer);
			JOptionPane.showMessageDialog(null, "Fantastic! " + devvinFriend.getName() + " is quite the name!");
			answer = JOptionPane.showInputDialog("How old are you, " + devvinFriend.getName() + "?");
			age = Integer.parseInt(answer);
			devvinFriend.setAge(age);
			JOptionPane.showMessageDialog(null, "Wow! " + age + " years old! That means the last year you were " + (age + -1) + " and next year you will be " + (age + 1) + "!");
			answer = JOptionPane.showInputDialog("Mind me asking, but how much do you weigh in pounds? (numbers only in answer)");
			weight = Double.parseDouble(answer);
			devvinFriend.setWeight(weight);
			JOptionPane.showMessageDialog(null, "That isn't that much. I have a rabbit the weighs " + (weight + 50) + "pounds");
			answer = JOptionPane.showInputDialog("What is your favorite hobby?");
			devvinFriend.setHobby(answer);
			JOptionPane.showMessageDialog(null, devvinFriend.getHobby() + "? My mom likes to do that in her spare time as well.");
			answer = JOptionPane.showInputDialog("What kind of personality do you have?");
			devvinFriend.setPersonality(answer);
			JOptionPane.showMessageDialog(null, devvinFriend.getPersonality() + "? That's very interesting.");
			answer = JOptionPane.showInputDialog("Final Question. Are you imaginary? (yes or no)");
			if(answer.equalsIgnoreCase("yes"))
			{
				isImaginary = true;
				devvinFriend.setisImaginary(isImaginary);
				JOptionPane.showMessageDialog(null, "Awesome, I will add you to my Imaginary Friend list.");
				answer = JOptionPane.showInputDialog("Are there more people in your cubicle that have yet to answer? (yes or no)");
				if(answer.equalsIgnoreCase("yes"))
				{
					JOptionPane.showMessageDialog(null, "Alright, lets continue.");
					findOutAboutFriends();
				}
				else if(answer.equalsIgnoreCase("no"))
				{
					JOptionPane.showMessageDialog(null, "Time to meet my friends.");
					showAndTell();
				}
				else
				{
					JOptionPane.showMessageDialog(null, "That is an invalid answer, now we must restart.");
					findOutAboutFriends();
				}
			}
			else if(answer.equalsIgnoreCase("no"))
			{
				isImaginary = false;
				devvinFriend.setisImaginary(isImaginary);
				JOptionPane.showMessageDialog(null, "You better not be lying to me " + devvinFriend.getName() + ".");
				answer = JOptionPane.showInputDialog("Are there more people in your cubicle that have yet to answer? (yes or no)");
				if(answer.equalsIgnoreCase("yes"))
				{
					JOptionPane.showMessageDialog(null, "Alright, lets continue.");
					findOutAboutFriends();
				}
				else if(answer.equalsIgnoreCase("no"))
				{
					JOptionPane.showMessageDialog(null, "Time to meet my friends.");
					showAndTell();
				}
				else
				{
					JOptionPane.showMessageDialog(null, "That is an invalid answer, now we must restart.");
					findOutAboutFriends();
				}
			}
			else
			{
				JOptionPane.showMessageDialog(null, "That is an invalid answer. Lets start from the beginning.");
				findOutAboutFriends();
			}
		}
		else
		{
			JOptionPane.showMessageDialog(null, "Sorry, but you are not one of the friends in my cubicle. I'm going to restart.");
			findOutAboutFriends();
			
		}
		
	}

	private void interact()
	{
		String answer;
		JOptionPane.showMessageDialog(null, "Hi, let's talk");
		// If you press the Red X or cancel on the input dialog you will return
		// a null value
		answer = JOptionPane.showInputDialog("who am I talking with?");
		JOptionPane.showMessageDialog(null, "Hey " + answer
				+ ", you are worthless.");
		answer = JOptionPane.showInputDialog("What do you like to do?");
		JOptionPane
				.showMessageDialog(null, answer + " you say? That's stupid.");
		answer = JOptionPane.showInputDialog("Do you even have friends?");
		if (answer.equalsIgnoreCase("yes"))
		{
			JOptionPane.showMessageDialog(null,
					"Don't you lie to me. Let's be serious now.");
			meetTheGUIThingy();
		}
		else if (answer.equalsIgnoreCase("no"))
		{
			JOptionPane.showMessageDialog(null, "Good.");
			meetTheGUIThingy();
		}
		else
		{
			JOptionPane.showMessageDialog(null,
					"That is not a valid answer. Lets restart.");
			interact();
		}

	}

	private void meetTheGUIThingy()
	{
		String answer;
		String answer2;
		JOptionPane.showMessageDialog(null,
				"Our Thingy object's current name is Jack the Pumpkin King");
		answer2 = JOptionPane
				.showInputDialog("What do you want to change my name to be?");
		answer = JOptionPane.showInputDialog(null,
				"Really, my name should be this: " + answer2
						+ "? Reply (Yes or No)");
		if (answer.equalsIgnoreCase("yes"))
		{
			if (answer.equals("Yes"))
			{
				JOptionPane.showMessageDialog(null,
						"Hurray, you followed a direction!");
			}
			JOptionPane.showMessageDialog(null,
					"Our Thingy object has a new name! It is " + answer2);
		}
		else if (answer.equalsIgnoreCase("no"))
		{
			meetTheGUIThingy();
		}
		else
		{
			JOptionPane.showMessageDialog(null, "I do not like the name "
					+ answer2 + " I think it is silly");
			JOptionPane.showMessageDialog(null, "Let's change the name.");
			meetTheGUIThingy();
		}

	}

	private void showAndTell()
	{
		JOptionPane.showMessageDialog(null, "Here is what we know about my friends.");
		JOptionPane.showMessageDialog(null, "I have a friend named " + samFriend.getName() + ". He is " + samFriend.getAge() + " years old. His personality is " + samFriend.getPersonality() + ". He weighs " + samFriend.getWeight() + "pounds. " + samFriend.getHobby() + " is his favorite hobby. His state of imagination status is: " + samFriend.getIsImaginary() + ".");
		JOptionPane.showMessageDialog(null, "I have a friend named " + jakeFriend.getName() + ". He is " + jakeFriend.getAge() + " years old. His personality is " + jakeFriend.getPersonality() + ". He weighs " + jakeFriend.getWeight() + "pounds. " + jakeFriend.getHobby() + " is his favorite hobby. His state of imagination status is: " + jakeFriend.getIsImaginary() + ".");
		JOptionPane.showMessageDialog(null, "I have a friend named " + nathanFriend.getName() + ". He is " + nathanFriend.getAge() + " years old. His personality is " + nathanFriend.getPersonality() + ". He weighs " + nathanFriend.getWeight() + "pounds. " + nathanFriend.getHobby() + " is his favorite hobby. His state of imagination status is: " + nathanFriend.getIsImaginary() + ".");
		JOptionPane.showMessageDialog(null, "I have a friend named " + devvinFriend.getName() + ". He is " + devvinFriend.getAge() + " years old. His personality is " + devvinFriend.getPersonality() + ". He weighs " + devvinFriend.getWeight() + "pounds. " + devvinFriend.getHobby() + " is his favorite hobby. His state of imagination status is: " + devvinFriend.getIsImaginary() + ".");
		JOptionPane.showMessageDialog(null, "That is all.");
	}
	
	private void checkWrapper()
	{
		int age;
		String answer;
		JOptionPane.showMessageDialog(null, "Hi, let's talk");
		// If you press the Red X or cancel on the input dialog you will return
		// a null value
		answer = JOptionPane.showInputDialog("How old are you?");

		if (answer.equalsIgnoreCase("yes"))
		{
			boolean isImaginary = true;
			samFriend.setisImaginary(isImaginary);
		}

		age = Integer.parseInt(answer);
		// Look in the Integer class to read an int from a String parameter.

		JOptionPane.showMessageDialog(null, "So you are " + age
				+ " years old? Next year you will be " + (age + 1)
				+ " years old!");
	}
}