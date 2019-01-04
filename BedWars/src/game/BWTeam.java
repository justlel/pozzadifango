package game;
import extra.Enums.BWColors;

public class BWTeam 
{
	BWColors color;
	int size;
	
	public BWTeam(BWColors color, int size)
	{
		this.color = color;
		this.size = size;
	}
	
	public int getSize()
	{
		return this.size;
	}
	
	public BWColors getColor()
	{
		return this.color;
	}
}
