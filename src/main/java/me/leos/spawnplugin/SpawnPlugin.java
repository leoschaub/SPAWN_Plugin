package me.leos.spawnplugin;

import me.leos.spawnplugin.Commands.DeleteSpawnCommand;
import me.leos.spawnplugin.Commands.SetSpawnCommand;
import me.leos.spawnplugin.Commands.SpawnCommand;
import org.bukkit.plugin.java.JavaPlugin;

public final class SpawnPlugin extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic

        getConfig().options().copyDefaults();
        saveDefaultConfig();

        getCommand("setspawn").setExecutor(new SetSpawnCommand(this));
        getCommand("spawn").setExecutor(new SpawnCommand(this));
        getCommand("delspawn").setExecutor(new DeleteSpawnCommand(this));


    }

}
