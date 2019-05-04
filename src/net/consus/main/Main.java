package net.consus.main;

import org.bukkit.plugin.java.JavaPlugin;
import com.google.common.collect.ArrayListMultimap;
import com.google.common.collect.Multimap;
import com.massivecraft.factions.entity.Faction;
import net.consus.cities.City;

public class Main extends JavaPlugin {

public static Multimap<Faction, City> cities = ArrayListMultimap.create();
	
private static Main plugin;
  public String NAME = "Consus Cities";
  public String VERSION = "0.1";
  public String AUTHOR = "TheDerpGamerX";
  
  public String pluginfile = NAME + "v" + VERSION;

  
  @Override
  public void onEnable() {
	  plugin = this;
  }
}