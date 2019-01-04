package game;

import java.util.ArrayList;

import org.bukkit.Location;
import org.bukkit.entity.Player;

public class BWPrelobby 
{
	static Location spawn;//= Main.config.getPreLobbySpawn();
	BWMap map;
	ArrayList<Player> players = new ArrayList<Player>();
	
	public BWPrelobby(BWMap map, Player p)
	{
		this.map = map;
		addAndTeleport(p);
	}
	
	public void addAndTeleport(Player p)
	{
		if(!players.contains(p))
		{
			players.add(p);
		}
		
		p.teleport(spawn);
	}
	
	public BWMap getMap()
	{
		return this.map;
	}
	
	public ArrayList<Player> getPlayers()
	{
		return this.players;
	}
	
	public Location getSpawn()
	{
		return spawn;
	}
}
