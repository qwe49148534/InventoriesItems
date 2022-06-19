package cookie.main.command;

import cookie.main.CookieInventory;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.jetbrains.annotations.NotNull;

public class MenuCommand implements CommandExecutor {
    @Override
    public boolean onCommand(@NotNull CommandSender commandSender, @NotNull Command command, @NotNull String s, @NotNull String[] strings) {

        if (commandSender instanceof Player player) {
            // 先創建一個GUI
            CookieInventory cookieInventory = new CookieInventory(9,"Hello");
            cookieInventory.open(player);
        }



        return true;
    }
}
