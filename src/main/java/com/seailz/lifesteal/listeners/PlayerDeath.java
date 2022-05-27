package com.seailz.lifesteal.listeners;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.PlayerDeathEvent;

public class PlayerDeath implements Listener {

    @EventHandler
    public void onDeath(PlayerDeathEvent e) {
        if (!(e.getEntity().getLastDamageCause().getEntity() instanceof Player)) return;

        // create variables
        Player p = e.getEntity();
        Player o = e.getEntity().getKiller();


        if (o == null) return;

        // Set correct health
        o.setMaxHealth(o.getMaxHealth() + 2.00);
        p.setMaxHealth(p.getMaxHealth() - 2.00);

        // Set death message
        e.setDeathMessage(p.getName() + " was brutally murdered by " + o.getName());
    }

}
