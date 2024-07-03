package io.github.createcn.firstmod;

// 导入必要的 Minecraft 和 Forge 类库，用于实现模组功能
import net.minecraft.*;
import net.minecraft.network.chat.TextComponent;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.Level;
import net.minecraftforge.event.entity.player.PlayerEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

/**
 * Main 类是模组的入口点。
 * 它使用 @Mod 注解标记为模组主类，并通过 @Mod.EventBusSubscriber 注解订阅事件。
 */
@Mod("firstmod")
@Mod.EventBusSubscriber
public class Main {

    /**
     * 当玩家登录时触发的事件处理方法。
     * 向玩家发送欢迎消息，指示他们是从客户端还是服务器端登录。
     *
     * @param event PlayerLoggedInEvent 对象，包含登录的玩家信息。
     */
    @SubscribeEvent
    public static void playerJoinWorld(PlayerEvent.PlayerLoggedInEvent event){
        // 获取登录的玩家对象
        Player player = event.getPlayer();
        // 获取玩家当前所在的维度对象
        Level level = player.getLevel();
        // 构建欢迎消息，包含玩家名称和登录位置（客户端或服务器）
        player.sendMessage(new TextComponent("Welcome, " + player.getDisplayName().getString() + " . From " + (level.isClientSide()?"CLIENT":"SERVER") + "."), Util.NIL_UUID);
    }
}

