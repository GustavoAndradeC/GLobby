package gustavoandradec.events;

import gustavoandradec.globby.GLobby;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerQuitEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.PlayerInventory;
import org.bukkit.inventory.meta.ItemMeta;

public class EventJAQ implements Listener {

    @EventHandler
    public void Join(PlayerJoinEvent e) {

        Player p = e.getPlayer();
        e.setJoinMessage(null);

        String titulo = GLobby.getPlugin(GLobby.class).getConfig().getString("titulo_login");
        String subtitulo = GLobby.getPlugin(GLobby.class).getConfig().getString("subtitulo_login");


        String Title = "Bem-vindo ao " + titulo;
        String SubTitle = subtitulo + " " + e.getPlayer().getName();
        int fadeIn = 10;
        int stay = 70;
        int fadeOut = 20;

        p.sendTitle(Title, SubTitle, fadeIn, stay, fadeOut);

        String JoinMsg = "§8[§a+§8]" + p.getName();

        for (Player on : p.getServer().getOnlinePlayers()) {
            on.sendMessage(JoinMsg);

        ItemStack Chest = new ItemStack(Material.CHEST, 1);
        int slotChest = 0;

            ItemMeta ChestMeta = Chest.getItemMeta();
            if (ChestMeta != null) {
                ChestMeta.setDisplayName("Status");
                Chest.setItemMeta(ChestMeta);
            }

        ItemStack Compass = new ItemStack(Material.COMPASS, 1);
        int slotCompass = 4;

            ItemMeta CompassMeta = Compass.getItemMeta();
            if (CompassMeta != null) {
                CompassMeta.setDisplayName("Modo de Jogo");
                Compass.setItemMeta(CompassMeta);
            }

        ItemStack Emerald = new ItemStack(Material.EMERALD, 1);
        int slotEmerald = 8;

            ItemMeta EmeraldMeta = Emerald.getItemMeta();
            if (EmeraldMeta != null) {
                EmeraldMeta.setDisplayName("Loja");
                Emerald.setItemMeta(EmeraldMeta);
            }

        PlayerInventory inv = p.getInventory();
        inv.clear();
        inv.setItem(slotChest, Chest);
        inv.setItem(slotCompass, Compass);
        inv.setItem(slotEmerald, Emerald);

        }

    }

    @EventHandler
    public void Quit(PlayerQuitEvent e) {
        Player p = e.getPlayer();
        e.setQuitMessage(null);

        String QuitMsg = "§8[§c-§8]" + p.getName();

        for (Player on : p.getServer().getOnlinePlayers()) {
            on.sendMessage(QuitMsg);
        }
    }
}

