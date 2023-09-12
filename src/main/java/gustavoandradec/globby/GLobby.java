package gustavoandradec.globby;

import gustavoandradec.events.DoubleJump;
import gustavoandradec.events.EventJAQ;
import org.bukkit.Bukkit;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

public final class GLobby extends JavaPlugin {

    @Override
    public void onEnable() {
        Bukkit.getConsoleSender().sendMessage("PASSOUUUUUU!");
        RegisterEvents();

    }

    public void RegisterEvents() {
        PluginManager pm = Bukkit.getPluginManager();
        pm.registerEvents(new EventJAQ(),this);
        pm.registerEvents(new DoubleJump(), this);
    }

}
