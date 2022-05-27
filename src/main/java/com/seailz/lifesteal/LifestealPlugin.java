package com.seailz.lifesteal;

import com.seailz.lifesteal.listeners.PlayerDeath;
import games.negative.framework.BasePlugin;

public final class LifestealPlugin extends BasePlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic

        registerListeners(
                new PlayerDeath()
        );
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
