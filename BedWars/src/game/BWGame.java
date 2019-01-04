package game;

import org.bukkit.entity.Player;

import extra.Objects;

public class BWGame 
{
	BWMap map;
	Player firstPlayer;
	BWPrelobby prelobby;
	
	public BWGame(BWMap map, Player firstPlayer)
	{
		this.map = map;
		this.firstPlayer = firstPlayer;
		preLobbyStart(firstPlayer);
	}
	
	public void preLobbyStart(Player p)
	{
		for(BWPrelobby m : Objects.starting)
		{
			if(m.getMap().equals(map))
			{
				m.addAndTeleport(p);
				break;
			}
		}
		
		BWPrelobby prelobby = new BWPrelobby(this.map, p);
		this.prelobby = prelobby;
	}
	
	public void joinGame(Player p)
	{
		preLobbyStart(p);
	}
	
	
}
