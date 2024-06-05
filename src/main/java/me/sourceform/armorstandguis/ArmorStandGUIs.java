package me.sourceform.armorstandguis;

import commands.ArmorStandCommand;
import org.bukkit.plugin.java.JavaPlugin;

public final class ArmorStandGUIs extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        System.out.println("SimpleGUIs has loaded");
        getCommand("armorstand").setExecutor(new ArmorStandCommand());

    }
}
