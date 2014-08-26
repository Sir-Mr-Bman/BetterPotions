package me.bman.bpotion.utils;

import org.bukkit.ChatColor;

public class AToC {

	public static String aToC(String format) {
		String postFormat = ChatColor.translateAlternateColorCodes('&', format);
		return postFormat;
	}
	
}
