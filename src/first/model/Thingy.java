package first.model;

public class Thingy
{
	//Declaration Selection
	/**
	 * Thingy Name
	 */
	private String name;
	private String movie;
	private String food;
	
	public Thingy()
	{
		name = "Jack the Pumpkin King";
		movie = "Star Wars";
		food = "Raspberries are best";
	}
	
	public void setMovie(String movie)
	{
		this.movie = movie;
	}
	
	public void setFood(String food)
	{
		this.food = food;
	}
	
	public void setName(String name)
	{
		this.name = name;
	}
	
	public String getMovie()
	{
		return movie;
	}
	
	public String getfood()
	{
		return food;
	}
	
	public String getName()
	{
		return name;
	}

}
