package me.bman.bpotion.events;

import me.bman.bpotion.Header;
import me.bman.bpotion.utils.Applier;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerLoginEvent;
import org.bukkit.potion.PotionEffectType;

public class JoinEvent implements Listener {

	@SuppressWarnings("deprecation")
	@EventHandler(priority = EventPriority.HIGHEST)
	public void onLogin(PlayerLoginEvent e) {
		Bukkit.getServer().getScheduler().scheduleAsyncDelayedTask(new Header(), new Runnable() {
			public void run() {
				Player p = e.getPlayer();
				if (p.hasPermission("bpot.absorption")) {
					Applier.appPotion(p, PotionEffectType.ABSORPTION, 9001, 1, true);
				} else if (p.hasPermission("bpot.blindness")) {
					Applier.appPotion(p, PotionEffectType.BLINDNESS, 9001, 1, true);
				} else if (p.hasPermission("bpot.confusion")) {
					Applier.appPotion(p, PotionEffectType.CONFUSION, 9001, 1, true);
				} else if (p.hasPermission("bpot.resistance")) {
					Applier.appPotion(p, PotionEffectType.DAMAGE_RESISTANCE, 9001, 1, true);
				} else if (p.hasPermission("bpot.haste")) {
					Applier.appPotion(p, PotionEffectType.FAST_DIGGING, 9001, 1, true);
				} else if (p.hasPermission("bpot.fire-proof")) {
					Applier.appPotion(p, PotionEffectType.FIRE_RESISTANCE, 9001, 1, true);
				} else if (p.hasPermission("bpot.harming")) {
					Applier.appPotion(p, PotionEffectType.HARM, 9001, 1, true);
				} else if (p.hasPermission("bpot.heal")) {
					Applier.appPotion(p, PotionEffectType.HEAL, 9001, 1, true);
				} else if (p.hasPermission("bpot.hunger")) {
					Applier.appPotion(p, PotionEffectType.HUNGER, 9001, 1, true);
				} else if (p.hasPermission("bpot.strength")) {
					Applier.appPotion(p, PotionEffectType.INCREASE_DAMAGE, 9001, 1, true);
				} else if (p.hasPermission("bpot.invisible")) {
					Applier.appPotion(p, PotionEffectType.INVISIBILITY, 9001, 1, true);
				} else if (p.hasPermission("bpot.jump")) {
					Applier.appPotion(p, PotionEffectType.JUMP, 9001, 1, true);
				} else if (p.hasPermission("bpot.night-vision")) {
					Applier.appPotion(p, PotionEffectType.NIGHT_VISION, 9001, 1, true);
				} else if (p.hasPermission("bpot.poison")) {
					Applier.appPotion(p, PotionEffectType.POISON, 9001, 1, true);
				} else if (p.hasPermission("bpot.regeneration")) {
					Applier.appPotion(p, PotionEffectType.REGENERATION, 9001, 1, true);
				} else if (p.hasPermission("bpot.saturation")) {
					Applier.appPotion(p, PotionEffectType.SATURATION, 9001, 1, true);
				} else if (p.hasPermission("bpot.slowness")) {
					Applier.appPotion(p, PotionEffectType.SLOW, 9001, 1, true);
				} else if (p.hasPermission("bpot.slow-dig")) {
					Applier.appPotion(p, PotionEffectType.SLOW_DIGGING, 9001, 1, true);
				} else if (p.hasPermission("bpot.speed")) {
					Applier.appPotion(p, PotionEffectType.SPEED, 9001, 1, true);
				} else if (p.hasPermission("bpot.water-breathing")) {
					Applier.appPotion(p, PotionEffectType.WATER_BREATHING, 9001, 1, true);
				} else if (p.hasPermission("bpot.weakness")) {
					Applier.appPotion(p, PotionEffectType.WEAKNESS, 9001, 1, true);
				} else if (p.hasPermission("bpot.wither")) {
					Applier.appPotion(p, PotionEffectType.WITHER, 9001, 1, true);
				}
			}
		}, 5L);
	}
}
