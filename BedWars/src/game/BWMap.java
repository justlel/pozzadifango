package game;

import java.util.ArrayList;
import org.bukkit.Location;

public class BWMap 
{
	String name;
	
	Location corner1;
	Location corner2;
	
	int n_blocks;
	int max_players;
	
	ArrayList<BWTeam> teams = new ArrayList<BWTeam>();
	
	public BWMap(String name, Location corner1, Location corner2, ArrayList<BWTeam> teams)
	{
		this.name = name;
		
		this.corner1 = corner1;
		this.corner2 = corner2;
		
		this.teams = teams;
		
		this.n_blocks = checkBlocks();
	}
	
	public Location getCorner1()
	{
		return this.corner1;
	}
	
	public Location getCorner2()
	{
		return this.corner2;
	}
	
	public int getBlocksNumber()
	{
		return this.n_blocks;
	}
	
	public int getMaxPlayersNumber()
	{
		return this.max_players;
	}
	
	public int getTeamSize()
	{
		return this.teams.get(0).getSize();
	}
	
	public int getTeamsNumber()
	{
		return this.teams.size();
	}
	
	public ArrayList<BWTeam> getTeams()
	{
		return this.teams;
	}
	
	private int checkBlocks()
	{
		int blocks = 0;
		
		int Xcorner1 = this.corner1.getBlockX();
		int Xcorner2 = this.corner2.getBlockX();
		int Ycorner1 = this.corner1.getBlockY();
		int Ycorner2 = this.corner2.getBlockY();
		int Zcorner1 = this.corner1.getBlockZ();
		int Zcorner2 = this.corner2.getBlockZ();
		
		int[] Xs = sortLoc(Xcorner1, Xcorner2);
		int[] Ys = sortLoc(Ycorner1, Ycorner2);
		int[] Zs = sortLoc(Zcorner1, Zcorner2);
		
		if(Xs == null || Ys == null && Zs == null)
		{
			return -1;
		}
		
		for(int x = Xs[0]; x < Xs[1]; x++)
		{
			for(int y = Ys[0]; y < Ys[1]; y++)
			{
				for(int z = Zs[0]; z < Zs[1]; z++)
				{
					blocks++;
				}
			}
		}
		
		return blocks;
	}
	
	private int[] sortLoc(int a, int b)
	{
		int[] returning = new int[2];
		
		if(a < b)
		{
			returning[0] = a;
			returning[1] = b;
			
			return returning;
		}
		else if(a > b)
		{
			returning[0] = b;
			returning[1] = a;
			
			return returning;
		}
		
		return null;
	}
}
