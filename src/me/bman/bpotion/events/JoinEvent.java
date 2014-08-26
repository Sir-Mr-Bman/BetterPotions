package me.bman.bpotion.events;

import me.bman.bpotion.utils.Applier;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerLoginEvent;
import org.bukkit.potion.PotionEffectType;

public class JoinEvent implements Listener {

	@EventHandler(priority = EventPriority.HIGHEST)
	public void onLogin(PlayerLoginEvent e) {
		
		Player p = e.getPlayer();
		if (p.hasPermission("bpot.absorption")) {
			Applier.appPotion(p, PotionEffectType.ABSORPTION, 9001, 1, true);
		} else if (p.hasPermission("bpot.blindness")) {
			Applier.appPotion(p, PotionEffectType.BLINDNESS, 9001, 1, true);
		} else if (p.hasPermission("bpot.confusion")) {
			Applier.appPotion(p, PotionEffectType.CONFUSION, 9001, 1, true);
		} else if (p.hasPermission("bpot.")) {
			Applier.appPotion(p, PotionEffectType.DAMAGE_RESISTANCE, 9001, 1, true);
		} else if (p.hasPermission("bpot.")) {
			Applier.appPotion(p, PotionEffectType.FAST_DIGGING, 9001, 1, true);
		} else if (p.hasPermission("bpot.")) {
			Applier.appPotion(p, PotionEffectType.FIRE_RESISTANCE, 9001, 1, true);
		} else if (p.hasPermission("bpot.")) {
			Applier.appPotion(p, PotionEffectType.HARM, 9001, 1, true);
		} else if (p.hasPermission("bpot.")) {
			Applier.appPotion(p, PotionEffectType.HEAL, 9001, 1, true);
		} else if (p.hasPermission("bpot.")) {
			Applier.appPotion(p, PotionEffectType.HUNGER, 9001, 1, true);
		} else if (p.hasPermission("bpot.")) {
			Applier.appPotion(p, PotionEffectType.INCREASE_DAMAGE, 9001, 1, true);
		} else if (p.hasPermission("bpot.")) {
			Applier.appPotion(p, PotionEffectType.INVISIBILITY, 9001, 1, true);
		} else if (p.hasPermission("bpot.")) {
			Applier.appPotion(p, PotionEffectType.JUMP, 9001, 1, true);
		}
		
	}
}
