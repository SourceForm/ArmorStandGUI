package commands;

import org.bukkit.ChatColor;
import org.bukkit.Location;
import org.bukkit.NamespacedKey;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.profile.PlayerProfile;

import java.net.InetSocketAddress;
import java.util.concurrent.CompletableFuture;

public class MenuHandler implements Listener {

    @EventHandler
    public void onMenuClick(InventoryClickEvent e){
        Player player = (Player) e.getWhoClicked();

        //Menu List
        final String MAIN_MENU = ChatColor.BLUE + "Armor Stand GUI";

        if(e.getView().getTitle().equalsIgnoreCase(MAIN_MENU)){
            switch(e.getCurrentItem().getType()){
                case ARMOR_STAND:
                    player.sendMessage("Opened Armor Stand Create Menu");
                    player.closeInventory();
                    //Open Armor Stand Inventory
                    break;
                case BARRIER:
                    player.sendMessage("Closing Main Menu");
                    player.closeInventory();
                    break;
                default:
                    break;
            }
        }
    }
}
