package me.bman.bpotion.utils;

import org.bukkit.entity.Player;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

public class Applier {

	
	/**
	 * "Amb" should ALWAYS be set to "true". 
	 * @param p
	 * @param type
	 * @param dur
	 * @param amp
	 * @param amb
	 */
	public final void appPotion(Player p, PotionEffectType type, int dur, int amp, boolean amb) {
		p.addPotionEffect(new PotionEffect(type, dur, amp, amb));
	}
	
	
}
