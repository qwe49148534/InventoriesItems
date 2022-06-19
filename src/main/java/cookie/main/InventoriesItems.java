package cookie.main;

import cookie.main.Event.ClickEvent;
import cookie.main.command.MenuCommand;
import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public class InventoriesItems extends JavaPlugin {
    @Override
    public void onEnable() {
        Bukkit.getPluginManager().registerEvents(new ClickEvent() , this);
        this.getCommand("menu").setExecutor(new MenuCommand());
    }
}
