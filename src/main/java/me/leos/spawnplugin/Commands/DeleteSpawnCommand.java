package me.leos.spawnplugin.Commands;

import me.leos.spawnplugin.SpawnPlugin;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class DeleteSpawnCommand implements CommandExecutor {

    private final SpawnPlugin plugin;

    public DeleteSpawnCommand(SpawnPlugin plugin) { this.plugin = plugin; }


    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

        if (sender instanceof Player) {
            Player player = (Player) sender;

            plugin.getConfig().set("spawn", null);
            plugin.saveConfig();
            player.sendMessage(ChatColor.RED + "Spawn has been deleted!");

        }


        return true;
    }
}
