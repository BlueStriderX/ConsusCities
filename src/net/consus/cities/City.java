package net.consus.cities;

import java.util.UUID;
import org.bukkit.Location;
import com.massivecraft.factions.entity.Faction;
import net.consus.main.Main;

public class City {
	
	public static String cityName;
	public static UUID cityUUID;
	public static Faction ownerFaction;
	public static Faction controllingFaction;
	public static Location coreBlockLocation;
	public static int radiusSize;
	public static CityType type;
	public static boolean capital;
	public static int victoryPoints;
	
	public static UUID generateCityUUID() {
		cityUUID = UUID.randomUUID();
		return cityUUID;
	}
	
	public static UUID getCityUUID() {
		return cityUUID;
	}
	
	public static Faction getOwnerFaction(City city) {
		if(Main.cities.containsValue(city)) {
			
		}
	}
}