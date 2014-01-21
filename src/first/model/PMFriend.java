package first.model;

public class PMFriend
{
	//Declaration Section
	private String name;
	private int age;
	private String personality;
	private boolean isImaginary;
	private double weight;
	private String hobby;
	
	public void setName(String name)
	{
		this.name = name;
	}
	
	public void setAge(int age)
	{
		this.age = age;
	}
	public void setPersonality(String personality)
	{
		this.personality = personality;
	}
	public void setisImaginary(boolean isImaginary)
	{
		this.isImaginary = isImaginary;
	}
	public void setWeight(double weight)
	{
		this.weight = weight;
	}
	public void setHobby(String hobby)
	{
		this.hobby = hobby;
	}
	public String getName()
	{
		return name;
	}
	
	public boolean getIsImaginary()
	{
		return isImaginary;
	}
	public String getPersonality()
	{
		return personality;
	}
	public int getAge()
	{
		return age;
	}
	public double getWeight()
	{
		return weight;
	}
	
	public String getHobby()

	{
		return hobby;
	}
	
	/**
	 * Initialize with bad values
	 */
	public PMFriend()
	{
		name = "nameless";
		age = -100000;
		personality = "";
		isImaginary = false;
		weight = -9999999.9999;
		hobby = "never";
	}
	public PMFriend(String name, int age, String personality, boolean isImaginary, double weight, String hobby)
	{
		this.name = name;
		this.age = age;
		this.personality = personality;
		this.isImaginary = isImaginary;
		this.weight = weight;
		this.hobby = hobby;
	}
}