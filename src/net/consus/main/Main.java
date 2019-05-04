package net.consus.main;

import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {

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