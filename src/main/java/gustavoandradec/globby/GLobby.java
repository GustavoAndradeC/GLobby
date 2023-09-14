package gustavoandradec.globby;

import gustavoandradec.events.DoubleJump;
import gustavoandradec.events.EventJAQ;
import org.bukkit.Bukkit;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

public class GLobby extends JavaPlugin {

    @Override
    public void onEnable() {
        saveDefaultConfig();
        FileConfiguration config = getConfig();
        Bukkit.getConsoleSender().sendMessage("tes:");
        RegisterEvents();
    }

    public void RegisterEvents() {
        PluginManager pm = Bukkit.getPluginManager();
        pm.registerEvents(new EventJAQ(),this);
        pm.registerEvents(new DoubleJump(), this);
    }
}
