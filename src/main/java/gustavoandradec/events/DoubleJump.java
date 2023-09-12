package gustavoandradec.events;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerToggleFlightEvent;

public class DoubleJump implements Listener {

    @EventHandler
    public void PlayerDJ(PlayerToggleFlightEvent e) {
        Player p = e.getPlayer();

        if(p.hasPermission("double.jump")) {
            e.setCancelled(true);

            p.setAllowFlight(false);
            p.setFlying(false);
            p.setVelocity(p.getLocation().getDirection().multiply(1.5).setY(1.0));
        }
    }
}
