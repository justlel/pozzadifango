package main;

import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.java.JavaPlugin;

public class BedWars extends JavaPlugin
{	
	public static Plugin instance = getMain();
	public static BedWars main = null;
	
	public void onEnable()
	{
		getCommand("bedwars").setExecutor(new commands.BedWars());
		main = this;
	}
	
	public static BedWars getMain()
	{
		return main;
	}
	
	public static JavaPlugin getInstance() 
	{
	    if(instance == null) instance = BedWars.getPlugin(BedWars.class);
	    return (JavaPlugin) instance;
	}
}
