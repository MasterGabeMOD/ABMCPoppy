package server.abmc.net;

import java.util.Random;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.entity.IronGolem;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDeathEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.plugin.java.JavaPlugin;

public class main
extends JavaPlugin
implements Listener {

public void onEnable() {

System.out.println("ABMCPoppy successfully enabled! v1.0");
Bukkit.getServer().getPluginManager().registerEvents(this, this);
}
public void onDisable()
{
getLogger().info("ABMCPoppy successfully disabled!");
}

@EventHandler
public void onIronGolemDeath(EntityDeathEvent e) {


        if (e.getEntity() instanceof IronGolem) {

            Random random = new Random();
            int chance = random.nextInt(100);

            ItemStack poppy = new ItemStack(Material.POPPY);


            if (e.getDrops().contains(poppy)) {


                if (chance >= 1) {

                    e.getDrops().clear();
                    
                    //.remove(poppy); doesn't work but just leaving this here for some other shit

                }
            }
        }
    }
}
