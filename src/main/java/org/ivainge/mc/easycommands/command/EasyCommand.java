package org.ivainge.mc.easycommands.command;

import com.google.common.collect.Lists;
import org.bukkit.ChatColor;
import org.bukkit.command.CommandSender;
import org.ivainge.mc.easycommands.EasyCommands;

import java.util.List;

public class EasyCommand extends AbstractCommand{

    public EasyCommand() {
        super("easycommands");
    }
    @Override
    public void execute(CommandSender sender, String label, String[] args) {
        if(args.length == 0) {
            sender.sendMessage("§eЧто-бы посмотреть список команд напишите: §6/" + label + " help");
            return;
        }

        if(args[0].equalsIgnoreCase("reload")) {
            if(!sender.hasPermission("easycommands.reload")) {
                sender.sendMessage("§4У вас нет прав");
                return;
            }

            EasyCommands.getInstance().reloadConfig();
            sender.sendMessage("§aEasyCommands reloaded!");
            return;
        }

        sender.sendMessage( "§cКоманда §4§l" + args[0] + " §r§cне найдена" );
    }

    @Override
    public List<String> complete(CommandSender sender, String[] args) {
        if(args.length == 1) return Lists.newArrayList("reload");
        return Lists.newArrayList();
    }
}
