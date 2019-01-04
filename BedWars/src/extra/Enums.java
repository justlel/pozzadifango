package extra;

import org.bukkit.ChatColor;

public class Enums 
{
	public static enum BWColors
	{
		SUCCESS(ChatColor.GREEN + "SUCCESS"),  FAILED_FULL_TEAM(ChatColor.RED + "FULL_TEAM"), FAILED_FULL_GAME(ChatColor.RED + "FULL_GAME"), FAILED_DISABLE(ChatColor.RED + "DISABLED"), FAILED_REGEN(ChatColor.RED + "REGEN");
	    
	    String value;
	    
	    private BWColors(String paramString1)
	    {
	    	this.value = paramString1;
	    }
	    
	    public String toString()
	    {
	    	return this.value;
	    }
	}
	
	public static enum Team_Prefix
	{
//		GOLD(ChatColor.YELLOW + "[✦]§r"), PURPLE(ChatColor.DARK_PURPLE + "[✦]§r"), RED(ChatColor.RED + "[✦]§r"), BLUE(ChatColor.BLUE + "[✦]§r"), ORANGE(ChatColor.GOLD + "[✦]§r"), GRAY(ChatColor.GRAY + "[✦]§r");
		GOLD("§7[§e✦§7]§r "), PURPLE("§7[§5✦§7]§r "), RED("§7[§4✦§7]§r "), BLUE("§7[§1✦§7]§r "), ORANGE("§7[§6✦§7]§r "), GRAY("§7[§8✦§7]§r ");
		
		String value;
		
		private Team_Prefix(String paramString1)
		{
			this.value = paramString1;
		}
		
		public String toString()
	    {
	    	return this.value;
	    }
	}
	
	public static enum BuildMapOutcome
	{
		SUCCESS("SUCCESS"),  FAILED_MAX_NUMBER("FULL_TEAM"), FAILED_FULL_GAME(ChatColor.RED + "FULL_GAME"), FAILED_DISABLE(ChatColor.RED + "DISABLED"), FAILED_REGEN(ChatColor.RED + "REGEN");
	    
	    String value;
	    
	    private BuildMapOutcome(String paramString1)
	    {
	    	this.value = paramString1;
	    }
	    
	    public String toString()
	    {
	    	return this.value;
	    }
	}
}
