package org.OZI.simpleHelloMessage.manager;

import org.bukkit.configuration.file.FileConfiguration;

public class ConfigManager {

    private final FileConfiguration config;

    public ConfigManager(FileConfiguration config) {
        this.config = config;
    }

    public String getJoinMessage() {
        return config.getString("join_message", " &8&l>> &r&c{PLAYER} &ahas joined the game!");
    }

    public String getQuitMessage() {
        return config.getString("quit_message", " &8&l>> &r&c{PLAYER} &ahas left the game!");
    }
}
