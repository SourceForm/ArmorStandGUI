package me.sourceform.armorstandguis;

import commands.ArmorStandCommand;
import commands.MenuHandler;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.ArrayList;

public final class ArmorStandGUIs extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        System.out.println("SimpleGUIs has loaded");
        getCommand("armorstand").setExecutor(new ArmorStandCommand(this));
        getServer().getPluginManager().registerEvents(new MenuHandler(this), this);
    }

    public void openMainMenu(Player player){
        Inventory main_menu = Bukkit.createInventory(player, 9, ChatColor.BLUE + "Armor Stand GUI");

        //Options for main menu
        ItemStack create = new ItemStack(Material.ARMOR_STAND);
        ItemMeta create_meta = create.getItemMeta();
        create_meta.setDisplayName((ChatColor.GREEN + "Create"));
        ArrayList<String> create_lore = new ArrayList<>();
        create_lore.add(ChatColor.DARK_PURPLE + "Create a new armor stand.");
        create_meta.setLore(create_lore);
        create.setItemMeta(create_meta);

        //Close main menu
        ItemStack close = new ItemStack(Material.BARRIER);
        ItemMeta close_meta = close.getItemMeta();
        close_meta.setDisplayName((ChatColor.RED + "Close Menu"));
        close.setItemMeta(close_meta);

        main_menu.setItem(0, create);
        main_menu.setItem(8, close);
        player.openInventory(main_menu);

    }

    public void openCreateMenu(Player player){
        Inventory create_menu = Bukkit.createInventory(player, 9, ChatColor.GREEN + "Create an Armor Stand");

        ItemStack arms = new ItemStack(Material.ARMOR_STAND);
        ItemStack glow = new ItemStack(Material.BEACON);
        ItemStack armor = new ItemStack(Material.DIAMOND_CHESTPLATE);
        ItemStack base = new ItemStack(Material.STONE_SLAB);
        ItemStack complete = new ItemStack(Material.GREEN_WOOL);
        ItemStack cancel = new ItemStack(Material.RED_WOOL);

        ItemMeta arms_meta = arms.getItemMeta();
        ItemMeta glow_meta = glow.getItemMeta();
        ItemMeta armor_meta = armor.getItemMeta();
        ItemMeta base_meta = base.getItemMeta();
        ItemMeta complete_meta = complete.getItemMeta();
        ItemMeta cancel_meta = cancel.getItemMeta();

        arms_meta.setDisplayName(ChatColor.AQUA + "Arms");
        glow_meta.setDisplayName(ChatColor.AQUA + "Glow");
        armor_meta.setDisplayName(ChatColor.AQUA + "Armor");
        base_meta.setDisplayName(ChatColor.AQUA + "Base Material");
        complete_meta.setDisplayName(ChatColor.DARK_GREEN + "Complete");
        cancel_meta.setDisplayName(ChatColor.RED + "Cancel");

        arms.setItemMeta(arms_meta);
        glow.setItemMeta(glow_meta);
        armor.setItemMeta(armor_meta);
        base.setItemMeta(base_meta);
        complete.setItemMeta(complete_meta);
        cancel.setItemMeta(cancel_meta);

        create_menu.setItem(0, arms);
        create_menu.setItem(1, glow);
        create_menu.setItem(2, armor);
        create_menu.setItem(3, base);
        create_menu.setItem(7, complete);
        create_menu.setItem(8, cancel);

        player.openInventory(create_menu);

    }
}
