package me.bman.bpotion;

import java.util.logging.Logger;

import me.bman.bpotion.events.JoinEvent;
import me.bman.bpotion.utils.Logging;

import org.bukkit.plugin.java.JavaPlugin;

public class Header extends JavaPlugin {

	public final static Logger loggit = Logger.getLogger("Minecraft");
	
	@Override
	public void onEnable() {
		
		Logging.log("Plugin started!");
		getServer().getPluginManager().registerEvents(new JoinEvent(), this);
	}
	
	@Override
	public void onDisable() {
		Logging.log("Plugin disabled.");
	}
	
	
}
