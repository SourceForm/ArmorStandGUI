package commands;

import me.sourceform.armorstandguis.ArmorStandGUIs;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;


public class ArmorStandCommand implements CommandExecutor {

    ArmorStandGUIs plugin;
    public ArmorStandCommand(ArmorStandGUIs plugin) {
        this.plugin = plugin;
    }

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

        if (sender instanceof Player) {
            Player player = (Player) sender;
            plugin.openMainMenu(player);
        }

        return true;
    }
}
