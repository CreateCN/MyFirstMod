package io.github.createcn.firstmod;

import net.minecraft.*;
import net.minecraft.network.chat.TextComponent;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.Level;
import net.minecraftforge.event.entity.player.PlayerEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod("firstmod")
@Mod.EventBusSubscriber
public class Main {

    @SubscribeEvent
    public static void playerJoinWorld(PlayerEvent.PlayerLoggedInEvent event){
            Player player = event.getPlayer();
            Level level = player.getLevel();
            player.sendMessage(new TextComponent("Welcome, " + player.getDisplayName().getString() + " . From " + (level.isClientSide()?"CLIENT":"SERVER") + "."), Util.NIL_UUID);
    }
}
