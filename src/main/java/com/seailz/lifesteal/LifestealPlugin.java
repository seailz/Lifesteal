package com.seailz.lifesteal;

import com.seailz.lifesteal.listeners.PlayerDeath;
import com.seailz.lifesteal.listeners.PlayerJoin;
import games.negative.framework.BasePlugin;

public final class LifestealPlugin extends BasePlugin {

    @Override
    public void onEnable() {
        registerListeners(
                new PlayerDeath(),
                new PlayerJoin()
        );
    }
}
