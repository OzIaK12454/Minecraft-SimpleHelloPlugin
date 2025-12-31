package org.OZI.simpleHelloMessage;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerQuitEvent;
import org.bukkit.plugin.java.JavaPlugin;

public final class SimpleHelloMessage extends JavaPlugin implements Listener {

    @Override
    public void onEnable() {
        getServer().getPluginManager().registerEvents(this, this);
        getLogger().info("SimpleHelloMessage enabled!");
    }

    @EventHandler
    public void onPlayerJoin(PlayerJoinEvent e) {
        e.setJoinMessage(null); // wyłącz standardową wiadomość
        Bukkit.broadcastMessage(ChatColor.translateAlternateColorCodes('&', "&8&l>> &r&c" + e.getPlayer().getName() + " &ahas joined the game!"));
    }

    @EventHandler
    public void onPlayerQuit(PlayerQuitEvent e) {
        e.setQuitMessage(null); // wyłącz standardową wiadomość
        Bukkit.broadcastMessage(ChatColor.translateAlternateColorCodes('&', "&8&l>> &r&c" + e.getPlayer().getName() + " &ahas left the game!"));
    }
}
