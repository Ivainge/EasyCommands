package org.ivainge.mc.easycommands;

import org.bukkit.plugin.java.JavaPlugin;
import org.ivainge.mc.easycommands.command.EasyCommand;

public final class EasyCommands extends JavaPlugin {

    private static EasyCommands instance;

    @Override
    public void onEnable() {
        instance = this;
        new EasyCommand();
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
    public static EasyCommands getInstance() {
        return instance;
    }
}
