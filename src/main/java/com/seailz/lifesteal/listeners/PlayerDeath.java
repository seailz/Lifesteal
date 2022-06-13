/*
 * Copyright (©) Seailz - 2022
 *     This library is free software; you can redistribute it and/or
 *     modify it under the terms of the GNU Lesser General Public
 *     License as published by the Free Software Foundation; either
 *     version 2.1 of the License, or (at your option) any later version.
 *
 *     This library is distributed in the hope that it will be useful,
 *     but WITHOUT ANY WARRANTY; without even the implied warranty of
 *     MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 *     Lesser General Public License for more details.
 *
 *     You should have received a copy of the GNU Lesser General Public
 *     License along with this library; if not, write to the Free Software
 *     Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston, MA  02110-1301
 *     USA
 *
 */

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

        assert o != null;

        // Set correct health
        o.setMaxHealth(o.getMaxHealth() + 2.00);
        p.setMaxHealth(p.getMaxHealth() - 2.00);

        // Set death message
        e.setDeathMessage(p.getName() + " was brutally murdered by " + o.getName());
    }

}
