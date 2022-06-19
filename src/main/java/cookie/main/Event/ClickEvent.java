package cookie.main.Event;

import cookie.main.CookieInventory;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.InventoryHolder;

public class ClickEvent implements Listener {

    @EventHandler
    public void clickEvent(InventoryClickEvent event) {
        InventoryHolder holder = event.getInventory().getHolder();

        // 判斷是不是從 cookieInventory 出來的 GUI
        if (holder instanceof CookieInventory cookieInventory) {
            cookieInventory.onClick(event);
        }

    }
}
