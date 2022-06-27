package me.leos.spawnplugin.Commands;

import me.leos.spawnplugin.SpawnPlugin;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Location;
import org.bukkit.World;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class SetSpawnCommand implements CommandExecutor {

    private final SpawnPlugin plugin;

    public SetSpawnCommand(SpawnPlugin plugin){
        this.plugin = plugin;
    }

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

        if (sender instanceof Player){
            Player player = (Player) sender;

            Location location = player.getLocation();
            plugin.getConfig().set("spawn", location);
            plugin.saveConfig();
            player.sendMessage(ChatColor.GREEN + "Spawn location set!");

            //plugin.getConfig().set("spawn.x", location.getX());
            //plugin.getConfig().set("spawn.y", location.getY());
            //plugin.getConfig().set("spawn.z", location.getZ());
            //plugin.getConfig().set("pawn.worldName", location.getWorld().getName());


        }

        return true;
    }
}
