package com.seailz.lifesteal.listeners;

import com.seailz.lifesteal.core.Locale;
import com.seailz.lifesteal.core.utils.NumberUtils;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

public class PlayerJoin implements Listener {

    @EventHandler
    public void onJoin(PlayerJoinEvent e) {
        if (!e.getPlayer().hasPlayedBefore()) {
            int hearts = NumberUtils.generateRandomNumber(8, 32);
            e.getPlayer().setMaxHealth(hearts);
            e.getPlayer().setHealth(hearts);
        }
        Locale.PLAYER_JOIN.replace("%player%", e.getPlayer().getName()).broadcast();
        e.setJoinMessage("");
    }
}
