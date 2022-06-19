package cookie.main;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.InventoryHolder;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.jetbrains.annotations.NotNull;

public class CookieInventory implements InventoryHolder {

    private final Inventory inventory;

    // 建立建構子
    public CookieInventory(int size , String title) {
        this.inventory = Bukkit.createInventory(this , size , title);
    }

    // 布置GUI的內容
    protected void init(Player player) {
        ItemStack itemStack = new ItemStack(Material.DIAMOND , 1);
        ItemMeta itemMeta = itemStack.getItemMeta();
        assert itemMeta != null;
        itemMeta.setDisplayName("Click Me!");
        itemStack.getItemMeta();
        inventory.addItem(itemStack);
    }

    public void open(Player player) {
        init(player);
        player.openInventory(inventory);
    }

    public void onClick(InventoryClickEvent event) {
        event.setCancelled(true);
    }


    @NotNull
    @Override
    public Inventory getInventory() {
        return inventory;
    }


}
