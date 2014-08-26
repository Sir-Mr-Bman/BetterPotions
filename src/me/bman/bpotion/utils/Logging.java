package me.bman.bpotion.utils;

import me.bman.bpotion.Header;

import org.bukkit.ChatColor;
import org.bukkit.entity.Player;

public class Logging {
	
	
	public static void log(String msg) {
		Header.loggit.info("[BetterPotions] " + msg);
	}
	
	public static void sMsg(String msg, Player p) {
		p.sendMessage(ChatColor.GREEN + "[" + ChatColor.RED + "BetterPotions" + ChatColor.GREEN + "] " +
				AToC.aToC(msg));
	}
}
